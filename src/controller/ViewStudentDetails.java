package controller;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import businesslogic.SignupValidation;

public class ViewStudentDetails {
	public void viewdetails(String email,char c) {
	SignupValidation signupobj=new SignupValidation();
	Map<String, ArrayList> map1=signupobj.studentsdetails;
	ArrayList<String> list=map1.get(email);

		Map<String, ArrayList> map2=signupobj.studentsdetails;
		for (Entry<String, ArrayList> entry : map2.entrySet())  
            System.out.println("email = " + entry.getKey()+",Name of student "+entry.getValue().get(0)+",Name of student"+entry.getValue().get(1)); 
	
	}
}

