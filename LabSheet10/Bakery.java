public class Bakery {
    private String flavor;
    private double unitPrice;
    private int PackingCost;

    public Bakery (String flavor, double unitPrice){
        this.flavor = flavor;
        this.unitPrice = unitPrice;
    }
    public  Bakery () {
        this( "", 0.0);
    }
    public String getFlavor(){
        return this.flavor;
    }
    public double getUnitPrice(){
        return this.unitPrice ;
    }
    public int getPackingCost(){
        return this.PackingCost;
    }
    public double calculateTotalPrice() {
        return this.unitPrice + this.PackingCost;
    }
    public String toString(){
        return  "Thank you for your order";
    }
}