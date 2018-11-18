/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

/**
 *
 * @author Rolo
 */
public class Team {
    
    private String name, description, hackathon;
    private byte[] picture;
    
    public Team(String name,String description, String hackathon){
        this.name = name;
        this.description = description;
        this.hackathon = hackathon;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public String getHackathon(){
        return hackathon;
    }
    public byte[] getPicture(){
        return picture;
    }
}
