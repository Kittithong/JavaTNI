import javax.swing.JOptionPane;
public class ProductMain2 {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "Pens";
        product1.price = 10.5;
        product1.quantity = 50;
        Product product2 = new Product();
        product2.name = "Notebooks";
        product2.price = 25.75;
        product2.quantity = 20;
        int choice;
        do {
            choice = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "1. Pens\n2. Notebooks\nSelect product number:"
                    )
            );
        } while (choice != 1 && choice != 2);
        if (choice == 1) {
            product1.showInfo();
            int amount = Integer.parseInt(
                    JOptionPane.showInputDialog("Enter amount:")
            );
            product1.sell(amount);
            product1.showInfo();
        } else {
            product2.showInfo();
            int amount = Integer.parseInt(
                    JOptionPane.showInputDialog("Enter amount:")
            );
            product2.sell(amount);
            product2.showInfo();
        }
    }
}