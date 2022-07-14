package entity;

/**
 * @author chumeng
 * @date 2022/7/13 19:26
 */
public class Dog extends Animal {
    private int dogFood;

    public int getDogFood() {
        return dogFood;
    }

    public void setDogFood(int dogFood) {
        this.dogFood = dogFood;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogFood=" + dogFood +
                "} " + super.toString();
    }
}
