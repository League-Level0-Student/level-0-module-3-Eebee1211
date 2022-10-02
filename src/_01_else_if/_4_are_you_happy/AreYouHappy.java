package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String happy = JOptionPane.showInputDialog("Are you happy?"); 
        if(happy.equalsIgnoreCase("Yes")) {
        	JOptionPane.showMessageDialog(null,"Well I guess thats good.");
        	
        }
        else if(happy.equalsIgnoreCase("No")) {
        	String not = JOptionPane.showInputDialog("Do you want to be happy?"); 
        
		if(not.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null,"Then do something about it!"); 
			
		}
		else if(not.equalsIgnoreCase("No")) {
			JOptionPane.showMessageDialog(null, "Why though?");
		}
        }
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
