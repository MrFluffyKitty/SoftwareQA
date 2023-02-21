import java.util.HashMap;
import java.util.Map;

public class ContactService {
	
	// sets ID
	int ID = 0000;
	
	// initializes hashmap
	private final Map<String, Contact> contactList = new HashMap<>();
	
	// gets id from hashmap
	public Contact getContact(String ID) {
	    return contactList.get(ID);
	}
	
	// adds contact
	public Contact addContact(String firstName, String lastName, String phone, String address) {
		ID++;
		String contactId = Integer.toString(ID);
	    Contact contact = new Contact(contactId, firstName, lastName, phone, address);
	    return contactList.put(contactId, contact);
	}
	
	// updates contact using id
	public void updateContact(String contactId, String firstName, String lastName, String phone, String address) {
	    Contact contact = getContact(contactId);
	    contact.setFirstName(firstName);
	    contact.setLastName(lastName);
	    contact.setPhone(phone);
	    contact.setAddress(address);
	}
	
	// deletes contact using id
	public Contact delContact(String ID) {
		String contactId = Integer.toString(this.ID);
		return contactList.remove(contactId);
	}
}
