/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playgroundmanager;

import java.awt.Component;
import static java.lang.Math.round;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author raimo
 */
public class PlayGraundManager {
    private ArrayList<kid> Kids = new ArrayList<kid>();
    private ArrayList<playSite> PlaySites = new ArrayList<>();
    private static final String CurateInformation="Made by R.Š.";
    Component frame=null;
    public ArrayList<kid> getKids() {
        return Kids;
    }

    public void setKids(ArrayList<kid> Kids) {
        this.Kids = Kids;
    }

    public ArrayList<playSite> getPlaySites() {
        return PlaySites;
    }

    public void setPlaySites(ArrayList<playSite> PlaySites) {
        this.PlaySites = PlaySites;
    }

    public void addKid(kid kid){
       this.Kids.add(kid);
    }
    
    public void addPlaySite(playSite playSite){
       this.PlaySites.add(playSite);
    }
    
    public ArrayList<kid> getKidsByName(String name) {
        ArrayList<kid> kids = new ArrayList<>();
        for(int i=0; i<this.Kids.size(); i++)
            if(this.Kids.get(i).getName().equals(name))
                kids.add(this.Kids.get(i));
        
        return kids;
    }
    
    public ArrayList<kid> getKidsByAge(int age) {
        ArrayList<kid> kids = new ArrayList<>();
        for(int i=0; i<this.Kids.size(); i++)
            if(this.Kids.get(i).getAge()==age)
                kids.add(this.Kids.get(i));
        
        return kids;
    }
    
    public ArrayList<kid> getKidsByTicket(int Ticket) {
        ArrayList<kid> kids = new ArrayList<>();
        for(int i=0; i<this.Kids.size(); i++)
            if(this.Kids.get(i).getNumOfTicket()==Ticket)
                kids.add(this.Kids.get(i));
        
        return kids;
    }
    
    public ArrayList<kid> getKidsByNameAndAge(String name, int age) {
        ArrayList<kid> kids = new ArrayList<>();
        for(int i=0; i<this.Kids.size(); i++)
            if(this.Kids.get(i).getName().equals(name) && this.Kids.get(i).getAge()==age)
                kids.add(this.Kids.get(i));
        
        return kids;
    }
    
    public ArrayList<kid> getKidsByNameAndTicket(String name, int Ticket) {
        ArrayList<kid> kids = new ArrayList<>();
        for(int i=0; i<this.Kids.size(); i++)
            if(this.Kids.get(i).getName().equals(name) && this.Kids.get(i).getNumOfTicket()==Ticket)
                kids.add(this.Kids.get(i));
        
        return kids;
    }
    
    public ArrayList<kid> getKidsByAgeAndTicket(int age, int Ticket) {
        ArrayList<kid> kids = new ArrayList<>();
        for(int i=0; i<this.Kids.size(); i++)
            if(this.Kids.get(i).getAge()==age && this.Kids.get(i).getNumOfTicket()==Ticket)
                kids.add(this.Kids.get(i));
        
        return kids;
    }
    
    public ArrayList<kid> getKids(int Ticket, String Name, int age) {
        ArrayList<kid> kids = new ArrayList<>();
        for(int i=0; i<this.Kids.size(); i++)
            if(this.Kids.get(i).getAge()==age && this.Kids.get(i).getNumOfTicket()==Ticket && this.Kids.get(i).getName().equals(Name))
                kids.add(this.Kids.get(i));
        
        return kids;
    }
    
    public ArrayList<kid> getKids(int Ticket, String Name, int age, boolean vip) {
        ArrayList<kid> kids = new ArrayList<>();
        for(int i=0; i<this.Kids.size(); i++)
            if(this.Kids.get(i).getAge()==age && this.Kids.get(i).getNumOfTicket()==Ticket && this.Kids.get(i).getName().equals(Name) && this.Kids.get(i).OrVip()==vip)
                kids.add(this.Kids.get(i));
        
        return kids;
    }
    
    public ArrayList<kid> getKidsByVIP(boolean vip) {
        ArrayList<kid> kids = new ArrayList<>();
        for(int i=0; i<this.Kids.size(); i++)
            if(this.Kids.get(i).OrVip()==vip)
                kids.add(this.Kids.get(i));
        
        return kids;
    }
    
