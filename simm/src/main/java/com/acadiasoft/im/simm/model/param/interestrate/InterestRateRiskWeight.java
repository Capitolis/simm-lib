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

package com.acadiasoft.im.simm.model.param.interestrate;

import com.acadiasoft.im.simm.model.SensitivityIdentifier;
import com.acadiasoft.im.simm.model.imtree.identifiers.RiskClass;
import com.acadiasoft.im.simm.model.param.SimmRiskWeight;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * As defined in Appendix 1 section D of doc/ISDA-SIMM-2.0.pdf
 */
public class InterestRateRiskWeight implements SimmRiskWeight {

  private static final BigDecimal VEGA = new BigDecimal("0.18");
  private static final BigDecimal INFLATION = new BigDecimal("64");
  private static final BigDecimal XCCY = new BigDecimal("21");

  private static final Map<InterestRateCurrencyVolatility, Map<InterestRateTenor, BigDecimal>> WEIGHTS = new HashMap<>();
  private static final Map<InterestRateTenor, BigDecimal> HIGH = new HashMap<>();
  private static final Map<InterestRateTenor, BigDecimal> LOW = new HashMap<>();
  private static final Map<InterestRateTenor, BigDecimal> REGULAR = new HashMap<>();

  static {
    REGULAR.put(InterestRateTenor._2W,   new BigDecimal("114"));
    REGULAR.put(InterestRateTenor._1M,   new BigDecimal("106"));
    REGULAR.put(InterestRateTenor._3M,   new BigDecimal("95") );
    REGULAR.put(InterestRateTenor._6M,   new BigDecimal("74") );
    REGULAR.put(InterestRateTenor._1YR,  new BigDecimal("66") );
    REGULAR.put(InterestRateTenor._2YR,  new BigDecimal("61") );
    REGULAR.put(InterestRateTenor._3YR,  new BigDecimal("56") );
    REGULAR.put(InterestRateTenor._5YR,  new BigDecimal("52") );
    REGULAR.put(InterestRateTenor._10YR, new BigDecimal("53") );
    REGULAR.put(InterestRateTenor._15YR, new BigDecimal("57") );
    REGULAR.put(InterestRateTenor._20YR, new BigDecimal("60") );
    REGULAR.put(InterestRateTenor._30YR, new BigDecimal("66") );
    WEIGHTS.put(InterestRateCurrencyVolatility.REGULAR, REGULAR);

    LOW.put(InterestRateTenor._2W,   new BigDecimal("15") );
    LOW.put(InterestRateTenor._1M,   new BigDecimal("18") );
    LOW.put(InterestRateTenor._3M,   new BigDecimal("8.6"));
    LOW.put(InterestRateTenor._6M,   new BigDecimal("11") );
    LOW.put(InterestRateTenor._1YR,  new BigDecimal("13") );
    LOW.put(InterestRateTenor._2YR,  new BigDecimal("15") );
    LOW.put(InterestRateTenor._3YR,  new BigDecimal("18") );
    LOW.put(InterestRateTenor._5YR,  new BigDecimal("20") );
    LOW.put(InterestRateTenor._10YR, new BigDecimal("19") );
    LOW.put(InterestRateTenor._15YR, new BigDecimal("19") );
    LOW.put(InterestRateTenor._20YR, new BigDecimal("20") );
    LOW.put(InterestRateTenor._30YR, new BigDecimal("23") );
    WEIGHTS.put(InterestRateCurrencyVolatility.LOW_VOLATILITY, LOW);

    HIGH.put(InterestRateTenor._2W,   new BigDecimal("101"));
    HIGH.put(InterestRateTenor._1M,   new BigDecimal("91") );
    HIGH.put(InterestRateTenor._3M,   new BigDecimal("78") );
    HIGH.put(InterestRateTenor._6M,   new BigDecimal("80") );
    HIGH.put(InterestRateTenor._1YR,  new BigDecimal("90") );
    HIGH.put(InterestRateTenor._2YR,  new BigDecimal("89") );
    HIGH.put(InterestRateTenor._3YR,  new BigDecimal("94") );
    HIGH.put(InterestRateTenor._5YR,  new BigDecimal("94") );
    HIGH.put(InterestRateTenor._10YR, new BigDecimal("92") );
    HIGH.put(InterestRateTenor._15YR, new BigDecimal("101"));
    HIGH.put(InterestRateTenor._20YR, new BigDecimal("104"));
    HIGH.put(InterestRateTenor._30YR, new BigDecimal("102"));
    WEIGHTS.put(InterestRateCurrencyVolatility.HIGH_VOLATILITY, HIGH);
  }

  @Override
  public BigDecimal getDeltaRiskWeight(SensitivityIdentifier s) {
    if (StringUtils.equalsIgnoreCase(s.getRiskType(), RiskClass.RISK_TYPE_INFLATION)) {
      return INFLATION;
    } else if (s.getRiskType().equalsIgnoreCase(RiskClass.RISK_TYPE_XCCY_BASIS)) {
      return XCCY;
    } else {
      InterestRateCurrencyVolatility vol = InterestRateCurrencyVolatility.get(s.getQualifier());
      InterestRateTenor tenor = InterestRateTenor.getByTenor(s.getLabel1());
      return WEIGHTS.get(vol).get(tenor);
    }
  }

  @Override
  public BigDecimal getVegaRiskWeight(SensitivityIdentifier s) {
    return VEGA;
  }

}
