package main;

import java.awt.EventQueue;
import java.nio.charset.Charset;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.rdf.model.RDFNode;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class SelectTaste extends JFrame {

	private JPanel contentPane;
	private String milk_type;
	private String disinfection_type;
	private String product_form;
	private String amount;
	private String taste;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public SelectTaste(String milk_type, String disinfection_type, String product_form, String amount) {
		this.milk_type = milk_type;
		this.disinfection_type = disinfection_type;
		this.product_form = product_form;
		this.amount = amount;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1280, 720);
		setBackground(Color.WHITE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.BOLD, 30));
		textField.setText("กรุณาเลือกรสชาติ");
		textField.setBounds(514, 59, 258, 59);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton WhiteMaltButton = new JButton("White Malt");
		WhiteMaltButton.setBorderPainted(false);
		WhiteMaltButton.setBackground(Color.ORANGE);
		WhiteMaltButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		WhiteMaltButton.setBounds(66, 215, 185, 59);
		contentPane.add(WhiteMaltButton);
		
		WhiteMaltButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taste = "white_malt";
				SelectBrand brand_page = new SelectBrand();
				brand_page.setVisible(true);
				setVisible(false);
			}
		});
		
		JButton NatureButton = new JButton("Nature");
		NatureButton.setBorderPainted(false);
		NatureButton.setBackground(new Color(102, 204, 255));
		NatureButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		NatureButton.setBounds(311, 215, 185, 59);
		contentPane.add(NatureButton);
		
		NatureButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taste = "nature";
				SelectBrand brand_page = new SelectBrand();
				brand_page.setVisible(true);
				setVisible(false);
			}
		});
		
		JButton StrawberryButton = new JButton("Strawberry");
		StrawberryButton.setBorderPainted(false);
		StrawberryButton.setBackground(new Color(255, 51, 102));
		StrawberryButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		StrawberryButton.setBounds(549, 215, 185, 59);
		contentPane.add(StrawberryButton);
		StrawberryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taste = "strawberry";
				SelectBrand brand_page = new SelectBrand();
				brand_page.setVisible(true);
				setVisible(false);
			}
		});
		
		
		JButton ChocolateButton = new JButton("Chocolate");
		ChocolateButton.setForeground(new Color(255, 255, 255));
		ChocolateButton.setBorderPainted(false);
		ChocolateButton.setBackground(new Color(102, 51, 0));
		ChocolateButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		ChocolateButton.setBounds(786, 215, 185, 59);
		contentPane.add(ChocolateButton);
		ChocolateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taste = "chocolate";
				SelectBrand brand_page = new SelectBrand();
				brand_page.setVisible(true);
				setVisible(false);
			}
		});
		
		
		JButton SweetButton = new JButton("Sweet");
		SweetButton.setBorderPainted(false);
		SweetButton.setBackground(new Color(204, 255, 102));
		SweetButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		SweetButton.setBounds(1026, 215, 185, 59);
		contentPane.add(SweetButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(-16, 0, 1294, 699);
		contentPane.add(lblNewLabel_1);
		SweetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taste = "sweet";
				SelectBrand brand_page = new SelectBrand();
				brand_page.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(new ImageIcon("C:\\\\Users\\\\Jajar\\\\Documents\\\\Learning\\\\SEMETIC\\\\tastewallpaper.jpg").getImage().getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_DEFAULT)));

		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Jajar\\Documents\\Learning\\SEMETIC\\White_Background_(To_id_screen_dust_during_cleanup).jpg"));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 1266, 683);
		contentPane.add(lblNewLabel);
		
		
		
        
	}
}

/*PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX owl: <http://www.w3.org/2002/07/owl#>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>
PREFIX milk: <http://www.drink.org/milk/#>
PREFIX milk1: <http://www.drink.org/milk/>
SELECT (str(?name) as ?Name)
WHERE { ?x rdf:type milk:Taste;
	rdfs:label ?name.	
}*/


