import javax.swing.*;

public class Lab403 {
    public static void main(String[] args) {
        final String USERNAME = "admin";
        final String PASSWORD = "Admin1234";

        while (true) {
            String inputUser = JOptionPane.showInputDialog(null, "Enter username:",
                    "Input", JOptionPane.QUESTION_MESSAGE);
            if (inputUser == null) {
                JOptionPane.showMessageDialog(null, "Canceled.",
                        "Message", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            String inputPass = JOptionPane.showInputDialog(null, "Enter password:",
                    "Input", JOptionPane.QUESTION_MESSAGE);
            if (inputPass == null) {
                JOptionPane.showMessageDialog(null, "Canceled.",
                        "Message", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            if (inputUser.equalsIgnoreCase(USERNAME) && inputPass.equals(PASSWORD)) {
                JOptionPane.showMessageDialog(null, "Login Success!!",
                        "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Login Fail...",
                        "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}


