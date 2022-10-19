/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.daoDetalle;
import dao.daoFacturacion;
import dao.daoProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.ModeloProducto;
import modelo.modeloDetalleFactura;
import modelo.modeloFacturacion;
import vista.Facturacion;
import vista.NuevaVenta;

/**
 *
 * @author Linda
 */
public class controladorVentas implements ActionListener {
    //instancia de clases
    daoFacturacion daofac = new daoFacturacion();
    daoProducto daoprod = new daoProducto();
    daoDetalle daodet = new daoDetalle();
    modeloFacturacion modfac = new modeloFacturacion();
    ModeloProducto modprod = new ModeloProducto();
    modeloDetalleFactura moddet = new modeloDetalleFactura();
    NuevaVenta nv = new NuevaVenta();
    
    //tabla
    DefaultTableModel tablafactura = new DefaultTableModel();
    ArrayList<modeloFacturacion> dataVentas = new ArrayList<>();
    
    
    //variables
    double importe;
    int item =1;
    double total;
    double cantidadpp;
   
    public controladorVentas(modeloDetalleFactura moddet){
        nv.setVisible(true);
        nv.btnbuscarprod.addActionListener(this);
        nv.btnañadirprodNuevaVenta.addActionListener(this);
    }
    
    
    //buscar producto en base de datos por numero de serie:
    public void buscarproducto(){
        if(nv.txtbusquedaProductoNuevaVenta.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese el codigo del producto");
        } else{
            modprod.setNumeroserie_producto(nv.txtbusquedaProductoNuevaVenta.getText().toString());
            
            boolean respuesta = daoprod.consultarprod(modprod);
            if(respuesta ==true){
                nv.txtnombreprodNuevaVenta.setText(modprod.getNombre_producto());
                nv.txtprecioProdNuevaVenta.setText(String.valueOf(modprod.getPrecio_producto()));
               nv.txtstockProdNuevaVenta.setText(String.valueOf(modprod.getCantidad_producto()));
               nv.txtidprodnuevaventa.setText(String.valueOf(modprod.getId_producto()));
               int estado = modprod.getEstado_producto();
                
            }
        }
    }
    
    //agregar un producto a la factura de la vista nueva venta
    public void agregarprodventatabla(){
        
    tablafactura = (DefaultTableModel) nv.tblnuevaVenta.getModel();

    int idprod = Integer.parseInt(nv.txtidprodnuevaventa.getText().toString());
    
    String nitcliente = nv.txtnitClienteNuevaVenta.getText().toString();
    String dpicliente = nv.txtdpiClienteNuevaVenta.getText().toString();
    int tarjetapuntos = Integer.parseInt(nv.txttarjetaPuntosNuevaVenta.getText().toString());
    String nombreprod = nv.txtnombreprodNuevaVenta.getText().toString();
    double precioprod = Double.parseDouble(nv.txtprecioProdNuevaVenta.getText().toString());
    String cantidad = String.valueOf(nv.jspcantidadNuevaVenta.getValue().toString());
    int cantidadprod = Integer.parseInt(cantidad);
    int stockprod = Integer.parseInt(nv.txtstockProdNuevaVenta.getText().toString());
    String numeroserie = nv.txtbusquedaProductoNuevaVenta.getText().toString();
    
    //pruebas----------------------------
     System.out.println(stockprod);
         System.out.println(cantidadprod);
    //------------------------------------   
         
         //condicion para añadir producto a la factura
    if(cantidadprod <= 0){
          JOptionPane.showMessageDialog(nv, "Elija una cantidad positiva para añadir producto a la venta");  
     
        //filtro para saber si hay suficiente cantidad disponibles
    }else if(stockprod < cantidadprod){
        JOptionPane.showMessageDialog(nv, "No hay suficientes productos en existencia");  
    }else{
         importe = precioprod*cantidadprod;
          Object[] objeto = new Object[6];
        objeto[0]=item;
        objeto[1]=numeroserie;
        objeto[2]=nombreprod;
        objeto[3]= precioprod;
        objeto[4]=cantidadprod;
        objeto[5]=importe;
        
      for(int i=0;i<nv.tblnuevaVenta.getRowCount(); i++){
          int fila=0;
          int total=0;
          
            fila= Integer.parseInt(nv.tblnuevaVenta.getValueAt(i, 4).toString());
        total+=fila;
        modfac.setCantidad_facturacion(total);
    
      }
        //descoontar del inventario
        while(modprod.getId_producto()==idprod){
            System.out.println("se esta ejecutando el while");
            
        int deduccion = stockprod-cantidadprod;
        modprod.setCantidad_producto(deduccion);
        modprod.setId_producto(idprod);
        daoprod.editarproducto(modprod);
        
        idprod++;
        
        System.out.println("esto es lo que queda:"+ modprod.getCantidad_producto());
        }
        
        tablafactura.addRow(objeto);
        nv.tblnuevaVenta.setModel(tablafactura);
        calculartotventa();
        
       item+=1; 
       
     
    }
    
 
}
    
    //calcular el total de la venta 
    public void calculartotventa(){
    total = 0;
   double totalproductos =0;
    
    for(int i=0; i<nv.tblnuevaVenta.getRowCount(); i++){
        cantidadpp = Double.parseDouble(nv.tblnuevaVenta.getValueAt(i, 3).toString());
       double precio = Double.parseDouble(nv.tblnuevaVenta.getValueAt(i, 4).toString());
        total+=(cantidadpp*precio);
        totalproductos +=cantidadpp;
     
    }
    nv.lbltotalventa.setText(String.valueOf(total));
       modfac.setMonto_facturacion(totalproductos);
}

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==nv.btnbuscarprod){
        buscarproducto();
    }else if(e.getSource()==nv.btnañadirprodNuevaVenta){
         agregarprodventatabla();
    }
    }
            
}
