package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		
		int score = 0; 
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer1 = JOptionPane.showInputDialog("Im tall when im young, and short when I'm old. What am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (answer1.equalsIgnoreCase("Candle")) {
score += 1;	
JOptionPane.showMessageDialog(null, "Correct!");
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "The correct answer was candle.");
	
	
}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
JOptionPane.showMessageDialog(null, "Your score is:" + score);		
	}
}

