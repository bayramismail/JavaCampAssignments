
public class Instructor extends User {

	private String firstName;
	private String lastName;
	
	public Instructor() {
		super();
	}

	public Instructor(int id, String userName, String eposta, String phone, String password, String firstName,
			String lastName) {
		super(id, userName, eposta, phone, password);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
