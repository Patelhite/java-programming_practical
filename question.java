import java.util.Scanner;
public class question {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
       
        //question 1
        // System.out.print("Enter number: ");
        // int a = sc.nextInt();
        // if( a > 0){
        //     System.out.println("positive");
        // } else if (a == 0){
        //     System.out.println("zero");
        // } else {
        //     System.out.println("negative");
        // }


        //question 2
        // System.out.print("enter  temp :");
        // double temp = sc.nextDouble();
        // if (temp >= 100){
        //     System.out.println("You have a fever");
        // }   else{
        //     System.out.println("You have NOT fever");
        // }

        // question 3
        // System.out.print("ENTER WEEK NUMBER :");
        // int a = sc.nextInt();
        // switch (a) {
        //         case 1 : System.out.println("MONDAY");
        //         break;
        //         case 2 : System.out.println("TUESDAY");
        //         break;
        //         case 3 : System.out.println("WEDNESDAY");
        //         break;
        //         case 4 : System.out.println("THARUSDAY");
        //         break;
        //         case 5 : System.out.println("FRIDAY");
        //         break;
        //         case 6 : System.out.println("SATURDAY");
        //         break;
        //         case 7 : System.out.println("SUNDAY");
        //         break;
        //         default : System.out.println("MAIN TO BEKAR HN ");
        // }

        // question 4
        System.out.print("Enter Year : ");
        int year = sc.nextInt();
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println("LEAP YEAR");
                } else {
                    System.out.println("NOT LEAP YEAR");
                }
            } else {
                System.out.println("LEAP YEAR");
            }
        } else {
            System.out.println("NOT LEAP YEAR");
        }







    }
}
