package co.edu.unbosque.model.persistence;

public class Compositor {

	private String[][] frases;
	private Propiedades prop;

	public Compositor() {
		frases = new String[6][4];
		prop = new Propiedades();
		Estrofas();
	}

	public void Estrofas() {
		frases[0][0] = "Mami ";
		frases[0][1] = "Bebé ";
		frases[0][2] = "Princess ";
		frases[0][3] = "Mami ";
		frases[1][0] = "yo quiero ";
		frases[1][1] = "yo puedo ";
		frases[1][2] = "yo vengo a ";
		frases[1][3] = "voy a ";
		frases[2][0] = "encenderte ";
		frases[2][1] = "amarte ";
		frases[2][2] = "ligar ";
		frases[2][3] = "jugar ";
		frases[3][0] = "suave ";
		frases[3][1] = "lento ";
		frases[3][2] = "rapido ";
		frases[3][3] = "fuerte ";
		frases[4][0] = "hasta que salga el sol ";
		frases[4][1] = "toda la noche ";
		frases[4][2] = "hasta el amanecer ";
		frases[4][3] = "todo el día ";
		frases[5][0] = "sin anestesia.";
		frases[5][1] = "sin compromiso.";
		frases[5][2] = "feis to feis.";
		frases[5][3] = "sin miedo.";
	}

	public String DevolverLetra() {

		String texto = "";
		int parrafos = Integer.parseInt(prop.leerPropiedades("numeroEstrofas"));
		int renglon = Integer.parseInt(prop.leerPropiedades("numeroFrases"));

		for (int i = 0; i < renglon * parrafos; i++) {

			for (int j = 0; j < 6; j++) {

				int ran = (int) (Math.random() * 100);
				texto += frases[j][ran % 4];

			}

			if ((i + 1) % renglon == 0) {
				texto += "\n" + "\n";
			} else {
				texto += "\n";
			}

		}

		return texto;
	}

	public String[][] getFrases() {
		return frases;
	}

	public void setFrases(String[][] frases) {
		this.frases = frases;
	}

	public Propiedades getProp() {
		return prop;
	}

	public void setProp(Propiedades prop) {
		this.prop = prop;
	}

}
