package businesslogic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import model.User;
import controller.DeleteStudentDetails;
import controller.UpdateStudentDetails;
import controller.ViewStudentDetails;
import controller.VirtualClass;
import controller.Course.Course;
public class LoginValidation {
	Scanner sc=new Scanner(System.in);
	static String mailemail="";
	static String email1="";
	public boolean UserValidation(String email, String password,String status) {
		
		SignupValidation obj = new SignupValidation();
		if(obj.Checkloginstatus(email, password)) {
			return true;
		}
		return false;
	}
	public void registerfun() {
		System.out.println("enter your name");
		String name=sc.next();
		System.out.println("enter your email");
		String email=sc.next();
		System.out.println("enter your Password");
		String password=sc.next();
		System.out.println("Reenter password");
		String confirmpassword=sc.next();
		System.out.println("Enter Phonenumber");
		String phonenumber=sc.next();
		System.out.println("Choose 1.Faculty 2.Student 1/2");
		int opt=sc.nextInt();
		String ch="s";
		if(opt==1) {
			ch="f";
		}
		SignupValidation signupobj=new SignupValidation();
		boolean output=signupobj.checkUserDetails(email, password, confirmpassword,phonenumber,name,ch);
		if(output) {
			System.out.println("Thank you for Registering");
			mailemail="true";
			email1=email;
		}
		else {
			System.out.println("enter correct Details");
		}
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char ch;
	while(true) {
	System.out.println("Select the option 1.login 2.register 3.detailsupdate 4.Delete 5.Viewdetails 6.courses 7.virtualcalss 8.Exit 1/2/3/4/5/6/7/8");
	int option=sc.nextInt();
	SignupValidation obj1=new SignupValidation();
	
	if(option==1) {
	System.out.println("enter your email");
	String email=sc.next();
	System.out.println("enter your Password");
	String password=sc.next();
	System.out.println("enter whether your a faculty or student f/s");//s-student,f=faculty
	char torst=sc.next().charAt(0);
	User userobj=new User(email,password);
	LoginValidation lv=new LoginValidation();
	boolean out=false;
	out=lv.UserValidation(email, password,mailemail);
	if(out==true) {
		System.out.println("Welcome");
		mailemail="true";
		email1=email;
	}
	else if(out==false && torst=='t') {
		System.out.println("You are not admin");
	}
	else {
		System.out.println("First Signup because you are not a user");
		LoginValidation obj=new LoginValidation();
		obj.registerfun();
	}
	}
	else if(option==2) {
		LoginValidation obj=new LoginValidation();
		obj.registerfun();
	}
	else if(option==3) {
		//to update user details
		if(mailemail.equals("true")){
			SignupValidation signup=new SignupValidation();
			if(signup.studentsdetails.get(email1).get(3).toString().equals("f")) {
				UpdateStudentDetails update=new UpdateStudentDetails();
				System.out.println("Select option 1.name 2.phonenumber");
				int opt=sc.nextInt();
				update.updatedetails(email1,opt);
			}
			else {
				System.out.println("You are not admin");
			}
		}
		else {
			System.out.println("You are not logged in");
		} 
	}
	else if(option==4) {
		//to delete user details
		if(mailemail.equals("true")){
		DeleteStudentDetails delete=new DeleteStudentDetails();
		delete.deletedetails(email1);
		}
		else {
			System.out.println("You are not logged in");
		}
	}
	else if(option==5) {
		//to view user details 
		if(mailemail.equals("true")){
		System.out.println("Are you a student or faculty s/f");
		char c=sc.next().charAt(0);
		ViewStudentDetails view=new ViewStudentDetails();
		view.viewdetails(email1,c);
	}
	else {
		System.out.println("You are not logged in");
	}
}
	else if(option==6) {
		if(mailemail.equals("true")){
		SignupValidation obj=new SignupValidation();
		Course course=new Course();
		//to see courses
		course.displaycourse(email1,obj.studentsdetails.get(email1).get(3).toString());
		}
		else {
			System.out.println("You are not logged in");
		}
	}	
	else if(option==7) {
		//to register for virtual classes and see the students registered
		if(mailemail.equals("true")){
		System.out.println("choose 1.studentslist registered for virtual class 2.Register");
		int opt=sc.nextInt();
		VirtualClass vc=new VirtualClass();
		if(opt==1) {
			System.out.println("Enter course name");
			String coursenam=sc.next();
			vc.register(email1, coursenam);
			}
		else {
			vc.viewlist();
		}
		}
	else {
		System.out.println("You are not logged in");
	}
}
	else if(option==8) {
		//to logout
		System.out.println("You are logged out.Thank you."); 
		mailemail="false";
	}
	}
}
}
	
	
