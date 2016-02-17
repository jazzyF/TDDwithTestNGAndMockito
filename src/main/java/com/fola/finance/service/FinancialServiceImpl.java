package com.fola.finance.service;

import java.math.BigDecimal;

import com.fola.finance.dataaccess.ClientDAO;
import com.fola.finance.util.Calculator;

public class FinancialServiceImpl implements FinancialService {

	private ClientDAO clientDAO;
	private Calculator calculator;

	@Override
	public BigDecimal calculateBonus(long clientId, BigDecimal payment) {
		Short clientType = clientDAO.getClientType(clientId);
		BigDecimal bonus = calculator.calculateBonus(clientType, payment);
		clientDAO.saveBonusHistory(clientId, bonus);
		return bonus;
	}

}
