public class CalcPi {
    public static void main(String[] args) {
        int iterations = Integer.parseInt(args[0]);
        System.out.println("π according to Java: " + Math.PI);

        double piApproximation = 0.0;
        double denominator = 1.0;
        boolean addTerm = true;

        for (int i = 0; i < iterations; i++) {
            double term = 1.0 / denominator;

            if (addTerm) {
                piApproximation += term;
            } else {
                piApproximation -= term;
            }

            denominator += 2.0;
            addTerm = !addTerm;
        }

        piApproximation *= 4.0;
        System.out.printf("π approximated:       %.15f%n", piApproximation);
    }
}
