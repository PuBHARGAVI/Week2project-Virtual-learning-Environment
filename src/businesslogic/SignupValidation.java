package businesslogic;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Pattern;

import model.User;
public class SignupValidation {
public static Map<String, ArrayList> studentsdetails = new TreeMap<String, ArrayList>(); 
static Set<String> emailset = new TreeSet<String>();
String email,password,confirmpassword;
LoginValidation lv=new LoginValidation();
public boolean checkUserDetails(String email, String password, String confirmpassword,String Phonenumber,String name,String fac) {
			if(validEmail(email)&&validPassword(password,confirmpassword)&&validPhone(Phonenumber)) {
				System.out.println("correct");
				if(!emailset.contains(email)) {
					System.out.println("Hi");
					ArrayList<String> list=new ArrayList<String>();
					list.add(name);
					list.add(Phonenumber);
					list.add(password);
					list.add(fac);
					studentsdetails.put(email, list);
					emailset.add(email);
			    	return true;
			    }
				
				else if(emailset.contains(email)) {
					System.out.println("Email already Exists");
					return false;
				}
			}
				return false;
	}
//validating user login status
public boolean Checkloginstatus(String email, String password) {
	if(emailset.contains(email) && studentsdetails.get(email).get(2).toString().equals(password) && lv.mailemail.toString().equals("false") ) {
		return true;
	}
	return false;
}
//validating Password
private boolean validPassword(String password, String confirmpassword) {
	if(password.equals(confirmpassword)==false)
		    return false;
	boolean lc=false;//checks for lowercase
	boolean uc=false;//checks for uppercase
	boolean digit=false;//checks for digits
	if(password.length()>8 &&password.length()<15 && password!=null) {
		   for(int i=0;i<password.length();i++) {
			   char ch=password.charAt(i);
		    	if(Character.isUpperCase(ch)) 
		    		uc=true;
		    	if(Character.isLowerCase(ch)) 
		    		lc=true;
		    	if(Character.isDigit(ch))
		    		digit=true;
		    			
		    if(lc && uc && digit)
		    	return true;
		    		}
		   }
	System.out.println("Enter correct password");
	return false;
		}
		    
//validating email
private boolean validEmail(String email) {
String Regex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                "[a-zA-Z0-9_+&*-]+)*@" + 
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$"; 
Pattern pat = Pattern.compile(Regex); 
if(email==null) {
	System.out.println("enter valid email");
   return false; 
}
return pat.matcher(email).matches(); 
 }
private boolean validPhone(String email) {
	if(email.length()!=10) {
		System.out.println("Enter correct phone number of length 10");
		return false;
	}
	return true;
}
 }

