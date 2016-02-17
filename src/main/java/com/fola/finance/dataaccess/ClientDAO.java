package com.fola.finance.dataaccess;

import java.math.BigDecimal;

public interface ClientDAO {

	Short getClientType(long clientId);

	boolean saveBonusHistory(long clientId, BigDecimal bonus);

}
