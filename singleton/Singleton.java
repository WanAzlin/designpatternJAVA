public class Singleton {
    private static Singleton singleton = new Singleton();
/** A private Constructor prevents any other class from instantiating. */
    private Singleton() {    }
    
    /** Static 'instance' method */
    public static Singleton getInstance() {
        return singleton;
    }
        // other methods protected by singleton-ness would be here...
    /** A simple demo method */
    public String demoMethod() {
        return "demo";
    }
}
