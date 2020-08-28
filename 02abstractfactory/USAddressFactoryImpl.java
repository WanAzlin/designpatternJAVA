class USAddressFactoryImpl implements AddressFactoryInterface{
    public AddressAbstractClass createAddress(){
        return new USAddress();
    }
    public PhoneNumberAbstractClass createPhoneNumber(){
        return new USPhoneNumber();
    }
}