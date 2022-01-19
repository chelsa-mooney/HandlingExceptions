public class HandlingExceptions {
// An exception is an event which occurs during the execution of a program that disrupts normal flow
    public static void main(String[] args)
    {
        int b[] = new int[2];
        try {
            // int a = 100/0;
            System.out.println("Value of b =" + b[3]);
        } catch (ArithmeticException x) {
            System.out.println(x);
        } catch (Exception x) {
            System.out.println(x);
        }
        System.out.println("???");
    }
}
