/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Categoria {
    private int intCategoriaVehiculo;
    private String descripcion;
    private int estado;
    
    public Categoria(){
        this.intCategoriaVehiculo = 0;
        this.descripcion = "";
        this.estado= 0;
             
    }
    
    public Categoria (int idCategoriaVehiculo, String descripcion, int estado){
        this.intCategoriaVehiculo  = idCategoriaVehiculo;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getIntCategoria() {
        return intCategoriaVehiculo;
    }

    public void setIntCategoria(int intCategoriaVehiculo) {
        this.intCategoriaVehiculo = intCategoriaVehiculo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
}
