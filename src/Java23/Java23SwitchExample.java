package Java23;

public class Java23SwitchExample {
    public static void main(String[] args) {
        int day = 2;  // Example input: 2 (Tuesday)

        // New switch expression (Introduced in Java 14, improved in Java 23)
        String dayName = switch (day) {
            case 1 -> "Monday";    // No need for 'break'
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";  // Default case for unexpected inputs
        };

        System.out.println("Day Name: " + dayName);  // Output: Tuesday
    }
}