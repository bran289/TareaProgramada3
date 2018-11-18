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
public class Sponsor {
    
    private String code, name, website;
    private byte[] picture;
    
    public Sponsor(String code, String name,String website){
        this.code = code;
        this.name = name;
        this.website = website;
    }
    public String getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
    public String getWebsite(){
        return website;
    }
    public byte[] getPicture(){
        return picture;
    }
}
