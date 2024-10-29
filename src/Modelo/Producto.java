/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Date;

/**
 *
 * @author Usuario
 */
public class Producto {

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getExistencia() {
        return existencia;
    }

    public void setExistencia(String existencia) {
        this.existencia = existencia;
    }
    
    private int id_producto; 
    private String nombre;
    private String categoria;
    private double precio;
    private String existencia;
    
    public Producto (int id_producto, String nombre, String categoria, double precio, String existencia) {
      
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.existencia = existencia;
    }
    public Producto (String nombre, String categoria, double precio, String existencia) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.existencia = existencia;
        
        
    }
    
             
         
       
}
