public class AbstractFactoryPattern {
     public static void main(String [] arguments){
        System.out.println("Example for the AbstractFactory pattern");
        System.out.println();
        System.out.println(" Notice that you can");
        System.out.println(" use the Address and PhoneNumber classes when writing");
        System.out.println(" almost all of the code. This allows you to write a very");
        System.out.println(" generic framework, and plug in Concrete Factories");
        System.out.println(" and Products to specialize the behavior of your code)");
        System.out.println();

        System.out.println("Creating U.S. Address and Phone Number:");
        AddressFactoryInterface addressFactory = new USAddressFactoryImpl();
        AddressAbstractClass address = addressFactory.createAddress();
        PhoneNumberAbstractClass phone = addressFactory.createPhoneNumber();
 
        address.setStreet("142 Lois Lane");
        address.setCity("Metropolis");
        address.setRegion("WY");
        address.setPostalCode("54321");
        phone.setPhoneNumber("7039214722");
        
        System.out.println("U.S. address:");
        System.out.println(address.getFullAddress());
        System.out.println("U.S. phone number:");
        System.out.println(phone.getPhoneNumber());
        System.out.println();
        System.out.println();
        
        System.out.println("Creating French Address and Phone Number:");
        addressFactory = new FrenchAddressFactoryImpl();
        address = addressFactory.createAddress();
        phone = addressFactory.createPhoneNumber();
        
        address.setStreet("21 Rue Victor Hugo");
        address.setCity("Courbevoie");
        address.setPostalCode("40792");
        phone.setPhoneNumber("011324290");

        System.out.println("French address:");
        System.out.println(address.getFullAddress());
        System.out.println("French phone number:");
        System.out.println(phone.getPhoneNumber());
     }
}