package healthcaresystem.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import healthcaresystem.bean.UserBean;
import healthcaresystem.dao.DaolayerImpl;
import healthcaresystem.exceptions.HealthCareException;

public class ServicelayerImpl implements Servicelayer{
	public boolean validatePassword(String password)
	{
		Pattern p1=Pattern.compile("\\w{1,4}[!@#$%^&*]{1,4}+");
		Matcher m1=p1.matcher(password);
		if(m1.find())
			return true;
		else
		  return false;
	}
	public boolean validateName(String username) {
		Pattern p=Pattern.compile("[A-Z]\\w");
		Matcher m=p.matcher(username);
		if(m.find())
			return true;
		else
			return false;
	}
	public boolean validateNumber(String mobile)
	{
		Pattern p1=Pattern.compile("0?[7-9][0-9]{9}");
	  Matcher m1=p1.matcher(mobile);
	  if(m1.find())
		  return true;
	  else
		  return false;
	}
	public boolean validateEmail(String mail) {
		Pattern p1=Pattern.compile("[0-9a-zA-Z][0-9a-zA-Z._]*[@]gmail.com");
		  Matcher m1=p1.matcher(mail);
		  if(m1.find())
			  return true;
		  else
			  return false;
	}
	DaolayerImpl dao=new DaolayerImpl();
	public String doRegister(UserBean bean) {
		return dao.doRegister(bean);
	
	}
}
