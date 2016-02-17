package com.fola.finance.util;

import java.math.BigDecimal;

public interface Calculator {

	BigDecimal calculateBonus(Short clientType, BigDecimal payment);

}
