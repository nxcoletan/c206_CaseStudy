import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class C206_CaseStudyTest {
	private Student st1;
	private Student st2;
	private CCA c1;
	private CCA c2;
	
	private ArrayList<Student> studentList = new ArrayList<Student>();
	private ArrayList<CCA> ccaList = new ArrayList<CCA>();
	

	@Before
	public void setUp() throws Exception {
		st1 = new Student(01,"Ezekiel", "P6", "6D", "Mr Lim Yan", "Angus Rehu", "angus@gamil.com", "12 Adis Road, Parc Sophia", "85950014");
		st2 = new Student(02,"Srinivas", "P4", "4N", "Mr Desmond", "Makcik rebus", "bagus@gamil.com", "Jurong West blk 53 #03-29", "99880076");
	
		c1 = new CCA(01, "Rugby", "Sport", "Strong and mighty boys are welcome!", "30", "Tuesday", "6pm-9pm", "School Field", "Peeros");
		c2 = new CCA(02, "Dance", "Performing Art", "The flexible and energetic shall be invited!", "25", "Friday", "5pm-8pm", "Hall", "Yao Ming");

		studentList= new ArrayList<Student>();
		ccaList= new ArrayList<CCA>();
		
	}

	@After
	public void tearDown() throws Exception {
			st1 = null;
			st2 = null;
			c1 = null;
			c2 = null;
			studentList = null;
			ccaList = null;
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
		
	}
	
	@Test
	public void addStudentTest() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Student arraylist to add to", studentList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		C206_CaseStudy.addStudent(studentList, st1);
		assertEquals("Check that Student arraylist size is 1", 1, studentList.size());
		assertSame("Check that Student is added", st1, studentList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addStudent(studentList, st2);
		assertEquals("Check that Student arraylist size is 2", 2, studentList.size());
		assertSame("Check that Student is added", st2, studentList.get(1));
	}
	
	@Test
	public void addCCATest() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid CCA arraylist to add to", ccaList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		C206_CaseStudy.addCCA(ccaList, c1);
		assertEquals("Check that CCA arraylist size is 1", 1, ccaList.size());
		assertSame("Check that CCA is added", c1, ccaList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addCCA(ccaList, c2);
		assertEquals("Check that CCA arraylist size is 2", 2, ccaList.size());
		assertSame("Check that CCA is added", c2, ccaList.get(1));
	}
	
	@Test
	public void getStudentListByIdTest() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Student arraylist to retrieve item", studentList);
		
		//test if the list of student retrieved from the SourceCentre is empty - boundary
		String allStudent= C206_CaseStudy.getStudentListById(studentList, 0);
		String testOutput = "";
		assertEquals("Check that getStudentById", testOutput, allStudent);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addStudent(studentList, st1);
		C206_CaseStudy.addStudent(studentList, st2);
		assertEquals("Test that Student arraylist size is 2", 2, studentList.size());
		
		//test if the expected output string same as the list of students retrieved from the SourceCentre	
		allStudent= C206_CaseStudy.getStudentListById(studentList, 0);
		testOutput = String.format("%-3s %-12s %-8s %-12s %-15s %-12s %-17s %-30s %-15s\n",01,"Ezekiel", "P6", "6D", "Mr Lim Yan", "Angus Rehu", "angus@gamil.com", "12 Adis Road, Parc Sophia", "85950014");
		testOutput += String.format("%-3s %-12s %-8s %-12s %-15s %-12s %-17s %-30s %-15s\n",02,"Srinivas", "P4", "4N", "Mr Desmond", "Makcik rebus", "bagus@gamil.com", "Jurong West blk 53 #03-29", "99880076");
	
		assertEquals("Test that getStudentById ", testOutput, allStudent);
		
	}
	
	@Test
	public void getCCAListByIdTest() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid CCA arraylist to retrieve item", ccaList);
		
		//test if the list of CCA retrieved from the SourceCentre is empty - boundary
		String allCCA= C206_CaseStudy.getCCAListById(ccaList, 0);
		String testOutput = "";
		assertEquals("Check that getCCAListById", testOutput, allCCA);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addCCA(ccaList, c1);
		C206_CaseStudy.addCCA(ccaList, c2);
		assertEquals("Test that CCA arraylist size is 2", 2, ccaList.size());
		
		//test if the expected output string same as the list of students retrieved from the SourceCentre	
		allCCA= C206_CaseStudy.getCCAListById(ccaList, 0);
		testOutput = String.format("%-3s %-15s %-50s %-14s %-15s %-10s %-20s %-10s\n",01, "Rugby", "Strong and mighty boys are welcome!", "30", "Tuesday", "6pm-9pm", "School Field", "Peeros");
		testOutput += String.format("%-3s %-15s %-50s %-14s %-15s %-10s %-20s %-10s\n",02,02, "Basketball", "The fittest and greatest shall be invited!", "20", "Friday", "5pm-8pm", "Basketball Court", "Yao Min");
	
		assertEquals("Test that getStudentById ", testOutput, allCCA);
		
	}
	
	

}
