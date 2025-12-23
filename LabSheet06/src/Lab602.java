import java.util.Scanner;

public class Lab602 {
    public static int find_rank(double score, double[] rate_scores) {
        int rank = 1;
        for (int i = 0; i < rate_scores.length; i++) {
            if (rate_scores[i] > score) {
                rank++;
            }
        }
        return rank;
    }
    public static void main(String[] args) {
        String[] movies = {"Me Before You", "Titanic",
                "Before Sunrise", "The Holiday",
                "A Walk to Remember"
        };
        double[] rate_scores = {4.2, 4.9, 4.4, 3.7, 4.3};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a movie title: ");
        String input = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < movies.length; i++) {
            if (movies[i].equalsIgnoreCase(input)) {
                System.out.println("The rating score of \"" + movies[i] + "\" is " + rate_scores[i]);

                int rank = find_rank(rate_scores[i], rate_scores);
                System.out.println("This movie is ranked number " + rank);

                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Cannot found this movie title...");
        }

        sc.close();
    }
}
