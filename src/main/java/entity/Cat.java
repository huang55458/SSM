package entity;

/**
 * @author chumeng
 * @date 2022/7/13 19:25
 */
public class Cat extends Animal {
    private int catFood;

    public int getCatFood() {
        return catFood;
    }

    public void setCatFood(int catFood) {
        this.catFood = catFood;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catFood=" + catFood +
                "} " + super.toString();
    }
}
