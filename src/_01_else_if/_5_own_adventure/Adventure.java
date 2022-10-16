package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Adventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   JOptionPane.showMessageDialog(null, "There was once a kid named William.");
     String special = JOptionPane.showInputDialog("Is William special or is he normal?");
     if(special.equalsIgnoreCase("Normal")) {
    	 JOptionPane.showMessageDialog(null, "He lived a normal life because he is normal. THE END.");
    	 JOptionPane.showMessageDialog(null,  "You may be asking why is the story so short? Well its your fault by saying that I am normal and not special. YOUR FAULT. Blame yourself!!!");
     }
        if(special.equalsIgnoreCase("Special")) {
        	JOptionPane.showMessageDialog(null, "Of course he is special. Why wouldn't he. Who would choose that I am not special? If you already did this and you answered the other one... SHAME ON YOU");
        String why = JOptionPane.showInputDialog("He is really good with math. But some could say that he isn't. Is it because he knows math that is above grade level but not so much at grade level or because he says that he is good at math but he never proved it? Answer with prove or level for your choice."); 
         if(why.equalsIgnoreCase("prove")) {
        	 JOptionPane.showMessageDialog(null,  "HOW DARE YOU THINK I AM A FRAUD. SHAME ON YOU, SHAME ON YOU! (I am not a fraud thank you very much)");
         }
        if(why.equalsIgnoreCase("level")) {
        	JOptionPane.showMessageDialog(null, "William is better with math that is higher level than what he is doing at school. Probably is because he is not good with modeling or that kind of annoying stuff that takes a million years to complete");
        	String grades = JOptionPane.showInputDialog("But does William have good grades?");
        			if(grades.equalsIgnoreCase("Yes")) {
        				JOptionPane.showMessageDialog(null,"William has very good grades and does his best in school.");
        				String success = JOptionPane.showInputDialog("Is William successful in life after school?");
        				if(success.equalsIgnoreCase("Yes")) {
        					JOptionPane.showMessageDialog(null, "Since William is so smart, he gets into a good college and is extremely rich. (Has not happend yet but hopefully will)");
        				}
        if(success.equalsIgnoreCase("No")) {
        	JOptionPane.showMessageDialog( null, " No, not possible. How could you think that I, William won't be successful? YOU MUST BE LYING!");
        }
        			
        			
        			
        			
        			
        			
        			}
        if(grades.equalsIgnoreCase("NO")) {
        	JOptionPane.showMessageDialog(null,"I can't believe you... you think i have bad grades... WELL YOU'RE WRONG! ");
        }
        			
        			
        			
        }
        
        
        }
        
        
        
        
        
     
		
	    
		
		
		
		
		
		
		
	}

}
