package Service;

import java.util.ArrayList;
import java.util.Map;

import businesslogic.SignupValidation;

public class DeleteStudentDetails {
	SignupValidation signupobj=new SignupValidation();
	Map<String, ArrayList> map1=signupobj.studentsdetails;
	public void deletedetails(String email) {
		if(map1.get(email)==null) {
			System.out.println("You are not reistered");
		}
		else {
		map1.remove(email);
		System.out.println();
	}
	}
}
