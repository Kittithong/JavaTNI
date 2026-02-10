package CoffeeShop;

public class Frappuccino extends Drink implements Priceable {
    private boolean whipped;
    public Frappuccino(char size, boolean whipped) {
        super("Frappuccino", size, 40);
        this.whipped = whipped;
    }
    @Override
    public double calculateFinalPrice() {
        double whipPrice = 0;
        if (whipped)
            whipPrice = 15;
        return getBasePrice() + whipPrice + getSizeExtra();
    }
    @Override
    public String toString() {
        String text = super.toString() + "\n";
        if (whipped)
            text += "Add whipped 15 Baht\n";
        text += "Total price = " + calculateFinalPrice() + " Baht";
        return text;
    }
}
