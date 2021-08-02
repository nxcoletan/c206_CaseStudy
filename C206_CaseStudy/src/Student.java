
public class Student {
	
	private int StudentID;
	private String Name;
	private String Grade;
	private String Classname;
	private String Classteacher;
	private String parentName;
	private String parentEmail;
	private String address;
	private String contactNo;
	private String cca;
	
	
	public int getStudentID() {
		
		return StudentID;
		
	}
	public Student(int studentID, String name, String grade, String classname, String classteacher,
			String parentName, String parentEmail, String address, String contactNo, String cca) {
		super();
		this.StudentID = studentID;
		this.Name = name;
		this.Grade = grade;
		this.Classname = classname;
		this.Classteacher = classteacher;
		this.parentName = parentName;
		this.parentEmail = parentEmail;
		this.address = address;
		this.contactNo = contactNo;
		this.cca = cca;
	}
	
	public String getCca() {
		
		return cca;
		
	}
	
	public void setCca(String cca) {
		
		this.cca = cca;
		
	}
	
	public Student(int studentID, String name, String grade, String classname, String classteacher,
			String parentName, String parentEmail, String address, String contactNo) {
		super();
		this.StudentID = studentID;
		this.Name = name;
		this.Grade = grade;
		this.Classname = classname;
		this.Classteacher = classteacher;
		this.parentName = parentName;
		this.parentEmail = parentEmail;
		this.address = address;
		this.contactNo = contactNo;
		
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
	
}
