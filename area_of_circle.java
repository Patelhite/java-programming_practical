import java.util.Scanner;
public class area_of_circle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.err.print("enter radius :");
            float radius = (float) sc.nextDouble(); 
            float area =  3.14f * radius * radius;
            System.out.println("area of circle :" + area);

            sc.close();
        }
    }
}
// public static void main(String[] args) 