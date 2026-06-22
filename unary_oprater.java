public class unary_oprater {
    public static void main(String[] args) {
        int A = 10;
        int B = 5;
        int a = 1;
        int b = ++a;
        int c = a++;
        //UNARY OPRATER
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("A++ = " + A++);
        System.out.println("A = " + A);
        System.out.println("++B = " + ++B);
        System.out.println("B = " + B);
        System.out.println("A-- = " + A--);
        System.out.println("A = " + A);
        System.out.println("--B = " + --B);
        System.out.println("B = " + B);


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
