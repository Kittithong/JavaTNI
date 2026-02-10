import java.util.Scanner;

public class CakeOrder {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //NO1
        System.out.println("Birthday Cake's Details:");
        System.out.print("Enter a message on cake: ");
        String message = scanner.nextLine();
        System.out.print("Enter a flavor: ");
        String flavor = scanner.next();
        System.out.print("How many pound: ");
        double pound = scanner.nextDouble();

        //No2
        BirthdayCake order1 = new BirthdayCake(message,pound,flavor,350);


        //No3
        System.out.println(order1);

        System.out.println("Cup Cake's Details:");
        System.out.print("Enter a flavor: ");
        String cupcake_flavor = scanner.next();
        System.out.print("How many piece: ");
        int piece = scanner.nextInt();
        CupCake order2 = new CupCake(piece,cupcake_flavor,65);
        System.out.println(order2);

        System.out.println();

        System.out.println("Total price = " + (order1.calculateTotalPrice() + order2.calculateTotalPrice()));



    }
}