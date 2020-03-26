package testing;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Test;

import model.User;

public class TestUser {
	LocalDateTime ld = LocalDateTime.of(2005, 4, 9, 22, 05, 12);
	User user = new User ( "admin@gmail.com","Admin@556",ld);
	
	@Test
	public void testSetterGetter() {
		user.setDate(ld);
		user.setEmail("admin@gmail.com");
		user.setPassword("Admin@556");
		assertEquals("admin@gmail.com",user.getEmail());
		assertEquals("Admin@556",user.getPassword());
		assertEquals(ld,user.getDate());
		try {
			user.setDate(null);
			user.setEmail(null);
			user.setPassword(null);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
