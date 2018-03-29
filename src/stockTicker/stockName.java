package softwareengineerclass;

/**
 *
 * @author Hank
 */

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class stockName extends JFrame{
    private String[] data = {"Item 1", "Item 2", "Item 3",
        "Item 4", "Item 5", "Item 6"};
    private int size = data.length;
    private JButton[] myButtons = new JButton[size];
    public stockName() {
    //Create a panel
        JPanel p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));

        add(p1, BorderLayout.CENTER);


        for (int i=0; i<size; i++)
        {
            myButtons[i] = new JButton(data[i]);
            //myButtons[i].setSize(50, 100);
            p1.add(myButtons[i]);
        }
        p1.setBackground(Color.BLACK);
    
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Create a frame and set its properties
    JFrame frame = new stockName();
    frame.setTitle("Favorite Stocks");
    frame.setSize(150, 200);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
        // TODO code application logic here
    }
    
}
