package nl.baidun.medical;

/**
 * This is testclass
 * 
 * @author siarheibaidun
 * @author olgabaidun
 */
public class MedicalPersonnel {
	private long firstname3;
	
	private String lastname;
	
	private String birthdate;
	
	/**
	 * siarehibaidun added grade and setter/getter
	 */
	private int grade;
	
	/**
	 * added by siarheibaidun
	 */
	private String address;

	/**
	 * added by Olja
	 */
	private String department;
	
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	public long getFirstname3() {
		return firstname3;
	}

	public void setFirstname3(long firstname) {
		this.firstname3 = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
