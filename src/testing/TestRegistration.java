package testing;
import static org.junit.Assert.*;
import org.junit.Test;
import businesslogic.SignupValidation;

public class TestRegistration {
	SignupValidation sv = new SignupValidation();
	@Test
	public void testCheckUserDetails() {
		assertEquals(true, sv.checkUserDetails("bhargavi@gmail.com", "Password@17", "Password@17","9867686797","bhargavi","f"));
		assertEquals(false, sv.checkUserDetails("bhargavi@gmail.com", "Password@17", "Password@16","9768593485","bhargavi","f"));
		assertEquals(false, sv.checkUserDetails("bhargavi@gmail.com", "Password@17", "Password@17","97678666","bhargavi","f"));
		assertEquals(true, sv.checkUserDetails("bhargavi@gmail.com", "Password@17", "Password@17","9867686797","bhargavi","s"));
		try {
			sv.checkUserDetails(null,null,null,null,null,null);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}