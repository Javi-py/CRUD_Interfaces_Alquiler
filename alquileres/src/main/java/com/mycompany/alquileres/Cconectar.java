
// CLASE QUE REALIZARÁ LA CONEXIÓN A BBDD MYSQL

package com.mycompany.alquileres;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Cconectar {
    Connection conectar = null;
   
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String user = "root";
    private String pass = "";
    private String url = "jdbc:mysql://localhost:3306/alquiler_bd";
    
    public Connection estableceConexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection(url, user, pass);
                
            //JOptionPane.showMessageDialog(null, "SE HA CONECTADO");
          
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR "+e.toString());
        }
        return conectar;   
    }
}
