import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.*;

class ContactServiceTest {
	
	private final Map<String, Contact> conList = new HashMap<>();
	
	@Test
	void testHashmapAndAddContact() {
		ContactService conService = new ContactService();
		conService.addContact("Leeroy", "Jenkins", "876712341", "Missouri");
		assertNotNull(conList.get("0001"));
	}
	
	@Test
	void testAddContactAndDelContact() {
		ContactService conService = new ContactService();
		conService.addContact("Leeroy", "Jenkins", "123456578", "Colorado");
		conService.delContact("0002");
		assertTrue(conList.containsKey("0001") && conList.get("0002") == null);
	}
	
	@Test
	void testUpdateContactAndGetContact() {
		ContactService conService = new ContactService();
		conService.addContact("Leeroy", "Jenkins", "876712341", "Missouri");
		conService.updateContact("0003", "Leeroy", "Jenkins", "876712341", "Michigan");
		assertTrue(conList.containsKey("0001"));
	}
}
 