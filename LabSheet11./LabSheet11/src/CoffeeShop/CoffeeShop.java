package CoffeeShop;
import java.util.ArrayList;
import java.util.Scanner;
public class CoffeeShop {
    static Scanner sc = new Scanner(System.in);
    public static Espresso orderEspresso() {
        System.out.print("Enter a size: ");
        char size = sc.next().charAt(0);
        Espresso e = new Espresso(size);
        System.out.print("Press 'y' or 'Y' For adding a shot: ");
        char ans = sc.next().charAt(0);
        if (ans == 'y' || ans == 'Y') {
            System.out.print("How many shots for adding in Espresso: ");
            int shot = sc.nextInt();
            e.addShot(shot);
        }
        return e;
    }
    public static Frappuccino orderFrappuccino() {
        System.out.print("Enter a size: ");
        char size = sc.next().charAt(0);
        System.out.print("Do you would like to add whipped cream [y/Y]? ");
        char ans = sc.next().charAt(0);
        boolean whip = (ans == 'y' || ans == 'Y');
        return new Frappuccino(size, whip);
    }
    public static void main(String[] args) {
        ArrayList<Priceable> orders = new ArrayList<>();
        int espressoCount = 0;
        int frappuccinoCount = 0;
        while (true) {
            System.out.print("Press 1 for odering Espresso \nPress 2 for ordering Frappuccino \nEnter an option: ");
            int menu = sc.nextInt();
            if (menu == 1) {
                Espresso e = orderEspresso();
                orders.add(e);
                espressoCount++;
                System.out.println(e);
            } else if (menu == 2) {
                Frappuccino f = orderFrappuccino();
                orders.add(f);
                frappuccinoCount++;
                System.out.println(f);
            } else {
                break;
            }
            System.out.print("Do you want to order more [y/Y]? ");
            char more = sc.next().charAt(0);
            if (!(more == 'y' || more == 'Y'))
                break;
        }
        double total = 0;
        for (Priceable p : orders)
            total += p.calculateFinalPrice();
        System.out.println("You ordered " + espressoCount + " Espresso");
        System.out.println("You ordered " + frappuccinoCount +" Frappuccino");
        System.out.println("Total price: " + total );
    }
}
