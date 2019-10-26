package ro.ubbcluj.tool;

import java.util.ArrayList;
import java.util.List;

class Kiste {
    List<Tool> gewichtGroeserAls5(List<Tool> kiste) {
        List<Tool> result = new ArrayList<>();
        for (Tool tool : kiste) {
            if (tool.gewicht() > 5) {
                result.add(tool);
            }
        }
        return result;
    }

    List<Tool> kannSchneiden(List<Tool> kiste) {
        List<Tool> result = new ArrayList<>();
        for (Tool tool : kiste) {
            if (tool.canCut()) {
                result.add(tool);
            }
        }
        return result;
    }
}