    public ArrayList<kid> getKidsByNameAndVIP(String name, boolean vip) {
        ArrayList<kid> kids = new ArrayList<>();
        for(int i=0; i<this.Kids.size(); i++)
            if(this.Kids.get(i).getName().equals(name) && this.Kids.get(i).OrVip()==vip)
                kids.add(this.Kids.get(i));
        
        return kids;
    }
    
    public ArrayList<kid> getKidsByAgeAndVIP(int age, boolean vip) {
        ArrayList<kid> kids = new ArrayList<>();
        for(int i=0; i<this.Kids.size(); i++)
            if(this.Kids.get(i).getAge()==age && this.Kids.get(i).OrVip()==vip)
                kids.add(this.Kids.get(i));
        
        return kids;
    }
    
    public ArrayList<kid> getKidsByTicketAndVIP(int Ticket, boolean vip) {
        ArrayList<kid> kids = new ArrayList<>();
        for(int i=0; i<this.Kids.size(); i++)
            if(this.Kids.get(i).getNumOfTicket()==Ticket && this.Kids.get(i).OrVip()==vip)
                kids.add(this.Kids.get(i));
        
        return kids;
    }
    
    public ArrayList<kid> getKidsByNameAndAgeAndVIP(String name, int age, boolean vip) {
        ArrayList<kid> kids = new ArrayList<>();
        for(int i=0; i<this.Kids.size(); i++)
            if(this.Kids.get(i).getName().equals(name) && this.Kids.get(i).getAge()==age && this.Kids.get(i).OrVip()==vip)
                kids.add(this.Kids.get(i));
        
        return kids;
    }
    
    public ArrayList<kid> getKidsByNameAndTicketAndVIP(String name, int Ticket, boolean vip) {
        ArrayList<kid> kids = new ArrayList<>();
        for(int i=0; i<this.Kids.size(); i++)
            if(this.Kids.get(i).getName().equals(name) && this.Kids.get(i).getNumOfTicket()==Ticket && this.Kids.get(i).OrVip()==vip)
                kids.add(this.Kids.get(i));
        
        return kids;
    }
    
    public ArrayList<kid> getKidsByAgeAndTicketAndVIP(int age, int Ticket, boolean vip) {
        ArrayList<kid> kids = new ArrayList<>();
        for(int i=0; i<this.Kids.size(); i++)
            if(this.Kids.get(i).getAge()==age && this.Kids.get(i).getNumOfTicket()==Ticket && this.Kids.get(i).OrVip()==vip)
                kids.add(this.Kids.get(i));
        
        return kids;
    }
    
    public kid getKid(kid kid) {
        for(int i=0; i<this.Kids.size(); i++)
            if(this.Kids.get(i)==kid)
                return this.Kids.get(i);
        
        return null;
    }
   
    public kid getKidByID(int kidID) {
        return this.Kids.get(kidID);
    }
    
     public ArrayList<playSite> getPlaySitesByName(String name) {
        ArrayList<playSite> playSite = new ArrayList<>();
        for(int i=0; i<this.PlaySites.size(); i++)
            if(this.PlaySites.get(i).getName().equals(name))
                playSite.add(this.PlaySites.get(i));
        
        return playSite;
     }
     
    public ArrayList<playSite> getPlaySitesByDefaultPlace(int DefaultPlace) {
        ArrayList<playSite> playSite = new ArrayList<>();
        for(int i=0; i<this.PlaySites.size(); i++)
            if(this.PlaySites.get(i).getDefaultPlace()==DefaultPlace)
                playSite.add(this.PlaySites.get(i));
        
        return playSite;
     }
    
    public ArrayList<playSite> getPlaySitesByHowManyKidsCanPlay(int HowManyKidsCanPlay) {
        ArrayList<playSite> playSite = new ArrayList<>();
        for(int i=0; i<this.PlaySites.size(); i++)
            if(this.PlaySites.get(i).getHowManyKidsCanPlay()==HowManyKidsCanPlay)
                playSite.add(this.PlaySites.get(i));
        
        return playSite;
     }
    
