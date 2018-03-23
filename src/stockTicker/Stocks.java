package stockTicker;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Stocks extends JFrame{
	private static Stocks frame = new Stocks();
	private static stockName stockName = new stockName();
	//private static List frame = new List();
	//private static Description frame = new Description();
	
	private JPanel jpList = new JPanel();
	private JPanel jpName = new JPanel();
	private JTextField jtfSearch = new JTextField(10);
	
	public static void main(String[] args) {
		
		frame.setTitle("Menu");
		frame.setLocationRelativeTo(null);
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
		jpMenu.add(jtfSearch);
		jtfSearch.setSize(150,200);
		jpMenu.add(jpList);
		//JPanel jbList = new JPanel();
		if (b.length > 0){
			JLabel jlMessage = new JLabel("Stocks");
			jpList.setLayout(new GridLayout(b.length,1));
			jpList.add(jlMessage);
			for(int i = 0; i <b.length; i++){
				jpList.add(new JButton(""+b[i]));
			}
		}
		else{
			JLabel jlMessage = new JLabel("Your stocks are here when they are added");
			jpList.add(jlMessage);
		}
		add(jpMenu, BorderLayout.CENTER);
		
		jtfSearch.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				stockName.setTitle("Hello");
				stockName.setVisible(true);
				stockName.setSize(300,500);
			}
		});
	}

}
