package car;

public class Car {
    private String color;
    private int price;
    private String brand;
    private String model;
    private VehicleType vehicleType;

    public Car(String color, int price, String brand, String model, VehicleType vehicleType) {
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
