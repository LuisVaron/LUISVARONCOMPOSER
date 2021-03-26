package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {

	private Properties prop = new Properties();
	private String archivoprop = "C:\\data\\archivo.properties";

	public int escribirPropiedades() {
		try {

			prop.setProperty("numeroEstrofas", "3");
			prop.setProperty("numeroFrases", "4");
			prop.setProperty("nombreArchivo", "");
			prop.store(new FileOutputStream(archivoprop), null);

		} catch (IOException ex) {
			return -1;
		}
		return 0;
	}

	public String leerPropiedades(String llave) {
		String linea = "";
		try {
			prop.load(new FileInputStream(archivoprop));
			prop.list(System.out);

			linea = prop.getProperty(llave);

		} catch (IOException ex) {
			
			return null;
		}
		return linea;
	}

}
