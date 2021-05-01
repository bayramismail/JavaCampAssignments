
public class Student extends User {

	private String firstName;
	private String lastName;
	
	public Student() {
		super();

	}

	public Student(int id, String firstName, String lastName, String userName, String eposta, String phone,
			String password) {
		super(id, userName, eposta, phone, password);
		
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
