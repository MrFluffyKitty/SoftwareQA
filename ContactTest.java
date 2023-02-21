import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("1111", "Leeroy", "Jenkins", "0123456789", "SNHU");
		assertTrue(contact.getID().equals("1111"));
		assertTrue(contact.getFirstName().equals("Leeroy"));
		assertTrue(contact.getLastName().equals("Jenkins"));
		assertTrue(contact.getPhone().equals("0123456789"));
		assertTrue(contact.getAddress().equals("SNHU"));
	}
	
	@Test
	void testContactIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Jenkins", "Jenkins", "0123456789", "SNHU");
		});
	}
	
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1111111111111", "Jenkins", "Jenkins", "0123456789", "SNHU");
		});
	}
	
	@Test
	void testContactFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("11111111", null, "Jenkins", "0123456789", "SNHU");
		});
	}
	
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1111", "LeeroyJenkins", "Jenkins", "0123456789", "SNHU");
		});
	}
	
	@Test
	void testContactLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("111111", "Jenkins", null, "0123456789", "SNHU");
		});
	}
	
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1111", "Leeroy", "LeeroyJenkins", "0123456789", "SNHU");
		});
	}
	
	@Test
	void testContactPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1111", "Jenkins", "Jenkins", null, "SNHU");
		});
	}
	
	@Test
	void testContactPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1111", "Leeroy", "Jenkins", "012345678910", "SNHU");
		});
	}
	
	@Test
	void testContactAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1111111111111", "Jenkins", "Jenkins", "0123456789", null);
		});
	}
	
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1111", "Leeroy", "Jenkins", "0123456789", "SNHU01234567890123456789012345678901234567890123456789");
		});
	}
	
	@Test
	void testContactAllNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, null, null, null, null);
		});
	}
}
