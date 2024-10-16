/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Ventas {
    String NombreV;
    double PrecioV;
    int CantidadV;
    int Sobrante;
    String FechaV;

    public Ventas(String NombreV, double PrecioV, int CantidadV, int Sobrante, String FechaV) {
        this.NombreV = NombreV;
        this.PrecioV = PrecioV;
        this.CantidadV = CantidadV;
        this.Sobrante = Sobrante;
        this.FechaV = FechaV;
    }

    public String getNombreV() {
        return NombreV;
    }

    public void setNombreV(String NombreV) {
        this.NombreV = NombreV;
    }

    public double getPrecioV() {
        return PrecioV;
    }

    public void setPrecioV(double PrecioV) {
        this.PrecioV = PrecioV;
    }

    public int getCantidadV() {
        return CantidadV;
    }

    public void setCantidadV(int CantidadV) {
        this.CantidadV = CantidadV;
    }

    public int getSobrante() {
        return Sobrante;
    }

    public void setSobrante(int Sobrante) {
        this.Sobrante = Sobrante;
    }

    public String getFechaV() {
        return FechaV;
    }

    public void setFechaV(String FechaV) {
        this.FechaV = FechaV;
    }
    
}