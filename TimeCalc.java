public class TimeCalc {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java TimeCalc <hh:mm> <minutesToAdd>");
            return;
        }

        String timeInput = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);

        String[] parts = timeInput.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);

        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes % 60;

        System.out.printf("%02d:%02d%n", newHours, newMinutes);
    }
}
