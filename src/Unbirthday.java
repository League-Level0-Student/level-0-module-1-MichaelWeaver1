import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	
	String date = JOptionPane.showInputDialog("What is the month of then day of your birthday?. mm/dd");

	if (date.equalsIgnoreCase("09/05")) {
		JOptionPane.showMessageDialog(null, "Happy birthday!");
	}
	
	
	
	
	
	else {
		JOptionPane.showMessageDialog(null, "Happy unbirdthday.");
	}
	
}
}
