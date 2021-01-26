package Registration;
import java.util.Scanner;

import Model.User;
public class LoginValidation {
public boolean teacherValidation(String email, String pass){
		
		if(email.equals("admin@gmail.com")&& pass.equals("admin")) {
			return true;
		}return false;
		
	}
	
	public boolean studentValidation(String email, String password) {
		SignupValidation obj = new SignupValidation();
		if(obj.userdetails.containsKey(email) && password.equals(obj.userdetails.get(email))) {
			System.out.println();
			return true;
		}return false;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your email");
	String email=sc.nextLine();
	System.out.println("enter your Password");
	String password=sc.nextLine();
	System.out.println("enter whether your a faculty or student f/s");//s-student,f=faculty
	char torst=sc.next().charAt(0);
	System.out.println("Enter Id");
	int id=sc.nextInt();
	User userobj=new User(id,email,password);
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
		System.out.println("enter your email");
		email=sc.next();
		System.out.println("enter your Password");
		password=sc.next();
		System.out.println("Reenter password");
		String confirmpassword=sc.next();
		SignupValidation signupobj=new SignupValidation();
		boolean output=signupobj.checkUserDetails(email, password, confirmpassword);
		if(output) {
			System.out.println("Thank you for Registering");
		}
		else {
			System.out.println("enter correct Details");
		}
	}
}
}
