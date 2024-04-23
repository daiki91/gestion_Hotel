import java.util.Date;
import java.util.Scanner;

public class Main {
    // public static void main(String[] args) {

    // // Créer une nouvelle réservation
    // Date arrivalDate = new Date(2023, 4, 1);
    // Date departureDate = new Date(2023, 4, 4);
    // ReservationSystem hotel1 = new ReservationSystem("arphan", "bodian",
    // "771364968", 0, arrivalDate, departureDate,
    // RoomType.SINGLE, 5, 2, true);
    // hotel1.add(hotel1);
    // System.out.println(hotel1.printReservationDetails);
    // }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // prenom
        ReservationSystem reservation = new ReservationSystem();
        System.out.println("Entrer votre prenom :");
        String fistName = scanner.nextLine();
        reservation.setFirstName(fistName);
        // nom
        System.out.println("Entrer votre nom :");
        String lastName = scanner.nextLine();
        reservation.setLastName(lastName);
        // numero
        System.out.println("Entrer votre numero :");
        String phoneNumber = scanner.nextLine();
        reservation.setPhoneNumber(phoneNumber);
        // date depart et arrivee
        reservation.setArrivalDate(new Date());
        reservation.setDepartureDate(new Date());
        // type de chambre
        System.out.println("Veuillez choisir une des options suivantes:");
        System.out.println("1. SINGLE");
        System.out.println("2. DOUBLE");
        System.out.println("3. SUITE");

        int choice = scanner.nextInt();
        RoomType selectedRoomType = null;

        switch (choice) {
            case 1:
                selectedRoomType = RoomType.SINGLE;
                break;
            case 2:
                selectedRoomType = RoomType.DOUBLE;
                break;
            case 3:
                selectedRoomType = RoomType.SUITE;
                break;
            default:
                System.out.println("Choix invalide");
        }

        if (selectedRoomType != null) {
            System.out.println("Vous avez choisi: " + selectedRoomType);
        }

        reservation.setRoomType(selectedRoomType);
        // nombre adult
        System.out.println("Entrer le nombre d'adulte :");
        int numAdults = scanner.nextInt();
        reservation.setNumAdults(numAdults);

        // nombre enfant
        System.out.println("Entrer le nombre d'enfant:");
        int numChildren = scanner.nextInt();
        reservation.setNumChildren(numChildren);
        reservation.setIncludesBreakfast(true);
        System.out.println(
                "_____________________________________________________________________________________________________________________________________________________\n");
        System.out.println("bonjour " + fistName + "voici votre reservation");
        reservation.printReservationDetails();
        // instance de reservation
        Reservation reservations = new Reservation();
        reservations.setStartDate(new Date());
        reservations.setEndDate(new Date());

        reservations.printReservation();

        // instance de chambre
        Room chambreRoom = new Room();
        System.out.println("Entrer le numero de chabre:");
        String roomNumber = scanner.nextLine();
        chambreRoom.setRoomNumber(roomNumber);
        System.out.println("le [rix de cette chambre est]");
        double price = 1000000;
        chambreRoom.setPrice(price);
        chambreRoom.setReservations(reservation);
        chambreRoom.printRoom();
    }
}
