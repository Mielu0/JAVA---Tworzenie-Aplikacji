import javax.swing.*;
import java.awt.*;


public class Main extends JFrame {
	
	public Main() 
	{		
		/*	 
		this.setSize(100, 100); //rozmiar
		this.setSize(new Dimension(100, 100)); //rozmiar poprzez stworzenie obiektu Dimension
		
		this.setLocation(100, 100); //pozycja ramki
		this.setLocation(new Point(100, 100)); //pozycja ramki poprzez utworzenie nowego obiektu Point		
		*/
		
		
		super("tytu³ ramki");
		this.setBounds(100, 50, 300, 100);
		
		this.setResizable(false); //zablokowana mozliwoœæ zmiany wielkosci ramki
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("obraz.jpg")); //ustawienie ikony ramki
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 //     this.pack(); //zawsze nalezy dodac, aby szybciej dzialalo, stusowac gdy mamy juz jakies komponenty (np. buttony
		
	}
	

	public static void main(String[] args) {				
		
		new Main().setVisible(true);		

	}

}
