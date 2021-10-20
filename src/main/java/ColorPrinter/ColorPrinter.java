package ColorPrinter;

import DocumentParser.DocumentParser;

public class ColorPrinter {
    private final UI_Console ui;
    private final DocumentParser parser;
    private Options mainMenu;

    public ColorPrinter(UI_Console ui, DocumentParser parser) {
        this.ui = ui;
        this.parser = parser;

        generateMainMenu();
    }

    public void start() {
        String selected = ui.printMenuOptions(mainMenu);

        while(!selected.equals("q")) {
            switch (selected) {
                case "1" -> addTextToDocument();
                case "2" -> printStyledDocument();
                case "3" -> clearDocument();
                default -> ui.printMessage("Not a valid option");
            }
            selected = ui.printMenuOptions(mainMenu);
        }
    }

    private void generateMainMenu() {
        mainMenu = new Options();

        Option addInput = new Option("Add text to document", "1");
        mainMenu.addOption(addInput);

        Option printDocument = new Option("Print document", "2");
        mainMenu.addOption(printDocument);

        Option clear = new Option("Clear document", "3");
        mainMenu.addOption(clear);

        Option quit = new Option("Quit Application", "q");
        mainMenu.addOption(quit);
    }

    private void addTextToDocument() {
        try {
            String input = ui.askForText();
            parser.parse(input);
        } catch (Exception e) {
            ui.printMessage(e.getMessage());
        }
    }

    private void printStyledDocument() {
        Styler styler = new Styler(parser.getParsedDocument());

        ui.printDocument(styler.getStyledSentences());
    }

    private void clearDocument() {
        parser.resetDocument();
    }
}
