/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Siswa;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class Konfig {
    private static Connection MySQLConfig;
    
    public static Connection configDB() throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/db_datasiswa_geusan";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new Driver());
            MySQLConfig = DriverManager.getConnection(url, user, pass);
        } catch(SQLException e) {
            System.out.println("Koneksi ke Database Gagal " + e.getMessage());
        }
        
        return MySQLConfig;
    }
    
}
