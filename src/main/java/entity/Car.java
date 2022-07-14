package entity;

/**
 * @author chumeng
 * @date 2022/7/13 15:49
 */
public class Car extends Vehicle {
    private int doorSize;

    public int getDoorSize() {
        return doorSize;
    }

    public void setDoorSize(int doorSize) {
        this.doorSize = doorSize;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doorSize=" + doorSize +
                "} " + super.toString();
    }
}
