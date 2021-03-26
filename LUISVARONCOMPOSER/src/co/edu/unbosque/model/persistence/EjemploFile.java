package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;

public class EjemploFile {

	public int escribirArchivo(String dato) {

		File fi = new File("C:\\data");

		JFileChooser fileChooser = new JFileChooser("C:\\data");

		fileChooser.setDialogTitle("Guardar Como");

		int result = fileChooser.showSaveDialog(null);

		if (result == JFileChooser.APPROVE_OPTION) {

			fi = fileChooser.getSelectedFile();

			String filePath = fi.getPath();

			if (!filePath.toLowerCase().endsWith(".txt")) {

				fi = new File(filePath + ".txt");

			}

		}

		try {

			FileWriter fw = new FileWriter(fi);
			PrintWriter pw = new PrintWriter(fw);

			pw.println(dato);

			fw.close();

		} catch (IOException e) {

			return -1;

		}

		return 0;
	}

}
