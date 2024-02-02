
// CLASE QUE MUESTRA LOS INMUEBLES

package com.mycompany.alquileres;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class CInmuebles {
    int id_inmueble;
    
    public int getId_inmueble() {
        return id_inmueble;
    }

    public void setId_inmueble(int id_inmueble) {
        this.id_inmueble = id_inmueble;
    }
    
    // REALIZAR LA BÚSQUEDA DEL INMUEBLE POR SU ID
    public void buscarInmueble(JTable paramMostrarInmueble,int id){
        Cconectar objetoConexion = new Cconectar();
        DefaultTableModel modelo = new DefaultTableModel();
        
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        paramMostrarInmueble.setRowSorter(OrdenarTabla);
        
        // MODIFICAR LA VARIABLES EN SETTER
        setId_inmueble(id);
        
        String sql = "";
        modelo.addColumn("ID");
        modelo.addColumn("LOCALIDAD");
        modelo.addColumn("CALLE");
        modelo.addColumn("N");
        modelo.addColumn("METROS");
        modelo.addColumn("BAÑOS");
        modelo.addColumn("PRECIO");
        
        paramMostrarInmueble.setModel(modelo);
        
        // PREPARACIÓN DE LA CONSULTA
        PreparedStatement pst;
        ResultSet rs;
        String[] datos = new String[7];
        
        try{
            sql = "SELECT * FROM inmuebles WHERE ID_INMUEBLE = ?";
            pst = objetoConexion.estableceConexion().prepareStatement(sql);//...
            pst.setInt(1, id_inmueble);
            rs = pst.executeQuery();
            while(rs.next()){
              datos[0] = rs.getString(1);
              datos[1] = rs.getString(2).toUpperCase();
              datos[2] = rs.getString(3).toUpperCase();
              datos[3] = rs.getString(4);
              datos[4] = rs.getString(5);
              datos[5] = rs.getString(6);
              datos[6] = rs.getString(7);
              
              modelo.addRow(datos);
          }
          paramMostrarInmueble.setModel(modelo);
          rs.close();
          pst.close(); 
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "NO SE MUESTRAN LOS REGISTROS, error: "+e.toString());
        }
    }
    
   
}

