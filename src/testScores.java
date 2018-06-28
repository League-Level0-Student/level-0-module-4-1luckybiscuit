import javax.swing.JOptionPane;

public class testScores {
	public static void main(String[] args) {
		String sco = JOptionPane.showInputDialog("Pssst...what did you get on the test?");
		double e = Double.parseDouble(sco);
		if(e>=50 && e<70) {
			JOptionPane.showMessageDialog(null, "Wow, " + e + "? You have a low IQ.");
		}else if(e>=70 && e<90) {
				JOptionPane.showMessageDialog(null, "Wow, " + e + "? You are a mediocre being.");
			
		}else if(e<50) {
			JOptionPane.showMessageDialog(null, "Wow, " + e + "? My brain will implode from your stupidity.");
		}else if(e>100) {
			JOptionPane.showMessageDialog(null, "Wow, " + e + "? You must have 1000 IQ.");
		}else {
				JOptionPane.showMessageDialog(null, "Wow, " + e + "? You are a respected member of society.");
		}
			
	}
}
