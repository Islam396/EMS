/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artechemployeemanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Mofaqkhayrul Islam
 */
class ConnectionDetails {
     Connection con;
    public ConnectionDetails() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost/emsdb", "root", "1234");
    }
    
    
}
