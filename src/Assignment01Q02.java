public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int numTerms = Integer.parseInt(args[0]);
        int n = 1;
        int sign = 1;
        for (int i = 0; i < numTerms; i++) {
            approxPi += sign * (1.0 / n);
            sign *= -1;
            n += 2;
        }
        approxPi = 4 * approxPi;
        System.out.println(approxPi + " " + actualPi);
    }
}
