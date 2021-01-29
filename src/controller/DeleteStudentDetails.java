package controller;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import businesslogic.LoginValidation;
import businesslogic.SignupValidation;

public class DeleteStudentDetails {
	SignupValidation signupobj=new SignupValidation();
	LoginValidation loginobj=new LoginValidation();
	Map<String, ArrayList> map1=signupobj.studentsdetails;
	public boolean deletedetails(String email) {
		if(map1.get(email)==null) {
			System.out.println("You are not registered");
			return false;
		}
		else {
		map1.remove(email);
		System.out.println("Your account is deleted");
		loginobj.mailemail="false";
		return true;
	}
}
}
