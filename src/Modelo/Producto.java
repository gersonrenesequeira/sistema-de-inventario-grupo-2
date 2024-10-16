/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Gerson
 */
public class Producto {   //Nombre de la clase //Inicio
    String nombre;       //Nombre del producto tipo cadena
    String categoría;   //Nombre de categoria tipo cadena
    double precio;      //Nombre del producto tipo real
    int existencia;  

    public Producto() {
    }

    public Producto(String nombre, String categoría, double precio, int existencia) {
        this.nombre = nombre;
        this.categoría = categoría;
        this.precio = precio;
        this.existencia = existencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    
}

    
