
public class Student {
	
	private String StudentID;
	private String Name;
	private String Grade;
	private String Classname;
	private String Classteacher;
	private String parentName;
	private String parentEmail;
	private String address;
	private String contactNo;
	private boolean isAvailable;
	
	public String getStudentID() {
		
		return StudentID;
		
	}
	public Student(String studentID, String name, String grade, String classname, String classteacher,
			String parentName, String parentEmail, String address, String contactNo, boolean isAvailable) {
		super();
		StudentID = studentID;
		Name = name;
		Grade = grade;
		Classname = classname;
		Classteacher = classteacher;
		this.parentName = parentName;
		this.parentEmail = parentEmail;
		this.address = address;
		this.contactNo = contactNo;
		this.isAvailable = isAvailable;
	}

	
	public void setStudentID(String studentID) {
		
		StudentID = studentID;
		
	}
	
	public String getName() {
		
		return Name;
	}
	
	public void setName(String name) {
		
		Name = name;
	}
	
	public String getGrade() {
		
		return Grade;
	}
	
	public void setGrade(String grade) {
		
		Grade = grade;
	}
	
	public String getClassname() {
		
		return Classname;
	}
	
	public void setClassname(String classname) {
		
		Classname = classname;
	}
	
	public String getClassteacher() {
		
		return Classteacher;
	}
	
	public void setClassteacher(String classteacher) {
		
		Classteacher = classteacher;
	}
	
	public String getParentName() {
		
		return parentName;
	}
	
	public void setParentName(String parentName) {
		
		this.parentName = parentName;
	}
	
	public String getParentEmail() {
		
		return parentEmail;
	}
	
	public void setParentEmail(String parentEmail) {
		
		this.parentEmail = parentEmail;
	}
	
	public String getAddress() {
		
		return address;
	}
	
	public void setAddress(String address) {
		
		this.address = address;
	}
	
	public String getContactNo() {
		
		return contactNo;
	}
	
	public void setContactNo(String contactNo) {
		
		this.contactNo = contactNo;
	}
	
	public boolean isAvailable() {
		
		return isAvailable;
	}
	
	public void setAvailable(boolean isAvailable) {
		
		this.isAvailable = isAvailable;
	}
	
	

}
