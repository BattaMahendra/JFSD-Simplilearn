package com.mahendra.project2;

import java.util.Scanner;

public class emailVerification {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the mailid that u want to search");
		String Email_id=sc.nextLine();
		sc.close();
		System.out.println("the email u searched is  " +searchMail(Email_id));
	}
	static String searchMail(String Email_ID) {
		String[] emp_Emails= {
				"mahi123@gmail.com",
				"arun444@gmail.com",
				"manju248@yahoo.com",
				"divya4@microsoft.com",
				"kiran@hellen.com" };
		   boolean flag=true;                           
		for(int i=0;i<emp_Emails.length;i++) {
			if( emp_Emails[i].equalsIgnoreCase(Email_ID)) {
				flag=false;
			}
		}
		if(flag==true) {
			String s="not present in the list";
			return s;
		}else return "present "+Email_ID;
}
}
