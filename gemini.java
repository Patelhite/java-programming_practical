import java.util.Scanner; // Correct import statement

public class gemini {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in) // Correct Scanner initialization
        ) {
            System.out.print("Enter A: ");
            int A = sc.nextInt();
            System.out.print("Enter B: ");
            int B = sc.nextInt();
            System.out.print("Enter C: ");
            int C = sc.nextInt();
            int average = (A + B + C) / 3;
            System.out.println("average is: " + average);
            // Close the Scanner when you're done
        }
    }
}