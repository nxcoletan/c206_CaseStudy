/*
 * I declare that this code was written by me. 
 * I will not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Ezekiel Tan
 * Student ID: 20011155
 * Class: E37E
 * Date/Time created: Tuesday 03-08-2021 21:50
 */

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
