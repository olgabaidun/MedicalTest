package nl.baidun.medical;

/**
 * This is testclass
 * 
 * @author siarheibaidun
 * @author olgabaidun
 */
public class MedicalPersonnel {
	private String firstname4;
	
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

	public String getFirstname4() {
		return firstname4;
	}

	public void setFirstname4(String firstname) {
		this.firstname4 = firstname;
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
}
