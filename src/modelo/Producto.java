/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Producto {
    
    //Atributos BD 
    private int idVehiculo;
    private String placa;
    private String modelo;
    private String marca;
    private String color;
    private int anio;
    private int idCategoriaVehiculo;
    private int estado;
    
    
    //Constructor
    public Producto(){
        this.idVehiculo = 0;
        this.placa= "";
        this.modelo = "";
        this.marca = "";
        this.color="";
        this.anio = 0;
        this.idCategoriaVehiculo = 0;
        this.estado = 0;
        
    }
    //Constructor cargado
    public Producto(int idVehiculo, String placa, String modelo, String marca, String color, int anio, int idCategoriaVehiculo, int estado) {
        this.idVehiculo = idVehiculo;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.anio = anio;
        this.idCategoriaVehiculo = idCategoriaVehiculo;
        this.estado = estado;
    }
    
    
    //metodos Set and Get

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getIdCategoriaVehiculo() {
        return idCategoriaVehiculo;
    }

    public void setIdCategoriaVehiculo(int idCategoriaVehiculo) {
        this.idCategoriaVehiculo = idCategoriaVehiculo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
}
