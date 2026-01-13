import javax.swing.JOptionPane;
public class ProductMain4 {
    public static void setting_product(Product... products) {
        String[] names = {"Pens", "Pencils", "Markers", "Highlighters"};
        double[] prices = {25.5, 17.25, 30, 35};
        int[] quantities = {20, 35, 10, 40};
        for (int i = 0; i < products.length; i++) {
            products[i] = new Product();
            products[i].name = names[i];
            products[i].price = prices[i];
            products[i].quantity = quantities[i];
        }
    }
    public static void main(String[] args) {
        Product[] products = new Product[4];
        setting_product(products);
        String menu = "";
        for (int i = 0; i < products.length; i++) {
            menu += (i + 1) + ". " + products[i].name + "\n";
        }
        int choice;
        do {
            choice = Integer.parseInt(
                    JOptionPane.showInputDialog(menu + "Select product number:")
            );
        } while (choice < 1 || choice > 4);
        Product selected = products[choice - 1];
        selected.showInfo();
        int amount = Integer.parseInt(
                JOptionPane.showInputDialog("Enter amount:")
        );
        selected.sell(amount);
        selected.showInfo();
    }
}