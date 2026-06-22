
/*public class type_casting {
    public static void main(String[] args) {
        int ch = 98;
        int ch2 = 97;                             // error 
        char num1 = ch;
        char num2 = ch2;
        System.out.println(num1);
        System.out.println(num2);
    }
    
}
*/

public class type_casting {
    public static void main(String[] args) {
        int ch = 98;
        int ch2 = 97;
        char num1 = (char) ch; // Explicit cast
        char num2 = (char) ch2; // Explicit cast
        System.out.println(num1);
        System.out.println(num2);
    }
}