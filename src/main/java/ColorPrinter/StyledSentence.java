package ColorPrinter;

import DocumentParser.Sentence;

import static ColorPrinter.COLOR.*;

public class StyledSentence {
    private final Sentence sentence;
    private String color;

    public StyledSentence(Sentence sentence, Enum color) {
        this.sentence = sentence;

        if (color.equals(RED)) {
            this.color = "\u001B[31m";
        } else if (color.equals(GREEN)) {
            this.color = "\u001B[32m";
        } else if (color.equals(BLUE)) {
            this.color = "\u001B[34m";
        }
    }

    public String getStyledSentence() {
        String RESET = "\u001B[0m";
        return color + sentence.getSentence() + RESET;
    }
}
