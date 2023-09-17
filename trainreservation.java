import java.util.Scanner;

public class trainreservation {
    private static final int TOTAL_SEATS = 50;
    private static boolean[] seats = new boolean[TOTAL_SEATS];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Train Reservation System");
            System.out.println("1. View Available Seats");
            System.out.println("2. Book a Seat");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    viewAvailableSeats();
                    break;
                case 2:
                    bookSeat();
                    break;
                case 3:
                    cancelReservation();
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void viewAvailableSeats() {
        System.out.println("Available Seats:");
        for (int i = 0; i < TOTAL_SEATS; i++) {
            if (!seats[i]) {
                System.out.print(i + 1 + " ");
            }
        }
        System.out.println();
    }

    private static void bookSeat() {
        System.out.print("Enter the seat number you want to book: ");
        int seatNumber = scanner.nextInt();

        if (seatNumber < 1 || seatNumber > TOTAL_SEATS) {
            System.out.println("Invalid seat number. Please enter a valid seat number.");
            return;
        }

        if (seats[seatNumber - 1]) {
            System.out.println("Sorry, this seat is already booked.");
        } else {
            seats[seatNumber - 1] = true;
            System.out.println("Seat " + seatNumber + " has been booked successfully.");
        }
    }

    private static void cancelReservation() {
        System.out.print("Enter the seat number you want to cancel: ");
        int seatNumber = scanner.nextInt();

        if (seatNumber < 1 || seatNumber > TOTAL_SEATS) {
            System.out.println("Invalid seat number. Please enter a valid seat number.");
            return;
        }

        if (seats[seatNumber - 1]) {
            seats[seatNumber - 1] = false;
            System.out.println("Reservation for seat " + seatNumber + " has been canceled.");
        } else {
            System.out.println("This seat is not currently booked.");
        }
    }
}
