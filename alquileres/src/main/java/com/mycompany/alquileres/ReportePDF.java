// INFORME EN PDF
package com.mycompany.alquileres;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReportePDF {

    Document documento;
    FileOutputStream fileoutputstream;
    // fuente y tamaño letra
    Font fuenteTitulo = FontFactory.getFont(FontFactory.TIMES_ROMAN, 16);
    Font fuenteParrafo = FontFactory.getFont(FontFactory.HELVETICA, 12);
    
    // fechas
    private String entrada = "";
    private String salida = "";
    
    
    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    //ventanaClientes verClientes = new ventanaClientes();
    
    //  SE CREA EL DOCUMENTO
    public void creardocumento() throws FileNotFoundException, DocumentException {
        documento = new Document(PageSize.A4, 35, 30, 50, 50);

        //archivo a generar
        String ruta = System.getProperty("user.home");
        fileoutputstream = new FileOutputStream(ruta + "/Desktop/informe_de_alquileres.pdf");
        PdfWriter.getInstance(documento, fileoutputstream);
    }

    public void abrirDocumento() {
        documento.open();
    }

    // AGREGAR TITULO
    public void agregarTtitulo(String texto) throws DocumentException {
        PdfPTable tabla = new PdfPTable(1); // 1 columna
        PdfPCell celda = new PdfPCell(new Phrase(texto, fuenteTitulo));
        celda.setColspan(5);
        celda.setBorderColor(BaseColor.WHITE);
        celda.setHorizontalAlignment(Element.ALIGN_CENTER);
        //celda.setBackgroundColor(BaseColor.DARK_GRAY);
        tabla.addCell(celda);
        documento.add(tabla);
    }

    //AGREGAR PÁRRAFO
    public void agregarParrafo(String texto) throws DocumentException {
        Paragraph parrafo = new Paragraph();
        parrafo.add(new Phrase(texto, fuenteParrafo));
        documento.add(parrafo);
    }

    // AGREGAR SALTOS DE LINEA
    public void agregarSaltosDeLinea() throws DocumentException {
        Paragraph saltosdelinea = new Paragraph();
        saltosdelinea.add(new Phrase(Chunk.NEWLINE));
        //saltosdelinea.add(new Phrase(Chunk.NEWLINE));
        documento.add(saltosdelinea);
    }
    
    // MOSTRAR FECHA ACTUAL DEL INFORME
    public void mostrarFecha() throws DocumentException{
        String formatoDeFecha = "d MMMM' de 'yyyy\n";
        Paragraph parrafo = new Paragraph();
        LocalDate curDate = LocalDate.now();
        parrafo.add(new Phrase(curDate.format(DateTimeFormatter.ofPattern(formatoDeFecha)), fuenteParrafo));
        LocalTime curTime = LocalTime.now();
        parrafo.add(new Phrase(curTime.format(DateTimeFormatter.ofPattern("HH':'mm"))));
        documento.add(parrafo);
       
    }
    
    // CREAR INFORME CON LA CONSULTA PISOS ALQUILADOS
    public void ConsultaPisosAlquilados(String FechaEntrada, String FechaSalida) throws DocumentException{
       
        // CONEXIÓN A BBDD
        Cconectar objetoConexion = new Cconectar();
        
        // MODIFICAR LA VARIABLES EN SETTER
        setEntrada(FechaEntrada);
        setSalida(FechaSalida);
        
        String sql;
        PdfPTable tabla = new PdfPTable(5); // ATRIBUTOS DE LA TABLA
        
        tabla.addCell("ID");
        tabla.addCell("DNI");
        tabla.addCell("ESTADO");
        tabla.addCell("F_ENTRADA");
        tabla.addCell("F_SALIDA");
        
        // PREPARACIÓN DE LA CONSULTA
        PreparedStatement pst;
        ResultSet rs;
        String[] datos = new String[5];
        
        try {
            sql = "SELECT ID_INMUEBLE,DNI,EXPEDIENTE,F_ENTRADA,F_SALIDA FROM alquiler WHERE F_ENTRADA BETWEEN ? AND ?";
            pst = objetoConexion.estableceConexion().prepareStatement(sql);//...
            pst.setString(1, entrada);//...
            pst.setString(2, salida);//...
            rs = pst.executeQuery();
            System.out.println(FechaEntrada);
            System.out.println(FechaSalida);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                tabla.addCell(datos[0]);
                tabla.addCell(datos[1]);
                tabla.addCell(datos[2]);
                tabla.addCell(datos[3]);
                tabla.addCell(datos[4]);
            
            }
            rs.close();
            pst.close();
        }catch(SQLException ex){
            Logger.getLogger(ReportePDF.class.getName()).log(Level.SEVERE, null, ex);
        }
        documento.add(tabla);
        documento.close();
        
    }
}
