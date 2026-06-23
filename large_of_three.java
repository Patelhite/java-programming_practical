import java.util.Scanner;
public class large_of_three {
    public static void main(String[] args) {
        System.out.println("WHO IS GREATER");
        try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter a: ");
         int a = sc.nextInt();
         System.out.print("Enter b: ");
         int b = sc.nextInt();
         System.out.print("Enter c: ");
         int c = sc.nextInt();
         if(a >= b && a >= c) {
             System.out.println("Largest number is: " + a);
        }
         else if(b >= c){
             System.out.println("Largest number is: " + b);
        }
            else {
            System.out.println("Largest number is: " + c);
        }
    }
}

}