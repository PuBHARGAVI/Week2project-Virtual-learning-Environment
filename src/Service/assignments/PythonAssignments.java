package Service.assignments;

import java.util.ArrayList;
import java.util.Scanner;
public class PythonAssignments {
		ArrayList<String> assignments=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
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
		public void deletassignments() {
			System.out.println("enter the assignment name you want to delete");
			String name=sc.next();
			assignments.remove(name);
		}
	}