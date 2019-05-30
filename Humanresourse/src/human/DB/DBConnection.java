/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pol
 */
public class DBConnection {
    public static final String DB_NAME = "myhrm";
    public static final String DB_HOST = "jdbc:mysql://localhost:3306/";
    public static final String DB_USER_NAME = "root";
    public static final String DB_PASSWORD = "123456";
    
    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_HOST+DB_NAME, DB_USER_NAME, DB_PASSWORD);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return conn;
    }
}
