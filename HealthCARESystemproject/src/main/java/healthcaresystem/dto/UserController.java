package healthcaresystem.dto;

import java.util.Random;
import java.util.Scanner;

import healthcaresystem.bean.UserBean;
import healthcaresystem.exceptions.HealthCareException;
import healthcaresystem.service.ServicelayerImpl;

public class UserController  {
	static Scanner sc=new Scanner(System.in);
	static UserBean bean=new UserBean();
	static ServicelayerImpl service=new ServicelayerImpl();
	public static UserBean setdetails() throws HealthCareException {
		String userid="";
		String password="";
		String username="";
		long mobile;
		String mail="";
		String gender="";
		int age;
		String userrole="";
		Random r=new Random();
		String random=(Integer.toString(Math.abs(r.nextInt(1000))));
		userid=random;
		System.out.println("..................................\nYour's new unique user id is : "+random);
			System.out.println("Enter your password : ");
			password=sc.next();
				if(service.validatePassword(password)) {
					bean.setPassword(password);
					  System.out.println("Password is Valid");
				}
				else
				{
					System.out.println("Password is invalid");
					throw new HealthCareException("Password is invalid");
				}
		
	
		/*if(service.validatePassword(password)) {
				bean.setPassword(password);
				  System.out.println("Password is Valid");
			}
			else
			{
				throw new HealthCareException("Password is Invalid");
			}*/
		
		
		System.out.println("Enter username : ");
		username=sc.next();
		if(service.validateName(username))
		{
			System.out.println("Username is Valid");
			bean.setUsername(username);
		}
		else
		{
			System.out.println("Username is Invalid");
			throw new HealthCareException("Password is invalid");
		}
		System.out.println("Enter your mobile no : ");
		mobile=sc.nextLong();
        if(service.validateNumber(Long.toString(mobile)))	{
        	System.out.println("Mobile number is valid");
        	bean.setMobile(mobile);
        }
        else
        {
        	System.out.println("Mobile number is invalid");
        	throw new HealthCareException("Password is invalid");
        }
        System.out.println("Enter your mail id");
        mail=sc.next();
        if(service.validateEmail(mail))
        {
        	System.out.println("Mail id is Valid");
        	bean.setMail(mail);
        }
        else {
        	 System.out.println("Mail id is not valid");
        	throw new HealthCareException("Password is invalid");
        }
       
        System.out.println("Enter gender : ");
        gender=sc.next();
        System.out.println("Enter age : ");
        age=sc.nextInt();
        System.out.println("Enter user role : ");
        userrole=sc.next();
        UserBean bean=new UserBean(userid,password,username,mobile,mail,gender,age,userrole);
		bean.setUserid(userid);
		bean.setGender(gender);
		bean.setAge(age);
		bean.setUserrole(userrole);
		    return bean;
	}
	public static void main(String args[])  
	{
		//ServicelayerImpl service=new ServicelayerImpl();
		while(true) {
			try {
				UserBean bean=setdetails();
				String result=service.doRegister(bean);
				System.out.println("Thank you.......\nYour's registration is successful with userid '"+result+"'");
			}
			catch(HealthCareException message) {
				System.out.println("Sorry.....Registration is unsuccessful\n\n Enter the Details again\n");
			}
		}
		
		
		
		/*String result=service.doRegister(bean);
		System.out.println("Thank you.......\nYour's registration is successful with userid '"+result+"'");*/
	}

}
