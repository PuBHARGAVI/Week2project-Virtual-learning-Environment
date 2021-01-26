package Registration;
import Model.User;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class SignupValidation {
static Map<String, String> userdetails = new TreeMap<String, String>(); 
Set<String> emailset = new TreeSet<String>();
String email,password,confirmpassword;
public boolean checkUserDetails(String email, String password, String confirmpassword) {
			if(validEmail(email)&&validPassword(password,confirmpassword)) {
				if(!emailset.contains(email)) {
					System.out.println("Hi");
					userdetails.put(email, password);
					emailset.add(email);
			    	return true;
			    }
				return false;
			}
			else
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
	return false;
		}
		    
//validating email
private boolean validEmail(String email) {
String Regex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                "[a-zA-Z0-9_+&*-]+)*@" + 
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$"; 
Pattern pat = Pattern.compile(Regex); 
if(email==null) 
   return false; 
return pat.matcher(email).matches(); 
 }	
 }

