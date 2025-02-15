package Java8;

public class Java8SwitchExample {
    public static void main(String[] args) {
        int day = 2;  // Example input: 2 (Tuesday)
        String dayName = getDayName(day);
        System.out.println("Day Name: " + dayName);  // Output: Tuesday
    }

    // Traditional switch case (Java 8 style)
    public static String getDayName(int day) {
        String result;
        switch (day) {
            case 1:
                result = "Monday";
                break;  // Must use 'break' to prevent fall-through
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Invalid day";  // Default case for unexpected inputs
        }
        return result;
    }
}