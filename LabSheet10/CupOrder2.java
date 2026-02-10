import java.util.Scanner;

public class CupOrder2 {
    Scanner sc = new Scanner(System.in);
    boolean loop = true;
    int flavor_number;
    String flavor;

    public void selectFlavor() {
        System.out.println("Press 1 for Chocolate");
        System.out.println("Press 2 for Vanilla");
        System.out.println("Press 3 for Strawberry");
        System.out.println("Press 4 for Lemon");
        System.out.println("Press 5 for Red Velvet");

        while (loop) {
            System.out.print("Enter a flavor number: ");
            flavor_number = sc.nextInt();

            if (flavor_number == 1) {
                flavor = "Chocolate";
                break;
            } else if (flavor_number == 2) {
                flavor = "Vanilla";
                break;
            } else if (flavor_number == 3) {
                flavor = "Strawberry";
                break;
            } else if (flavor_number == 4) {
                flavor = "Lemon";
                break;
            } else if (flavor_number == 5) {
                flavor = "Red Velvet";
                break;
            }
        }
    }

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        CupOrder2 bakery = new CupOrder2();
        String message;
        double pound;
        int piece;

        System.out.println("Press 1 to order Birthday Cake");
        System.out.println("Press 2 to order Cup Cake");
        System.out.println("Press 3 to order Brownie");
        System.out.println("Press 3 to order Tiramisu");
        System.out.print("Enter an option: ");
        choice = sc.nextInt();

        if (choice == 1) {
            System.out.println();
            bakery.selectFlavor();
            System.out.println();
            System.out.print("Enter a message: ");
            message = sc.next();
            System.out.print("How many pound: ");
            pound = sc.nextDouble();
            System.out.println();
            BirthdayCake order1 = new BirthdayCake(message, pound, bakery.flavor, 350);
            System.out.println(order1);
        } else if (choice == 2) {
            System.out.println();
            bakery.selectFlavor();
            System.out.println();
            System.out.print("How many pieces: ");
            piece = sc.nextInt();
            System.out.println();
            CupCake order2 = new CupCake(piece, bakery.flavor, 70);
            System.out.println(order2);
        } else if (choice == 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Tiramisu custom:");
            System.out.print("Enter a color on a kanom: ");
            String color= scanner.nextLine();
            System.out.print("Enter a flavor: ");
            String flavor= scanner.nextLine();
            System.out.print("How many set: ");
            int set = scanner.nextInt();


            Tiramisu order1 = new Tiramisu(color,set,flavor,20);

            System.out.println(order1);
        } else {
            System.out.println("Wrong option!! Try again!!");
        }
    }
}