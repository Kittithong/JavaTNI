import javax.swing.*;
public class Bonus {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
                "summation number = "+(2+5) +
                        "\nSubtraction number = "+(2-5)+
                        "\nMultiplication number = "+(2*5)+
                        "\nDivision number = "+(float)2/5+
                        "\nModulus number = "+(2%5),
                "Arithmetic Operators",
                JOptionPane.WARNING_MESSAGE);
    }
}
