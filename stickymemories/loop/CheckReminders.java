/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickymemories.loop;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.PriorityQueue;
import stickymemories.core.Controller;
import stickymemories.core.Note;
import stickymemories.core.order.ByCreationOrderAsc;

/**
 *
 * @author bernardovieira
 */
public class CheckReminders {
    
    private PriorityQueue<Note> noteByReminder;
    boolean notificationMode = false; //falso - passivo    true - ativo
    
    public CheckReminders(){
        //load first time!
        noteByReminder = new PriorityQueue<>(new ByCreationOrderAsc());
    }

    public PriorityQueue<Note> getNoteByReminder() {
        return noteByReminder;
    }
    
    public Note getLatestReminderNote(){
        return noteByReminder.peek();
    }
    
    public void updateComparator(){
        Note n = noteByReminder.poll();
        noteByReminder.add(n);
    }
    
    public boolean updateReminders() throws IOException, FileNotFoundException, ClassNotFoundException{
        List<Note> temp = Controller.loadData();
        if(temp == null){
            return false;
        }
        noteByReminder.clear();
        for (Note n : temp) {
            noteByReminder.add(n);
        }
        return true;
    }

    public void isPassive(boolean notificationMode) {
        this.notificationMode = notificationMode;
    }

    public boolean isNotificationMode() {
        return notificationMode;
    }
}
