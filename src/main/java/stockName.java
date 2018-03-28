

/**
 *
 * @author Hank
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.*;

//import stockTicker.display;

public class stockName extends JFrame{
    private JButton[] myButtons = new JButton[5];
    public stockName() {
    //Create a panel
    JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 2, 2));
    //JLabel label = new JLabel("This is a Array");
    //label.setFont(new Font("Serif", Font.PLAIN, 24));
    //add(label, BorderLayout.CENTER);
    String[] data = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6"};
    //p1.add(new JList(data));
    add(p1, BorderLayout.CENTER);
    
    
    //for (int i=0; i<data.length; i++){
        //myButtons[i].setSize(50, 50);
    	//p1.add(new JButton(""+data[i]));
    	
    	//}
    //}
    
    for (int i=0; i<data.length; i++){
    	JButton name = new JButton(""+data[i]);
    	p1.add(name);
    	
    	name.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				
				display.run();
			}
		});
    }
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Create a frame and set its properties
    	JFrame frame = new stockName();
    	frame.setTitle("BOX");
    	frame.setSize(300, 150);
    	frame.setLocationRelativeTo(null); // Center the frame
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
        // TODO code application logic here
    
    }
    
}
