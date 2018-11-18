/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import DataBase.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Rolo
 */
public class Eliminacion {
    
    public PreparedStatement Categoria(String id) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "delete Category where(id="+id+")";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
    public PreparedStatement Encargado(String id) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "delete Attendant where(idCard="+id+")";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
    public PreparedStatement Hackathon(String id) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "delete Hackathon where(id="+id+")";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
    public PreparedStatement Noticia(String id) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "delete News where(id="+id+")";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
    public PreparedStatement Organizador(String id) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "delete Organizer where(id="+id+")";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
    public PreparedStatement Patrocinador(String id) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "delete Sponsor where(id="+id+")";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
}
