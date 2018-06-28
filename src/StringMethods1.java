import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class StringMethods1 {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to whatever you want
		String oof = JOptionPane.showInputDialog("Gimme a word!");
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
		System.out.println("Third letter: " + oof.charAt(3));
		// 3. Print the length of your String to the console.
		//    HINT: .length
		System.out.println("Length: " + oof.length());

		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
		for(int len = 0;len < oof.length();len++) {
			System.out.println(oof.charAt(len));
		}
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		String finder = JOptionPane.showInputDialog("Gimme a letter in your word!");
		int find = finder.length();
		if(find> 1 || find == 0) {
			JOptionPane.showMessageDialog(null, "That's not one letter! Low IQer");
		}else {
			for(int l = 0; l< oof.length();l++) {
				if(oof.charAt(l) == finder.charAt(0)) {
					System.out.println("Looks like your character, " + finder + ", is character " + (l+1));
				}else {
					System.out.println("Nope");
				}
			}
		}
		
	}
}


