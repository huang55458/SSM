package entity;

/**
 * @author chumeng
 * @date 2022/7/13 15:44
 */
public class Vehicle {
    private int id;
    private String type;
    private String color;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
