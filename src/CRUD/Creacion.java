/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import DataBase.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

/**
 *
 * @author Rolo
 */
public class Creacion {
        
    public PreparedStatement Categoria(String id, String name, String description, byte[] picture) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "insert into Category(id, name, descriptionC, picture) values('"+id+"','"+name+"','"+description+"','"+picture+"')";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
    public PreparedStatement Encargado(String id, String name,String surname1,String surname2,String profession, String email, byte[] picture) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "insert into Attendant(idCard, nameA, surname1, surname2,profession,email,picture) values('"+id+"','"+name+"','"+surname1+"','"+surname2+"','"+profession+"','"+email+"','"+picture+"')";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
    public PreparedStatement EncargadoTel(String id, String telephone) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "insert into telAttendant values('"+id+"','"+telephone+"')";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
    public PreparedStatement Hackathon(String id, String name,String Organizer,String Topic,
            String description,String category,String hours,String start,String finish,
            String website,String email,String first, String second, String third, String sponsor,
            byte[] poster, byte[] logo) throws ClassNotFoundException, SQLException{
        
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "insert into Hackathon(id, name, codOrg, topic, descriptionH,"
                + "idCat,hours,startDate,finishDate,website,email,prize1,prize2,prize3,sponsorCode,poster,logo)"
                + "values('"+id+"','"+name+"','"+Organizer+"','"+Topic+"','"+description+"','"+category+"','"+hours+"','"+start+"','"+finish+"','"+
                website+"','"+email+"','"+first+"','"+second+"','"+third+"','"+sponsor+"','"+poster+"','"+logo+"',)";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
        
    }
    public PreparedStatement HackathonEncargado(String id, String attendantid) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "insert into AttendantHackathon values('"+id+"','"+attendantid+"')";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
    public PreparedStatement HackathonPatrocinador(String id, String codeSponsor) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "insert into SponsorHackathon values('"+id+"','"+codeSponsor+"')";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
    public PreparedStatement Requisito(String id, String nameR) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "insert into requirement values('"+id+"','"+nameR+"')";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
    public PreparedStatement Inscripcion(String name, String description, String hackathon, byte[] image) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "insert into Team values('"+name+"','"+description+"','"+image+"','"+hackathon+")";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
    public PreparedStatement Noticia(String id, String title, String header,String textN, byte[] picture,String registerDate,String author,String idHackathon) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "insert into News values('"+id+"','"+title+"','"+header+"','"+textN+"','"+picture+"','"+registerDate+"','"+author+"','"+idHackathon+")";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
    public PreparedStatement Organizador(String code, String nameO, String country,String city,String addressO,String email,byte[] picture) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "insert into Organizer values('"+code+"','"+nameO+"','"+country+"','"+city+"','"+addressO+"','"+email+"','"+picture+"')";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
    public PreparedStatement telOrganizador(String id, String telephone) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "insert into telOrganizer values('"+id+"','"+telephone+"')";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
    public PreparedStatement Patrocinador(String code, String name, String website, byte[] logo) throws ClassNotFoundException, SQLException{
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query = "insert into Sponsor values('"+code+"','"+name+"','"+website+"','"+logo+"')";
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        return pst;
    }
    
}
