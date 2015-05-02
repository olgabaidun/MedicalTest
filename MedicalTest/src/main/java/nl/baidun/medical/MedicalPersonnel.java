package nl.baidun.medical;

/**
 * This is testclass
 * 
 * @author siarheibaidun
 * @author olgabaidun
 */
public class MedicalPersonnel {
	private String firstname;
	
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
}
