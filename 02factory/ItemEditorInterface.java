import javax.swing.JComponent;

interface ItemEditorInterface {
    public JComponent getGUI();
    public void commitChanges();
}
