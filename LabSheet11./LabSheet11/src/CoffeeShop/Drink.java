package CoffeeShop;

public abstract class Drink {
    private String drinkName;
    private char size;
    private double basePrice;
    public Drink(String drinkName, char size, double basePrice) {
        this.drinkName = drinkName;
        this.size = Character.toUpperCase(size);
        this.basePrice = basePrice;
    }
    public double getBasePrice() {
        return basePrice;
    }
    public double getSizeExtra() {
        if (size == 'S')
            return 0;
        else if (size == 'M')
            return 10;
        else if (size == 'L')
            return 15;
        else
            return -1;
    }
    @Override
    public String toString() {
        return "Your order: " + drinkName + " (Size: " + size + ")";
    }
}
