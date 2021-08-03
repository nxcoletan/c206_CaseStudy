
public class Student {
	
	private int StudentID;
	private String Name;
	private String registrationID;
	private String Grade;
	private String Classname;
	private String Classteacher;
	private String parentName;
	private String parentEmail;
	private String address;
	private String parentNumber;
	private String cca;
	
	public int getStudentID() {
		
		return StudentID;
		
	}
	public Student(int studentID, String name, String registrationID, String grade, String classname, String classteacher,
			String parentName, String parentEmail, String address, String parentNumber, String cca) {
		this.StudentID = studentID;
		this.Name = name;
		this.registrationID = registrationID;
		this.Grade = grade;
		this.Classname = classname;
		this.Classteacher = classteacher;
		this.parentName = parentName;
		this.parentEmail = parentEmail;
		this.address = address;
		this.parentNumber = parentNumber;
		this.cca = cca;
	}
	
	public String getCca() {
		
		return cca;
		
	}
	
	public void setCca(String cca) {
		
		this.cca = cca;
		
	}
	
	public Student(int studentID, String name, String grade, String classname, String classteacher,
			String parentName, String parentEmail, String address, String parentNumber) {
		super();
		this.StudentID = studentID;
		this.Name = name;	
		this.Grade = grade;
		this.registrationID = "";
		this.Classname = classname;
		this.Classteacher = classteacher;
		this.parentName = parentName;
		this.parentEmail = parentEmail;
		this.address = address;
		this.parentNumber = parentNumber;
		this.cca = "Pending";
		
	}

	
	public void setStudentID(int studentID) {
		
		StudentID = studentID;
		
	}
	
	public String getName() {
		
		return Name;
	}
	
	public void setName(String name) {
		
		Name = name;
	}
	
	public String getRegistrationID() {
		return registrationID;
	}
	public void setRegistrationID(String registrationID) {
		this.registrationID = registrationID;
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
	
	public String getParentNumber() {
		
		return parentNumber;
	}
	
	public void setParentNumber(String parentNumber) {
		
		this.parentNumber = parentNumber;
	}
	
}
