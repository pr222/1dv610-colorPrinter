package ColorPrinter;

import DocumentParser.*;

import java.util.ArrayList;

public class Styler {
    Document document;
    ArrayList<StyledSentence> styledSentences;

    public Styler(Document document) {
        this.document = document;
        this.styledSentences = new ArrayList<>();

        style();
    }

    private void style() {
        for (Sentence sentence : document.getAllSentences()) {
            if (sentence instanceof Regular) {
                StyledSentence styled = new StyledSentence(sentence, COLOR.GREEN);
                styledSentences.add(styled);
            } else if (sentence instanceof Question) {
                StyledSentence styled = new StyledSentence(sentence, COLOR.BLUE);
                styledSentences.add(styled);
            } else if (sentence instanceof Exclamation) {
                StyledSentence styled = new StyledSentence(sentence, COLOR.RED);
                styledSentences.add(styled);
            }
        }
    }

    public ArrayList<StyledSentence> getStyledSentences() {
        return styledSentences;
    }
}
