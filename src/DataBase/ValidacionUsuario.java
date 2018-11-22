/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Rolo
 */
public class ValidacionUsuario {
    
    public String validarAdmin(String nombre,String contrasena){
        String resultado = "";
        try{
            Conexion conexion = new Conexion();
            Connection con = conexion.Conexion();
            String query="select [user] from login where ([user]='"+nombre+"' and "
                            + "rol='Administrator' and [password]='"+contrasena+"')";
            try{
                PreparedStatement ps = con.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    resultado = rs.getString("user");
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return resultado;
    }
    
    public String validarOrgan(String nombre,String contrasena){
        String resultado = "";
        try{
            Conexion conexion = new Conexion();
            Connection con = conexion.Conexion();
            String query="select [user] from login where ([user]='"+nombre+"' and "
                        + "rol='Organizer' and [password]='"+contrasena+"')";
            try{
                PreparedStatement ps = con.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    resultado = rs.getString("user");
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return resultado;
    }
}
