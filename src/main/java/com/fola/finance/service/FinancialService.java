package com.fola.finance.service;

import java.math.BigDecimal;

public interface FinancialService {
	public BigDecimal calculateBonus(long clientId, BigDecimal payment);

}
