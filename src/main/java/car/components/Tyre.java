package car.components;

public class Tyre extends Components implements IComponent{
    private TyreType tyreType;

    public Tyre(int price, TyreType tyreType) {
        super(price);
        this.tyreType = tyreType;
    }

    public TyreType getTyreType() {
        return tyreType;
    }

    public int getPrice() {
        return 0;
    }
}
