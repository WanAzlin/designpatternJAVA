class FrenchAddress extends AddressAbstractClass {
    private static final String COUNTRY = "FRANCE";
    
    // Concrete method
    public String getCountry(){ return COUNTRY; }
    
    public String getFullAddress(){
        return getStreet() + EOL_STRING +
            getPostalCode() + SPACE + getCity() +
            EOL_STRING + COUNTRY + EOL_STRING;
    }
}