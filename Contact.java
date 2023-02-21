public class Contact {
	
	// Instantiated variables
	private String ID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	// contact constructor
	public Contact(String ID, String firstName, String lastName, String phone, String address) {
		setID(ID);
		setFirstName(firstName);
		setLastName(lastName);
		setPhone(phone);
		setAddress(address);
	}
	
	// getters and setters with throw exceptions and input validation
	public String getID() {
		return ID;
	}
	
    public void setID(String ID) {
        if (ID == null || ID.length() > 10) {
        	throw new IllegalArgumentException("invalid ID");
        }
        this.ID = ID;
    }

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10 || firstName.length() < 1) {
			throw new IllegalArgumentException("invalid firstName");
		}
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10 || lastName.length() < 1) {
			throw new IllegalArgumentException("invalid lastName");
		}
		this.lastName = lastName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("invalid phone");
		}
		this.phone = phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		if (address == null || address.length() > 30 || address.length() < 1) {
			throw new IllegalArgumentException("invalid address");
		}
		this.address = address;
	}
}