    public ArrayList<playSite> getPlaySitesByKidID(int KidID) {
        ArrayList<playSite> playSite = new ArrayList<>();
        for(int i=0; i<this.PlaySites.size(); i++)
            if(this.PlaySites.get(i).chOrIsKidID(KidID))
                playSite.add(this.PlaySites.get(i));
        
        return playSite;
     }
    
    public ArrayList<playSite> getPlaySitesByTimeOfStart(Date timeOfStart) {
        ArrayList<playSite> playSite = new ArrayList<>();
        for(int i=0; i<this.PlaySites.size(); i++)
            if(this.PlaySites.get(i).getTimeOfStart().equals(timeOfStart))
                playSite.add(this.PlaySites.get(i));
        
        return playSite;
     }
    
     public ArrayList<playSite> getPlaySitesByTimeOfEnd(Date TimeOfEnd) {
        ArrayList<playSite> playSite = new ArrayList<>();
        for(int i=0; i<this.PlaySites.size(); i++)
            if(this.PlaySites.get(i).getTimeOfEnd().equals(TimeOfEnd))
                playSite.add(this.PlaySites.get(i));
        
        return playSite;
     }
     
     public playSite getPlaySite(playSite playSite) {
       for(int i=0; i<this.PlaySites.size(); i++)
            if(this.PlaySites.get(i)==playSite)
                return this.PlaySites.get(i);
        
        return null;
    }
    
    public int getKidID(kid kid){
       for(int i=0; i<this.Kids.size(); i++)
            if(this.Kids.get(i)==kid)
                return i;
       
       return -1;
    }
     
    public int getPlaySiteID(playSite playSite){
        for(int i=0; i<this.PlaySites.size(); i++)
            if(this.PlaySites.get(i)==playSite)
                return i;
       
       return -1;
    }
    
    public boolean chOrKidHadQueue(int KidId) {
       for(int i=0; i<this.PlaySites.size(); i++)
            if(this.PlaySites.get(i).chOrIsInLine(KidId))
            return true;
      return false;
    }
    
    public List<Integer> getQueueBySiteID(int SiteID) {
       return this.PlaySites.get(SiteID).getQueue();
    }
    
    public boolean chOrKidHadTicket(int id){
        if(this.Kids.get(id).getNumOfTicket()<1)
        return false;
        
        return true;
    }
    
     public boolean chOrPlaySiteHadPlace(int id){
        if(this.PlaySites.get(id).getHowManyKidsCanPlay()>0)
        return true;
        return false;
    }
    
     public boolean chOrKidNotPlayKnow(int KidID){
         for(int i=0; i<this.PlaySites.size(); i++)
            if(this.PlaySites.get(i).chOrIsKidID(KidID))
            return true;
         
         return false;
     }
     
     public int hadKidPlayGameID(int KidID){
         for(int i=0; i<this.PlaySites.size(); i++)
            if(this.PlaySites.get(i).chOrIsKidID(KidID))
            return i;
         
         return -1;
     }
     
    public void sendKindToPlay(int kidID, int playSiteID){
              this.sendKindToPlay(this.getKidByID(kidID), this.PlaySites.get(playSiteID));
    }
     
