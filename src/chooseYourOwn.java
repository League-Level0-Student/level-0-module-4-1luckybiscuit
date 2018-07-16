import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class chooseYourOwn {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "You are exploring the most treacherous depths of Middle Earth--Mordoor!\nNot Mordor, no--Mordoor, an evil dungeon full of infinity times ten more doors than you can think of!\nThe prize? The Mordoorknob, a mythical treasure said to be able to open any lock at any time.\nHow will you find it?");
		int fd = JOptionPane.showOptionDialog(null, "There are two doors in front of you, with curious writing on each. Which one to open?", "First Decision", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Apple", "Windows" }, null);
		if(fd == 0) {
			JOptionPane.showMessageDialog(null, "Opening the door, you are blinded by a flash of light!\nAn iMac on full brightness blinds you, causing you to stumble into a wall. You're a bit dizzy...");
			playMac("mac.mp3");
			JOptionPane.showMessageDialog(null, "You hear a Steve Jobs voice call out to you, \"Buy the newest version!\" as the iMac screen darkens and plays a sound.");
		}else {
			playWindows("windows.mp3");
			JOptionPane.showMessageDialog(null, "Opening the door, you find Bill Gates sitting in a pool of money.\nYou don't want to disturb him, but he notices you and tells you to listen to a sound clip.");
		}
		JOptionPane.showOptionDialog(null, "What do you hear?", "Second Decision", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Laurel", "Yanny" }, null);
			JOptionPane.showMessageDialog(null, "As a trapdoor springs open, you fall into a room of people who disagree with you. Uh oh!");
			int td = JOptionPane.showOptionDialog(null, "What do you do?", "Third Decision", 0, JOptionPane.INFORMATION_MESSAGE, null,
		new String[] { "Open the only door in the room--the one that says \"IQ Testing\"", "Switch opinions", "Test your karate skills"}, null);	
		if(td == 0) {
			int fd1 = JOptionPane.showOptionDialog(null, "What button do you press?", "Fourth Decision", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "IQ Amplifier", "Self-destruct", "Materialize \"Mordoorknob\""}, null);	
			if(fd1 == 0) {
				JOptionPane.showMessageDialog(null, "The door shuts, preventing you from leaving the room. There are two other buttons.\nLuckily, your IQ triples and you realize how to find the Mordoorknob!!");
				int ffd1 = JOptionPane.showOptionDialog(null, "Don't be stupid?", "Sixth Decision", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "Self-destruct", "Create \"Mordoorknob\""}, null);	
				if(ffd1 == 1) {
					JOptionPane.showMessageDialog(null, "As soon as you press it, the entire room explodes, taking Mordoor down with it.\nI thought you had 300 IQ! What were you thinking?");
				}else {
					JOptionPane.showMessageDialog(null, "The prized Mordoorknob materializes in front of you. At long last!\nWith 300 IQ and a Mordoorknob in your hand, who knows what you can do?");
				}
			}else if(fd1 == 1) {
				JOptionPane.showMessageDialog(null, "As soon as you press it, the entire room explodes, taking Mordoor down with it. So long!");
			}else {
				JOptionPane.showMessageDialog(null, "The prized Mordoorknob materializes in front of you. At long last! You begin journeying out of Mordoor.\n\n...That probably means there is more than one Mordoorknob. Who knows? You got what you wanted...");
			}
		}else if (td == 1) {
			JOptionPane.showMessageDialog(null, "The mob sees through your lies and starts beating you up. Now what?");
			int fd2 = JOptionPane.showOptionDialog(null, "Plan B?", "Fifth Decision", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Open the only door in the room--the one that says \"IQ Testing\"", "Test your karate skills"}, null);	
			if(fd2 == 0) {
				JOptionPane.showMessageDialog(null, "You find a curious machine in the center of the room. It's got three buttons on a panel.");
				int fd1 = JOptionPane.showOptionDialog(null, "What button do you press?", "Sixth Decision", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "IQ Amplifier", "Self-destruct", "Materialize \"Mordoorknob\""}, null);	
				if(fd1 == 0) {
					JOptionPane.showMessageDialog(null, "The door shuts, preventing you from leaving the room. There are two other buttons.\nLuckily, your IQ triples and you realize how to find the Mordoorknob!!");
					int ffd1 = JOptionPane.showOptionDialog(null, "Don't be stupid?", "Sixth Decision", 0, JOptionPane.INFORMATION_MESSAGE, null,
							new String[] { "Self-destruct", "Create \"Mordoorknob\""}, null);	
					if(ffd1 == 1) {
						JOptionPane.showMessageDialog(null, "As soon as you press it, the entire room explodes, taking Mordoor down with it.\nI thought you had 300 IQ! What were you thinking?");
					}else {
						JOptionPane.showMessageDialog(null, "The prized Mordoorknob materializes in front of you. At long last!\nWith 300 IQ and a Mordoorknob in your hand, who knows what you can do?");
					}}
			}else {
				JOptionPane.showOptionDialog(null, "What do you do?", "Fourth Decision", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "Flying Crane Kick", "Mantis Strike", "Samurai Suplex", "Falcon Punch"}, null);	
				JOptionPane.showMessageDialog(null, "You pull a muscle and keel over. You're finished!");
			}
		}else {
			JOptionPane.showOptionDialog(null, "What do you do?", "Fourth Decision", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Flying Crane Kick", "Mantis Strike", "Samurai Suplex", "Falcon Punch"}, null);	
			JOptionPane.showMessageDialog(null, "You pull a muscle and keel over. You're finished!");
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
