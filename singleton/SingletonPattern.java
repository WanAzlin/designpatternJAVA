public class SingletonPattern {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        System.out.println("Calling a method of a Singleton: " + s1.demoMethod());
        
        Singleton s2 = Singleton.getInstance();
        System.out.println("Calling a method of a Singleton: " + s2.demoMethod());
        
        boolean b1 = (s1 == s2);
        System.out.println("Object instance s1 and s2 are the same object: " + b1);
    }
}