    public void sendKindToPlay(kid kid, playSite playSite){
        int numOfKid=getKidID(kid);
        int numOfPlaySite=getPlaySiteID(playSite);
        
        if(numOfKid==-1){
            JOptionPane.showMessageDialog(frame,  "no is such child in list!!", CurateInformation, JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(numOfPlaySite==-1){
            JOptionPane.showMessageDialog(frame,  "no is such play site in list!!!", CurateInformation, JOptionPane.ERROR_MESSAGE);
            return;
            
        }
        
        if(!chOrKidHadTicket(numOfKid)){
            JOptionPane.showMessageDialog(frame,  "the child has no more tickets!!!", CurateInformation, JOptionPane.ERROR_MESSAGE);
           return;
        }
        
        if(this.chOrKidHadQueue(numOfKid)){
            JOptionPane.showMessageDialog(frame,  "child is already stand in line", CurateInformation, JOptionPane.ERROR_MESSAGE);
          return;
         }
        
        if(!this.PlaySites.get(numOfPlaySite).chTime()){ 
         JOptionPane.showMessageDialog(frame,  "sorry, but now not working play site", CurateInformation, JOptionPane.ERROR_MESSAGE);
         this.PlaySites.get(numOfPlaySite).removeAllQueue();
         return;
        }
        
        if(!chOrPlaySiteHadPlace(numOfPlaySite)){
          JOptionPane.showMessageDialog(frame,  "the play site has no more place. Maybe you want add his kid to queue? Y/N", CurateInformation, JOptionPane.ERROR_MESSAGE);
          Scanner sc = new Scanner(System.in); 
          String str = sc.nextLine();
          if(str.equals("y") || str.equals("Y")){
              if(this.Kids.get(numOfKid).OrVip())
              this.addQueueVip(numOfPlaySite, numOfKid);
              else
              this.PlaySites.get(numOfPlaySite).addQueue(numOfKid);
          
          }
           return;
        }
        
        if(this.chOrKidNotPlayKnow(numOfKid)){
          JOptionPane.showMessageDialog(frame,  "sorry, but now kid play to "+this.PlaySites.get(this.hadKidPlayGameID(numOfKid)).getName(), CurateInformation, JOptionPane.ERROR_MESSAGE);
          return;
        }
        
        
        this.Kids.get(numOfKid).depriveTicket();
        this.PlaySites.get(numOfPlaySite).deprivePlace();
        this.PlaySites.get(numOfPlaySite).addKidID(numOfKid);
        
        
     }
    
    public void endPlayInSiteByID(int playSite){
         if(this.PlaySites.size()!=0)
       this.PlaySites.get(playSite).removeAllKids();
    }
    
    public void endPlayInSite(playSite playSite){
       this.endPlayInSiteByID(this.getPlaySiteID(playSite));
    }
    
    public void endPlayByID(int KidID){
       if( this.getPlaySitesByKidID(KidID).size()!=0)
       this.getPlaySitesByKidID(KidID).get(0).removeKid(KidID);
    }
    
    public void endPlayByID(kid kid){
        this.endPlayByID(this.getKidID(kid));
    }
    
     public double EmploymentOfPlaySiteByID(int PlaySiteID){
        double ter=Double.valueOf(this.getPlaySites().get(PlaySiteID).getKidsID().size());
        double ter1=Double.valueOf(this.PlaySites.get(PlaySiteID).getDefaultPlace());
        if(ter==0.0)
            return 0.0;
        return round((ter1*100.0)/ter);
         
     }
     
     public double EmploymentOfPlaySite(playSite PlaySite){
         return this.EmploymentOfPlaySiteByID(this.getPlaySiteID(PlaySite));
     }
     
     public void remuveQueueByKidID(int KidID){
           for(int i=0;i<this.PlaySites.size();i++){
             this.PlaySites.get(i).removeQueue(KidID);
           }     
     }
     
     public void remuveKidHistory(int KidID){
           for(int i=0;i<this.PlaySites.size();i++){
             this.PlaySites.get(i).remuveKidHistory(KidID);
           }
     
     }
     
     public void addQueueVip(int PlaySitesID, int KidID){
        List<Integer> queue = this.PlaySites.get(PlaySitesID).getQueue();
        boolean vip=false;
        int numVip=0;
        for(int i=0; i<queue.size(); i++){
           if(this.Kids.get(queue.get(i)).OrVip()){
            vip=true;
            numVip=queue.get(i);
           }
        }
        
        if(vip){
            if(queue.size()>numVip+4)
                queue.add(numVip+4, KidID);
            else
                queue.add(KidID); 
        }
        else
            queue.add(KidID);
        
        this.PlaySites.get(PlaySitesID).setQueue(queue);
     }
     
     public void removeKidByID(int kidID){
         this.endPlayByID(kidID);
          this.remuveKidHistory(kidID);
          this.remuveQueueByKidID(kidID);
          this.Kids.remove(kidID);
     }
     
     public void removeKid(kid kid){
        this.removeKidByID(this.getKidID(kid));
     }
     
     public void removePlaySiteByID(int PlaySiteID){
         if(  this.PlaySites.size()!=1)
          this.PlaySites.remove(PlaySiteID);
     }
     
     public void removePlaySite(playSite PlaySite){
        this.removePlaySiteByID(this.getPlaySiteID(PlaySite));
     }
     
}
