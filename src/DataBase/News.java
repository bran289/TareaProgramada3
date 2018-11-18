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
public class News {
    
    private String id, title, header, text, date, author, hackathon;
    private byte[] picture;
    
    public News(String id,String title,String header,String text,String date,String author,String hackathon){
        this.id = id;
        this.title = title;
        this.header = header;
        this.text = text;
        this.date = date;
        this.author = author;
        this.hackathon = hackathon;
    }
    public String getID(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getHeader(){
        return header;
    }
    public String getText(){
        return text;
    }
    public String getDate(){
        return date;
    }
    public String getAuthor(){
        return author;
    }public String getHackathon(){
        return hackathon;
    }
    public byte[] getPicture(){
        return picture;
    }
    
}
