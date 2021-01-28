package Service.Course;
import java.util.ArrayList;
import java.util.Scanner;
public class Javacourse{
	Scanner sc=new Scanner(System.in);
	ArrayList<String> stdweb=new ArrayList<String>();
	static ArrayList<String> modules=new ArrayList<String>();
	static ArrayList<String> assignments=new ArrayList<String>();
	static ArrayList<String> assessments=new ArrayList<String>();
	public void display(String email,String s) {
		System.out.println("if you are not registered for the course please register first- choose Y/N otherwise ignore");
		char c=sc.next().charAt(0);
		if(c=='Y') {
			stdweb.add(email);
			System.out.println("registration is successful for the course");
			}
		
		if(stdweb.contains(email)) {
		while(true){
			System.out.println("choose 1.modules 2.assignments 3.quizzes 4.exit");
			int opt=sc.nextInt();
		if(opt==1) {
			System.out.println("choose 1.add 2.view 3.delete");
			int opt1=sc.nextInt();
			if(opt1==1) {
				if(s=="f") {
				addmodules();
				}
				else {
					System.out.println("You are not admin");
				}
			}
			else if(opt1==2) {
				viewmodules();
			}
			else {
				if(s=="f") {
					deletemodules();
				}
				else {
					System.out.println("You are not admin");
				}
			}
		}
		else if(opt==2) {
			System.out.println("choose 1.add 2.view 3.delete");
			int opt1=sc.nextInt();
			if(opt1==1) {
				if(s=="f") {
					addassignments();
				}
				else {
					System.out.println("You are not admin");
				}
			}
			else if(opt1==2) {
				viewassignments();
			}
			else {
				if(s=="f") {
				deleteassignments();
				}
				else {
					System.out.println("You are not admin");
				}
			}
		}
		else if(opt==3) {
			System.out.println("choose 1.add 2.view 3.delete");
			int opt1=sc.nextInt();
			if(opt1==1) {
				if(s=="f") {
				addassessments();
				}
				else {
					System.out.println("You are not admin");
				}
			}
			else if(opt1==2) {
				viewassessments();
			}
			else {
				if(s=="f") {
				deleteassessments();
			}
				else {
					System.out.println("You are not admin");
				}
		}
		}
		else {
			break;
		}
	}
		}
	else {
		System.out.println("You are not registered for the course");
	}
}
	public void viewmodules() {
	for(String module:modules) {
		System.out.println(module);
	}
	}
	public void addmodules() {
		int size=modules.size();
		size+=1;
		modules.add("module"+size);

	}
	public void deletemodules() {
		System.out.println("enter the module name you want to delete");
		String name=sc.next();
		modules.remove(name);
	}
	public void viewassignments() {
		for(String assignment:assignments) {
			System.out.println(assignment);
		}
		}
		public void addassignments() {
			int size=assignments.size();
			size+=1;
			assignments.add("assignment"+size);
		}
		public void deleteassignments() {
			System.out.println("enter the assignment name you want to delete");
			String name=sc.next();
			assignments.remove(name);
		}
		public void viewassessments() {
			for(String assessment:assessments) {
				System.out.println(assessment);
			}
			}
			public void addassessments() {
				int size=assessments.size();
				size+=1;
				assessments.add("assessment"+size);
			}
			public void deleteassessments() {
				System.out.println("enter the assessment name you want to delete");
				String name=sc.next();
				assessments.remove(name);
			}
					

}
