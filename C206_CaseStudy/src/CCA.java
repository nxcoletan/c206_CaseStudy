
public class CCA {
	private int ccaID;
	private String ccaName;
	private String description;
	private String classsize;
	private String dayofweek;
	private String time;
	private String venue;
	private String nameofInstructor;
	
	public CCA(int ccaID, String ccaName, String description, String classsize, String dayofweek, String time,
			String venue, String nameofInstructor) {
		super();
		this.ccaID = ccaID;
		this.ccaName = ccaName;
		this.description = description;
		this.classsize = classsize;
		this.dayofweek = dayofweek;
		this.time = time;
		this.venue = venue;
		this.nameofInstructor = nameofInstructor;
	}

	public int getCcaID() {
		return ccaID;
	}

	public void setCcaID(int ccaID) {
		this.ccaID = ccaID;
	}

	public String getCcaName() {
		return ccaName;
	}

	public void setCcaName(String ccaName) {
		this.ccaName = ccaName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getClasssize() {
		return classsize;
	}

	public void setClasssize(String classsize) {
		this.classsize = classsize;
	}

	public String getDayofweek() {
		return dayofweek;
	}

	public void setDayofweek(String dayofweek) {
		this.dayofweek = dayofweek;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getNameofInstructor() {
		return nameofInstructor;
	}

	public void setNameofInstructor(String nameofInstructor) {
		this.nameofInstructor = nameofInstructor;
	}
	
	
}
