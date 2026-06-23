import java.util.Scanner;
public class pass_or_fail {
     public static void main(String args []){

        try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Enter your marks: ");
                int marks = sc.nextInt();
//         if(marks >= 34) {
//             System.out.println("You have passed");
//         } else if (marks == 0) {
//             System.out.println("ABBSENT");
//
//         }
//
//         else {
//             System.out.println("You have failed");
//         }
  





                String RC = (marks >= 33) ? "pass" : "fail";
                System.out.println(RC);
        }
 }

}