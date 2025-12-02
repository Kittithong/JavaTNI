import java.util.Scanner;

public class Lab305 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int First = scan.nextInt();

        System.out.print("Enter the second number: ");
        int Second = scan.nextInt();

        if (First % 2 != 0) {
            ++First;
        }
        for (int i = First; i <= Second; i += 2) {
            System.out.print(i + " ");
        }
    }
}
