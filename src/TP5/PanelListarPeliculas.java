package TP5;

import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JList;

public class PanelListarPeliculas extends JPanel {
	
	private JList list;
	private DefaultListModel<Peliculas> listModel;
	
	public PanelListarPeliculas() {
		setLayout(null);
		
		JLabel lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPeliculas.setBounds(50, 140, 72, 14);
		add(lblPeliculas);
		
		list = new JList();
		list.setBounds(132, 25, 263, 231);
		add(list);
	}
	
	public void setDefaultListModel(DefaultListModel<Peliculas> listModel)
	{
		ordenarLista(listModel);
		
		this.listModel = listModel;
		list.setModel(this.listModel);
	}
	
	//Funcion para ordenar modelList
	public DefaultListModel<Peliculas> ordenarLista (DefaultListModel<Peliculas> listModel){
		
		List<Peliculas> lista = new ArrayList<>(); //Instancio una lista de películas tipo ArrayList
		
		for(int i = 0; i < listModel.getSize(); i++) { // Recorro listModel y agrego cada Pelicula a la lista
			
			lista.add((Peliculas)listModel.get(i));
		}
		
		Collections.sort(lista); //Para usar sort clase Peliculas debe implementar Comparable
		listModel.removeAllElements(); // Vacio listModel
		
		for (Peliculas p : lista) { //Con un foreach recorro el arraylist ordenado son sort y lo arrego a la modelList
			listModel.addElement(p);
		}
		
		return listModel; // Devuelvo la modelList ya ordenada
	}
}
