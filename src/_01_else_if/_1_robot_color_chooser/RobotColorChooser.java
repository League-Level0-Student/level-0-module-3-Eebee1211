
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		Robot rob = new Robot();
	     rob.penDown (); 
	     rob.setPenWidth(10);
		rob.setSpeed(1000);

	     String color = JOptionPane.showInputDialog("What color do you want the robot to draw with?");
	     if(color.equalsIgnoreCase("Red")) {
	    	 rob.setPenColor(255,0,0); 
	    
	     }
	     else if(color.equalsIgnoreCase("Orange")) {
	    	 rob.setPenColor(255,153,0); 
	    	
	  }
	     else if(color.equalsIgnoreCase("Yellow")) {
	    	 rob.setPenColor(255,255,0); 
	    	 
	     }

	     else if(color.equalsIgnoreCase("Green")) {
	    	 rob.setPenColor(0,255,0);
	     }
	     else if (color.equalsIgnoreCase("Blue")) {
	    	 rob.setPenColor(0,0,255); 
	    	 
	     }
	     else if(color.equalsIgnoreCase("Cyan")) {
	    	 rob.setPenColor(0,255,240 );
	     }
	     else if(color.equalsIgnoreCase("Purple")) {
	    	 rob.setPenColor(255,0,230); 
	     }
	     else if(color.equalsIgnoreCase("Black")) {
	    	 rob.setPenColor(0,0,0);
	     }
	     else {
	    	 JOptionPane.showMessageDialog(null,"We are out of " + color );
	     }
	     int count = 0;
	      while ( count < 4) {
	    	  rob.move(100);
	    	  rob.turn(90);
	    	  

	    	  count+=1;
	      } 
	     
	     
	     
	     



	}
}
