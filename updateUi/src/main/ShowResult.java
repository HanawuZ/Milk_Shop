package UI;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.rdf.model.RDFNode;

import com.github.andrewoma.dexx.collection.ArrayList;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.SwingConstants;
public class ShowResult extends JFrame {
/*
	 PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX owl: <http://www.w3.org/2002/07/owl#>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>
PREFIX milk: <http://www.drink.org/milk/#>
PREFIX milk1: <http://www.drink.org/milk/>

SELECT (?milk as ?Milk) (?tasteLabel as ?Taste) (?disinfectionLabel as ?Disinfection) (?typeLabel as ?Type) (?detailLabel as ?Detail)  (?productFormLabel as ?Product_Form)
WHERE {
  ?x rdfs:label ?milk;
     rdf:type milk:nestle;
     milk:hasTaste ?taste;
     milk1:hasDisinfection ?disinfection;
     milk1:hasType ?type;
     milk:hasProduct_Detail ?product_detail;
     milk:hasProduct_From ?product_form.
  ?taste rdfs:label ?tasteLabel .
  ?disinfection rdfs:label ?disinfectionLabel.
  ?type rdfs:label ?typeLabel.
  ?product_detail rdfs:label ?detailLabel.
  ?product_form rdfs:label ?productFormLabel.
   FILTER(?taste = milk:sweet && ?disinfection = milk:UHT && ?type = milk:cow && ?product_detail = milk:200_ml && ?product_form = milk:box) 
 
}

*/
	
	private JPanel contentPane;
	private String[][] milkList;
	private String milk_type;
	private String disinfection_type;
	private String product_form;
	private String amount;
	private String taste;
	private String brand;
	private String queryString;
	private String SelectMilk = "No milk";
	
	
    public ShowResult(String milk_type, String disinfection_type, String product_form, String amount, String taste, String brand) {
    	this.milk_type = milk_type;
		this.disinfection_type = disinfection_type;
		this.product_form = product_form;
		this.amount = amount;
		this.taste = taste;
		this.brand = brand;
	
		
		//	rdf:type milk:nestle;
		String select_brand = String.format("milk:%s", brand);
		String select_taste = String.format("milk:%s", taste);
		String select_type = String.format("milk:%s", milk_type);
		String select_disinfection = String.format("milk:%s", disinfection_type);
		String select_product_form = String.format("milk:%s", product_form);
		String select_amount = String.format("milk:%s", amount);
		System.out.println(select_brand);
		System.out.println(select_taste);
		System.out.println(select_type);
		System.out.println(select_disinfection);
		System.out.println(select_product_form);
		System.out.println(select_amount);
		
		String filter = String.format("FILTER(?taste = %s && ?disinfection = %s && ?type = %s && ?product_detail = %s && ?product_form = %s) }",
				select_taste, select_disinfection, select_type, select_amount, select_product_form);
		queryString = 
				 "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
				+"PREFIX owl: <http://www.w3.org/2002/07/owl#>"
				+"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>"
				+"PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>"
				+"PREFIX milk: <http://www.drink.org/milk/#>"
				+"PREFIX milk1: <http://www.drink.org/milk/>"
				+"SELECT (str(?milk) as ?Milk) (?tasteLabel as ?Taste) (?disinfectionLabel as ?Disinfection) (?typeLabel as ?Type) (?detailLabel as ?Detail)  (?productFormLabel as ?Product_Form)"
				+"WHERE {?x rdfs:label ?milk;"
				+"rdf:type "+select_brand+";"
				+"milk:hasTaste ?taste;"
				+"milk1:hasDisinfection ?disinfection;"
				+"milk1:hasType ?type;"
				+"milk:hasProduct_Detail ?product_detail;"
				+"milk:hasProduct_From ?product_form."
				+"?taste rdfs:label ?tasteLabel."
				+"?disinfection rdfs:label ?disinfectionLabel."
				+"?type rdfs:label ?typeLabel."
				+"?product_detail rdfs:label ?detailLabel."
				+"?product_form rdfs:label ?productFormLabel."
				+filter;
				
		
//		queryString = 
//				 "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
//				+"PREFIX owl: <http://www.w3.org/2002/07/owl#>"
//				+"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>"
//				+"PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>"
//				+"PREFIX milk: <http://www.drink.org/milk/#>"
//				+"PREFIX milk1: <http://www.drink.org/milk/>"
//				+"SELECT (str(?milk) as ?Milk) (?tasteLabel as ?Taste) (?disinfectionLabel as ?Disinfection) (?typeLabel as ?Type) (?detailLabel as ?Detail)  (?productFormLabel as ?Product_Form)"
//				+"WHERE {?x rdfs:label ?milk;"
//				+"rdf:type "+select_brand+";"
//				+"milk:hasTaste ?taste;"
//				+"milk1:hasDisinfection ?disinfection;"
//				+"milk1:hasType ?type;"
//				+"milk:hasProduct_Detail ?product_detail;"
//				+"milk:hasProduct_From ?product_form."
//				+"?taste rdfs:label ?tasteLabel."
//				+"?disinfection rdfs:label ?disinfectionLabel."
//				+"?type rdfs:label ?typeLabel."
//				+"?product_detail rdfs:label ?detailLabel."
//				+"?product_form rdfs:label ?productFormLabel."
//				+"FILTER(?taste = "+select_taste+" && "
//				+"?disinfection = "+select_disinfection+" && "
//				+"?type = "+select_type+" && "
//				+"?product_form = "+select_product_form+" && "
//				+"?amount = "+select_amount+")}";
        
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(223, 232, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel YourMilkIsLabel = new JLabel("Your Milk is");
		YourMilkIsLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		YourMilkIsLabel.setBounds(596, 10, 243, 67);
		contentPane.add(YourMilkIsLabel);
		
		org.apache.jena.query.ResultSet results = OpenOWL_milk.ExecSparQlMilk(queryString); //all method ExecSparQl from OpenOWL class
		System.out.println(results.hasNext());
		while (results.hasNext()) {
			 QuerySolution sol = results.nextSolution();
			 SelectMilk = sol.get("Milk").toString(); 
			 System.out.println(SelectMilk);
		}
		JLabel MilkResultLabel = new JLabel(SelectMilk);
		MilkResultLabel.setHorizontalAlignment(SwingConstants.CENTER);
		MilkResultLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		MilkResultLabel.setBounds(500, 87, 397, 109);
		contentPane.add(MilkResultLabel);
		
		
    	
    }
    
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowResult frame = new ShowResult("cow","UHT","box","200_ml","sweet","nestle");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}