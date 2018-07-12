import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class chooseYourOwn {
	public static void main(String[] args) {
		int hp = 100;
		JOptionPane.showMessageDialog(null, "You are exploring the most treacherous depths of Middle Earth--Mordoor!\nNot Mordor, no--Mordoor, an evil dungeon full of infinity times ten more doors than you can think of!\nThe prize? The Mordoorknob, a mythical treasure said to be able to open any lock at any time.\nHow will you find it?");
		int fd = JOptionPane.showOptionDialog(null, "There are two doors in front of you, with curious writing on each. Which one to open?", "First Decision", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Apple", "Windows" }, null);
		if(fd == 0) {
			hp = hp - 30;
			JOptionPane.showMessageDialog(null, "Opening the door, you are blinded by a flash of light!\nAn iMac on full brightness blinds you, causing you to stumble into a wall.\n Your health drops to " + hp + ".");
			playMac("mac.mp3");
			JOptionPane.showMessageDialog(null, "You hear a Steve Jobs voice call out to you, \"Buy the newest version!\" as the iMac screen darkens and plays a sound.");
		}else {
			playWindows("windows.mp3");
			JOptionPane.showMessageDialog(null, "Opening the door, you find Bill Gates sitting in a pool of money.\nYou don't want to disturb him, but he notices you and tells you to listen to a sound clip.");
		}
		JOptionPane.showOptionDialog(null, "What do you hear?", "Second Decision", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Laurel", "Yanny" }, null);
		hp = hp - 20;
			JOptionPane.showMessageDialog(null, "As a trapdoor springs open, you fall into a room of people who disagree with you. Uh oh!.");
			int td = JOptionPane.showOptionDialog(null, "What do you do?", "Third Decision", 0, JOptionPane.INFORMATION_MESSAGE, null,
		new String[] { "Open the only door in the room--the one that says \"IQ Testing\"", "Pretend to agree", "Test your karate skills"}, null);	
		if(td == 0) {
			int fd1 = JOptionPane.showOptionDialog(null, "What do you do?", "Fourth Decision", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Open the only door in the room--the one that says \"IQ Testing\"", "Pretend to agree", "Test your karate skills"}, null);	
			if(fd1 == 0) {
				
			}
		}else if (td == 1) {
			hp = hp - 30;
			int fd2 = JOptionPane.showOptionDialog(null, "What do you do?", "Fourth Decision", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Open the only door in the room--the one that says \"IQ Testing\"", "Test your karate skills"}, null);	
			if(fd2 == 0) {
				
			}else {
				
			}
		}else {
			hp = hp - 50;
			int fd3 = JOptionPane.showOptionDialog(null, "What do you do?", "Fourth Decision", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Flying Crane Kick", "Mantis Strike", "Samurai Suplex", "Falcon Punch"}, null);	
			if(fd3 == 0) {
				
			}else if(fd3 == 1) {
			
			}else if (fd3 == 2) {
				
			}else {
				
			}
		}
	}
	public static void playWindows(String windows) {
		AudioClip audioClip = JApplet.newAudioClip(new chooseYourOwn().getClass().getResource(windows));
		audioClip.play();
	}
	public static void playMac(String mac) {
		AudioClip audioClip = JApplet.newAudioClip(new chooseYourOwn().getClass().getResource(mac));
		audioClip.play();
	}
}
