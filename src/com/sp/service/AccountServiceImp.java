package com.sp.service;

import com.sp.bean.Account;

import in.sp.dao.AccountDaoImpl;

public class AccountServiceImp implements AccountService{

	@Override
	public boolean updateAccountService(Account acc) {
		AccountDaoImpl adidao=new AccountDaoImpl();
		boolean status=adidao.CreateAccount(acc);
		
		return status;
	}

	@Override	public boolean CreateAccountService(Account acc) {
		// TODO Auto-generated method stub
		AccountDaoImpl adidao=new AccountDaoImpl();
		
		boolean status1=adidao.updateAccount(acc);
		return status1;

	}

}
