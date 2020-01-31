/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playgroundmanager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author raimo
 */
public class playSite {
    private String Name;
    private int defaultPlace;
    private int howManyKidsCanPlay;
    private List<Integer> kidsID = new ArrayList<>();
    private List<Integer> queue = new ArrayList<>();
    private List<history> history = new ArrayList<>();
    private Date timeOfStart;
    private Date timeOfEnd;
    private int Visiter=0;
    
    public playSite(String Name, int Place,  Date timeOfStart, Date timeOfEnd) {
        if(Place<1){
          System.out.println("the number of seats shall not be less than 1");
          return;
        }
        if(!timeOfEnd.after(timeOfStart)){
            System.out.println("time of start canby after time of end");
            return;
        }
        this.Name = Name;
        this.defaultPlace = Place;
        this.howManyKidsCanPlay = Place;
        this.timeOfStart = timeOfStart;
        this.timeOfEnd = timeOfEnd;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getDefaultPlace() {
        return defaultPlace;
    }

    public void setDefaultPlace(int defaultPlace) {
        this.defaultPlace = defaultPlace;
    }

    public int getHowManyKidsCanPlay() {
        return howManyKidsCanPlay;
    }

    public void setHowManyKidsCanPlay(int howManyKidsCanPlay) {
        this.howManyKidsCanPlay = howManyKidsCanPlay;
    }

    public List<Integer> getKidsID() {
        return kidsID;
    }

    public void setKidsID(List<Integer> kindID) {
        this.kidsID = kindID;
    }

    public Date getTimeOfStart() {
        return timeOfStart;
    }

    public void setTimeOfStart(Date timeOfStart) {
        this.timeOfStart = timeOfStart;
    }

    public Date getTimeOfEnd() {
        return timeOfEnd;
    }

    public void setTimeOfEnd(Date timeOfEnd) {
        this.timeOfEnd = timeOfEnd;
    }
    
    public boolean chOrIsKidID(int KidID){
      return kidsID.contains(KidID);
    }
    
    public void addKidID(int KidID){
      this.kidsID.add(KidID);
      this.history.add(new history(KidID, new Date()));
    }
    
    public void deprivePlace(){
     this.howManyKidsCanPlay--;
     this.Visiter++;
    }
    
    public void deprivePlace(int i){
     this.howManyKidsCanPlay-=i;
    }
    
    public boolean chTime(){
       
        String time=new SimpleDateFormat("HH:mm:ss").format(new Date());
        Date date=new Date();
        try {
            date = new SimpleDateFormat("HH:mm:ss").parse(time);
        } catch (ParseException ex) {
            Logger.getLogger(playSite.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       if(date.after(this.timeOfStart) && date.before(this.timeOfEnd))
         return true;
     
       return false;
    }
    
    public void removeKid(int kidID){
        for(int i=0;i<this.kidsID.size();i++)
            if(this.kidsID.get(i)==kidID){
                this.kidsID.remove(i);
                this.howManyKidsCanPlay++;
                for(int i2=this.history.size();i2>=0;i2--)
                   if(this.history.get(i2).getKidID()==kidID){
                        this.history.get(i2).setTimeOfEnd(new Date());
                        return;
                   }
            }
    }
    
    public void removeAllKids(){
        this.kidsID.removeAll(kidsID);
        this.howManyKidsCanPlay=this.defaultPlace;
    }

    public List<Integer> getQueue() {
        return queue;
    }

    public void setQueue(List<Integer> queue) {
        this.queue = queue;
    }
    
    public void addQueue(int kidID) {
        this.queue.add(kidID);
    }
    
    public void addQueueVip(int kidID, int num) {
        this.queue.add(num, kidID);
    }
    
    public int getQueue(int kidID) {
        return this.queue.get(kidID);
    }
    
    public boolean chOrIsInLine(int kidID){
        return this.queue.contains(kidID);
    }
    
    public void removeQueue(int kidID){
        for(int i=0;i<this.queue.size();i++)
            if(this.queue.get(i)==kidID){
                this.queue.remove(i);
            }
    }
    
    public void removeAllQueue(){
        this.queue.removeAll(queue);
    }

    public int getVisiter() {
        return Visiter;
    }

    public List<history> getHistory() {
        return history;
    }

    public void setHistory(List<history> history) {
        this.history = history;
    }
    
    public void remuveKidHistory(int KidID){
        for(int i=0;i<this.history.size();i++)
            if(this.history.get(i).getKidID()==KidID){
                this.history.remove(i);
            }
    }
    
}
