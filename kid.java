/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playgroundmanager;

/**
 *
 * @author raimo
 */
public class kid {
    private int NumOfTicket;
    private String Name;
    private int age;
    private boolean OrVip;
    
    public kid(int NumOfTicket, String Name, int age) {
        this.NumOfTicket = NumOfTicket;
        this.Name = Name;
        this.age = age;
        OrVip=false;
    }
    
    public kid(int NumOfTicket, String Name, int age, boolean vip) {
        this.NumOfTicket = NumOfTicket;
        this.Name = Name;
        this.age = age;
        OrVip=vip;
    }

    public int getNumOfTicket() {
        return NumOfTicket;
    }

    public void setNumOfTicket(int NumOfTicket) {
        this.NumOfTicket = NumOfTicket;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void depriveTicket(){
     this.NumOfTicket--;
    }
    
    public void depriveTicket(int i){
     this.NumOfTicket-=i;
    }

    public boolean OrVip() {
        return OrVip;
    }

    public void setOrVip(boolean OrVip) {
        this.OrVip = OrVip;
    }
    
    
}
