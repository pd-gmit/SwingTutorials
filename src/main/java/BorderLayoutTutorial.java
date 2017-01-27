import javax.swing.*;
import java.awt.*;

public class BorderLayoutTutorial {
	
	// Lets create the objects that we'll need 
	JFrame frame = new JFrame("BorderLayout demo");
	JButton btn1 = new JButton("NORTH");
	JButton btn2 = new JButton("SOUTH");
	JButton btn3 = new JButton("CENTER");
	JButton btn4 = new JButton("WEST");
	JButton btn5 = new JButton("EAST");
	
	//The main method creates a seperate thread to run an object/instance of the BorderLayoutTutorial class
	public static void main(String[] args) {
			
		//here we use the static method of the SwingUtilities class, invokeLater(), to 
		//create a "runnable environment" for the "runnable" BorderLayout object. Once that environment is in place
		//we then create an anonymous BorderLayoutTutorial object!
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				//we create an (anonymous) instance/object of the BorderLayoutTutorial
				//which will then be run immediately by the thread
				new BorderLayoutTutorial();
			}
		});
	}
	
	//This is the constructor for our BorderLayoutTutorial.
	public BorderLayoutTutorial() {
		frame.setLayout(new BorderLayout());   //Tell the frame to use Border layout
		frame.add(btn1, BorderLayout.NORTH);
		frame.add(btn2, BorderLayout.SOUTH);
		frame.add(btn3, BorderLayout.CENTER);
		frame.add(btn4, BorderLayout.WEST);
		frame.add(btn5, BorderLayout.EAST);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();   //make it all nice and neat!
		frame.setVisible(true); //last thing we do is show the GUI (we're spared watching components appearing!)
	}
}
