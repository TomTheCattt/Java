/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hehe;

/**
 *
 * @author VIet Anh
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DB {
    public static Connection getJDBCConnection() throws SQLException {
        final String url = "jdbc:mysql://localhost:3306/shoeapp?autoReconnect=true&useSSL=false";
        final String user = "root";
        final String password = "1234";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
        public static void main(String[] args) throws SQLException {
        Connection connection = getJDBCConnection();
        
        if (connection != null) {
            System.out.println("Data connection successful");
        } else {
            System.out.println("Data connection failed");
        }
    }
}
