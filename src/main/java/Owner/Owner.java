package Owner;

import java.util.ArrayList;
import car.Car;

public abstract class Owner {

    private String name;
    private int money;
    private ArrayList<Car> collection;

    public Owner(String name, int money) {
        this.name = name;
        this.money = money;
        this.collection = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public ArrayList<Car> getCollection() {
        return collection;
    }

    public void setCollection(ArrayList<Car> collection) {
        this.collection = collection;
    }


}
