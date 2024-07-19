package in.sp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sp.DbCon.DbConnection;
import com.sp.bean.Account;

public class AccountDaoImpl implements AccountDao {
	
	@Override
	public boolean updateAccount(Account acc) {
		boolean status;
		// TODO Auto-generated method stub
		try
		{
		Connection con=DbConnection.dbcon();
		PreparedStatement pt=con.prepareStatement("update account set balance=? where accountnumber=?");
		pt.setInt(1, acc.getBalance());
		pt.setInt(2, acc.getAccount_num());
		
		int count=pt.executeUpdate();
		if(count>0)
		{
			status=true;
		}
		else {
			status=false;
		}
		}
		catch(Exception e) {
			status=false;
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public boolean CreateAccount(Account acc) {
		// TODO Auto-generated method stub
		boolean status;
		// TODO Auto-generated method stub
		try
		{
		Connection con=DbConnection.dbcon();
		PreparedStatement pt=con.prepareStatement("insert into account values(?,?,?,?)");
		pt.setInt(1, acc.getAccount_num());
		pt.setString(2, acc.getFirst_name());
		pt.setString(3, acc.getLast_name());
		pt.setInt(4, acc.getBalance());
		
		int count=pt.executeUpdate();
		if(count>0)
		{
			status=true;
		}
		else {
			status=false;
		}
		}
		catch(Exception e) {
			status=false;
			e.printStackTrace();
		}
		return status;
	}

}
