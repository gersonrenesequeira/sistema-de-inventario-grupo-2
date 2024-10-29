/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class DAOProducto {
    public Producto Insertar(String nombre, String categoria, double precio,
            int existencia) {
        String transaccion = "INSET INTO Producto (nombres,categoria,precio,existencia) VALUES('"
               + nombre +"', '"
               + categoria  +"', '"      
               + precio     +"', '"   
               + existencia +"', '" ;
         if (new DataBase().Actualizar(transaccion) > 0 ){
        return new Producto(nombre, categoria, precio , existencia);
    }
      return null;      
}
 public int Actualizar (int id_producto, String nombre, String categoria, double precio,
         int existencia){
     
      String transaccion = "UPDATE Producto SET caracteristicas='"
               
              + nombre +"',nombres ='"
              + categoria  +"',categoria ='"      
              + precio     +"',precio ='"   
              + existencia +"',existencia ='"
              + id_producto ;
        
  return new DataBase().Actualizar(transaccion);         
 }
public List obtenerDatos() {
    
     String transaccion = "SELEC * FROM Productos";
     List<Map> registros = new DataBase().Listar(transaccion);
     List<Producto> productos = new ArrayList();
     for (Map registro : registros){
         Producto aut = new Producto ((int) registro.get("id_Producto"),
                 (String) registro.get("nombre"),
                 (String) registro.get("Categoria"),
                 (double) registro.get("precio"),
                 (int) registro.get("Existencia"));
         productos.add(aut);  
     }
      return productos;
     
       }
      public int Eliminar(int id){
       String Producto ="DELETE FROM Productos WHERE id_productos='"+ id + "'";
       return new DataBase().Actualizar(Producto);
      }
      
       
}
    
    
    
    
     



 