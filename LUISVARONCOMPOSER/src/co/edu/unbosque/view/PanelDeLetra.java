package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

public class PanelDeLetra extends JPanel {
	
	private JLabel etiqueta_letra;
	private JScrollPane scroll_letra;
	
	public PanelDeLetra() {
		
		setLayout(null);
		
		inicializarComponentes();
		
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		setBackground(new Color(225,225,225));
		setBorder(new TitledBorder("Letra canción"));
		etiqueta_letra = new JLabel();
		scroll_letra = new JScrollPane();
		scroll_letra.setBounds(10,0,430,300);
		etiqueta_letra.setBounds(0,0,430,300);
		scroll_letra.setViewportView(etiqueta_letra);
		add(scroll_letra);
		
	}

	public JScrollPane getScroll() {
		return scroll_letra;
	}

	public void setScroll(JScrollPane scroll_letra) {
		this.scroll_letra = scroll_letra;
	}

	public JLabel getEtiqueta_resultados() {
		return etiqueta_letra;
	}

	public void setEtiqueta_resultados(JLabel etiqueta_resultados) {
		this.etiqueta_letra = etiqueta_resultados;
	}

}
