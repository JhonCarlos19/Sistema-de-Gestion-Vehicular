/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import conexion.Conexion;
import java.sql.Connection;
import modelo.Categoria;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;


public class Ctrl_Categoria {

    
 /**
 * ******************************************************
 * metodo para guardar una nueva categoria
 * *******************************************************
 */
    public boolean guardar(Categoria objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO tb_categoria_vehiculo VALUES(?, ?, ?)");
            consulta.setInt(1, 0); // id auto_increment
            consulta.setString(2, objeto.getDescripcion());
            consulta.setInt(3, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al guardar la categoría: " + e);
        }

        return respuesta;
    }

    /**
     * **********************************************************
     * metodo para consultar si la categoria registrada ya existe
     * **********************************************************
     */

    public boolean existeCategoria(String categoria) {
        boolean respuesta = false;

        String sql = "select descripcion tb_categoria_vehiculo = '" + categoria + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al guardar la categoría: " + e);
        }

        return respuesta;
    }

    /**
     * **********************************************************
     * metodo para actualizar el registro
     * **********************************************************
     */
    public boolean actualizar(Categoria objeto, int idCategoriaVehiculo) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("update tb_categoria_vehiculo set descripcion =? where idCategoriaVehiculo='" + idCategoriaVehiculo + "'");
            consulta.setString(1, objeto.getDescripcion()); // id auto_increment

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al actualizar la categoría: " + e);
        }

        return respuesta;
    }
    
    /**
     * **********************************************************
     * metodo para eliminar el registro
     * **********************************************************
     */
    
    public boolean eliminar(int idCategoriaVehiculo) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement(""
                    + "delete from tb_categoria_vehiculo where idCategoriaVehiculo='" + idCategoriaVehiculo + "'");
            consulta.executeUpdate(); // id auto_increment
            

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al eliminar la categoría: " + e);
        }

        return respuesta;
        
    }
}