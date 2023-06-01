/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestaodeestoqueateliedocejava;

import java.sql.*;
/**
 *
 * @author pj
 */
public class ModuloConexao {
    
    public static Connection conector(){
        java.sql.Connection conexao = null;
        String driver ="com.mysql.cj.jdbc.Driver";
        String url ="jdbc:mysql://127.0.0.1:3306/dbateliedoce";
        String user ="root";
        String password ="dgd32133";
        
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
            
        } catch (Exception e){
            System.out.print(e);
            return null;
        }
    }
    
}
