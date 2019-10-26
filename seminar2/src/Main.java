import ro.ubbcluj.animal.Animal;
import ro.ubbcluj.animal.Cat;
import ro.ubbcluj.animal.Dog;
import ro.ubbcluj.animal.Fish;
import ro.ubbcluj.animal.powers.CanWalk;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

        animals.add(new Fish());
        animals.add(new Dog());
        animals.add(new Cat());

        for (Animal animal : animals) {
            System.out.println(animal.talk());
        }

        List<CanWalk> walkingAnimals = new ArrayList<>();
        walkingAnimals.add(new Dog());
        walkingAnimals.add(new Cat());

        for (CanWalk animal : walkingAnimals) {
            System.out.println(animal.walk());
        }
    }

}
