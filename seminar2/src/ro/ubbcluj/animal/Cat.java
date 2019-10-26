package ro.ubbcluj.animal;

import ro.ubbcluj.animal.powers.CanPur;
import ro.ubbcluj.animal.powers.CanWalk;
import ro.ubbcluj.food.CatFood;
import ro.ubbcluj.food.Food;

public class Cat extends Domestic implements CanWalk, CanPur {

    @Override
    public String talk() {
        return "Miau";
    }

    @Override
    public boolean feed(Food food) {
        return food instanceof CatFood;
    }

    @Override
    public String pur() {
        return "purrrr";
    }

    @Override
    public String walk() {
        return "walking...";
    }
}
