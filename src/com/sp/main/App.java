package com.sp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sp.DbCon.DbConnection;
import com.sp.bean.Account;
import com.sp.service.AccountService;
import com.sp.service.AccountServiceImp;

import in.sp.dao.AccountDaoImpl;

public class App {
	public static void main(String[] args) throws ClassNotFoundException  {
		
		
		Account act=new Account();
		act.setAccount_num(12);
		act.setFirst_name("Kkk");
		act.setLast_name("vvv");
		act.setBalance(1000);
		
		Account act1=new Account();
      	act1.setAccount_num(1);
      	act1.setBalance(140);
		
		AccountService ass=new AccountServiceImp();
		boolean status= ass.CreateAccountService(act);
		boolean status1=ass.updateAccountService(act1);
		if(status && status1)
		{
			System.out.println("Data Updated");
		}
		else {
			System.out.println("Data Updatedation Failed");
		}
		}
		
		
	}


