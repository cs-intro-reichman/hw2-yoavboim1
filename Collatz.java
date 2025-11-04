public class Collatz {
    public static void main(String args[]) {
        if (args.length != 2) {
            System.out.println("Usage: java Collatz <N> <mode>");
            return;
        }

        int N = Integer.parseInt(args[0]);
        String mode = args[1];

        boolean verbose = mode.equals("v");

        for (int seed = 1; seed <= N; seed++) {
            int count = 1; // counts number of terms including the starting seed
            int current = seed;

            if (verbose) {
                System.out.print(current + " ");
            }

            while (current != 1) {
                if (current % 2 == 0) {
                    current = current / 2;
                } else {
                    current = 3 * current + 1;
                }

                count++;
                if (verbose) {
                    System.out.print(current + " ");
                }
            }

            if (verbose) {
                System.out.println("(" + count + ")");
            }
        }

        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}
