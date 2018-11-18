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
public class Organizer {
    
    private String code, name, country, city, address, telephone, email;
    private byte[] picture;
    
    public Organizer(String code,String name,String country,String city,String address,String telephone,String email){
        this.code = code;
        this.name = name;
        this.country = country;
        this.city = city;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }
    public String getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
    public String getCountry(){
        return country;
    }
    public String getCity(){
        return city;
    }
    public String getAddress(){
        return address;
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
