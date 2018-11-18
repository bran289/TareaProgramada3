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
public class Attendant {
    
    private String id, name,surname1,surname2,profession, telephone,email;
    private byte[] picture;
    
    public Attendant(String id, String name,String surname1,String surname2,String profession,String telephone,String email){
        this.id = id;
        this.name = name;
        this.surname1 = surname1;
        this.surname2 = surname2;
        this.profession = profession;
        this.telephone = telephone;
        this.email = email;
    }
    public String getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSurname1(){
        return surname1;
    }
    public String getSurname2(){
        return surname2;
    }
    public String getProfession(){
        return profession;
    }
    public String getTelephone(){
        return telephone;
    }
    public String getEmail(){
        return email;
    }
    public byte[] getPicture(){
        return picture;
    }
}
