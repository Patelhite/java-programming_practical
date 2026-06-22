import java.util.Scanner;
public class product_input{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {   // OBJECT
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a * b;
            System.out.println(sum);
        }


    }
    
    
}