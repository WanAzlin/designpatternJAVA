class FrenchAddressFactoryImpl implements AddressFactoryInterface {
    public AddressAbstractClass createAddress(){
        return new FrenchAddress();
    }
    
    public PhoneNumberAbstractClass createPhoneNumber(){
        return new FrenchPhoneNumber();
    }
}