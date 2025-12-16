import javax.swing.JOptionPane;

public class Lab501 {
    public static double cal_bmi(double weight, double height_cm) {
        double height_m = height_cm / 100;
        double bmi = weight / (height_m * height_m);
        return bmi;
    }

    public static String check_bmi(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Healthy Weight";
        } else if (bmi >= 25 && bmi <= 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        while (true) {
            int confirm = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want to check your BMI?",
                    "Check BMI",
                    JOptionPane.YES_NO_OPTION
            );
            if (confirm == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "END PROGRAM!!");
                break;
            }
            String w = JOptionPane.showInputDialog("Enter your weight (kg.):");
            String h = JOptionPane.showInputDialog("Enter your height (cm.):");
            double weight = Double.parseDouble(w);
            double height = Double.parseDouble(h);
            double bmi = cal_bmi(weight, height);
            String result = check_bmi(bmi);
            JOptionPane.showMessageDialog(
                    null,
                    "Your BMI = " + String.format("%.2f", bmi)
                            + "\nYour BMI result = " + result);
        }
    }
}
