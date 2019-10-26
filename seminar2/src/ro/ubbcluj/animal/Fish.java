package ro.ubbcluj.animal;

import ro.ubbcluj.animal.powers.CanSwim;
import ro.ubbcluj.food.FishFood;
import ro.ubbcluj.food.Food;

public class Fish extends Domestic implements CanSwim {

    @Override
    public String talk() {
        return "Woop";
    }

    @Override
    public boolean feed(Food food) {
        return food instanceof FishFood;
    }

    @Override
    public String swim() {
        return "Look at me, I'm swimming...";
    }
}
