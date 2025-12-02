import javax.swing.*;

public class Ex301 {
    public static void main(String[] args) {
        double total_price = Double.parseDouble(JOptionPane.showInputDialog("Enter total price"));

        int coupon = JOptionPane.showConfirmDialog(null,
                "Do you have coupon",
                "Coupon", JOptionPane.YES_NO_OPTION);

        JOptionPane.showMessageDialog(null, "Do you have coupon?");

        if (coupon == JOptionPane.YES_NO_OPTION) { // if (coupon == 0)
            int discout_coupon = Integer.parseInt(JOptionPane.showInputDialog("How many discount(%)?"));
            double discout = total_price * discout_coupon / 100;
            double pay = total_price - discout;
            JOptionPane.showMessageDialog(null,
                    "You get discount" + discout + "baht.\n" + "Total price is " + pay + "Baht.");
        } else {
            if (total_price >= 1500) {
                double discout = total_price * 10 / 100;
                double pay = total_price - discout;
                JOptionPane.showMessageDialog(null,
                        "You get discout 10% (" + discout + ")\n"
                                + "Total price is " + pay + "baht");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Total price is " + total_price + "Baht.");
            }
        }
    }
}