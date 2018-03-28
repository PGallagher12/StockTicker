

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Stocks extends JFrame{
	private static Stocks frame = new Stocks();
	private static stockName stockName = new stockName();
	//private static Description frame = new Description();
	
	private JPanel jpList = new JPanel();
	private JPanel jpName = new JPanel();
	private JPanel jpSearch = new JPanel();
	private JPanel jpDescription = new JPanel();
	private JTextField jtfSearch = new JTextField(10);
	private JLabel jlSearch = new JLabel("Search");
	private JScrollPane jsbScroll = new JScrollPane(jpList);
	
	public static void main(String[] args) {
		
		frame.setTitle("Menu");
		frame.setLocationRelativeTo(null);
		frame.setPreferredSize(new Dimension(800,500));
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public Stocks(){
			
		int b[] = {3,1,4,5,68,9,2};
		
		
		JPanel jpMenu = new JPanel();
		jpMenu.setLayout(new GridLayout(2,2));
		jpMenu.add(jpName);
		jpName.setBackground(Color.black);
		
		jpMenu.add(jpSearch);
		jpSearch.add(jlSearch);
		jpSearch.add(jtfSearch);
		jtfSearch.setColumns(30);
		jpMenu.add(jpList);
		
		if (b.length > 0){
			JLabel jlMessage = new JLabel("Stocks");
			
			jpList.setLayout(new GridLayout(b.length,1));
			jpList.add(jlMessage);
			jpList.add(jsbScroll);
			for(int i = 0; i <b.length; i++){
				
				jpList.add(new JButton(""+b[i]));
			}
			
		}
		else{
			JLabel jlMessage = new JLabel("Your stocks are here when they are added");
			jpList.add(jlMessage);
		}
		
		jpMenu.add(jpDescription);
		
		
		add(jpMenu, BorderLayout.CENTER);
		
		jtfSearch.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				
				stockName.setTitle("BOX");
				stockName.setVisible(true);
				stockName.setSize(300,500);
				frame.setVisible(false);
				//getText();
			}
			
			//public void getText(){
				//String v = (jtfSearch.getText());
			//}
		});
	}

}
