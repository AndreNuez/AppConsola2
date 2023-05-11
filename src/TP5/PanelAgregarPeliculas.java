package TP5;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelAgregarPeliculas extends JPanel {

	private JTextField txtNombre;
	private JComboBox<Categorias> cbGenero;
	private JButton btnAceptar;
	private DefaultListModel<Peliculas> listModel;

	/**
	 * Create the panel.
	 */
	public PanelAgregarPeliculas() {
		setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblId.setBounds(61, 47, 46, 14);
		add(lblId);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNombre.setBounds(61, 87, 66, 14);
		add(lblNombre);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGenero.setBounds(61, 129, 66, 14);
		add(lblGenero);
		
		JLabel lblIDAuto = new JLabel("");
		lblIDAuto.setBounds(200, 47, 46, 14);
		lblIDAuto.setText(Integer.toString(Peliculas.devuelveProximoID()));
		add(lblIDAuto);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(200, 86, 131, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		cbGenero = new JComboBox<Categorias>();
		cbGenero.setBounds(200, 128, 131, 20);
		add(cbGenero);
		
		cbGenero.addItem(new Categorias("Seleccione un genero"));
		cbGenero.addItem(new Categorias("Terror"));
		cbGenero.addItem(new Categorias("Accion"));
		cbGenero.addItem(new Categorias("Suspenso"));
		cbGenero.addItem(new Categorias("Romantica"));
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!txtNombre.getText().isEmpty() && !cbGenero.getSelectedItem().toString().matches("Seleccione un genero"))
				{
					Peliculas pelicula = new Peliculas();
					pelicula.setNombre(txtNombre.getText());
					pelicula.setGenero((Categorias)cbGenero.getSelectedItem());
					listModel.addElement(pelicula);
							
					txtNombre.setText("");
				}
				else {
					JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
				}
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAceptar.setBounds(200, 218, 89, 23);
		add(btnAceptar);

	}
	
	public void setDefaultListModel(DefaultListModel<Peliculas> listModelRecibido)
	{
		this.listModel = listModelRecibido;
	}
}
