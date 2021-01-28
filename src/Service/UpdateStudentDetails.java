package Service;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import businesslogic.SignupValidation;

public class UpdateStudentDetails {
Scanner sc=new Scanner(System.in);
public void updatedetails(String email,int option) {
	// TODO Auto-generated method stub
	SignupValidation signupobj=new SignupValidation();
	Map<String, ArrayList> map1=signupobj.studentsdetails;
	ArrayList<String> list=map1.get(email);
	if(list==null) {
		System.out.println("You are not registered");
	}
	else {
	if(option==1) {
		System.out.println("Enter new name");
		String name=sc.next();
		list.set(0,name);
	}
	else {
		System.out.println("Enter new phone number");
		String number=sc.next();
		list.set(1,number);
	}
	}
}
}
