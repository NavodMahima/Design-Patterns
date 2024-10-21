class PrinterManager {
    private static PrinterManager instance;

    private PrinterManager() {
        System.out.println("Printer Manager initialized.");
    }

    public static synchronized PrinterManager getInstance() {
        if (instance == null) {
            instance = new PrinterManager();
        }
        return instance;
    }

    public void printDocument(String document) {
        System.out.println("Printing document: " + document);
    }
}

