package ro.ubbcluj.tool;

public class Schere extends Tool {
    @Override
    public int gewicht() {
        return 3;
    }

    public boolean canCut() {
        return true;
    }
}

