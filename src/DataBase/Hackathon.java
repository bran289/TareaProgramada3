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
public class Hackathon {
    
    private String id, name, organizer, attendant, topic, description, requirement, category, hours, sDate, fDate, website,email,first,second,third,sponsor;
    private byte[] picture,logo;
    
    public Hackathon(String id, String name, String organizer, String attendant, String topic
            , String description, String requirement, String category, String hours, 
            String sDate, String fDate, String website,String email,String first,String second,String third,String sponsor){       
        this.id = id;this.name = name;this.organizer = organizer;this.attendant = attendant;this.topic = topic;
        this.description = description;this.requirement = requirement;this.category = category;this.hours = hours;
        this.sDate = sDate;this.fDate = fDate;this.website = website;this.email = email;this.first = first;
        this.second = second;this.third = third;this.sponsor = sponsor;}
    public String getID(){        return id;    }public String getName(){        return name;    }
    public String getOrganizer(){        return organizer;    }public String getAttendant(){        return attendant;    }
    public String getTopic(){        return topic;    }public String getDescription(){        return description;    }
    public String getRequirement(){        return requirement;    }public String getCategory(){        return category;    }
    public String getHours(){        return hours;    }public String getSDate(){        return sDate;    }
    public String getFDate(){        return fDate;    }public String getWebsite(){        return website;    }
    public String getEmail(){        return email;    }public String getFirst(){        return first;    }
    public String getSecond(){        return second;    }public String getThird(){        return third;    }
    public String getSponsor(){        return sponsor;    }
    
    public byte[] getPicture(){
        return picture;
    }
    public byte[] getPoster(){
        return logo;
    }
}
