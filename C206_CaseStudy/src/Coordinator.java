 public class Coordinator {
	private String name;
	private String username;
	private String password;
	private int coordId;
	private String role;
	
	public Coordinator(String name, String username, String password, int coordId, String role) {
		this.name = name;
		this.username = username;
		this.password = password;
		this.coordId = coordId;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public int getCoordId() {
		return coordId;
	}

	public String getRole() {
		return role;
	}

	public void setPassword(String password) {
		this.password = password;
	}



}

    
