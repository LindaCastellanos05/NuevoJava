
package dao;

import conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import modelo.ModeloProducto;

/**
 *
 * @author dave_
 */
public class daoProducto extends conexion{
    //Variables necesarias
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    
    //Query necesarios para Producto
    /*************Query****************/
    String insertar = "INSERT INTO producto (nombre_producto,numeroserie_producto,precio_producto,cantidad_producto,"
    + "estado_producto,categoria_producto) VALUES (?,?,?,?,?,?)";
    String mostrar = "SELECT * FROM producto";
    /*********************************/
    
    public String guardarProducto(ModeloProducto producto){
        int respuesta;
        String mensaje = "";
        
        try{
            
            con = conectar();
            ps = con.prepareStatement(insertar);
            ps.setString(1, producto.getNombre_producto());
            ps.setString(2, producto.getNumeroserie_producto());
            ps.setDouble(3, producto.getPrecio_producto());
            ps.setInt(4, producto.getCantidad_producto());
            ps.setInt(5, producto.getEstado_producto());
            ps.setInt(6, producto.getCategoria_producto());
            respuesta = ps.executeUpdate();
            
            if(respuesta == 1){
                mensaje = "Guardado";
                JOptionPane.showMessageDialog(null, mensaje);
            }
            else{
                mensaje = "Error al Guardar";
                JOptionPane.showMessageDialog(null, mensaje);
            }
            
        }
        catch(SQLException ex){
            java.util.logging.Logger.getLogger(daoProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            closeConection();
       }
        
        return mensaje;
    }
    
}
