package TP5;

public class Categorias {

	private String Nombre;

	public Categorias(String nombre) {
		Nombre = nombre;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	@Override
	public String toString() {
		return Nombre;
	}
	
	
}
