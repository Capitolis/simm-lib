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

package com.acadiasoft.im.simm.engine;

import com.acadiasoft.im.base.fx.FxRate;
import com.acadiasoft.im.simm.model.*;

import java.util.Arrays;
import java.util.List;

interface SimmCrifMixin {

  Sensitivity S_IR_1 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "USD", "1", "2w", "OIS", "4000000", FxRate.USD, "4000000");
  Sensitivity S_IR_2 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "USD", "1", "3m", "Municipal", "-3000000", FxRate.USD, "-3000000");
  Sensitivity S_IR_3 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "USD", "1", "1y", "Municipal", "2000000", FxRate.USD, "2000000");
  Sensitivity S_IR_4 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "USD", "1", "1y", "Prime", "3000000", FxRate.USD, "3000000");
  Sensitivity S_IR_5 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "USD", "1", "1y", "Prime", "-1000000", FxRate.USD, "-1000000");
  Sensitivity S_IR_6 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "EUR", "1", "3y", "Libor3m", "-2000000", FxRate.USD, "-2000000");
  Sensitivity S_IR_7 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "EUR", "1", "3y", "Libor6m", "5000000", FxRate.USD, "5000000");
  Sensitivity S_IR_8 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "EUR", "1", "5y", "Libor12m", "10000000", FxRate.USD, "10000000");
  Sensitivity S_IR_9 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "EUR", "1", "5y", "Libor12m", "25000000", FxRate.USD, "25000000");
  Sensitivity S_IR_10 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "EUR", "1", "10y", "Libor12m", "35000000", FxRate.USD, "35000000");
  Sensitivity S_IR_11 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "AUD", "1", "1m", "Libor3m", "2000000", FxRate.USD, "2000000");
  Sensitivity S_IR_12 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "AUD", "1", "6m", "Libor3m", "3000000", FxRate.USD, "3000000");
  Sensitivity S_IR_13 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "AUD", "1", "2y", "Libor3m", "-2000000", FxRate.USD, "-2000000");
  Sensitivity S_IR_14 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "CHF", "1", "15y", "Libor6m", "-4000000", FxRate.USD, "-4000000");
  Sensitivity S_IR_15 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "CHF", "1", "20y", "Libor6m", "10000000", FxRate.USD, "10000000");
  Sensitivity S_IR_16 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "CHF", "1", "30y", "Libor6m", "18000000", FxRate.USD, "18000000");
  Sensitivity S_IR_17 = new DefaultSensitivity("RatesFX", "Risk_Inflation", "CHF", "", "", "", "-10000000", FxRate.USD, "-10000000");
  Sensitivity S_IR_18 = new DefaultSensitivity("RatesFX", "Risk_XCcyBasis", "CHF", "", "", "", "30000000", FxRate.USD, "30000000");
  Sensitivity S_IR_19 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "JPY", "2", "2w", "Libor1m", "-1000000", FxRate.USD, "-1000000");
  Sensitivity S_IR_20 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "JPY", "2", "1m", "Libor1m", "-1500000", FxRate.USD, "-1500000");
  Sensitivity S_IR_21 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "JPY", "2", "3m", "Libor3m", "1500000", FxRate.USD, "1500000");
  Sensitivity S_IR_22 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "JPY", "2", "6m", "Libor3m", "2000000", FxRate.USD, "2000000");
  Sensitivity S_IR_23 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "JPY", "2", "1y", "Libor6m", "3000000", FxRate.USD, "3000000");
  Sensitivity S_IR_24 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "JPY", "2", "2y", "Libor6m", "4000000", FxRate.USD, "4000000");
  Sensitivity S_IR_25 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "JPY", "2", "3y", "Libor6m", "5000000", FxRate.USD, "5000000");
  Sensitivity S_IR_26 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "JPY", "2", "5y", "Libor12m", "20000000", FxRate.USD, "20000000");
  Sensitivity S_IR_27 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "JPY", "2", "10y", "Libor12m", "50000000", FxRate.USD, "50000000");
  Sensitivity S_IR_28 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "JPY", "2", "15y", "Libor12m", "-1000000", FxRate.USD, "-1000000");
  Sensitivity S_IR_29 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "JPY", "2", "20y", "Libor12m", "-2000000", FxRate.USD, "-2000000");
  Sensitivity S_IR_30 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "JPY", "2", "30y", "Libor12m", "3000000", FxRate.USD, "3000000");
  Sensitivity S_IR_31 = new DefaultSensitivity("RatesFX", "Risk_Inflation", "JPY", "", "", "", "15000000", FxRate.USD, "15000000");
  Sensitivity S_IR_32 = new DefaultSensitivity("RatesFX", "Risk_XCcyBasis", "JPY", "", "", "", "500000", FxRate.USD, "500000");
  Sensitivity S_IR_33 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "CNY", "3", "2w", "OIS", "1000000", FxRate.USD, "1000000");
  Sensitivity S_IR_34 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "CNY", "3", "1m", "OIS", "1500000", FxRate.USD, "1500000");
  Sensitivity S_IR_35 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "CNY", "3", "3m", "Libor1m", "-500000", FxRate.USD, "-500000");
  Sensitivity S_IR_36 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "CNY", "3", "6m", "Libor3m", "-1000000", FxRate.USD, "-1000000");
  Sensitivity S_IR_37 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "MXN", "3", "1y", "Libor6m", "9000000", FxRate.USD, "9000000");
  Sensitivity S_IR_38 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "MXN", "3", "2y", "Libor12m", "10000000", FxRate.USD, "10000000");
  Sensitivity S_IR_39 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "MXN", "3", "3y", "OIS", "-500000", FxRate.USD, "-500000");
  Sensitivity S_IR_40 = new DefaultSensitivity("RatesFX", "Risk_IRCurve", "MXN", "3", "5y", "OIS", "-1000000", FxRate.USD, "-1000000");
  Sensitivity S_IR_41 = new DefaultSensitivity("Credit", "Risk_IRCurve", "BRL", "3", "10y", "Libor6m", "14000000", FxRate.USD, "14000000");
  Sensitivity S_IR_42 = new DefaultSensitivity("Credit", "Risk_IRCurve", "BRL", "3", "15y", "Libor6m", "20000000", FxRate.USD, "20000000");
  Sensitivity S_IR_43 = new DefaultSensitivity("Credit", "Risk_IRCurve", "BRL", "3", "20y", "Libor12m", "-800000", FxRate.USD, "-800000");
  Sensitivity S_IR_44 = new DefaultSensitivity("Credit", "Risk_IRCurve", "BRL", "3", "30y", "Libor12m", "-800000", FxRate.USD, "-800000");
  Sensitivity S_IR_45 = new DefaultSensitivity("Credit", "Risk_Inflation", "BRL", "", "", "", "2000000", FxRate.USD, "2000000");
  Sensitivity S_IR_46 = new DefaultSensitivity("Credit", "Risk_XCcyBasis", "BRL", "", "", "", "-1000000", FxRate.USD, "-1000000");

  List<Sensitivity> S_IR = Arrays.asList(S_IR_1, S_IR_2, S_IR_3, S_IR_4, S_IR_5, S_IR_6, S_IR_7, S_IR_8, S_IR_9, S_IR_10, S_IR_11, S_IR_12, S_IR_13, S_IR_14, S_IR_15, S_IR_16,
      S_IR_17, S_IR_18, S_IR_19, S_IR_20, S_IR_21, S_IR_22, S_IR_23, S_IR_24, S_IR_25, S_IR_26, S_IR_27, S_IR_28, S_IR_29, S_IR_30, S_IR_31, S_IR_32, S_IR_33, S_IR_34, S_IR_35,
      S_IR_36, S_IR_37, S_IR_38, S_IR_39, S_IR_40, S_IR_41, S_IR_42, S_IR_43, S_IR_44, S_IR_45, S_IR_46);

  Sensitivity S_FX_1 = new DefaultSensitivity("RatesFX", "Risk_FX", "EUR", "", "", "", "50000000", FxRate.USD, "50000000");
  Sensitivity S_FX_2 = new DefaultSensitivity("RatesFX", "Risk_FX", "EUR", "", "", "", "-50000000", FxRate.USD, "-50000000");
  Sensitivity S_FX_3 = new DefaultSensitivity("RatesFX", "Risk_FX", "EUR", "", "", "", "-6000000000", FxRate.USD, "-6000000000");
  Sensitivity S_FX_4 = new DefaultSensitivity("RatesFX", "Risk_FX", "USD", "", "", "", "610000000", FxRate.USD, "610000000");
  Sensitivity S_FX_5 = new DefaultSensitivity("RatesFX", "Risk_FX", "GBP", "", "", "", "910000000", FxRate.USD, "910000000");
  Sensitivity S_FX_6 = new DefaultSensitivity("RatesFX", "Risk_FX", "EUR", "", "", "", "-900000000", FxRate.USD, "-900000000");
  Sensitivity S_FX_7 = new DefaultSensitivity("RatesFX", "Risk_FX", "CNY", "", "", "", "-200000000", FxRate.USD, "-200000000");
  Sensitivity S_FX_8 = new DefaultSensitivity("RatesFX", "Risk_FX", "KRW", "", "", "", "210000000", FxRate.USD, "210000000");
  Sensitivity S_FX_9 = new DefaultSensitivity("RatesFX", "Risk_FX", "TRY", "", "", "", "80000000", FxRate.USD, "80000000");
  Sensitivity S_FX_10 = new DefaultSensitivity("RatesFX", "Risk_FX", "BRL", "", "", "", "-300000000", FxRate.USD, "-300000000");
  Sensitivity S_FX_11 = new DefaultSensitivity("Credit", "Risk_FX", "BRL", "", "", "", "41000000", FxRate.USD, "41000000");
  Sensitivity S_FX_12 = new DefaultSensitivity("Credit", "Risk_FX", "QAR", "", "", "", "-40000000", FxRate.USD, "-40000000");
  List<Sensitivity> S_FX = Arrays.asList(S_FX_1, S_FX_2, S_FX_3, S_FX_4, S_FX_5, S_FX_6, S_FX_7, S_FX_8, S_FX_9, S_FX_10, S_FX_11, S_FX_12);

  Sensitivity S_CRQ_1 = new DefaultSensitivity("Credit", "Risk_CreditQ", "ISIN:BE0934259525", "1", "1y", "USD", "400000", FxRate.USD, "400000");
  Sensitivity S_CRQ_2 = new DefaultSensitivity("Credit", "Risk_CreditQ", "ISIN:BE0934259525", "1", "2y", "USD", "-300000", FxRate.USD, "-300000");
  Sensitivity S_CRQ_3 = new DefaultSensitivity("Credit", "Risk_CreditQ", "ISIN:CA112585AG91", "2", "2y", "USD", "180000", FxRate.USD, "180000");
  Sensitivity S_CRQ_4 = new DefaultSensitivity("Credit", "Risk_CreditQ", "ISIN:CA112585AG91", "2", "2y", "EUR", "-180000", FxRate.USD, "-180000");
  Sensitivity S_CRQ_5 = new DefaultSensitivity("Credit", "Risk_CreditQ", "ISIN:CA82028KAP62", "3", "3y", "GBP", "180000", FxRate.USD, "180000");
  Sensitivity S_CRQ_6 = new DefaultSensitivity("Credit", "Risk_CreditQ", "ISIN:CA82028KAP62", "3", "5y", "JPY", "-100000", FxRate.USD, "-100000");
  Sensitivity S_CRQ_7 = new DefaultSensitivity("Credit", "Risk_CreditQ", "ISIN:FR0000108359", "4", "5y", "USD", "180000", FxRate.USD, "180000");
  Sensitivity S_CRQ_8 = new DefaultSensitivity("Credit", "Risk_CreditQ", "ISIN:FR0000108359", "4", "5y", "USD", "-100000", FxRate.USD, "-100000");
  Sensitivity S_CRQ_9 = new DefaultSensitivity("Credit", "Risk_CreditQ", "ISIN:CH0010519475", "5", "10y", "USD", "180000", FxRate.USD, "180000");
  Sensitivity S_CRQ_10 = new DefaultSensitivity("Credit", "Risk_CreditQ", "ISIN:CH9823105801", "5", "1y", "USD", "-100000", FxRate.USD, "-100000");
  Sensitivity S_CRQ_11 = new DefaultSensitivity("Credit", "Risk_CreditQ", "ISIN:DE4830528795", "6", "2y", "EUR", "180000", FxRate.USD, "180000");
  Sensitivity S_CRQ_12 = new DefaultSensitivity("Credit", "Risk_CreditQ", "ISIN:GB0862147969", "7", "3y", "GBP", "-300000", FxRate.USD, "-300000");
  Sensitivity S_CRQ_13 = new DefaultSensitivity("Credit", "Risk_CreditQ", "ISIN:CA6515779866", "8", "5y", "USD", "-100000", FxRate.USD, "-100000");
  Sensitivity S_CRQ_14 = new DefaultSensitivity("Credit", "Risk_CreditQ", "ISIN:FR0003335977", "9", "10y", "USD", "180000", FxRate.USD, "180000");
  Sensitivity S_CRQ_15 = new DefaultSensitivity("Credit", "Risk_CreditQ", "ISIN:CA2201568701", "10", "1y", "USD", "-100000", FxRate.USD, "-100000");
  Sensitivity S_CRQ_16 = new DefaultSensitivity("Credit", "Risk_CreditQ", "ISIN:CA6130123456", "11", "2y", "USD", "180000", FxRate.USD, "180000");
  Sensitivity S_CRQ_17 = new DefaultSensitivity("Credit", "Risk_CreditQ", "ISIN:FR0002226543", "12", "3y", "USD", "-100000", FxRate.USD, "-100000");
  Sensitivity S_CRQ_18 = new DefaultSensitivity("Credit", "Risk_CreditQ", "ISIN:UNKNOWN1", "Residual", "1y", "USD", "180000", FxRate.USD, "180000");
  Sensitivity S_CRQ_19 = new DefaultSensitivity("Credit", "Risk_CreditQ", "ISIN:UNKNOWN1", "Residual", "3y", "USD", "-100000", FxRate.USD, "-100000");
  Sensitivity S_CRQ_20 = new DefaultSensitivity("Credit", "Risk_CreditQ", "ISIN:UNKNOWN2", "Residual", "3y", "EUR", "180000", FxRate.USD, "180000");
  Sensitivity S_CRQ_21 = new DefaultSensitivity("Credit", "Risk_CreditQ", "ISIN:UNKNOWN3", "Residual", "5y", "USD", "180000", FxRate.USD, "180000");
  Sensitivity S_CRQ_22 = new DefaultSensitivity("Credit", "Risk_CreditQ", "ISIN:UNKNOWN3", "Residual", "10y", "GBP", "-100000", FxRate.USD, "-100000");
  Sensitivity S_CRQ_23 = new DefaultSensitivity("Credit", "Risk_BaseCorr", "CDX IG", "", "", "", "500000", FxRate.USD, "500000");
  Sensitivity S_CRQ_24 = new DefaultSensitivity("Credit", "Risk_BaseCorr", "CDX IG", "", "", "", "-200000", FxRate.USD, "-200000");
  Sensitivity S_CRQ_25 = new DefaultSensitivity("Credit", "Risk_BaseCorr", "iTraxx Main", "", "", "", "400000", FxRate.USD, "400000");
  List<Sensitivity> S_CRQ = Arrays.asList(S_CRQ_1, S_CRQ_2, S_CRQ_3, S_CRQ_4, S_CRQ_5, S_CRQ_6, S_CRQ_7, S_CRQ_8, S_CRQ_9, S_CRQ_10, S_CRQ_11, S_CRQ_12, S_CRQ_13, S_CRQ_14,
      S_CRQ_15, S_CRQ_16, S_CRQ_17, S_CRQ_18, S_CRQ_19, S_CRQ_20, S_CRQ_21, S_CRQ_22, S_CRQ_23, S_CRQ_24, S_CRQ_25);

  Sensitivity S_CRNQ_1 = new DefaultSensitivity("Credit", "Risk_CreditNonQ", "ISIN:AU3005621011", "1", "1y", "CMBX", "6000000", FxRate.USD, "6000000");
  Sensitivity S_CRNQ_2 = new DefaultSensitivity("Credit", "Risk_CreditNonQ", "ISIN:AU3005621011", "1", "2y", "CMBX", "3000000", FxRate.USD, "3000000");
  Sensitivity S_CRNQ_3 = new DefaultSensitivity("Credit", "Risk_CreditNonQ", "ISIN:AU3005621011", "1", "3y", "CMBX", "-3000000", FxRate.USD, "-3000000");
  Sensitivity S_CRNQ_4 = new DefaultSensitivity("Credit", "Risk_CreditNonQ", "ISIN:DE0314227036", "1", "2y", "ABX", "-2000000", FxRate.USD, "-2000000");
  Sensitivity S_CRNQ_5 = new DefaultSensitivity("Credit", "Risk_CreditNonQ", "ISIN:DE0314227036", "1", "3y", "ABX", "3000000", FxRate.USD, "3000000");
  Sensitivity S_CRNQ_6 = new DefaultSensitivity("Credit", "Risk_CreditNonQ", "ISIN:DE0314227036", "1", "5y", "ABX", "-4000000", FxRate.USD, "-4000000");
  Sensitivity S_CRNQ_7 = new DefaultSensitivity("Credit", "Risk_CreditNonQ", "ISIN:ES0338093059", "2", "3y", "CMBX", "-400000", FxRate.USD, "-400000");
  Sensitivity S_CRNQ_8 = new DefaultSensitivity("Credit", "Risk_CreditNonQ", "ISIN:ES0338093059", "2", "5y", "CMBX", "-200000", FxRate.USD, "-200000");
  Sensitivity S_CRNQ_9 = new DefaultSensitivity("Credit", "Risk_CreditNonQ", "ISIN:ES0338093059", "2", "10y", "CMBX", "200000", FxRate.USD, "200000");
  Sensitivity S_CRNQ_10 = new DefaultSensitivity("Credit", "Risk_CreditNonQ", "ISIN:CA0359093012", "2", "1y", "CMBX", "200000", FxRate.USD, "200000");
  Sensitivity S_CRNQ_11 = new DefaultSensitivity("Credit", "Risk_CreditNonQ", "ISIN:CA0359093012", "2", "3y", "CMBX", "200000", FxRate.USD, "200000");
  Sensitivity S_CRNQ_12 = new DefaultSensitivity("Credit", "Risk_CreditNonQ", "ISIN:CA0359093012", "2", "5y", "CMBX", "-300000", FxRate.USD, "-300000");
  Sensitivity S_CRNQ_13 = new DefaultSensitivity("Credit", "Risk_CreditNonQ", "ISIN:UNKNOWN1", "Residual", "1y", "ABX", "400000", FxRate.USD, "400000");
  Sensitivity S_CRNQ_14 = new DefaultSensitivity("Credit", "Risk_CreditNonQ", "ISIN:UNKNOWN2", "Residual", "2y", "CMBX", "-200000", FxRate.USD, "-200000");
  Sensitivity S_CRNQ_15 = new DefaultSensitivity("Credit", "Risk_CreditNonQ", "ISIN:UNKNOWN1", "Residual", "5y", "ABX", "300000", FxRate.USD, "300000");
  Sensitivity S_CRNQ_16 = new DefaultSensitivity("Credit", "Risk_CreditNonQ", "ISIN:UNKNOWN2", "Residual", "10y", "CMBX", "-100000", FxRate.USD, "-100000");
  List<Sensitivity> S_CRNQ = Arrays.asList(S_CRNQ_1, S_CRNQ_2, S_CRNQ_3, S_CRNQ_4, S_CRNQ_5, S_CRNQ_6, S_CRNQ_7, S_CRNQ_8, S_CRNQ_9, S_CRNQ_10, S_CRNQ_11, S_CRNQ_12, S_CRNQ_13,
      S_CRNQ_14, S_CRNQ_15, S_CRNQ_16);

  Sensitivity S_EQ_1 = new DefaultSensitivity("Equity", "Risk_Equity", "ISIN:INE044A01036", "1", "", "", "6000000", FxRate.USD, "6000000");
  Sensitivity S_EQ_2 = new DefaultSensitivity("Equity", "Risk_Equity", "ISIN:INE406A01037", "1", "", "", "1000000", FxRate.USD, "1000000");
  Sensitivity S_EQ_3 = new DefaultSensitivity("Equity", "Risk_Equity", "ISIN:CNE000000J28", "2", "", "", "-2000000", FxRate.USD, "-2000000");
  Sensitivity S_EQ_4 = new DefaultSensitivity("Equity", "Risk_Equity", "ISIN:CNE000000L16", "2", "", "", "1000000", FxRate.USD, "1000000");
  Sensitivity S_EQ_5 = new DefaultSensitivity("Equity", "Risk_Equity", "ISIN:RU0009024277", "3", "", "", "2000000", FxRate.USD, "2000000");
  Sensitivity S_EQ_6 = new DefaultSensitivity("Equity", "Risk_Equity", "ISIN:RU0009091573", "3", "", "", "-1000000", FxRate.USD, "-1000000");
  Sensitivity S_EQ_7 = new DefaultSensitivity("Equity", "Risk_Equity", "ISIN:INE160A01022", "4", "", "", "-2000000", FxRate.USD, "-2000000");
  Sensitivity S_EQ_8 = new DefaultSensitivity("Equity", "Risk_Equity", "ISIN:INE467B01029", "4", "", "", "-1000000", FxRate.USD, "-1000000");
  Sensitivity S_EQ_9 = new DefaultSensitivity("Equity", "Risk_Equity", "ISIN:US1266501006", "5", "", "", "10000000", FxRate.USD, "10000000");
  Sensitivity S_EQ_10 = new DefaultSensitivity("Equity", "Risk_Equity", "ISIN:US28176E1082", "5", "", "", "2000000", FxRate.USD, "2000000");
  Sensitivity S_EQ_11 = new DefaultSensitivity("Equity", "Risk_Equity", "ISIN:CA7751092007", "6", "", "", "-4000000", FxRate.USD, "-4000000");
  Sensitivity S_EQ_12 = new DefaultSensitivity("Equity", "Risk_Equity", "ISIN:CA85472N1096", "6", "", "", "2000000", FxRate.USD, "2000000");
  Sensitivity S_EQ_13 = new DefaultSensitivity("Equity", "Risk_Equity", "ISIN:DE000BASF111", "7", "", "", "4000000", FxRate.USD, "4000000");
  Sensitivity S_EQ_14 = new DefaultSensitivity("Equity", "Risk_Equity", "ISIN:DE000A1DAHH0", "7", "", "", "-2000000", FxRate.USD, "-2000000");
  Sensitivity S_EQ_15 = new DefaultSensitivity("Equity", "Risk_Equity", "ISIN:US67066G1040", "8", "", "", "-4000000", FxRate.USD, "-4000000");
  Sensitivity S_EQ_16 = new DefaultSensitivity("Equity", "Risk_Equity", "ISIN:US8574771031", "8", "", "", "-2000000", FxRate.USD, "-2000000");
  Sensitivity S_EQ_17 = new DefaultSensitivity("Equity", "Risk_Equity", "ISIN:BRCESPACNPB4", "9", "", "", "400000", FxRate.USD, "400000");
  Sensitivity S_EQ_18 = new DefaultSensitivity("Equity", "Risk_Equity", "ISIN:BRENBRACNOR2", "9", "", "", "-1000000", FxRate.USD, "-1000000");
  Sensitivity S_EQ_19 = new DefaultSensitivity("Equity", "Risk_Equity", "ISIN:AU000000API4", "10", "", "", "800000", FxRate.USD, "800000");
  Sensitivity S_EQ_20 = new DefaultSensitivity("Equity", "Risk_Equity", "ISIN:AU000000CTD3", "10", "", "", "-600000", FxRate.USD, "-600000");
  Sensitivity S_EQ_21 = new DefaultSensitivity("Equity", "Risk_Equity", "SPX", "11", "", "", "1000000000", FxRate.USD, "1000000000");
  Sensitivity S_EQ_22 = new DefaultSensitivity("Equity", "Risk_Equity", "VPL", "11", "", "", "2000000", FxRate.USD, "2000000");
  Sensitivity S_EQ_23 = new DefaultSensitivity("Equity", "Risk_Equity", "EEM", "11", "", "", "-1000000", FxRate.USD, "-1000000");
  Sensitivity S_EQ_24 = new DefaultSensitivity("Equity", "Risk_Equity", "VIX", "12", "", "", "3000000", FxRate.USD, "3000000");
  Sensitivity S_EQ_25 = new DefaultSensitivity("Equity", "Risk_Equity", "JINV", "12", "", "", "2000000", FxRate.USD, "2000000");
  Sensitivity S_EQ_26 = new DefaultSensitivity("Equity", "Risk_Equity", "VSTOXX", "12", "", "", "-1000000", FxRate.USD, "-1000000");
  Sensitivity S_EQ_27 = new DefaultSensitivity("Equity", "Risk_Equity", "ISIN:UNKNOWN1", "Residual", "", "", "700000", FxRate.USD, "700000");
  Sensitivity S_EQ_28 = new DefaultSensitivity("Credit", "Risk_Equity", "ISIN:UNKNOWN3", "Residual", "", "", "-300000", FxRate.USD, "-300000");
  List<Sensitivity> S_EQ = Arrays.asList(S_EQ_1, S_EQ_2, S_EQ_3, S_EQ_4, S_EQ_5, S_EQ_6, S_EQ_7, S_EQ_8, S_EQ_9, S_EQ_10, S_EQ_11, S_EQ_12, S_EQ_13, S_EQ_14, S_EQ_15, S_EQ_16,
      S_EQ_17, S_EQ_18, S_EQ_19, S_EQ_20, S_EQ_21, S_EQ_22, S_EQ_23, S_EQ_24, S_EQ_25, S_EQ_26, S_EQ_27, S_EQ_28);

  Sensitivity S_CM_1 = new DefaultSensitivity("Commodity", "Risk_Commodity", "Coal Americas", "1", "", "", "150000000", FxRate.USD, "150000000");
  Sensitivity S_CM_2 = new DefaultSensitivity("Commodity", "Risk_Commodity", "Coal Europe", "1", "", "", "1000000", FxRate.USD, "1000000");
  Sensitivity S_CM_3 = new DefaultSensitivity("Commodity", "Risk_Commodity", "Crude oil Americas", "2", "", "", "1500000000", FxRate.USD, "1500000000");
  Sensitivity S_CM_4 = new DefaultSensitivity("Commodity", "Risk_Commodity", "Crude oil Asia/Middle East", "2", "", "", "-1000000", FxRate.USD, "-1000000");
  Sensitivity S_CM_5 = new DefaultSensitivity("Commodity", "Risk_Commodity", "Light Ends Europe", "3", "", "", "-360000000", FxRate.USD, "-360000000");
  Sensitivity S_CM_6 = new DefaultSensitivity("Commodity", "Risk_Commodity", "Light Ends Asia", "3", "", "", "1000000", FxRate.USD, "1000000");
  Sensitivity S_CM_7 = new DefaultSensitivity("Commodity", "Risk_Commodity", "Middle Distillates Asia", "4", "", "", "-10000000", FxRate.USD, "-10000000");
  Sensitivity S_CM_8 = new DefaultSensitivity("Commodity", "Risk_Commodity", "Middle Distillates Europe", "4", "", "", "-1000000", FxRate.USD, "-1000000");
  Sensitivity S_CM_9 = new DefaultSensitivity("Commodity", "Risk_Commodity", "Heavy Distillates Americas", "5", "", "", "10000000", FxRate.USD, "10000000");
  Sensitivity S_CM_10 = new DefaultSensitivity("Commodity", "Risk_Commodity", "Heavy Distillates Europe", "5", "", "", "1000000", FxRate.USD, "1000000");
  Sensitivity S_CM_11 = new DefaultSensitivity("Commodity", "Risk_Commodity", "NA Natural Gas Gulf Coast", "6", "", "", "650000000", FxRate.USD, "650000000");
  Sensitivity S_CM_12 = new DefaultSensitivity("Commodity", "Risk_Commodity", "NA Natural Gas West", "6", "", "", "-1000000", FxRate.USD, "-1000000");
  Sensitivity S_CM_13 = new DefaultSensitivity("Commodity", "Risk_Commodity", "EU Natural Gas Europe", "7", "", "", "-10000000", FxRate.USD, "-10000000");
  Sensitivity S_CM_14 = new DefaultSensitivity("Commodity", "Risk_Commodity", "NA Power Eastern Interconnect", "8", "", "", "-300000000", FxRate.USD, "-300000000");
  Sensitivity S_CM_15 = new DefaultSensitivity("Commodity", "Risk_Commodity", "NA Power ERCOT", "8", "", "", "-1000000", FxRate.USD, "-1000000");
  Sensitivity S_CM_16 = new DefaultSensitivity("Commodity", "Risk_Commodity", "EU Power Germany", "9", "", "", "10000000", FxRate.USD, "10000000");
  Sensitivity S_CM_17 = new DefaultSensitivity("Commodity", "Risk_Commodity", "EU Power UK", "9", "", "", "1000000", FxRate.USD, "1000000");
  Sensitivity S_CM_18 = new DefaultSensitivity("Commodity", "Risk_Commodity", "Freight Wet", "10", "", "", "51000000", FxRate.USD, "51000000");
  Sensitivity S_CM_19 = new DefaultSensitivity("Commodity", "Risk_Commodity", "Freight Dry", "10", "", "", "-1000000", FxRate.USD, "-1000000");
  Sensitivity S_CM_20 = new DefaultSensitivity("Commodity", "Risk_Commodity", "Base Metals Copper", "11", "", "", "-300000000", FxRate.USD, "-300000000");
  Sensitivity S_CM_21 = new DefaultSensitivity("Commodity", "Risk_Commodity", "Base Metals Lead", "11", "", "", "1000000", FxRate.USD, "1000000");
  Sensitivity S_CM_22 = new DefaultSensitivity("Commodity", "Risk_Commodity", "Precious Metals Gold", "12", "", "", "-800000000", FxRate.USD, "-800000000");
  Sensitivity S_CM_23 = new DefaultSensitivity("Commodity", "Risk_Commodity", "Precious Metals Silver", "12", "", "", "-1000000", FxRate.USD, "-1000000");
  Sensitivity S_CM_24 = new DefaultSensitivity("Commodity", "Risk_Commodity", "Grains Corn", "13", "", "", "20000000", FxRate.USD, "20000000");
  Sensitivity S_CM_25 = new DefaultSensitivity("Commodity", "Risk_Commodity", "Grains Wheat", "13", "", "", "1000000", FxRate.USD, "1000000");
  Sensitivity S_CM_26 = new DefaultSensitivity("Commodity", "Risk_Commodity", "Softs Cocoa", "14", "", "", "10000000", FxRate.USD, "10000000");
  Sensitivity S_CM_27 = new DefaultSensitivity("Commodity", "Risk_Commodity", "Softs Cotton", "14", "", "", "-1000000", FxRate.USD, "-1000000");
  Sensitivity S_CM_28 = new DefaultSensitivity("Commodity", "Risk_Commodity", "Livestock Live Cattle", "15", "", "", "-10000000", FxRate.USD, "-10000000");
  Sensitivity S_CM_29 = new DefaultSensitivity("Commodity", "Risk_Commodity", "Livestock Lean Hogs", "15", "", "", "1000000", FxRate.USD, "1000000");
  Sensitivity S_CM_30 = new DefaultSensitivity("Commodity", "Risk_Commodity", "Ethanol", "16", "", "", "-25000000", FxRate.USD, "-25000000");
  Sensitivity S_CM_31 = new DefaultSensitivity("Commodity", "Risk_Commodity", "Random Length Lumber", "16", "", "", "-2000000", FxRate.USD, "-2000000");
  Sensitivity S_CM_32 = new DefaultSensitivity("Commodity", "Risk_Commodity", "Agriculture Index", "17", "", "", "1300000000", FxRate.USD, "1300000000");
  Sensitivity S_CM_33 = new DefaultSensitivity("Credit", "Risk_Commodity", "Natural Gas Index", "17", "", "", "2000000", FxRate.USD, "2000000");
  List<Sensitivity> S_CM = Arrays.asList(S_CM_1, S_CM_2, S_CM_3, S_CM_4, S_CM_5, S_CM_6, S_CM_7, S_CM_8, S_CM_9, S_CM_10, S_CM_11, S_CM_12, S_CM_13, S_CM_14, S_CM_15, S_CM_16,
      S_CM_17, S_CM_18, S_CM_19, S_CM_20, S_CM_21, S_CM_22, S_CM_23, S_CM_24, S_CM_25, S_CM_26, S_CM_27, S_CM_28, S_CM_29, S_CM_30, S_CM_31, S_CM_32, S_CM_33);

  Sensitivity S_IRV_1 = new DefaultSensitivity("RatesFX", "Risk_IRVol", "USD", "", "30y", "", "600000000", FxRate.USD, "600000000");
  Sensitivity S_IRV_2 = new DefaultSensitivity("RatesFX", "Risk_IRVol", "JPY", "", "20y", "", "200000000", FxRate.USD, "200000000");
  Sensitivity S_IRV_3 = new DefaultSensitivity("RatesFX", "Risk_IRVol", "CAD", "", "15y", "", "140000000", FxRate.USD, "140000000");
  Sensitivity S_IRV_4 = new DefaultSensitivity("RatesFX", "Risk_IRVol", "JPY", "", "10y", "", "200000000", FxRate.USD, "200000000");
  Sensitivity S_IRV_5 = new DefaultSensitivity("RatesFX", "Risk_IRVol", "INR", "", "5y", "", "80000000", FxRate.USD, "80000000");
  Sensitivity S_IRV_6 = new DefaultSensitivity("RatesFX", "Risk_IRVol", "EUR", "", "3y", "", "50000000", FxRate.USD, "50000000");
  Sensitivity S_IRV_7 = new DefaultSensitivity("RatesFX", "Risk_IRVol", "CNY", "", "2y", "", "50000000", FxRate.USD, "50000000");
  Sensitivity S_IRV_8 = new DefaultSensitivity("RatesFX", "Risk_IRVol", "RUB", "", "1y", "", "20000000", FxRate.USD, "20000000");
  Sensitivity S_IRV_9 = new DefaultSensitivity("RatesFX", "Risk_IRVol", "USD", "", "6m", "", "100000000", FxRate.USD, "100000000");
  Sensitivity S_IRV_10 = new DefaultSensitivity("RatesFX", "Risk_IRVol", "JPY", "", "3m", "", "100000000", FxRate.USD, "100000000");
  Sensitivity S_IRV_11 = new DefaultSensitivity("RatesFX", "Risk_IRVol", "CAD", "", "1m", "", "100000000", FxRate.USD, "100000000");
  Sensitivity S_IRV_12 = new DefaultSensitivity("RatesFX", "Risk_IRVol", "JPY", "", "2w", "", "100000000", FxRate.USD, "100000000");
  Sensitivity S_IRV_13 = new DefaultSensitivity("RatesFX", "Risk_IRVol", "EUR", "", "30y", "", "-100000000", FxRate.USD, "-100000000");
  Sensitivity S_IRV_14 = new DefaultSensitivity("RatesFX", "Risk_IRVol", "EUR", "", "20y", "", "-100000000", FxRate.USD, "-100000000");
  Sensitivity S_IRV_15 = new DefaultSensitivity("RatesFX", "Risk_IRVol", "JPY", "", "15y", "", "-100000000", FxRate.USD, "-100000000");
  Sensitivity S_IRV_16 = new DefaultSensitivity("RatesFX", "Risk_InflationVol", "USD", "", "30y", "", "80000000", FxRate.USD, "80000000");
  Sensitivity S_IRV_17 = new DefaultSensitivity("RatesFX", "Risk_InflationVol", "JPY", "", "20y", "", "40000000", FxRate.USD, "40000000");
  Sensitivity S_IRV_18 = new DefaultSensitivity("RatesFX", "Risk_InflationVol", "CAD", "", "20y", "", "20000000", FxRate.USD, "20000000");
  Sensitivity S_IRV_19 = new DefaultSensitivity("RatesFX", "Risk_InflationVol", "CAD", "", "10y", "", "10000000", FxRate.USD, "10000000");
  Sensitivity S_IRV_20 = new DefaultSensitivity("RatesFX", "Risk_InflationVol", "INR", "", "5y", "", "10000000", FxRate.USD, "10000000");
  Sensitivity S_IRV_21 = new DefaultSensitivity("RatesFX", "Risk_InflationVol", "USD", "", "2w", "", "-80000000", FxRate.USD, "-80000000");
  List<Sensitivity> S_IRV = Arrays.asList(S_IRV_1, S_IRV_2, S_IRV_3, S_IRV_4, S_IRV_5, S_IRV_6, S_IRV_7, S_IRV_8, S_IRV_9, S_IRV_10, S_IRV_11, S_IRV_12, S_IRV_13, S_IRV_14,
      S_IRV_15, S_IRV_16, S_IRV_17, S_IRV_18, S_IRV_19, S_IRV_20, S_IRV_21);

  Sensitivity S_CRV_1 = new DefaultSensitivity("Credit", "Risk_CreditVol", "ISIN:US1850531850", "1", "1y", "USD", "120000000", FxRate.USD, "120000000");
  Sensitivity S_CRV_2 = new DefaultSensitivity("Credit", "Risk_CreditVol", "ISIN:US1850531850", "1", "1y", "GBP", "60000000", FxRate.USD, "60000000");
  Sensitivity S_CRV_3 = new DefaultSensitivity("Credit", "Risk_CreditVol", "ISIN:US9800555990", "1", "3y", "USD", "30000000", FxRate.USD, "30000000");
  Sensitivity S_CRV_4 = new DefaultSensitivity("Credit", "Risk_CreditVol", "ISIN:CN0068511222", "2", "1y", "CNY", "200000000", FxRate.USD, "200000000");
  Sensitivity S_CRV_5 = new DefaultSensitivity("Credit", "Risk_CreditVol", "ISIN:CN0068511222", "2", "2y", "CNY", "-40000000", FxRate.USD, "-40000000");
  Sensitivity S_CRV_6 = new DefaultSensitivity("Credit", "Risk_CreditVol", "ISIN:CA2108230001", "Residual", "1y", "USD", "10000000", FxRate.USD, "10000000");
  Sensitivity S_CRV_7 = new DefaultSensitivity("Credit", "Risk_CreditVol", "ISIN:GB1086652888", "Residual", "5y", "EUR", "30000000", FxRate.USD, "30000000");
  Sensitivity S_CRV_8 = new DefaultSensitivity("Credit", "Risk_CreditVol", "ISIN:CA2108230001", "Residual", "10y", "USD", "-160000000", FxRate.USD, "-160000000");
  Sensitivity S_CRV_9 = new DefaultSensitivity("Credit", "Risk_CreditVol", "ISIN:CN0068511222", "2", "1y", "CNY", "-200000000", FxRate.USD, "-200000000");
  Sensitivity S_CRV_10 = new DefaultSensitivity("Credit", "Risk_CreditVol", "ISIN:US1850531850", "1", "3y", "USD", "-120000000", FxRate.USD, "-120000000");
  List<Sensitivity> S_CRV = Arrays.asList(S_CRV_1, S_CRV_2, S_CRV_3, S_CRV_4, S_CRV_5, S_CRV_6, S_CRV_7, S_CRV_8, S_CRV_9, S_CRV_10);

  Sensitivity S_CNV_1 = new DefaultSensitivity("Credit", "Risk_CreditVolNonQ", "EU.IG", "1", "1y", "CMBX", "45000000", FxRate.USD, "45000000");
  Sensitivity S_CNV_2 = new DefaultSensitivity("Credit", "Risk_CreditVolNonQ", "US.IG", "1", "1y", "CMBX", "30000000", FxRate.USD, "30000000");
  Sensitivity S_CNV_3 = new DefaultSensitivity("Credit", "Risk_CreditVolNonQ", "US.IG", "1", "2y", "CMBX", "-20000000", FxRate.USD, "-20000000");
  Sensitivity S_CNV_4 = new DefaultSensitivity("Credit", "Risk_CreditVolNonQ", "CN.HY", "2", "3y", "CMBX", "-50000000", FxRate.USD, "-50000000");
  Sensitivity S_CNV_5 = new DefaultSensitivity("Credit", "Risk_CreditVolNonQ", "JP.HY", "2", "5y", "ABX", "20000000", FxRate.USD, "20000000");
  Sensitivity S_CNV_6 = new DefaultSensitivity("Credit", "Risk_CreditVolNonQ", "BR.HY", "Residual", "1y", "CMBX", "55000000", FxRate.USD, "55000000");
  Sensitivity S_CNV_7 = new DefaultSensitivity("Credit", "Risk_CreditVolNonQ", "RU.HY", "Residual", "5y", "ABX", "10000000", FxRate.USD, "10000000");
  Sensitivity S_CNV_8 = new DefaultSensitivity("Credit", "Risk_CreditVolNonQ", "BR.HY", "Residual", "10y", "CMBX", "35000000", FxRate.USD, "35000000");
  Sensitivity S_CNV_9 = new DefaultSensitivity("Credit", "Risk_CreditVolNonQ", "RU.HY", "Residual", "1y", "ABX", "15000000", FxRate.USD, "15000000");
  List<Sensitivity> S_CNV = Arrays.asList(S_CNV_1, S_CNV_2, S_CNV_3, S_CNV_4, S_CNV_5, S_CNV_6, S_CNV_7, S_CNV_8, S_CNV_9);

  Sensitivity S_EQV_1 = new DefaultSensitivity("Equity", "Risk_EquityVol", "ISIN:AT000089755122", "1", "1m", "", "1200000", FxRate.USD, "1200000");
  Sensitivity S_EQV_2 = new DefaultSensitivity("Equity", "Risk_EquityVol", "ISIN:AT016188495495", "1", "3m", "", "1000000", FxRate.USD, "1000000");
  Sensitivity S_EQV_3 = new DefaultSensitivity("Equity", "Risk_EquityVol", "ISIN:AT000089755122", "1", "6m", "", "-3000000", FxRate.USD, "-3000000");
  Sensitivity S_EQV_4 = new DefaultSensitivity("Equity", "Risk_EquityVol", "ISIN:AU001159751155", "2", "1y", "", "-2000000", FxRate.USD, "-2000000");
  Sensitivity S_EQV_5 = new DefaultSensitivity("Equity", "Risk_EquityVol", "ISIN:AU003186678890", "2", "2y", "", "-1000000", FxRate.USD, "-1000000");
  Sensitivity S_EQV_6 = new DefaultSensitivity("Equity", "Risk_EquityVol", "ISIN:AU002189533177", "5", "3y", "", "15000000", FxRate.USD, "15000000");
  Sensitivity S_EQV_7 = new DefaultSensitivity("Equity", "Risk_EquityVol", "ISIN:CA842256904411", "9", "5y", "", "-400000", FxRate.USD, "-400000");
  Sensitivity S_EQV_8 = new DefaultSensitivity("Equity", "Risk_EquityVol", "ISIN:BR484898123123", "10", "10y", "", "2000000", FxRate.USD, "2000000");
  Sensitivity S_EQV_9 = new DefaultSensitivity("Equity", "Risk_EquityVol", "SPX", "11", "15y", "", "300000000", FxRate.USD, "300000000");
  Sensitivity S_EQV_10 = new DefaultSensitivity("Equity", "Risk_EquityVol", "SPX", "11", "20y", "", "-10000000", FxRate.USD, "-10000000");
  Sensitivity S_EQV_11 = new DefaultSensitivity("Equity", "Risk_EquityVol", "VIX", "12", "30y", "", "50000000", FxRate.USD, "50000000");
  Sensitivity S_EQV_12 = new DefaultSensitivity("Equity", "Risk_EquityVol", "ISIN:GB770459100599", "Residual", "10y", "", "400000", FxRate.USD, "400000");
  Sensitivity S_EQV_13 = new DefaultSensitivity("Equity", "Risk_EquityVol", "ISIN:CY180666897555", "Residual", "30y", "", "-500000", FxRate.USD, "-500000");
  Sensitivity S_EQV_14 = new DefaultSensitivity("Equity", "Risk_EquityVol", "ISIN:AU001159751155", "2", "6m", "", "-200000", FxRate.USD, "-200000");
  Sensitivity S_EQV_15 = new DefaultSensitivity("Equity", "Risk_EquityVol", "ISIN:AU001159751155", "2", "1m", "", "200000", FxRate.USD, "200000");
  List<Sensitivity> S_EQV =
      Arrays.asList(S_EQV_1, S_EQV_2, S_EQV_3, S_EQV_4, S_EQV_5, S_EQV_6, S_EQV_7, S_EQV_8, S_EQV_9, S_EQV_10, S_EQV_11, S_EQV_12, S_EQV_13, S_EQV_14, S_EQV_15);

  Sensitivity S_FXV_1 = new DefaultSensitivity("RatesFX", "Risk_FXVol", "USDGBP", "", "3m", "", "24000000", FxRate.USD, "24000000");
  Sensitivity S_FXV_2 = new DefaultSensitivity("RatesFX", "Risk_FXVol", "GBPUSD", "", "1y", "", "100000000", FxRate.USD, "100000000");
  Sensitivity S_FXV_3 = new DefaultSensitivity("RatesFX", "Risk_FXVol", "BRLUSD", "", "2y", "", "80000000", FxRate.USD, "80000000");
  Sensitivity S_FXV_4 = new DefaultSensitivity("RatesFX", "Risk_FXVol", "EURQAR", "", "1m", "", "-20000000", FxRate.USD, "-20000000");
  Sensitivity S_FXV_5 = new DefaultSensitivity("RatesFX", "Risk_FXVol", "HKDKRW", "", "6m", "", "-15000000", FxRate.USD, "-15000000");
  Sensitivity S_FXV_6 = new DefaultSensitivity("RatesFX", "Risk_FXVol", "CNYSGD", "", "3y", "", "12000000", FxRate.USD, "12000000");
  Sensitivity S_FXV_7 = new DefaultSensitivity("RatesFX", "Risk_FXVol", "RUBTRY", "", "5y", "", "-12000000", FxRate.USD, "-12000000");
  Sensitivity S_FXV_8 = new DefaultSensitivity("RatesFX", "Risk_FXVol", "KRWBRL", "", "10y", "", "30000000", FxRate.USD, "30000000");
  Sensitivity S_FXV_9 = new DefaultSensitivity("RatesFX", "Risk_FXVol", "EURQAR", "", "1y", "", "-40000000", FxRate.USD, "-40000000");
  Sensitivity S_FXV_10 = new DefaultSensitivity("RatesFX", "Risk_FXVol", "USDGBP", "", "1y", "", "-24000000", FxRate.USD, "-24000000");
  List<Sensitivity> S_FXV = Arrays.asList(S_FXV_1, S_FXV_2, S_FXV_3, S_FXV_4, S_FXV_5, S_FXV_6, S_FXV_7, S_FXV_8, S_FXV_9, S_FXV_10);

  Sensitivity S_CMV_1 = new DefaultSensitivity("Commodity", "Risk_CommodityVol", "Coal Europe", "1", "2w", "", "4000000", FxRate.USD, "4000000");
  Sensitivity S_CMV_2 = new DefaultSensitivity("Commodity", "Risk_CommodityVol", "Coal Americas", "1", "1m", "", "3000000", FxRate.USD, "3000000");
  Sensitivity S_CMV_3 = new DefaultSensitivity("Commodity", "Risk_CommodityVol", "Coal Australia", "1", "3m", "", "-3000000", FxRate.USD, "-3000000");
  Sensitivity S_CMV_4 = new DefaultSensitivity("Commodity", "Risk_CommodityVol", "Crude oil Americas", "2", "6m", "", "-32000000", FxRate.USD, "-32000000");
  Sensitivity S_CMV_5 = new DefaultSensitivity("Commodity", "Risk_CommodityVol", "Crude oil Asia/Middle East", "2", "1y", "", "-10000000", FxRate.USD, "-10000000");
  Sensitivity S_CMV_6 = new DefaultSensitivity("Commodity", "Risk_CommodityVol", "Light Ends Americas", "3", "2y", "", "5500000", FxRate.USD, "5500000");
  Sensitivity S_CMV_7 = new DefaultSensitivity("Commodity", "Risk_CommodityVol", "NA Natural Gas Gulf Coast", "6", "3y", "", "30000000", FxRate.USD, "30000000");
  Sensitivity S_CMV_8 = new DefaultSensitivity("Commodity", "Risk_CommodityVol", "NA Power ERCOT", "8", "5y", "", "7000000", FxRate.USD, "7000000");
  Sensitivity S_CMV_9 = new DefaultSensitivity("Commodity", "Risk_CommodityVol", "Freight Dry", "10", "10y", "", "1000000", FxRate.USD, "1000000");
  Sensitivity S_CMV_10 = new DefaultSensitivity("Commodity", "Risk_CommodityVol", "Base Metals Copper", "11", "6m", "", "-7000000", FxRate.USD, "-7000000");
  Sensitivity S_CMV_11 = new DefaultSensitivity("Commodity", "Risk_CommodityVol", "Precious Metals Gold", "12", "1y", "", "12000000", FxRate.USD, "12000000");
  Sensitivity S_CMV_12 = new DefaultSensitivity("Commodity", "Risk_CommodityVol", "Grains Wheat", "13", "2y", "", "8000000", FxRate.USD, "8000000");
  Sensitivity S_CMV_13 = new DefaultSensitivity("Commodity", "Risk_CommodityVol", "Agriculture Index", "17", "15y", "", "900000", FxRate.USD, "900000");
  Sensitivity S_CMV_14 = new DefaultSensitivity("Commodity", "Risk_CommodityVol", "Natural Gas Index", "17", "20y", "", "-2000000", FxRate.USD, "-2000000");
  Sensitivity S_CMV_15 = new DefaultSensitivity("Commodity", "Risk_CommodityVol", "Ethanol", "16", "5y", "", "600000", FxRate.USD, "600000");
  Sensitivity S_CMV_16 = new DefaultSensitivity("Commodity", "Risk_CommodityVol", "Random Length Lumber", "16", "30y", "", "-700000", FxRate.USD, "-700000");
  Sensitivity S_CMV_17 = new DefaultSensitivity("Commodity", "Risk_CommodityVol", "Crude oil Americas", "2", "2w", "", "20000000", FxRate.USD, "20000000");
  Sensitivity S_CMV_18 = new DefaultSensitivity("Commodity", "Risk_CommodityVol", "Coal Australia", "1", "2w", "", "3000000", FxRate.USD, "3000000");
  List<Sensitivity> S_CMV = Arrays.asList(S_CMV_1, S_CMV_2, S_CMV_3, S_CMV_4, S_CMV_5, S_CMV_6, S_CMV_7, S_CMV_8, S_CMV_9, S_CMV_10, S_CMV_11, S_CMV_12, S_CMV_13, S_CMV_14,
      S_CMV_15, S_CMV_16, S_CMV_17, S_CMV_18);

  NotionalFactor S_AN_1 = NotionalFactor.of("Product Alpha", "12.5");
  NotionalFactor S_AN_2 = NotionalFactor.of("Product Bravo", "25.0");

  Notional S_AN_3 = Notional.of("Product Alpha", "80000000", FxRate.USD, "80000000");
  Notional S_AN_4 = Notional.of("Product Bravo", "60000000", FxRate.USD, "60000000");
  Notional S_AN_5 = Notional.of("Product Bravo", "100000000", FxRate.USD, "100000000");
  Notional S_AN_6 = Notional.of("Product Charlie", "40000000", FxRate.USD, "40000000");
  FixedAmount S_AN_7 = FixedAmount.of("10000000", FxRate.USD, "10000000");
  FixedAmount S_AN_8 = FixedAmount.of("20000000", FxRate.USD, "20000000");
  ProductMultiplier S_MUL_1 = ProductMultiplier.of("RatesFX", "1.045");
  ProductMultiplier S_MUL_2 = ProductMultiplier.of("Credit", "1.034");
  ProductMultiplier S_MUL_3 = ProductMultiplier.of("Equity", "1.215");
  ProductMultiplier S_MUL_4 = ProductMultiplier.of("Commodity", "1.054");
  List<ProductMultiplier> S_MUL = Arrays.asList(S_MUL_1, S_MUL_2, S_MUL_3, S_MUL_4);

}
