package TP5;

public class Peliculas {

	private int ID;
	private String Nombre;
	private Categorias Genero;
	private static int proximoID = 1;
	
	public Peliculas() {
		ID = proximoID;
		proximoID++;
	}
	
	public Peliculas(String nombre, Categorias genero) {
		ID = proximoID;
		Nombre = nombre;
		Genero = genero;
		proximoID++;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Categorias getGenero() {
		return Genero;
	}

	public void setGenero(Categorias genero) {
		Genero = genero;
	}

	@Override
	public String toString() {
		return ID + " - " + Nombre + " - " + Genero;
	}
	
	public static int devuelveProximoID(){
		return proximoID;
	}
	
}
