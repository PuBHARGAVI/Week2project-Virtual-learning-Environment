package testing;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Test;

import model.User;

public class TestUser {
	User user = new User();	
	@Test
	public void testSetterGetter() {
		user.setEmail("bhargavi@gmail.com");
		user.setPassword("Password@17");
		assertEquals("abc@gmail.com",user.getEmail());
		assertEquals("Abc@55",user.getPassword());
		try {
			user.setEmail(null);
			user.setPassword(null);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}