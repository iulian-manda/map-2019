package ro.ubbcluj.tool;

public class Hammer extends Tool {
    @Override
    public int gewicht() {
        return 9;
    }

    public boolean canCut() {
        return false;
    }
}

