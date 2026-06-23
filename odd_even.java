import java.util.Scanner;
public class odd_even {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.err.print("enter number :");
            int number = sc.nextInt();

            if(number % 2 == 0){
                System.err.println("Even");
            }
            else {
                System.out.println("ODD");
            }
        }

        
    }
    
}
