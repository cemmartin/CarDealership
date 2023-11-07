package car.components;

public class Engine extends Components implements IComponent{

    private double size;

    public Engine(int price, double size) {
        super(price);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public int getPrice() {
        return 0;
    }
}
