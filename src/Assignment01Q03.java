public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        int[] fib = new int[x];
        for (int i = 0; i < x; i++) {
            if (i == 0 || i == 1) {
                fib[i] = 1;
            } else {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
        }
       int numOdd = 0;
        for (int i = 0; i < x; i++) {
            System.out.print(fib[i]);
            if (fib[i] % 2 != 0) {
                numOdd++;
            }
            if (i < x - 1) {
                System.out.print(" "); // Make sure we don't print a trailing space
            }
        }
        System.out.println();
        

        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
