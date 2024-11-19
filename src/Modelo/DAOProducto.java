/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Modelo.Producto;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class DAOProducto {
     //método para insertar datos a la BD

    public Producto Insertar(String nombre, String categoria, Float precio,
            int existencia) {
        String transaccion = "INSERT INTO Producto (Nombre,Categoria,Precio,existencia) VALUES('"
               + nombre +"', '"
               + categoria  +"', '"      
               + precio     +"', '"   
               + existencia +"') " ;
        //llamar al metodo Actualizar ubicado en DataBase.java
         if (new DataBase().Actualizar(transaccion) > 0 ){
        return new Producto(nombre, categoria, precio , existencia);
    }
      return null;      
}
    //método actualizar un registro en la BD
 public int Actualizar (int id_producto, String nombre, String categoria, float precio,
         int existencia){
     
      String transaccion = "UPDATE Producto SET Nombre='"
              + nombre +"',Categoria ='"
              + categoria+"',Precio='"      
              + precio     +"',existencia ='"   
              + existencia +"'WHERE ID_Producto="
              + id_producto ;
        
  return new DataBase().Actualizar(transaccion);         
 }
  //metodo para selecionar todos los registros de la tabla 
public List obtenerDatos() {
    
     String transaccion = "SELECT * FROM producto";
     //llamar el metodo listar de BataDase.java
     List<Map> registros = new DataBase().Listar(transaccion);
     List<Producto> productos = new ArrayList(); //arreglo de autores 
     //ciclo que recorre cada registro y los agrega al arreglo de autores 
     for (Map registro : registros){
         Producto aut = new Producto ((int) registro.get("ID_Producto"),
                 (String) registro.get("Nombre"),
                 (String) registro.get("Categoria"),
                 (Float) registro.get("Precio"),
                 (int) registro.get("existencia"));
         productos.add(aut);  
     }
      return productos;//retorna todos los autores ubicados a la tabla de BD
     
       }
 //elimina un registro de la tabla en la BD
      public int Eliminar(int id){
       String producto ="DELETE FROM producto WHERE ID_Producto='"+ id + "'";
       return new DataBase().Actualizar(producto);
      }
      
       
}
    
    
    
    
     



 