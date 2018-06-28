import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("What pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for(int i = 0;i<6;i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do with your pet?", "Act", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Walk", "Feed", "Destroy", "Groom", "Fetch" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task == 0) {
				
			}else if (task == 1) {
				
			}else if (task == 2) {
				
			}else if (task == 3) {
				
			}else if (task == 4) {
				
			}else {
				fetch(pet);
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void cuddle(String x) {
		happinessLevel = happinessLevel + 2;
		JOptionPane.showMessageDialog(null, "Your " + x + "now has a happiness level of" + happinessLevel + "!");
	}static void walk(String x) {
		happinessLevel = happinessLevel + 4;
		JOptionPane.showMessageDialog(null, "Your " + x + "now has a happiness level of" + happinessLevel + "!");
	}static void feed(String x) {
		happinessLevel = happinessLevel + 5;
		JOptionPane.showMessageDialog(null, "Your " + x + "now has a happiness level of" + happinessLevel + "!");
	}static void destroy(String x) {
		happinessLevel = 0;
		JOptionPane.showMessageDialog(null, "Congratulations! Your " + x + "is dead! It has a happiness level of" + happinessLevel + "!");
		System.exit(0);
	}static void groom(String x) {
		happinessLevel = happinessLevel + 3;
		JOptionPane.showMessageDialog(null, "Your " + x + "now has a happiness level of" + happinessLevel + "!");
	}static void fetch(String x) {
		happinessLevel = happinessLevel + 4;
		JOptionPane.showMessageDialog(null, "Your " + x + "now has a happiness level of" + happinessLevel + "!");
	}
	
}