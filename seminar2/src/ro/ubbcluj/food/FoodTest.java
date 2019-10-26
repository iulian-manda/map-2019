package ro.ubbcluj.food;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import ro.ubbcluj.animal.Animal;
import ro.ubbcluj.animal.Dog;
import ro.ubbcluj.animal.Fish;

@RunWith(JUnit4.class)
public class FoodTest {

    @Test
    public void feed_dogDogFood() {
        Animal dog = new Dog();
        Assert.assertTrue(dog.feed(new DogFood()));
    }

    @Test
    public void feed_fishDogFood() {
        Animal fish = new Fish();
        Assert.assertFalse(fish.feed(new DogFood()));
    }

}
