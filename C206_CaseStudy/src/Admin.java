
public class Admin {
	private String name;
	private String username;
	private String password;
	private int adminid;
	private String role;

	public Admin(String name, String username, String password, int adminid, String role) {
		this.name = name;
		this.username = username;
		this.password = password;
		this.adminid = adminid;
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) { 
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public String getUsername() {
		return username;
	}

	public int getadminid() {
		return adminid;
	}

	public String getRole() {
		return role;
	}

}
