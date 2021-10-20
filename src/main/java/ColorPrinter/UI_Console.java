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

    public void printMessage(String message) {
        System.out.println("***");
        System.out.println(message);
        System.out.println("***");
    }

    public String askForText() {
        System.out.println("************************************");
        System.out.println("*** Add text to document: ");

        return scan.nextLine();
    }

    public void printDocument(ArrayList<StyledSentence> styledSentences) {
        System.out.println("************************************");
        System.out.println("*** DOCUMENT: ");
        System.out.println("************************************");
        for (StyledSentence sentence : styledSentences) {
            System.out.println("** " + sentence.getStyledSentence());
        }
        System.out.println("************************************");
    }
}