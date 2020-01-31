/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playgroundmanager;

import java.util.Date;

/**
 *
 * @author raimo
 */
public class history {
    private int kidID=0;
    private Date timeOfStart;
    private Date timeOfEnd;

    public int getKidID() {
        return kidID;
    }

    public void setKidID(int kidID) {
        this.kidID = kidID;
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

    public history(int kidId, Date timeOfStart) {
        this.kidID = kidId;
        this.timeOfStart = timeOfStart;
        this.timeOfEnd=null;
    }
    
    
}
