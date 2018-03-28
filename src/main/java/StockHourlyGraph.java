
import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.patriques.output.timeseries.data.StockData;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zhang
 */
public class StockHourlyGraph extends JFrame {
  public StockHourlyGraph(List<StockData> Lday, String Sday) {
    setTitle("Stock Price and Volume in "+ Sday);
    add(new StockDailyPanel(Lday,Sday));
  }

  /** Main method */
  public static void run(List<StockData> Lday, String Sday) {
    StockHourlyGraph frame = new StockHourlyGraph(Lday,Sday);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 800);
    frame.setVisible(true);
  }
}

    class StockDailyPanel extends JPanel {
        List<StockData> Lday;
        String Sday;
    
    StockDailyPanel(List<StockData> Lday, String Sday) {
        super();
        
        this.Sday = Sday;
        this.Lday = Lday.stream().collect(Collectors.toList());
        
    }
    
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    

    int xWidth  = getWidth();        // Panel Width
    System.out.println("width is "+xWidth);
    int yHeight = getHeight();
    System.out.println("height is "+yHeight);
    int xBorder = xWidth/10;                // The gap to leave on each side
    int yBorder = yHeight/10;
    int xOrigin = xBorder;           // The origin is at (10, height- 40)
    int yOrigin = yHeight - 2* yBorder;
    int xAxisLength = xWidth-xBorder;
    int onePart = xAxisLength /13;
    int barWidth = 10;               // A bar will be 10 units wide
    int barSpace = 5;                // ... space between bars
    double coeff = 0.00001;
    
    
    
//xOrigin+xWidth-2*yBorder
    g.drawLine(xOrigin, yOrigin, xAxisLength, yOrigin);   // Draw X-axis
    g.drawLine(xOrigin, yOrigin, xOrigin, yBorder);
    g.drawString("20", xOrigin-xBorder/3, yBorder);
    g.drawString("10", xOrigin-xBorder/3, (yOrigin+yBorder)/2);
    g.drawString("0", xOrigin-xBorder/3, yOrigin);
    String hours[] = {"10AM","11AM","12AM","13PM","14PM","15PM","16PM"};
    g.drawString("Stock Price and Volume of "+Sday, xAxisLength/3, yBorder/2);
    for(int i = 0;i<7;i++){
        if(!Lday.get(i).getDateTime().toString().substring(0,10).equals(Sday.substring(0,10))){
            break;
        }
        g.setColor(Color.BLACK);
        g.drawString(hours[i], xOrigin+onePart*i, yOrigin+yBorder/2);
        
    }
    for(int i = 0;i<7;i++){
        
        g.setColor(Color.BLACK);
        g.drawString(hours[i], xOrigin+onePart*i, yOrigin+yBorder/2);
        
    }
   /* for(int i = 0;i<7;i++){
        g.setColor(Color.DARK_GRAY);
        
        g.fillRect(xOrigin+onePart*i,yOrigin-(int)average[i][0]*coeff,barWidth,(int)average[i][0]*coeff);
    }
    for(int i = 0;i<7;i++){
        g.setColor(Color.orange);
        
        g.fillRect(xOrigin+onePart*i+barSpace+barWidth,yOrigin-(int)average[i][1]*coeff,barWidth,(int)average[i][1]*coeff);
    }
    */
    
  }
}
