package kata05p2.view;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import kata05p2.model.*;

public class MailListReaderBD {

    public static List<Mail> listaEmail = new ArrayList<Mail>();

    public List<Mail> read(String bdName) {
        String url = "jdbc:sqlite:" + bdName;
        Connection conn = null;
        String sql = "SELECT * FROM EMAIL";
        
        try {
            
            conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(sql);
            while (res.next()) {
                String email = res.getString("mail");
                if (email.contains("@")) {
                    listaEmail.add(new Mail(email));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listaEmail;
    }
}
