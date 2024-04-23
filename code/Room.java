import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.*;

public class Room {
    private String roomNumber;
    private RoomType roomType;
    private double price;
    private ReservationSystem reservations;

    public Room(String roomNumber, RoomType roomType, double price) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.reservations = new ReservationSystem();
    }

    public Room() {
    }

    // Méthode pour vérifier si la salle est disponible pour une plage de dates
    // donnée
    // public boolean isAvailable(Date startDate, Date endDate) {
    // // Vérifier si la chambre a des réservations pendant la plage de dates
    // for (Reservation reservation : reservations) {
    // if (reservation.getStartDate().before(endDate) &&
    // reservation.getEndDate().after(startDate)) {
    // return false;
    // }
    // }

    // return true;

    // }

    // Getters et setters
    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ReservationSystem getReservations() {
        return reservations;
    }

    public void setReservations(ReservationSystem reservations) {
        this.reservations = reservations;
    }

    // methode d'ajout de resevation
    public void addReservation(Reservation reservation) {

    }

    public void addReservation(ReservationSystem reservation) {
        reservation.add(reservation);
    }

    public void printRoom() {
        String[] keys = { "numero chambre", "prix", "type de chambre", "reservations " };
        Object[] values = { this.roomNumber, this.price, this.roomType, this.reservations };
        for (int i = 0; i < keys.length; i++) {
            // System.out.printf("\t");
            System.out.printf("_________________________________________________________________\n");
            System.out.printf("| %-20s              | %s\n", keys[i], values[i]);
        }
        System.out.printf(
                "-------------------------------------------------------------------------------------------------------------------------------------------------------\n");
    }

}
