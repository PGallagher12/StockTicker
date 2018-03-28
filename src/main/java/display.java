
/* NAME: Spencer Russell
 * DATE: 3/22/17
 */

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
 
public class display extends JFrame {
    
    public display(){
        
    }
    public static void run() {
    display description = new display();
    description.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set up the content pane.
        addComponentsToPane(description.getContentPane());
        //Use the content pane's default BorderLayout. No need for
        //setLayout(new BorderLayout());
        //Display the window.
        description.pack();
        description.setVisible(true);
  }
     public static void main(String[] args) {
     display.run();
}
     public static void addComponentsToPane(Container pane) {
        boolean RIGHT_TO_LEFT = false;
        if (!(pane.getLayout() instanceof BorderLayout)) {
            pane.add(new JLabel("Container doesn't use BorderLayout!"));
            return;
        }
         
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(
                    java.awt.ComponentOrientation.RIGHT_TO_LEFT);
        }
         
        JLabel title = new JLabel("NAME DISPLAY");
        pane.add(title, BorderLayout.PAGE_START);
         
        //Make the center component big
        //location of graph.  import?
        JPanel stockGraph = new JPanel();
        stockGraph.setPreferredSize(new Dimension(400, 300));
        pane.add(stockGraph, BorderLayout.CENTER);
         
        //this should include stock information
        JPanel stockWritten = new JPanel();
        JLabel stockCode = new JLabel("Stock Code:" + "");
        stockWritten.add(stockCode, BorderLayout.PAGE_START);
        JLabel description = new JLabel("Description:");
        stockWritten.add(description, BorderLayout.CENTER);
        pane.add(stockWritten, BorderLayout.LINE_START);
         
        //Possible location to adjust graph view
        JPanel buttonPane = new JPanel();
        buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.LINE_AXIS));
        JButton button = new JButton("Day");
        buttonPane.add(button);
        button = new JButton("Week");
        buttonPane.add(button);
        button = new JButton("Month");
        buttonPane.add(button);
        button = new JButton("Add/Remove");
        buttonPane.add(button);

        pane.add(buttonPane, BorderLayout.PAGE_END);
        

    }
}
    
    

     




