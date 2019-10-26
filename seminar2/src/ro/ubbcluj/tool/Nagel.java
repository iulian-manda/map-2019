package ro.ubbcluj.tool;

public class Nagel extends Tool {
    @Override
    public int gewicht() {
        return 2;
    }

    public boolean canCut() {
        return false;
    }
}
