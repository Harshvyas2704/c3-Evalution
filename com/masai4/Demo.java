package com.masai4;

import java.util.Scanner;

public class Demo {

	static boolean flag = false;
	void setter() {
//		Demo d2 = new Demo();
		
		
	}
	
	public static void main(String[] args) {
		Customer c1 = new Customer();
		
		boolean nameflag = false;
		boolean passflag = false;
		boolean mobileflag = false;
		boolean emailflag = false;
		
		
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter username");
			String name = input.nextLine();
			
			
			System.out.println("Enter password");
			String password = input.nextLine();
			
			System.out.println("Enter mobile number");
			String mobile = input.nextLine();
			
			System.out.println("Enter email id");
			String email = input.nextLine();
			
			if(name.length() > 2 && name.length() < 9) {
				nameflag = true;
				c1.setUsername(name);
			}
//			System.out.println(nameflag);
			
			if(password.length() > 2 && password.length() < 9) {
				passflag = true;
				c1.setPassword(password);
			}
//			System.out.println(passflag);
			
			
			if(mobile.length() == 10){
				mobileflag = true;
				c1.setMobileNumber(mobile);
			}
			
			
			if(email.length()>10) {
				emailflag = true;
				c1.setEmail(email);
			}
			
//			System.out.println(emailflag);
			
			if(nameflag ==  true && passflag ==  true && mobileflag ==  true && emailflag ==  true) {
				Demo.flag = true;
			}
		
		
		
		Demo d1 = new Demo();
//		System.out.println(Demo.flag);
		
		if(Demo.flag) {
			System.out.println(c1.getUsername());
			System.out.println(c1.getPassword());
			System.out.println(c1.getMobileNumber());
			System.out.println(c1.getEmail());
		}
		else {
			System.out.println("Enter a valid details");
		}
		
		
	}
}
