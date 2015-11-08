import javax.swing.*;
import java.awt.*;


public class Main extends JFrame {	
	
	JButton przycisk1;
	JButton przycisk3;
	JButton przycisk4;
	JButton przycisk5;

	public Main() 
	{				
		
		super("tytu³ ramki");
		this.setBounds(100, 100, 300, 120);
		initComponents();
		
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     //   this.pack(); //zawsze nalezy dodac, aby szybciej dzialalo, stosowac gdy mamy juz jakies komponenty (np. buttony),
       //dopasuwouje do wielkosci ramki
		
	}
	
	public void initComponents()
	{
		przycisk1 = new JButton("Przycisk"); //deklaracja przycisku
		JButton przycisk2 = new JButton("Przycisk2");
		przycisk3 = new JButton("Przycisk3");
		przycisk4 = new JButton("Przycisk4");
		przycisk5 = new JButton("Przycisk5");
		
		Container kontener = this.getContentPane(); //tworzymy szybke, na ktorej bedzie znajodwal sie button
		kontener.add(przycisk1, BorderLayout.CENTER); //dodanie przyciski, BorderLayout.CENTER -centrowanie
		kontener.add(przycisk2, BorderLayout.PAGE_START);
		kontener.add(przycisk3, BorderLayout.PAGE_END);
		kontener.add(przycisk4, BorderLayout.LINE_END);
		kontener.add(przycisk5, BorderLayout.LINE_START);
		
		//pozycjonowanie absulotne:
		przycisk1.setLocation(10,10);
		przycisk1.setSize(150,20);
		kontener.setLayout(null);
		kontener.add(przycisk1);
	}
	

	

	public static void main(String[] args) {				
		
		new Main().setVisible(true);		

	}

}
