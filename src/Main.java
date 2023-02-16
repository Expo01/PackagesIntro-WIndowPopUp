public class Main {
    public static void main(String[] args) {

//        javafx.scene.Node node = null;
        // Node node = null;
//        org.w3c.dom.Node anotherNode = null;
        // neither of these packages exist for me, but the concept here was that when two classes have the same name,
        //such as Node, you have a couple choices. You can import one of the classes and do not have to call the fully
        //qualified package name each time, or I can use the more verbose, but potentially clearer, version where
        // the fully qualified name for both Node class packages is used


        MyWindow myWindow = new MyWindow("Complete Java");
        myWindow.setVisible(true);
    }
}