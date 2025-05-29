/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Producto;

/**
 *
 * @author Usuario
 */
public class Ctrl_Producto {
    /**
 * ******************************************************
 * metodo para guardar un nuevo Vehiculo
 * *******************************************************
 */
    public boolean guardar(Producto objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO tb_vehiculo VALUES(?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0); // id auto_increment
            consulta.setString(2, objeto.getPlaca());
            consulta.setString(3, objeto.getModelo());
            consulta.setString(4, objeto.getMarca());
            consulta.setString(5, objeto.getColor());
            consulta.setInt(6, objeto.getAnio());
            consulta.setInt(7, objeto.getIdCategoriaVehiculo());
            consulta.setInt(8, objeto.getEstado());
            
            
            

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al guardar la categoría: " + e);
        }

        return respuesta;
    }

    /**
     * *****************************************************************
     * metodo para consultar si el vehiculo ya esta registrado en la BD
     * ****************************************************************
     */

    public boolean existeProducto(String producto) {
        boolean respuesta = false;

        String sql = "select placa tb_vehiculo where placa = '" + producto + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar el Vehiculo: " + e);
        }

        return respuesta;
    }

    
}
