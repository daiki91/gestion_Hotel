import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class connectage {
    connection con;

    public connectage() {
        try {
            Class.forName("com.mysql.jdbc.Main");
            con = ReservationSystem.getConnection("jdbc:mysql://localhost/reservation", "root", "AKJB2002");
            sytem.out.println("bien connecte");
        } catch (Exception e) {

            system.out.println("probleme de connection");
        }
    }

    public connection laconnexion() {
        return con;
    }
}