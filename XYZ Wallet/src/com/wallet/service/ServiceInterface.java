package com.wallet.service;

import java.sql.ResultSet;
import java.util.List;

import com.wallet.bean.Bean;

public interface ServiceInterface {
	public int InsertServe(Bean b);
	public int UpdatePhoneServe(Bean b);
	public int UpdateNameServe(Bean b);
	public ResultSet BalanceServe(Bean b);
	public int DepositServe(Bean b);
	public int WithdrawServe(Bean b);
	public List<Bean> TransactServe(Bean b);
	
}
