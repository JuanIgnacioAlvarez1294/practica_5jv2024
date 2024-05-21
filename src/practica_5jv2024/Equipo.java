package practica_5jv2024;

public abstract class Equipo {
	private String nombreEquipo;
	private String universidad;
	private String lenguaje;
	private int tamañoEquipo;
	
	
	public Equipo() {
		
	}

	public Equipo(String nombreEquipo, String universidad, String lenguaje, Integer tamañoEquipo) {
		this.nombreEquipo = nombreEquipo;
		this.universidad = universidad;
		this.lenguaje = lenguaje;
		this.tamañoEquipo = tamañoEquipo;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	public int getTamañoEquipo() {
		return tamañoEquipo;
	}

	public void setTamañoEquipo(int tamañoEquipo) {
		this.tamañoEquipo = tamañoEquipo;
	}

	@Override
	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", universidad=" + universidad + ", lenguaje=" + lenguaje
				+ ", tamañoEquipo=" + tamañoEquipo + "]";
	}
	
	public abstract boolean equipoCompleto();
	
}
