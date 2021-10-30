package ColorPrinter;

public class Option {
    private final String option;
    private final String selector;

    public Option(String option, String selector) {
        this.option = option;
        this.selector = selector;
    }

    public String getOption() {
        return option;
    }

    public String getSelector() {
        return selector;
    }
}
