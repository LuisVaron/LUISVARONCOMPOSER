package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.EjercicioArchivo;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {

	private EjercicioArchivo m;
	private View gui;
	private String content;

	public Controller() {

		gui = new View();
		m = new EjercicioArchivo();
		funcionar();

	}

	public void funcionar() {

		gui.getPdatos().getBoton_generar().addActionListener(this);
		gui.getPdatos().getBoton_guardar().addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		try {

			if (e.getActionCommand().equals("GENERAR")) {

				m.gestionarPropiedades();
				this.content = m.getComposer().DevolverLetra();
				gui.getPresul().getEtiqueta_resultados().setText("<html>" + this.content.replace("\n", "<br>"));

			} else if (e.getActionCommand().equals("GUARDAR")) {

				m.gestionarArchivoCadena(this.content);

			}
		} catch (Exception x) {
			System.out.println(x);
		}
	}
}
