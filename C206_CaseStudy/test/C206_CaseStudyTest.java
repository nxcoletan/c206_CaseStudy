import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {

	@Before
	public void setUp() throws Exception {
		ArrayList<CCA> ccaList = new ArrayList<CCA>();
		CCA cca1 = new CCA(01, "Rugby", "Strong and mighty boys are welcome!", "30", "Tuesday", "6pm-9pm", "School Field", "Peeros");
		CCA cca2 = new CCA(02, "Basketball", "The fittest and greatest shall be invited!", "20", "Friday", "5pm-8pm", "Basketball Court", "Yao Min");

		ArrayList<Student> studentList = new ArrayList<Student>();
		Student student1 = new Student(01,"Ezekiel", "P6", "6D", "Mr Lim Yan", "Angus Rehu", "angus@gamil.com", "12 Adis Road, Parc Sophia", "85950014");
		Student student2 = new Student(02,"Srinivas", "P4", "4N", "Mr Desmond", "Makcik rebus", "bagus@gamil.com", "Jurong West blk 53 #03-29", "99880076");
		studentList.add(student1);
		studentList.add(student2);

		Admin admin = new Admin("SystemAdmin ", "admin", "admin", 1, "Admin");
		Coordinator coordin = new Coordinator("Coordinator", "coordin", "coordin", 1, "Coordinator");
		Student student = new Student(01,"Ezekiel", "P6", "6D", "Mr Lim Yan", "Angus Rehu", "angus@gamil.com", "12 Adis Road, Parc Sophia", "85950014");
	}
	public void getCCAListById(){
		
	}

	@After
	public void tearDown() throws Exception {
		ccaList = null;
		studentList = null;
		cca1 = null;
		cca2 = null;
		student1 = null;
		student2 = null;
		student = null;
		admin = null;
		coordin = null;
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}

}
