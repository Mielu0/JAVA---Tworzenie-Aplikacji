import javax.swing.*;
import java.awt.*;


public class Main extends JFrame {		
	
	JButton button1 = new JButton("Przycisk1");
	JButton button2 = new JButton("Przycisk2");
	JButton button3 = new JButton("Przycisk3");
	JButton button4 = new JButton("Przycisk4");
	
	//JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER)); //panele - sluza, aby przytrzymywac tematycznie powiazane ze soba komponety
	//taki panel uzywa ukladu managerow - FlowLayout()   Flow - strumieniowy/oplywowy uklad managero
	//do panelu mozemy dodac button	
//	JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEADING));
//	JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel panel = new JPanel(new FlowLayout(FlowLayout.TRAILING));
	
	public Main() 
	{				
		super("tytul ramki");
		this.setBounds(100, 100, 300, 120);
		initComponents();        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     // this.pack(); 
	}
	
	public void initComponents()
	{
		//this.getContentPane().add(new JButton("Button1"),BorderLayout.PAGE_START); //towrzy i dodaje button
		button1.setPreferredSize(new Dimension(100,50));
		panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		//button2.setPreferredSize(button2.getPreferredSize());
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		//this.getContentPane().add(panel,BorderLayout.PAGE_START);
		this.getContentPane().add(panel, BorderLayout.CENTER);
		//this.getContentPane().add(button1, BorderLayout.PAGE_START);	
	}
	

	

	public static void main(String[] args) {				
		
		new Main().setVisible(true);		

	}

}
