package stockTicker;

import java.awt.*;
import javax.swing.*;

public class Stocks extends JFrame{
	private static Stocks frame = new Stocks();
	//private static stockName stockName = new stockName();
	//private static List frame = new List();
	//private static Description frame = new Description();
	
	private JPanel jbList = new JPanel();
	private JPanel jbName = new JPanel();
	private JTextField jtfSearch = new JTextField(10);
	
	public static void main(String[] args) {
		
		frame.setTitle("Menu");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public Stocks(){
		JPanel jpMenu = new JPanel();
		jpMenu.setLayout(new GridLayout(2,2));
		jpMenu.add(jbName);
		jbName.setBackground(Color.black);
		jpMenu.add(jtfSearch);
		jtfSearch.setSize(150,200);
		jpMenu.add(jbList);
		jbList.setBackground(Color.RED);
		add(jpMenu, BorderLayout.CENTER);
		
		/*jtfSearch.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				stockName.setTitle("Hello");
			}
		});*/
	}

}
