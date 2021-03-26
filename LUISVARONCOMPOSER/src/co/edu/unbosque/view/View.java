package co.edu.unbosque.view;

import java.awt.Color;
import javax.swing.JFrame;

public class View extends JFrame{
	
	private PanelDeBotones pboton;
	private PanelDeLetra pletra;
	
	public View() {
		
		setTitle("Compositor canciones reggaeton");
		
		setSize(500,400);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		getContentPane().setBackground(Color.red);
		getContentPane().setLayout(null);
		
		inicializarComponentes();
		
		setResizable(false);
		
		setLocationRelativeTo(null);
		
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		pletra = new PanelDeLetra();
		pletra.setBounds(25,15, 435, 260);
		getContentPane().add(pletra);
		
		pboton = new PanelDeBotones();
		pboton.setBounds(25, 265, 435, 70);
		getContentPane().add(pboton);
	}

	public PanelDeBotones getPdatos() {
		return pboton;
	}

	public void setPdatos(PanelDeBotones pdatos) {
		this.pboton = pdatos;
	}

	public PanelDeLetra getPresul() {
		return pletra;
	}

	public void setPresul(PanelDeLetra presul) {
		this.pletra = presul;
	};
	

}
