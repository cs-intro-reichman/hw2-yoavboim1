public class TestRandom {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java TestRandom <N>");
            return;
        }

        int N = Integer.parseInt(args[0]);
        int greaterCount = 0;
        int lessOrEqualCount = 0;

        for (int i = 0; i < N; i++) {
            double r = Math.random();
            if (r > 0.5) {
                greaterCount++;
            } else {
                lessOrEqualCount++;
            }
        }

        System.out.println("> 0.5: " + greaterCount + " times");
        System.out.println("<= 0.5: " + lessOrEqualCount + " times");

        if (lessOrEqualCount == 0) {
            // Avoid division by zero
            return;
        }

        double ratio = (double) greaterCount / lessOrEqualCount;
        System.out.println("Ratio: " + ratio);
    }
}
