import javax.swing.JOptionPane;

public class SecretPassword {
public static void main(String[] args) {
	String Password =  ("myboy201");
	String message1 = JOptionPane.showInputDialog("State your secret message.");
	String guess = JOptionPane.showInputDialog("What do you think the password is?");	
	if (guess.equals(Password)) {
	JOptionPane.showMessageDialog(null, message1);
	}
	
	else {
	JOptionPane.showMessageDialog(null, "INTRUDER!");
	}
	
}
}
