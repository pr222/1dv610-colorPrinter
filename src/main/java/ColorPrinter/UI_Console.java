package ColorPrinter;

import java.util.ArrayList;
import java.util.Scanner;

public class UI_Console {
    Scanner scan;

    public UI_Console() {
        scan = new Scanner(System.in);
    }

    public String printMenuOptions(Options options) {
        System.out.println("************************************");
        System.out.println("*** Select an option to continue:");
        for (Option option : options.getOptions()) {
            System.out.println("[" + option.getSelector() + "] " + option.getOption());
        }
        System.out.println("***");

        return scan.nextLine();
    }
}