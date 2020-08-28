abstract class PhoneNumberAbstractClass{
	
	private String phoneNumber;
	
	// Abstract method
	public abstract String getCountryCode();
	
	public String getPhoneNumber(){ return phoneNumber; }
	
	public void setPhoneNumber(String newNumber){
		try{
			Long.parseLong(newNumber);
			phoneNumber = newNumber;
		} catch (NumberFormatException exc){
		}
	}
}