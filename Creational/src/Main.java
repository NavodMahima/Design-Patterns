//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PrinterManager printer1 = PrinterManager.getInstance();
        printer1.printDocument("Document1.pdf");

        PrinterManager printer2 = PrinterManager.getInstance();
        printer2.printDocument("Document2.pdf");

        if (printer1 == printer2) {
            System.out.println("Both references are the same instance.");
        }
    }
}