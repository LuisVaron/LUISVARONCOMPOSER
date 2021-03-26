package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.EjemploFile;
import co.edu.unbosque.model.persistence.Propiedades;
import co.edu.unbosque.model.persistence.Compositor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class EjercicioArchivo {

	private Compositor composer;
	private EjemploFile archivo;
	private Propiedades prop;

	public EjercicioArchivo() {
		composer = new Compositor();
		archivo = new EjemploFile();
		prop = new Propiedades();
	}

	public String gestionarArchivoCadena(String letra) {

		archivo.escribirArchivo(letra);

		return "Archivo escrito.";
	}

	public String gestionarPropiedades() {

		pathProp();
		prop.escribirPropiedades();

		return "Propiedades actualizadas.";
	}

	public void pathProp() {

		Path path = Paths.get("C:\\data\\");

		try {
			if (!Files.exists(path)) {

				Files.createDirectory(path);

			}
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	public Compositor getComposer() {
		return composer;
	}

	public void setComposer(Compositor composer) {
		this.composer = composer;
	}

	public EjemploFile getArchivo() {
		return archivo;
	}

	public void setArchivo(EjemploFile archivo) {
		this.archivo = archivo;
	}

}
