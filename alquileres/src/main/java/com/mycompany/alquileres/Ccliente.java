// CLASE CLIENTES

package com.mycompany.alquileres;


import com.itextpdf.text.pdf.PdfPTable;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class Ccliente {
    private int DNI,TELÉFONO;
    private String NOMBRE,APELLIDO_1,APELLIDO_2;

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDO_1() {
        return APELLIDO_1;
    }

    public void setAPELLIDO_1(String APELLIDO_1) {
        this.APELLIDO_1 = APELLIDO_1;
    }

    public String getAPELLIDO_2() {
        return APELLIDO_2;
    }

    public void setAPELLIDO_2(String APELLIDO_2) {
        this.APELLIDO_2 = APELLIDO_2;
    }

    public int getTELÉFONO() {
        return TELÉFONO;
    }

    public void setTELÉFONO(int TELÉFONO) {
        this.TELÉFONO = TELÉFONO;
    }
    
    // método insertar datos
    public void InsertarCliente(JTextField paramDNI,JTextField paramNombre,JTextField paramApellido_1,JTextField paramApellido_2, JTextField paramTelefono){
        
        DNI = Integer.parseInt(paramDNI.getText()); //HACER UN CASTING A INT
        TELÉFONO = Integer.parseInt(paramTelefono.getText()); //HACER UN CASTING A INT
        
        setDNI(DNI);
        setNOMBRE(paramNombre.getText().toUpperCase());
        setAPELLIDO_1(paramApellido_1.getText().toUpperCase());
        setAPELLIDO_2(paramApellido_2.getText().toUpperCase());
        setTELÉFONO(TELÉFONO);
        
        Cconectar objetoConexion = new Cconectar();
        CallableStatement cs = null;
        // en la tabla clientes se insertan los datos que corresponden a la BBDD
        String consulta = "insert into cliente (DNI,NOMBRE,APELLIDO_1,APELLIDO_2,TELÉFONO) values (?,?,?,?,?);"; 
        try{
            
                cs = objetoConexion.estableceConexion().prepareCall(consulta);
                cs.setInt(1, getDNI());
                cs.setString(2,getNOMBRE());
                cs.setString(3,getAPELLIDO_1());
                cs.setString(4,getAPELLIDO_2());
                cs.setInt(5, getTELÉFONO());
            
                cs.execute();
                JOptionPane.showMessageDialog(null, "SE INSERTÓ CORRECTAMENTE");
                cs.close();
                
        
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, " NO SE INSERTÓ CORRECTAMENTE, ERROR: "+e.toString());    
        }
        
        
    }
    // MOSTRAR LOS CLIENTES EN LA TABLA
    public void mostrarClientes(JTable paramTablaTotalClientes){
        Cconectar objetoConexion = new Cconectar();
        DefaultTableModel modelo = new DefaultTableModel();
        
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        paramTablaTotalClientes.setRowSorter(OrdenarTabla);
        
        String sql = "";
        modelo.addColumn("DNI");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO_1");
        modelo.addColumn("APELLIDO_2");
        modelo.addColumn("TELÉFONO");
        
        paramTablaTotalClientes.setModel(modelo);
        
        sql = "SELECT * FROM cliente";
        
        String[] datos = new String[5]; //la longitud de 5 es por los valores de las columnas de la tabla
        Statement st;
       
        try{
          st = objetoConexion.estableceConexion().createStatement();
          ResultSet rs = st.executeQuery(sql);
          while(rs.next()){
              datos[0] = rs.getString(1).toUpperCase();
              datos[1] = rs.getString(2).toUpperCase();
              datos[2] = rs.getString(3).toUpperCase();
              datos[3] = rs.getString(4).toUpperCase();
              datos[4] = rs.getString(5);
              modelo.addRow(datos);
          }
          paramTablaTotalClientes.setModel(modelo);
          st.close();
          rs.close();
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, "NO SE MUESTRAN LOS REGISTROS, error: "+e.toString());
       }
    }
    
    // SELECCIONA LOS REGISTROS EN LA TABLA CLIENTES
    public void SeleccionarCliente(JTable paramTablaClientes, JTextField paramDNI, JTextField paramNombre, JTextField paramApellido_1,JTextField paramApellido_2, JTextField paramteléfono){
        try{
            int fila = paramTablaClientes.getSelectedRow();
            if (fila >= 0){
                paramDNI.setText((String) paramTablaClientes.getValueAt(fila, 0));
                paramNombre.setText((String) paramTablaClientes.getValueAt(fila, 1));
                paramApellido_1.setText((String) paramTablaClientes.getValueAt(fila, 2));
                paramApellido_2.setText((String) paramTablaClientes.getValueAt(fila, 3));
                paramteléfono.setText((String) paramTablaClientes.getValueAt(fila, 4));
                
            }else{
                JOptionPane.showMessageDialog(null, "FILA NO SELECCIONADA");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERROR DE SELECCIÓN, error: "+e.toString());
        }
    }
    
    // MODIFICAR DATOS DE LOS CLIENTES
    public void ModificarClientes(JTextField paramDNI, JTextField paramNombre, JTextField paramApellido_1,JTextField paramApellido_2, JTextField paramteléfono){
        setDNI(Integer.parseInt(paramDNI.getText()));
        setNOMBRE(paramNombre.getText());
        setAPELLIDO_1(paramApellido_1.getText());
        setAPELLIDO_2(paramApellido_2.getText());
        setTELÉFONO(Integer.parseInt(paramteléfono.getText()));
        
        Cconectar objetoConexion = new Cconectar();
        // cogemos los valores de la tabla clientes
        String consulta = "UPDATE cliente SET cliente.DNI = ?, cliente.NOMBRE = ?,"
                + "cliente.APELLIDO_1 = ?,"
                + "cliente.APELLIDO_2 = ?,"
                + "cliente.TELÉFONO = ? WHERE cliente.DNI = ?;";
        
        PreparedStatement cs = null;
        try{
            cs = objetoConexion.estableceConexion().prepareStatement(consulta);
            cs.setInt(1, getDNI());
            cs.setString(2, getNOMBRE());
            cs.setString(3, getAPELLIDO_1());
            cs.setString(4, getAPELLIDO_2());
            cs.setInt(5, getTELÉFONO());
            cs.setInt(6, getDNI());
            
            
            cs.executeUpdate();
            JOptionPane.showMessageDialog(null, "MODIFICADO CORRECTAMENTE");
            
         }catch (SQLException e){
             JOptionPane.showMessageDialog(null, "NO SE HA MODIFICADO, ERROR: "+ e.toString());
         }finally{
             try{
                 cs.close();
                 
             }catch (SQLException e){
                 JOptionPane.showMessageDialog(null, "ERROR AL CERRAR LA BBDD, ERROR: "+ e.toString());
             }
         }
    }
    
    // ELIMINAR DATOS
    public void EliminarCliente(JTextField paramDNI){
        setDNI(Integer.parseInt(paramDNI.getText()));
        Cconectar objetoConexion = new Cconectar();
        CallableStatement cs;
        
        String consulta = "DELETE FROM cliente WHERE cliente.DNI = ?;";
        try{
            cs = objetoConexion.estableceConexion().prepareCall(consulta);
            cs.setInt(1, getDNI());
            cs.execute();
            JOptionPane.showMessageDialog(null, "ELIMINADO CORRECTAMENTE");
            cs.close();
        }catch (Exception e){
             JOptionPane.showMessageDialog(null, "NO SE HA ELIMINADO, ERROR: "+ e.toString());
        }
    }
    
    
 
}
