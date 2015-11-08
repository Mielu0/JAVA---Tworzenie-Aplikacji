import javax.swing.*;
import java.awt.*;


public class Main extends JFrame {
	
	public Main() 
	{
		
		/*
		 *TWORZENIE RAMKI, wersja dluzsza + opcje:
		 *nie wymaga extends JFrame
		JFrame frame = new JFrame("Moja ramka");
		//frame.setTitle("Moja ramka");	//nazwa ramki
		
		frame.setSize(100, 100); //rozmiar
		frame.setSize(new Dimension(100, 100)); //rozmiar poprzez stworzenie obiektu Dimension
		
		frame.setLocation(100, 100); //pozycja ramki
		frame.setLocation(new Point(100, 100)); //pozycja ramki poprzez utworzenie nowego obiektu Point
		
		frame.setBounds(100, 50, 100, 100); //pozycja (x,y) i wielkosc (z,w)
		
		frame.setResizable(false); //zablokowana mozliwoœæ zmiany wielkosci ramki
		
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("obraz.jpg")); //ustawienie ikony ramki
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //wylaczenie ramki po nacisnieciu x
		frame.setVisible(true); //widocznosc ramki = trues
		this.pack(); //zawsze nalezy dodac, aby szybciej dzialalo, stusowac gdy mamy juz jakies komponenty (np. buttony
		*/
		
		//wersja krotsza, wymaga extends JFrame:
		
		super("tytu³ ramki");
		//this.setBounds(100, 50, 300, 100);
		
		//cetrowanie ramki:
		
		int szer = Toolkit.getDefaultToolkit().getScreenSize().width; //pobranie szerokowsci ekranu
	    int wys = Toolkit.getDefaultToolkit().getScreenSize().height; //pobranie wysokosci ekranu
	    this.setSize(szer/2, wys/2); //ustawienie wielkosci na polowe wymiarow
	    
	    int szerRamki = this.getSize().width; //pobranie szerokosci ramki
        int wysRamki = this.getSize().height; //pobranie dlugosci ramki
        
        this.setLocation((szer-szerRamki)/2, (wys-wysRamki)/2); //ustawienie pozycji na cetrum
        
        
        this.setDefaultCloseOperation(3);
 //       this.pack();
		
	}
	

	public static void main(String[] args) {
		
		//new Main();
		
		new Main().setVisible(true);
		

	}

}
