import java.util.Scanner;

public class Tiramisu_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Khanomkhai custom:");
        System.out.print("Enter a color on a kanom: ");
        String color= scanner.nextLine();
        System.out.print("Enter a flavor: ");
        String flavor= scanner.nextLine();
        System.out.print("How many set: ");
        int set = scanner.nextInt();


        Tiramisu order1 = new Tiramisu(color,set,flavor,20);

        System.out.println(order1);
    }
}
