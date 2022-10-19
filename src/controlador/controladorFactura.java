/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.daoFacturacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.modeloFacturacion;
import vista.Facturacion;

/**
 *
 * @author Linda
 */
public class controladorFactura implements ActionListener, MouseListener {
     //instancia de clases
    daoFacturacion daofac = new daoFacturacion();
    modeloFacturacion modfac = new modeloFacturacion();
    Facturacion factura = new Facturacion();
    daoFacturacion daofacturacion = new daoFacturacion();
    //tabla
    DefaultTableModel tablafactura = new DefaultTableModel();
    ArrayList<modeloFacturacion> dataVentas = new ArrayList<>();
    
    
    public controladorFactura(modeloFacturacion modfac){
        factura.setVisible(true);
        ventasRealizadas(factura.tblventasfacturacion);
        factura.tblventasfacturacion.addMouseListener(this);
    }
    
    //mostrar el historial de ventas 
    public void ventasRealizadas(JTable tbl){
        factura.tblventasfacturacion.setModel(tablafactura);
        Object[] col= new Object[10];
        
        tablafactura.addColumn("ID");
        tablafactura.addColumn("CANTIDAD");
        tablafactura.addColumn("MONTO");
        tablafactura.addColumn("FECHA");
        tablafactura.addColumn("NIT");
        tablafactura.addColumn("ID CLIENTE");
        tablafactura.addColumn("ID CAJERO");
        tablafactura.addColumn("ID T.PUNTOS");
        tablafactura.addColumn("LONGITUD");
        tablafactura.addColumn("LATITUD");
        
        
        int numeroventas = daofacturacion.mostrartodo(modfac).size();
         dataVentas = (ArrayList<modeloFacturacion>) daofacturacion.mostrartodo(modfac);
        System.out.println(numeroventas);
        
        //lleno mi tabla con los datos previamente ingresados en la base de datos
        for(int i=0; i<numeroventas; i++){
           
         col[0] = dataVentas.get(i).getId_facturacion();
         col[1] = dataVentas.get(i).getCantidad_facturacion();
         col[2] = dataVentas.get(i).getMonto_facturacion();
         col[3] = dataVentas.get(i).getFecha_facturacion();
         col[4] = dataVentas.get(i).getNit_facturacion();
         col[5] = dataVentas.get(i).getIdcliente_facturacion();
         col[6] = dataVentas.get(i).getIdcajero_facturacion();
         col[7] = dataVentas.get(i).getIdpuntos_facturacion();
         col[8] = dataVentas.get(i).getLongitud_facturacion();
         col[9] = dataVentas.get(i).getLatitud_facturacion();
         
         
         
         tablafactura.addRow(col);
        }
    }
    //accion de ver la tabla en los edit text
    public void vertabla(){
         int numfilas = factura.tblventasfacturacion.getColumnCount();
                      
       String[] par = new String[numfilas];
       for( int i =0; i< numfilas; i++){
       par [i]= String .valueOf(factura.tblventasfacturacion.getValueAt(factura.tblventasfacturacion.getSelectedRow(), i));
 }
 
       //colocar cada dato:
       factura.txtcantidadFac.setText(par[1]);
       factura.txtidfac.setText(par[0]);
       factura.txtmontoFac.setText(par[2]);
       
      /* LocalDateTime localDateTime = LocalDateTime.parse(par[3]);
       Date convertedDatetime = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
       factura.txtfechaFac.setDate(convertedDatetime);*/
       
       
       factura.txtnitFac.setText(par[4]);
       factura.txtclienteFac.setText(par[5]);
       factura.txtusuarioFac.setText(par[6]);
       factura.txttarjetaPuntosFac.setText(par[7]);
       factura.txtlatitudfac.setText(par[9]);
       factura.txtlongitudfac.setText(par[8]);
       

  System.out.println("se esta haciendo click en la tabla");
  
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()== factura.tblventasfacturacion){
            vertabla();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
