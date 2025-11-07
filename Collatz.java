public class Collatz {

    public static void main(String[] args) {
        boolean verboseMode = args[1].equals("v");
        int upperLimit = Integer.parseInt(args[0]);

        for (int startNumber = 1; startNumber <= upperLimit; startNumber++) {
            int currentNumber = startNumber;
            int stepCount = 2;

            if (verboseMode) System.out.print(String.format("%s ", currentNumber));
            currentNumber = nextCollatz(currentNumber);

            while (currentNumber != 1) {
                if (verboseMode) System.out.print(String.format("%s ", currentNumber));
                currentNumber = nextCollatz(currentNumber);
                stepCount++;
            }

            if (verboseMode) System.out.print(String.format("%s ", currentNumber));
            if (verboseMode) System.out.println(String.format("(%s)", stepCount));
        }

        System.out.println(String.format(
            "Every one of the first %s hailstone sequences reached 1.", args[0]
        ));
    }

    public static int nextCollatz(int number) {
        if (number % 2 == 0) {
            number = number / 2;
        } else {
            number = 3 * number + 1;
        }
        return number;
    }
}
