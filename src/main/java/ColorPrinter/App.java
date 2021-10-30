package ColorPrinter;

import DocumentParser.DocumentParser;

public class App {
    public static void main(String[] args) {
        UI_Console ui = new UI_Console();
        DocumentParser parser = new DocumentParser();
        ColorPrinter printer = new ColorPrinter(ui, parser);

        printer.start();
    }
}
