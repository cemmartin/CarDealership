package car.components;

public class Gearbox extends Components implements IComponent{

    private String speed;

    public Gearbox(int price, String speed) {
        super(price);
        this.speed = speed;
    }

    public String getSpeed() {
        return speed;
    }

    public int getPrice() {
        return 0;
    }
}
