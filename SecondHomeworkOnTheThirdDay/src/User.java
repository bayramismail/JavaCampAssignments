
public class User {
	private int id;

	private String userName;
	private String eposta;
	private String phone;
	private String password;

	public User(int id,  String userName, String eposta, String phone,
			String password) {
		super();
		this.id = id;
		
		this.userName = userName;
		this.eposta = eposta;
		this.phone = phone;
		this.password = password;
	}

	public User() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
