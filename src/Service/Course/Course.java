package Service.Course;
import java.util.*;

import businesslogic.SignupValidation;
public class Course {
	public void displaycourse(String email,String s) {
	Scanner sc=new Scanner(System.in);
	SignupValidation obj=new SignupValidation();
	Map<String, ArrayList> stddetails =obj.studentsdetails;
	while(true) {
	System.out.println("Select the course you want for\n 1.Java 2.Python 3.Web technologies choose 4.exit 1/2/3/4");
	int option=sc.nextInt();
	if(option==1) {
	Javacourse jc=new Javacourse();
	jc.display(email,s);
	}
	else if(option==2) {
		PythonCourse pc=new PythonCourse();		
		pc.display(email,s);
	}	
	else if(option==3) {
		WebTechnologiesCourse wc=new WebTechnologiesCourse();
		wc.display(email,s);
	}
	else {
		break;
	}
		}
		
	}
}


