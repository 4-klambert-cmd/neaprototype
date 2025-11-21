/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author 4-klambert
 */
public class databaseconnection {
    String url = "jdbc:mysql://185.156.138.148/4-klambert";
    String user = "4-klambert";
    String password = "Duty3-Palace-Area";
try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("conection good");
            return connection;
        } catch (Exception e){
            // stack trace shows errors
            e.printStackTrace();
            System.out.println("not successful");
            return null;
        }
    }
}
