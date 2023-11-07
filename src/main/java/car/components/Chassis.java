package car.components;

public class Chassis extends Components implements IComponent {
    private ChassisType chassisType;

    public Chassis(int price, ChassisType chassisType) {
        super(price);
        this.chassisType = chassisType;
    }

    public ChassisType getChassisType() {
        return chassisType;
    }

    @Override
    public int getPrice() {
        return 0;
    }


}
