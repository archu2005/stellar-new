package Day_9;
import java.util.Scanner;

public class TrainTicketReservation {
    private static final int TOTAL_SEATS = 10; 
    private static boolean[] seats = new boolean[TOTAL_SEATS]; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n==== Train Ticket Reservation System ====");
            System.out.println("1. Book a Ticket");
            System.out.println("2. Cancel a Ticket");
            System.out.println("3. View Seat Availability");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bookTicket(scanner);
                    break;
                case 2:
                    cancelTicket(scanner);
                    break;
                case 3:
                    viewSeats();
                    break;
                case 4:
                    System.out.println("Thank you for using the Train Ticket Reservation System!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    
    private static void bookTicket(Scanner scanner) {
        System.out.print("Enter seat number to book (1-" + TOTAL_SEATS + "): ");
        int seatNumber = scanner.nextInt();

        if (seatNumber < 1 || seatNumber > TOTAL_SEATS) {
            System.out.println("Invalid seat number! Please choose a number between 1 and " + TOTAL_SEATS);
            return;
        }

        if (!seats[seatNumber - 1]) {
            seats[seatNumber - 1] = true;
            System.out.println("Seat " + seatNumber + " has been successfully booked.");
        } else {
            System.out.println("Sorry, Seat " + seatNumber + " is already booked.");
        }
    }

    
    private static void cancelTicket(Scanner scanner) {
        System.out.print("Enter seat number to cancel (1-" + TOTAL_SEATS + "): ");
        int seatNumber = scanner.nextInt();

        if (seatNumber < 1 || seatNumber > TOTAL_SEATS) {
            System.out.println("Invalid seat number! Please choose a number between 1 and " + TOTAL_SEATS);
            return;
        }

        if (seats[seatNumber - 1]) {
            seats[seatNumber - 1] = false;
            System.out.println("Seat " + seatNumber + " has been successfully canceled.");
        } else {
            System.out.println("Seat " + seatNumber + " is already available.");
        }
    }

    
    private static void viewSeats() {
        System.out.println("\n==== Seat Availability ====");
        for (int i = 0; i < TOTAL_SEATS; i++) {
            System.out.println("Seat " + (i + 1) + ": " + (seats[i] ? "Booked" : "Available"));
        }
    }
}