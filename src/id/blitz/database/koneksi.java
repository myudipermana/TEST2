/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.blitz.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author KP
 */
public class koneksi {
    public Statement state ;
public Connection connect;
public String url = "jdbc:mysql://localhost:3306/dbase";

public Connection again(){
    try {
        connect=DriverManager.getConnection(url,"root","qwerty");
            System.out.println("Database Ditemukan");
            state=connect.createStatement();
    } catch (SQLException x) {
        System.err.println("SQLException:"+x.getMessage());
    }
        return connect;
}
    
}
