/*
 * Copyright (c) 2021 AcadiaSoft, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.acadiasoft.im.simm.engine.margin;

import com.acadiasoft.im.base.margin.GroupMargin;
import com.acadiasoft.im.base.margin.SiloMargin;
import com.acadiasoft.im.base.util.BigDecimalUtils;
import com.acadiasoft.im.base.util.ListUtils;
import com.acadiasoft.im.simm.config.SimmConfig;
import com.acadiasoft.im.simm.model.Sensitivity;
import com.acadiasoft.im.simm.model.SensitivityIdentifier;
import com.acadiasoft.im.simm.model.imtree.identifiers.ProductClass;
import com.acadiasoft.im.simm.model.param.SimmRiskClassCorrelation;
import com.acadiasoft.im.simm.model.utils.MarginUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMargin extends SiloMargin {

  private static final String LEVEL = "3.Silo";

  private ProductMargin(ProductClass productClass, BigDecimal margin, List<GroupMargin> marginByRiskClass) {
    super(LEVEL, productClass, margin, marginByRiskClass);
  }

  public static ProductMargin calculate(ProductClass product, List<Sensitivity> sensitivities, SimmConfig config) {
    List<RiskMargin> marginByRiskClass = ListUtils.groupBy(sensitivities, SensitivityIdentifier::getRiskIdentifier).entrySet().stream()
      .map(entry -> RiskMargin.calculate(entry.getKey(), entry.getValue(), config))
      .collect(Collectors.toList());
    BigDecimal sumSquared = BigDecimalUtils.sumSquared(marginByRiskClass, RiskMargin::getMargin);
    BigDecimal sumCorrelated = MarginUtils.sumCorrelated(
      marginByRiskClass, RiskMargin::getMargin, SimmRiskClassCorrelation::get
    );
    BigDecimal sqrt = BigDecimalUtils.sqrt(sumSquared.add(sumCorrelated));
    return new ProductMargin(product, sqrt, new ArrayList<>(marginByRiskClass));
  }

}
