/**
 * 
 */
package com.tildev.web;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

/**
 * @author tildev
 * @date 2019. 4. 2.
 */
public class MySQLConnectionTest {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/book_ex?useSSL=false&serverTimezone=Asia/Seoul";
    
    private static final String USER = "tildev";
    
    private static final String PW = "tildev#123";
    
    @Test
    public void testConnection() throws Exception{
        Class.forName(DRIVER);
        Connection con;
        try{
            con = DriverManager.getConnection(URL, USER, PW);
            System.out.println(con);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
