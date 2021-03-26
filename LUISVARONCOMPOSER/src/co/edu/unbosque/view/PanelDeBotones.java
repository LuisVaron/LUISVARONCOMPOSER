package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelDeBotones extends JPanel {

	private JButton boton_generar;
	private JButton boton_guardar;

	public PanelDeBotones() {

		setLayout(null);

		inicializarComponentes();

		setVisible(true);

	}

	public void inicializarComponentes() {

		setBackground(Color.red);
		
		boton_generar = new JButton("Generar");
		boton_generar.setBounds(25,25,150,50);
		boton_generar.setActionCommand("GENERAR");
		add(boton_generar);
		
		boton_guardar = new JButton("Guardar");
		boton_guardar.setBounds(250,25,150,50);
		boton_guardar.setActionCommand("GUARDAR");
		add(boton_guardar);
	}


	public JButton getBoton_generar() {
		return boton_generar;
	}

	public void setBoton_generar(JButton boton_generar) {
		this.boton_generar = boton_generar;
	}

	public JButton getBoton_guardar() {
		return boton_guardar;
	}

	public void setBoton_guardar(JButton boton_guardar) {
		this.boton_guardar = boton_guardar;
	}
	
	

}
