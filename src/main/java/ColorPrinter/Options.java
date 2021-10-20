package ColorPrinter;

import java.util.ArrayList;

public class Options {
    ArrayList<Option> options;

    public Options() {
        this.options = new ArrayList<>();
    }

    public void addOption(Option option) {
        options.add(option);
    }

    public ArrayList<Option> getOptions() {
        return options;
    }
}
