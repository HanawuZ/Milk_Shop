package UI;

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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class SelectTaste extends JFrame {

	private JPanel contentPane;
	private String milk_type;
	private String disinfection_type;
	private String product_form;
	private String amount;
	private String taste;

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
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel TasteLabel = new JLabel("กรุณาเลือกรสชาติ");
		TasteLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		TasteLabel.setBounds(518, 10, 258, 59);
		contentPane.add(TasteLabel);
		
		JButton WhiteMaltButton = new JButton("White Malt");
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
		SweetButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		SweetButton.setBounds(1026, 215, 185, 59);
		contentPane.add(SweetButton);
		SweetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taste = "sweet";
				SelectBrand brand_page = new SelectBrand();
				brand_page.setVisible(true);
				setVisible(false);
			}
		});
		

	
        
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


