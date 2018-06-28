//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
        int e = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        int a = JOptionPane.showConfirmDialog(null, "Are we on vacation?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        System.out.println(e);
        if(e == 1) {
        		isWeekday = false;
        }else {
        		isWeekday = true;
        }
        if(a == 1) {
        		isVacation = false;
        }else {
        		isVacation = true;
        }
        /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
        if(isVacation == true||isWeekday == false) {
        		JOptionPane.showMessageDialog(null, "I'm goin' back to sleepp...");
        }else{
        		JOptionPane.showMessageDialog(null, "Wake up! We're going to miss the furry convention!");
        }
    }
}
