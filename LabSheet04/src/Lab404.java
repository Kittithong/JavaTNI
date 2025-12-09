import java.util.Scanner;

public class Lab404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sentence = new StringBuilder();
        boolean first = true;

        while (true) {
            System.out.print("Enter word: ");
            String w = sc.nextLine().trim();

            if (w.isEmpty()) continue;
            if (w.equalsIgnoreCase("stop"))
                break;

            if (!first) {
                sentence.append(' ');
            }
            sentence.append(w);
            first = false;
        }
        System.out.println(sentence.toString());
    }
}


