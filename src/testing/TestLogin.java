package testing;

import static org.junit.Assert.*;
import org.junit.Test;

import businesslogic.LoginValidation;
public class TestLogin {
	
		LoginValidation lu = new LoginValidation();
		
		@Test
		public void testValidate() {
			assertEquals(false,lu.UserValidation("bhargavi@gmail.com", "Password@17","false"));
			assertEquals(true,lu.UserValidation("bhargavi@gmail.com", "Password@17","true"));
			try {
				lu.UserValidation(null,null,null);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	

}