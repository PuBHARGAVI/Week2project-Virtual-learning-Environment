package controller;

import java.util.ArrayList;
import java.util.Map;

import businesslogic.SignupValidation;

public class DeleteStudentDetails {
	SignupValidation signupobj=new SignupValidation();
	Map<String, ArrayList> map1=signupobj.studentsdetails;
	public void deletedetails(String email) {
		map1.remove(email);
		System.out.println();
	}
}
