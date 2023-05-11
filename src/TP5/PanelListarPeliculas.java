package TP5;

import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import java.awt.Font;
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
		this.listModel = listModel;
		list.setModel(this.listModel);
	}
}
