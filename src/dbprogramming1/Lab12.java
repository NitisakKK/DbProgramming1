package dbprogramming1;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Lab12 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb1";
        String username = "root";
        String password = "123456za";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, username, password);
            String sql = "INSERT INTO student(studentID,firstname,lastname,email,deptID) "
                    + "VALUES(?,?,?,?,?)";
            PreparedStatement preparestatement = connection.prepareStatement(sql);
            preparestatement.setString(1, "33333");
            preparestatement.setString(2, "aaaa");
            preparestatement.setString(3, "bbbb");
            preparestatement.setString(4, "aaaazaza@gmail.com");
            preparestatement.setString(5, "IT");
            preparestatement.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Lab9.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Lab9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
