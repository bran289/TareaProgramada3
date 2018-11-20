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
public class Modificar {
    
    public PreparedStatement Categoria(String columna,String modificacion,String id) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "UPDATE Category SET "+columna+" = '"+modificacion+"' WHERE id = "+id+";";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
    public PreparedStatement CategoriaImagen(String columna,byte[] modificacion,String id) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "UPDATE Category SET "+columna+" = '"+modificacion+"' WHERE id = "+id+";";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
    public PreparedStatement Encargado(String columna,String modificacion,String id) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();         
        String query = "UPDATE Attendant SET "+columna+" = '"+modificacion+"' WHERE idCard = "+id+";";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
                
    }
    public PreparedStatement EncargadoTel(String columna,String modificacion,String id) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "UPDATE telAttendant SET "+columna+" = '"+modificacion+"' WHERE idCard = "+id+";";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
    public PreparedStatement EncargadoImagen(String columna,byte[] modificacion,String id) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "UPDATE Attendant SET "+columna+" = '"+modificacion+"' WHERE idCard = "+id+";";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
    public PreparedStatement Hackathon(String columna,String modificacion,String id) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "UPDATE Hackathon SET "+columna+" = '"+modificacion+"' WHERE id = "+id+";";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
    public PreparedStatement HackathonImagen(String columna,byte[] modificacion,String id) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "UPDATE Hackathon SET "+columna+" = '"+modificacion+"' WHERE id = "+id+";";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
    public PreparedStatement HackathonLogo(String columna,byte[] modificacion,String id) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "UPDATE Hackathon SET "+columna+" = '"+modificacion+"' WHERE id = "+id+";";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
    public PreparedStatement Noticia(String columna,String modificacion,String id) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "UPDATE News SET "+columna+" = '"+modificacion+"' WHERE id = "+id+";";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
    public PreparedStatement NoticiaImagen(String columna,byte[] modificacion,String id) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "UPDATE News SET "+columna+" = '"+modificacion+"' WHERE id = "+id+";";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
    public PreparedStatement Organizador(String columna,String modificacion,String id) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "UPDATE Organizer SET "+columna+" = '"+modificacion+"' WHERE code = "+id+";";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
    public PreparedStatement OrganizadorImagen(String columna,byte[] modificacion,String id) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "UPDATE Organizer SET "+columna+" = '"+modificacion+"' WHERE code = "+id+";";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
    public PreparedStatement Patrocinador(String columna,String modificacion,String id) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "UPDATE Sponsor SET "+columna+" = '"+modificacion+"' WHERE code = "+id+";";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
    public PreparedStatement SponsorImagen(String columna,byte[] modificacion,String id) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "UPDATE Sponsor SET "+columna+" = '"+modificacion+"' WHERE code = "+id+";";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
}
