/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import DataBase.Category;
import DataBase.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Rolo
 */
public class Visualizacion {
    
    public ArrayList<String> Categoria() throws ClassNotFoundException, SQLException{
        ArrayList<String> listaCategorias = new ArrayList<>();
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query ="select * from Category";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            listaCategorias.add(0, (rs.getString("id")+" "+rs.getString("name")+" "+rs.getString("descriptionC")));
        }  
        return listaCategorias;
    }
    public ArrayList<String> Encargado() throws ClassNotFoundException, SQLException{
        ArrayList<String> listaEncargados = new ArrayList<>();
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query ="select Attendant.idCard,nameA,surname1,surname2,profession,email, telephone from Attendant join telAttendant on telAttendant.idCard = Attendant.idCard";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            listaEncargados.add(0, (rs.getString("idCard")+" "+rs.getString("nameA")+" "+rs.getString("surname1")+" "+rs.getString("surname2")+" "+rs.getString("profession")+" "+rs.getString("email")+" "+rs.getString("telephone")));
        }  
        return listaEncargados;
    }
    public ArrayList<String> Hackathon() throws ClassNotFoundException, SQLException{
        ArrayList<String> listaHackathons = new ArrayList<>();
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query ="select Hackathon.id,Hackathon.name as Hack,Organizer.nameO,Attendant.nameA,topic,"
                + "descriptionH,requirement.nameR,Category.name,startDate,finishDate,hours,Hackathon.website,"
                + "Hackathon.email,prize1,prize2,prize3,Sponsor.name as sponsor from Hackathon\n" +
                        "join AttendantHackathon on AttendantHackathon.idHackathon = Hackathon.id\n" +
                        "join requirement on requirement.idHackathon = Hackathon.id\n" +
                        "join Organizer on Organizer.code = Hackathon.codOrg\n" +
                        "join Attendant on Attendant.idCard = AttendantHackathon.attendantID\n" +
                        "join Category on Category.id = Hackathon.idCat\n" +
                        "join Sponsor on Sponsor.code = Hackathon.sponsorCode;";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            listaHackathons.add(0, (rs.getString("id")+" "+rs.getString("Hack")+" "+rs.getString("nameO")+" "+rs.getString("nameA")+" "+rs.getString("topic")+" "+rs.getString("descriptionH")+" "+rs.getString("nameR")+" "+rs.getString("name")+" "+rs.getString("startDate")+" "+rs.getString("finishDate")+" "+rs.getString("hours")+" "+rs.getString("website")+" "+rs.getString("email")+" "+rs.getString("prize1")+" "+rs.getString("prize2")+" "+rs.getString("prize3")+" "+rs.getString("sponsor")));
        }  
        return listaHackathons;
    }
    public ArrayList<String> HackathonID() throws ClassNotFoundException, SQLException{
        ArrayList<String> listaNoticias = new ArrayList<>();
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query ="select id from Hackathon;";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            listaNoticias.add(0, (rs.getString("id")));
        }  
        return listaNoticias;
    }
    public ArrayList<String> ListHackathones() throws ClassNotFoundException, SQLException{
        ArrayList<String> listaHackathonesTematica = new ArrayList<>();
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query ="select Hackathon.name as nombre, Count(idCat) as cantCat,\n" +
"count(Team.nameT) as cantEquipo, count(Edition.edition) as cantEdi,\n" +
"count(Hackathon.sponsorCode) as cantSpon\n" +
"from Hackathon\n" +
"join Team on Team.idHackathon = Hackathon.id\n" +
"join Edition on Edition.idHackathon = Hackathon.id\n" +
"group by Hackathon.topic, Hackathon.name";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            listaHackathonesTematica.add(0, (rs.getString("cantCat")));
            listaHackathonesTematica.add(0, (rs.getString("cantEquipo")));
            listaHackathonesTematica.add(0, (rs.getString("cantEdi")));
            listaHackathonesTematica.add(0, (rs.getString("cantSpon")));
            listaHackathonesTematica.add(0, (rs.getString("nombre")));
        }  
        return listaHackathonesTematica;
    }
    public ArrayList<String> cantidadTematica(String nombreHacka) throws ClassNotFoundException, SQLException{
        ArrayList<String> listaCantidad = new ArrayList<>();
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query ="SELECT count(topic) as cantidad\n" +
"FROM Hackathon \n" +
"WHERE topic='"+nombreHacka+"'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            listaCantidad.add(0, (rs.getString("cantidad")));
        }  
        return listaCantidad;
    }
    public ArrayList<String> OrganizerCode() throws ClassNotFoundException, SQLException{
        ArrayList<String> listaNoticias = new ArrayList<>();
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query ="select code from Organizer;";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            listaNoticias.add(0, (rs.getString("code")));
        }  
        return listaNoticias;
    }
    public ArrayList<String> AttendantID() throws ClassNotFoundException, SQLException{
        ArrayList<String> listaNoticias = new ArrayList<>();
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query ="select idCard from Attendant;";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            listaNoticias.add(0, (rs.getString("idCard")));
        }  
        return listaNoticias;
    }
    public ArrayList<String> ReporteGeneral(String topic) throws ClassNotFoundException, SQLException{
        ArrayList<String> listaNoticias = new ArrayList<>();
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query ="select CONCAT(Hackathon.name,count(Hackathon.id), count(News.id) \n" +
", count(Edition.edition),\n" +
"count(Team.nameT)) as resultado\n" +
"from Organizer\n" +
"join Hackathon on Hackathon.codOrg = Organizer.code\n" +
"join News on News.idHackathon = Hackathon.id\n" +
"join Edition on Edition.idHackathon = Hackathon.id\n" +
"join Team on Team.idHackathon = Hackathon.id\n" +
"where(Hackathon.topic='"+topic+"')\n" +
"group by nameO, Hackathon.topic, Hackathon.name";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            listaNoticias.add(0, (rs.getString("resultado")));
        }  
        return listaNoticias;
    }
        public ArrayList<String> ListadoxPeriodo(String fecha1, String fecha2) throws ClassNotFoundException, SQLException{
        ArrayList<String> listaNoticias = new ArrayList<>();
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query ="select Hackathon.name as nombre, Count(idCat) as cantCat,\n" +
"count(Team.nameT) as cantEquipo, count(Edition.edition) as cantEdi,\n" +
"count(Hackathon.sponsorCode) as cantSpon\n" +
"from Hackathon\n" +
"join Team on Team.idHackathon = Hackathon.id\n" +
"join Edition on Edition.idHackathon = Hackathon.id\n" +
"where(startDate between '"+fecha1+"' and '"+fecha2+"')\n" +
"group by Hackathon.topic, Hackathon.name";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            listaNoticias.add(0, (rs.getString("cantCat")));
            listaNoticias.add(0, (rs.getString("cantEquipo")));
            listaNoticias.add(0, (rs.getString("cantEdi")));
            listaNoticias.add(0, (rs.getString("cantSpon")));
            listaNoticias.add(0, (rs.getString("nombre")));
        }  
        return listaNoticias;
    }
    public ArrayList<String> CategoryID() throws ClassNotFoundException, SQLException{
        ArrayList<String> listaNoticias = new ArrayList<>();
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query ="select id from Category;";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            listaNoticias.add(0, (rs.getString("id")));
        }  
        return listaNoticias;
    }
    public ArrayList<String> SponsorCode() throws ClassNotFoundException, SQLException{
        ArrayList<String> listaNoticias = new ArrayList<>();
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query ="select code from Sponsor;";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            listaNoticias.add(0, (rs.getString("code")));
        }  
        return listaNoticias;
    }
    public ArrayList<String> Noticia() throws ClassNotFoundException, SQLException{
        ArrayList<String> listaNoticias = new ArrayList<>();
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query ="select News.id,title,header,textN,registerDate,author,Hackathon.name from News\n" +
                    "join Hackathon on Hackathon.id = News.idHackathon";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            listaNoticias.add(0, (rs.getString("id")+" "+rs.getString("title")+" "+rs.getString("header")+" "+rs.getString("textN")+" "+rs.getString("registerDate")+" "+rs.getString("author")+" "+rs.getString("name")));
        }  
        return listaNoticias;
    }
    public ArrayList<String> Organizador() throws ClassNotFoundException, SQLException{
        ArrayList<String> listaNoticias = new ArrayList<>();
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query ="select code, nameO,country, city, addressO, email, telOrganizer.telephone from Organizer\n" +
                    "join telOrganizer on telOrganizer.codeOrganizer = Organizer.code";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            listaNoticias.add(0, (rs.getString("code")+" "+rs.getString("nameO")+" "+rs.getString("country")+" "+rs.getString("city")+" "+rs.getString("addressO")+" "+rs.getString("email")+" "+rs.getString("telephone")));
        }  
        return listaNoticias;
    }
    public ArrayList<String> Patrocinador() throws ClassNotFoundException, SQLException{
        ArrayList<String> listaOrganizadores = new ArrayList<>();
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query ="select code, name, website from Sponsor";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            listaOrganizadores.add(0, (rs.getString("code")+" "+rs.getString("name")+" "+rs.getString("website")));
        }  
        return listaOrganizadores;
    }
        public ArrayList<String> Equipos() throws ClassNotFoundException, SQLException{
        ArrayList<String> listaEquipos = new ArrayList<>();
        Conexion conexion = new Conexion();
        Connection con = conexion.Conexion();
        String query ="select nameT,projectDescription,idHackathon from Team";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            listaEquipos.add(0, (rs.getString("nameT")+" "+rs.getString("projectDescription")+" "+rs.getString("idHackathon")));
        }  
        return listaEquipos;
    }
}
