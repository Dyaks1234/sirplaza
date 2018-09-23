/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class javaconnect {

    /**
     *
     * @return
     */
    public static Connection connectdb(){
        Connection con=null;
        try {
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/Mship", "admins", "admins");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(javaconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
