package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Adventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      JOptionPane.showMessageDialog(null, "  " );
      String coding = JOptionPane.showInputDialog("Is Jacob good at coding?"); 
      if(coding.equalsIgnoreCase("Yes")) {
    	  JOptionPane.showMessageDialog(null, "Jacob is really good at coding. He is so good that he makes millions every year from tournaments.");
          JOptionPane.showMessageDialog(null, "But he was not always that good at coding.");
          String where = JOptionPane.showInputDialog("Did Jacob take coding lessons at The League of Amazing Programmers?"); 
          if(where.equalsIgnoreCase("Yes")) {
        	  JOptionPane.showMessageDialog(null,"Since Jacob took lessons at The Leagure of Amazing Programmers, his coding skills skyrocketed.");
              JOptionPane.showMessageDialog(null, "Since Jacob is so rich, he becomes the owner of many businesses and becomes the richest person in the world because his bussinesses are very high-tech and very popular." );
          }
          else if(where.equalsIgnoreCase("No")) {
        	  JOptionPane.showMessageDialog(null,"Jacob was really good at figuring things by himself so learned how to code by watching videos. His parents knew that he did not need a teacher so they did not want to spend money paying for lessons at The League. After all, no point in paying people to teach somemone how to code when they can learn it themselves easily."); 
              JOptionPane.showMessageDialog(null, "Because Jacob is such a quick learner, he is successful in every aspect of life.");
          }
      
      
      
      
      
      }//Yes to "coding" ends here. Make another if statement.//
        if(coding.equalsIgnoreCase("No")) {
        	JOptionPane.showMessageDialog(null, "Jacob is not really good at coding. But it is not really his fault. He should have taken lessons at The League of Amazing Programmers");
        	JOptionPane.showMessageDialog(null, "Jacob lives an ordinary life because SOMEONE mhmm (the person who is controlling the story) has the WONDERFUL idea to make him not good at coding.");
        }
        
        
        
        
        
        
     
		
	    
		
		
		
		
		
		
		
	}

}
