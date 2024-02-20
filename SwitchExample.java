import java.util.Scanner;

class SwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month number (1-12): ");
        int monthNumber = scanner.nextInt();

        String monthName = switch (monthNumber) {
            case  1 -> "January";
            case  2 -> "February";
            case  3 -> "March";
            case  4 -> "April";
            case  5 -> "May";
            case  6 -> "June";
            case  7 -> "July";
            case  8 -> "August";
            case  9 -> "September";
            case  10 -> "October";
            case  11 -> "November";
            case  12 -> "December";
            default -> "Invalid month number";
        };

        System.out.println("The month is " + monthName);
        scanner.close();
    }
}
