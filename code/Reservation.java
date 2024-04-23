import java.util.*;
import java.util.Date;

public class Reservation {
    private Date startDate;
    private Date endDate;
    private int reservationNumber;

    public Reservation(Date startDate, Date endDate, int reservationNumber) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.reservationNumber = 0;
    }

    public Reservation() {

    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getreservationNumber() {
        return reservationNumber;
    }

    public void setreservationNumber(int reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public void sendConfirmationEmail() {

    }

    public void printReservation() {
        String[] keys = { "numero reservation", "debut sejour", "fin sejour" };
        Object[] values = { this.reservationNumber, this.startDate, this.endDate };
        for (int i = 0; i < keys.length; i++) {
            // System.out.printf("\t");
            System.out.printf("_________________________________________________________________\n");
            System.out.printf("| %-20s              | %s\n", keys[i], values[i]);
        }
        System.out.printf("-----------------------------------------------------------\n");
    }
}