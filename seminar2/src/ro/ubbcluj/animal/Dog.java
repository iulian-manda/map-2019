package ro.ubbcluj.animal;

import ro.ubbcluj.animal.powers.CanWalk;
import ro.ubbcluj.food.DogFood;
import ro.ubbcluj.food.Food;

public class Dog extends Domestic implements CanWalk {
    @Override
    public String talk() {
        return "Ham";
    }

    @Override
    public boolean feed(Food food) {
        return food instanceof DogFood;
    }

    @Override
    public String walk() {
        return "dog walking...";
    }
}
