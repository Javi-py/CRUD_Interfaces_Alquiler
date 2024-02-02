
// CLASE QUE MUESTRA EN UNA TABLA LOS PISOS Y SU SITUACIÓN

package com.mycompany.alquileres;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class CVerAlquileres {
    
    public void MostrarAlquileres(JTable paramTablaMostrar){
        
        Cconectar objetoConexion = new Cconectar();
        DefaultTableModel modelo = new DefaultTableModel();
        
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        paramTablaMostrar.setRowSorter(OrdenarTabla);
        
        String sql = "";
        modelo.addColumn("ID");
        modelo.addColumn("DNI");
        modelo.addColumn("ESTADO");
        modelo.addColumn("F-ENTRADA");
        modelo.addColumn("F-SALIDA");
        
        paramTablaMostrar.setModel(modelo);
        
        sql = "SELECT * FROM inmuebles";
        
        String[] datos = new String[5]; //la longitud de 5 es por los valores de las columnas de la tabla
        Statement st;
       
        try{
          st = objetoConexion.estableceConexion().createStatement();
          ResultSet rs = st.executeQuery(sql);
          while(rs.next()){
              datos[0] = rs.getString(1);
              datos[1] = rs.getString(2);
              datos[2] = rs.getString(3);
              datos[3] = rs.getString(4);
              datos[4] = rs.getString(5);
              modelo.addRow(datos);
          }
          paramTablaMostrar.setModel(modelo);
          st.close();
          rs.close();
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, "NO SE MUESTRAN LOS REGISTROS, error: "+e.toString());
       }
    }
    
    
}
