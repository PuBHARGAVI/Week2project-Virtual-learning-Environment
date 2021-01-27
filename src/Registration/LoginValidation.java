package Registration;

import java.util.Map;
import java.util.Scanner;

import Model.User;
import Service.DeleteStudentDetails;
import Service.UpdateStudentDetails;
import Service.ViewStudentDetails;
public class LoginValidation {
	Scanner sc=new Scanner(System.in);
public boolean teacherValidation(String email, String pass){
		
		if(email.equals("admin@gmail.com")&& pass.equals("admin")) {
			ViewStudentDetails view=new ViewStudentDetails();
			view.viewdetails(email,'f');
			return true;
		}return false;
		
	}
	
	public boolean studentValidation(String email, String password) {
		
		SignupValidation obj = new SignupValidation();
		if(obj.studentsdetails.containsKey(email) && password.equals(obj.studentsdetails.get(email))) {
			System.out.println();
			return true;
		}return false;
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
		SignupValidation signupobj=new SignupValidation();
		boolean output=signupobj.checkUserDetails(email, password, confirmpassword,phonenumber,name);
		if(output) {
			System.out.println("Thank you for Registering");
			
			}
		else {
			System.out.println("enter correct Details");
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char ch;
	while(true) {
	System.out.println("Select the option 1.login 2.register 3.update 4.Delete 5.View 6.Exit 1/2/3/4/5/6");
	int option=sc.nextInt();
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
	if(torst=='s') {
		out=lv.studentValidation(email, password);
	}
	else {
		out=lv.teacherValidation(email, password);
	}
	if(out==true) {
		System.out.println("Welcome");
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
		UpdateStudentDetails update=new UpdateStudentDetails();
		System.out.println("Enter your email");
		String email=sc.next();
		System.out.println("Select option 1.name 2.phonenumber");
		int opt=sc.nextInt();
		update.updatedetails(email,opt);
	}
	else if(option==4) {
		DeleteStudentDetails delete=new DeleteStudentDetails();
		System.out.println("Enter your email");
		String email=sc.next();
		delete.deletedetails(email);
	}
	else if(option==5) {
		ViewStudentDetails view=new ViewStudentDetails();
		System.out.println("Enter your email");
		String email=sc.next();
		System.out.println("Are you a student or faculty s/f");
		char c=sc.next().charAt(0);
		view.viewdetails(email,c);
	}
	else if(option==6) {
		System.out.println("You are logged out.Thank you."); 
		break;
	}
	}
}
}
	
	
