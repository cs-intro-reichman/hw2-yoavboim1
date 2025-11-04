public class Cheers {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Cheers <word> <repetitions>");
            return;
        }

        String word = args[0].toUpperCase();
        int repetitions = Integer.parseInt(args[1]);

        String useAnLetters = "AEFHILMNORSX";

        // Loop through each character of the word
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            String article = (useAnLetters.indexOf(ch) != -1) ? "an" : "a";
            System.out.println("Give me " + article + " " + ch + ": " + ch + "!");
        }

        System.out.println("What does that spell?");
        for (int i = 0; i < repetitions; i++) {
            System.out.println(word + "!!!");
        }
    }
}
