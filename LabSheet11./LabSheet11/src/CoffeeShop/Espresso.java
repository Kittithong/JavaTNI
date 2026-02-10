package CoffeeShop;

public class Espresso extends Drink implements Priceable {
    private int shot;
    public Espresso(char size) {
        super("Espresso", size, 35);
        shot = 0;
    }
    public void addShot(int shot) {
        this.shot += shot;
    }
    @Override
    public double calculateFinalPrice() {
        return getBasePrice() + (shot * 15) + getSizeExtra();
    }
    @Override
    public String toString() {
        String text = super.toString() + "\n";
        if (shot > 0)
            text += "Added " + shot + " shot\n";
        text += "Total price = " + calculateFinalPrice() + " Baht";
        return text;
    }
}
