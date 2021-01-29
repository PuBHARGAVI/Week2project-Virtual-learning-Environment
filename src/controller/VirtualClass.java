package controller;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class VirtualClass {
	static Map<String,String> stdlist=new HashMap<String,String>();
	public void register(String email,String coursename) {
		stdlist.put(email,coursename);
		}
	public void viewlist() {
		if(stdlist==null) {
			System.out.println("No rows");
		}
		else {
		System.out.println("Students registered for virtual classes");
		for (Map.Entry<String,String> entry : stdlist.entrySet()) {  
            System.out.println("email = " + entry.getKey() + 
                             ", coursename = " + entry.getValue());
		}
  
	}
}
}
