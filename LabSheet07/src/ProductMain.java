import javax.swing.JOptionPane;

public class ProductMain {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(
                null,
                "Welcome to Product Stock System",
                "Message",
                JOptionPane.INFORMATION_MESSAGE
        );
        Product product = new Product();
        product.name = JOptionPane.showInputDialog("Enter product name:");
        product.price = Double.parseDouble(
                JOptionPane.showInputDialog("Enter price:")
        );
        product.quantity = Integer.parseInt(
                JOptionPane.showInputDialog("Enter quantity:")
        );
        product.showInfo();
        int add = JOptionPane.showConfirmDialog(
                null,
                "Do you want to add stock?",
                "Add Stock",
                JOptionPane.YES_NO_CANCEL_OPTION
        );
        if (add == JOptionPane.YES_OPTION) {
            int amount = Integer.parseInt(
                    JOptionPane.showInputDialog("Enter amount:")
            );
            product.addStock(amount);
        }
        int change = JOptionPane.showConfirmDialog(
                null,
                "Do you want to change price?",
                "Change Price",
                JOptionPane.YES_NO_CANCEL_OPTION
        );
        if (change == JOptionPane.YES_OPTION) {
            double newPrice = Double.parseDouble(
                    JOptionPane.showInputDialog("Enter new price:")
            );
            product.changePrice(newPrice);
        }
        product.showInfo();
    }
}