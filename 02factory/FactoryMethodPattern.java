public class FactoryMethodPattern {
    
    public static void main(String [] arguments){
        
        System.out.println("Example for the FactoryMethod pattern - Creating a GUI editor for the Contact\n");
        
        System.out.println("The GUI defined in the EditorGui class is a truly generic editor.");
        System.out.println("It accepts an argument of type ItemEditor, and delegates");
        System.out.println(" all editing tasks to its ItemEditorInterface and the associated GUI.");
        System.out.println(" The getEditor() Factory Method is used to obtain the ItemEditor");
        System.out.println(" for the example.");
        System.out.println();
        System.out.println("Notice that the editor in the top portion of the GUI is,");
        System.out.println(" in fact, returned by the ItemEditor belonging to the");
        System.out.println(" ContactEditableImpl class, and has appropriate fields for that class.\n");
        
        // Create ContactEditableImpl object
        System.out.println("Creating a Contact object.\n");
        ContactEditableImpl someone = new ContactEditableImpl();
        
        EditorGui editorGui = new EditorGui(someone.getEditor());
        editorGui.createGui();   
        
    }
}
