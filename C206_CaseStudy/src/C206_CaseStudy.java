import java.util.ArrayList;
import java.util.Random;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		ArrayList<CCA> ccaList = new ArrayList<CCA>();
		Student student1 = new Student(01,"Ezekiel", "P6", "P6-01", "Mr Lim", "Mr Joespeh ", "jospeh@gamil.com","No 4 , Bedok Road , Singapore", "+65 85950014");
		studentList.add(student1);

		//Hello
		Admin admin = new Admin("Systemadmin ", "admin", "admin", 1, "admin");
		
		
		while (true) {
			C206_CaseStudy.MainMenu();
			int staffChoice = Helper.readInt("Enter choice > ");
			
			if (staffChoice == 1) {
					C206_CaseStudy.loginMenu();
					String uName = Helper.readString("Enter username > ");
					String uPassword = Helper.readString("Enter password > ");
					boolean isAdmin = C206_CaseStudy.doadminLogin(admin, uName, uPassword);
					if (isAdmin == false) {
						System.out.println("Either your username or password was incorrect. Please try again!");
					}
					while (isAdmin) {
						C206_CaseStudy.adminMenu();
						int choice = Helper.readInt("Enter choice > ");
						
						if (choice == 1) {
							
							String allstudentList = C206_CaseStudy.studentListToString(studentList);
							System.out.println(allstudentList);
							System.out.println("Total number of students: " + C206_CaseStudy.getallstudentList(studentList));

						} else if (choice == 2) {
							
							int EditStudentID = Helper.readInt("Enter Student ID > ");
							String StudentListDetails = C206_CaseStudy.getStudentListById(studentList, EditStudentID);
							if (!StudentListDetails.isEmpty()) {
								System.out.println(StudentListDetails);
								String NameUpdate = Helper.readString("Enter Name > ");
								String GradeUpdate = Helper.readString("Enter Grade > ");
								String ClassnameUpdate = Helper.readString("Enter Classname > ");
								String ClassteacherUpdate = Helper.readString("Enter Classteacher > ");
								String parentNameUpdate = Helper.readString("Enter Parent Name > ");
								String parentEmailUpdate = Helper.readString("Enter Parent Email > ");
								String addressUpdate = Helper.readString("Enter Address > ");
								String contactNoUpdate = Helper.readString("Enter Contact Number > ");
								
								boolean isEdited = C206_CaseStudy.editStudentStatus(studentList, EditStudentID, NameUpdate, GradeUpdate, ClassnameUpdate, ClassteacherUpdate, parentNameUpdate, parentEmailUpdate, addressUpdate, contactNoUpdate);
								if (isEdited == true) {
									StudentListDetails = C206_CaseStudy.getStudentListById(studentList, EditStudentID);
									System.out.println(String.format("Student details of ", EditStudentID," had been Updated"));
									System.out.println(StudentListDetails);
								} else {
									System.out.println("The inputs you entered is invalid.");
				
								}
							} else {
								System.out.println("That Student ID does not exist!");
							}
							
							
						} else if (choice == 3) {
							
							
							int deleteStudentID = Helper.readInt("Enter Student ID > ");

							String Studentdetails = C206_CaseStudy.getStudentListById(studentList, deleteStudentID);

							if (!Studentdetails.isEmpty()) {
								System.out.println(Studentdetails);
								char toDelete = Helper.readChar("Do you wish to delete this flight?(y/n) > ");

								if (toDelete == 'y') {
									boolean deleted = C206_CaseStudy.removeStudent(studentList, deleteStudentID);

									if (deleted == true) {
										System.out.println(String.format("Student id %d account was deleted successfully.", deleteStudentID));
									} else {
										System.out.println("Something went wrong, flight schedule was not deleted.");
									}
								}
							} else {
								System.out.println("That Student ID does not exist!");
							}

							
						} else if (choice == 4) {		
							int id = Helper.readInt("Enter ID number > ");
							String ccaName = Helper.readString("Enter CCA Name > ");
							String description = Helper.readString("Enter CCA Description > ");
							String classsize = Helper.readString("Enter Class Size > ");
							String dayofweek = Helper.readString("Enter CCA Day of Week > ");
							String time = Helper.readString("Enter CCA time > ");
							String venue = Helper.readString("Enter CCA Venue > ");
							String nameofInstructor = Helper.readString("Enter CCA Instructor Name > ");
							
							CCA newCCA = new CCA(id, ccaName, description, classsize, dayofweek, time, venue, nameofInstructor);
							boolean result = C206_CaseStudy.addCCA(ccaList, newCCA);
							if (result == true) {
								System.out.println("CCA added!");
							} else {
								System.out.println("CCA NOT added, you must include all details!");
							}

							
						} else if (choice == 5) {
							
							int deleteCCAID = Helper.readInt("Enter CCA ID > ");

							String CCAdetails = C206_CaseStudy.getCCAListById(ccaList, deleteCCAID);

							if (!CCAdetails.isEmpty()) {
								System.out.println(CCAdetails);
								char toDelete = Helper.readChar("Do you wish to delete this flight?(y/n) > ");

								if (toDelete == 'y') {
									boolean deleted = C206_CaseStudy.removeCCA(ccaList, deleteCCAID);

									if (deleted == true) {
										System.out.println(String.format("CCA was deleted successfully.", deleteCCAID));
									} else {
										System.out.println("Something went wrong, flight schedule was not deleted.");
									}
								}
							} else {
								System.out.println("That CCA ID does not exist!");
							}
							
							
						} else if (choice == 6) {
							
							int EditCCAID = Helper.readInt("Enter CCA ID > ");
							String CCAdetails = C206_CaseStudy.getCCAListById(ccaList, EditCCAID);
							if (!CCAdetails.isEmpty()) {
								System.out.println(CCAdetails);
								String ccaNameUpdate = Helper.readString("Enter CCA Name > ");
								String descriptionUpdate = Helper.readString("Enter CCA Description > ");
								String classsizeUpdate = Helper.readString("Enter Class Size > ");
								String dayofweekUpdate = Helper.readString("Enter CCA Day of Week > ");
								String timeUpdate = Helper.readString("Enter CCA time > ");
								String venueUpdate = Helper.readString("Enter CCA Venue > ");
								String nameofInstructorUpdate = Helper.readString("Enter CCA Instructor Name > ");
						
								boolean isEdited = C206_CaseStudy.editCCAStatus(studentList, EditCCAID, ccaNameUpdate, descriptionUpdate, classsizeUpdate, dayofweekUpdate, timeUpdate, venueUpdate, nameofInstructorUpdate);
								if (isEdited) {
									CCAdetails = C206_CaseStudy.getCCAListById(ccaList, EditCCAID);
									System.out.println(String.format("CCA details of ", EditCCAID," had been Updated"));
									System.out.println(CCAdetails);
								} else {
									System.out.println("The inputs you entered is invalid.");
								}
							} else {
								System.out.println("That CCA ID does not exist!");
							}

						
						} else {
							System.out.println("Invalid choice");
						
						}
					}
					
			}else if(staffChoice == 2) {
				int StudentID = Helper.readInt("Enter Student ID > ");
				String Name = Helper.readString("Enter Name > ");
				String Grade = Helper.readString("Enter Grade > ");
				String Classname = Helper.readString("Enter Classname > ");
				String Classteacher = Helper.readString("Enter Classteacher > ");
				String parentName = Helper.readString("Enter Parent Name > ");
				String parentEmail = Helper.readString("Enter Parent Email > ");
				String address = Helper.readString("Enter Address > ");
				String contactNo = Helper.readString("Enter Contact Number > ");
				Student newSchedule = new Student(StudentID, Name, Grade, Classname, Classteacher, parentName,  parentEmail,  address,  contactNo);
				boolean result = C206_CaseStudy.addStudent(studentList, newSchedule);
				if (result == true) {
					System.out.println("Flight schedule added!");
				} else {
					System.out.println("Flight schedule NOT added, you must include all details!");
				}

			}
		}
	}
		
		
	private static boolean editCCAStatus(ArrayList<Student> studentList, int editCCAID, String nameUpdate,
			String gradeUpdate, String classnameUpdate, String classteacherUpdate, String parentNameUpdate,
			String parentEmailUpdate, String addressUpdate) {
		
			for (int i = 0; i < studentList.size(); i++) {
				Student s = studentList.get(i);
			}
			return true;
		}


	private static boolean removeCCA(ArrayList<CCA> ccaList, int deleteCCAID) {
		boolean a = false;
		for (int i = 0; i < ccaList.size(); i++) {
			CCA s = ccaList.get(i);
			if (s.getID() == deleteCCAID) {
				ccaList.remove(i);
				a = true;
				break;
			}
		}
		return a;
	}


	private static String getCCAListById(ArrayList<CCA> ccaList, int deleteCCAID) {
		String output = "";

		for (int i = 0; i < ccaList.size(); i++) {
			CCA cca = ccaList.get(i);

			if (cca.getID() == deleteCCAID) {
				output += String.format("%-3s %-20s %-20s %-15s %-15s %-20s %-20s %-10s\n", "ID", "NAME", "DESCRIPTION", "CLASS SIZE", "DAY OF WEEK ", "TIME", "VENEUE", " INSTRUCTOR");
				output += String.format("%-3s %-20s %-20s %-15s %-15s %-20s %-20s %-10s\n", cca.getID(), cca.getTitle(), cca.getDescription(), cca.getSize(), cca.getDay(),cca.getTime(), cca.getVenue(), cca.getInstructorName());
				break;
			}
		}

		return output;
	}


	private static boolean addCCA(ArrayList<CCA> ccaList, CCA newCCA) {
		boolean r = false;
		if (newCCA.getTitle().isEmpty() == true || newCCA.getDescription().isEmpty() == true || newCCA.getSize().isEmpty() == true || newCCA.getDay().isEmpty() == true || newCCA.getTime().isEmpty() == true || newCCA.getVenue().isEmpty() == true || newCCA.getInstructorName().isEmpty() == true) {
			r = false;

		} else {
			r = true;
			ccaList.add(newCCA);
		}
		return r;
	}


	private static boolean removeStudent(ArrayList<Student> studentList, int deleteStudentID) {
		boolean a = false;
		for (int i = 0; i < studentList.size(); i++) {
			Student s = studentList.get(i);
			if (s.getStudentID() == deleteStudentID) {
				studentList.remove(i);
				a = true;
				break;
			}
		}
		return a;
	}


	private static boolean editStudentStatus(ArrayList<Student> studentList, int editStudentID, String nameUpdate,
			String gradeUpdate, String classnameUpdate, String classteacherUpdate, String parentNameUpdate,
			String parentEmailUpdate, String addressUpdate, String contactNoUpdate) {
		// TODO Auto-generated method stub
		return false;
	}


	private static String getStudentListById(ArrayList<Student> studentList, int studentID) {
		String output = "";

		for (int i = 0; i < studentList.size(); i++) {
			Student s = studentList.get(i);

			if (s.getStudentID() == studentID) {
				output += String.format("%-3s %-20s %-20s %-15s %-15s %-20s %-20s %-20s %-10s\n", "ID", "NAME", "GRADE", "CLASS NAME", "CLASS TEACHER ", "PARENT NAME", "PARENT EMAIL", " ADDRESS", "CONTACT NO");
				output += String.format("%-3s %-20s %-20s %-15s %-15s %-20s %-20s %-20s %-10s\n", s.getStudentID(), s.getName(), s.getGrade(), s.getClassname(), s.getClassteacher(),s.getParentName(), s.getParentEmail(), s.getAddress(), s.getParentNumber());
				break;
			}
		}

		return output;
	}


	private static boolean addStudent(ArrayList<Student> studentList, Student newSchedule) {
		boolean r = false;
		if (newSchedule.getName().isEmpty() == true || newSchedule.getGrade().isEmpty() == true || newSchedule.getClassname().isEmpty() == true || newSchedule.getClassteacher().isEmpty() == true || newSchedule.getParentName().isEmpty() == true || newSchedule.getParentEmail().isEmpty() == true || newSchedule.getAddress().isEmpty() == true || newSchedule.getParentNumber().isEmpty() == true) {
			r = false;

		} else {
			r = true;
			studentList.add(newSchedule);
		}
		return r;
	}


	private static int getallstudentList(ArrayList<Student> studentList) {
		
		return studentList.size();
	}



	private static String studentListToString(ArrayList<Student> studentList) {
		String output = "";
		output += String.format("%-3s %-20s %-20s %-15s %-15s %-20s %-20s %-20s %-20s %-10s\n", "ID", "NAME", "GRADE", "CLASS NAME", "CLASS TEACHER ", "PARENT NAME", "PARENT EMAIL", " ADDRESS", "CONTACT NO", "CCA");
		for (int i = 0; i < studentList.size(); i++) {
			Student s = studentList.get(i);
			output += String.format("%-3s %-20s %-20s %-15s %-15s %-20s %-20s %-20s %-20s %-10s\n", s.getStudentID(), s.getName(), s.getGrade(), s.getClassname(), s.getClassteacher(),s.getParentName(), s.getParentEmail(), s.getAddress(), s.getParentNumber(), s.getCca());
		}
		return output;
	}


	
	private static boolean doadminLogin(Admin admin, String uName, String uPassword) {
		if (uName.equals(admin.getUsername()) && (uPassword.equals(admin.getPassword()))) {
			return true;
		} else {
			return false;
		} 
	}

	public static void loginMenu() {
		Helper.line(30, "-");
		System.out.println("CCA REGISTRATION");
		Helper.line(30, "-");
	}
	
	public static void MainMenu() {
		Helper.line(30, "-");
		System.out.println("CCA REGISTRATION");
		Helper.line(30, "-");
		
		System.out.println("1. Login");
		System.out.println("2. Register");
	}

	public static void adminMenu() {

		Helper.line(30, "-");
		System.out.println("FLIGHT SCHEDULER - STAFF");
		Helper.line(30, "-");

		System.out.println("1. View all student");
		System.out.println("2. Update student details");
		System.out.println("3. Remove student account");
		System.out.println("4. Add CCA");
		System.out.println("5. Delete CCA");
		System.out.println("6. Update CCA");

	}
	
	public static void studentMenu() {

		Helper.line(30, "-");
		System.out.println("FLIGHT SCHEDULER - Student");
		Helper.line(30, "-");

		System.out.println("1. Drop CCA");
		System.out.println("2. Add CCA");

	}


}
