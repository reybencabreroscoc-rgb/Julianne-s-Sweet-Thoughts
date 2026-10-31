import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class DBConnection {
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/julianne_sweet_thoughts", "root", "");
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Database Error: " + e.getMessage());
            return null;
        }
    }
}
