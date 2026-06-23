import java.util.Scanner;
public class switch_clculaotr {
    public static void main(String args[]){
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        char oprater = sc.next().charAt(0);

        switch (oprater) {
            case '+' -> System.out.println(a + b);
            case '-' -> System.out.println(a - b);
            case '*' -> System.out.println(a * b);
            case '/' -> System.out.println(a / b);
            case '%' -> System.out.println(a % b);
            default -> System.out.println("Invalid oprater");
        }
    }
}
}