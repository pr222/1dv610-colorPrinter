package ColorPrinter;

public class ColorPrinter {
    private UI_Console ui;
    private Options mainMenu;

    public ColorPrinter(UI_Console ui) {
        this.ui = ui;

        generateMainMenu();
    }

    public void start() {
        ui.printMenuOptions(mainMenu);
    }

    private void generateMainMenu() {
        mainMenu = new Options();

        Option addInput = new Option("Add text to format", "1");
        mainMenu.addOption(addInput);

        Option printFormatted = new Option("Print formatted document", "2");
        mainMenu.addOption(printFormatted);

        Option quit = new Option("Quit Application", "3");
        mainMenu.addOption(quit);
    }
}
