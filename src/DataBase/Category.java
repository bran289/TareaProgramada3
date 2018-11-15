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
public class Category {
    
    private String id, name, description;
    private byte[] picture;
    
    public Category(String id, String name,String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }
    public String getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public byte[] getPicture(){
        return picture;
    }
}
