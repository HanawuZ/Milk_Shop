package UI;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import org.apache.jena.query.QuerySolution;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;

public class Menu extends JFrame {

	private JPanel panel;
	private JFrame frame;
	private String[][] milkList;
	String queryString = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
						+"PREFIX owl: <http://www.w3.org/2002/07/owl#>"
						+"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>"
						+"PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>"
						+"PREFIX milk: <http://www.drink.org/milk/#>"
						+"PREFIX milk1: <http://www.drink.org/milk/>"
						+"SELECT (str(?milk) as ?Milk) (?tasteLabel as ?Taste) (?disinfectionLabel as ?Disinfection) (?typeLabel as ?Type) (?detailLabel as ?Detail)  (?productFormLabel as ?Product_Form)"
						+"WHERE {?x rdfs:label ?milk;"
						+"milk:hasTaste ?taste;"
						+"milk1:hasDisinfection ?disinfection;"
						+"milk1:hasType ?type;"
						+"milk:hasProduct_Detail ?product_detail;"
						+"milk:hasProduct_From ?product_form."
						+"?taste rdfs:label ?tasteLabel."
						+"?disinfection rdfs:label ?disinfectionLabel."
						+"?type rdfs:label ?typeLabel."
						+"?product_detail rdfs:label ?detailLabel."
						+"?product_form rdfs:label ?productFormLabel. }";

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Menu() {
		frame = new JFrame();
    	panel = new JPanel();
    	milkList = new String[37][];
        //actual data for the table in a 2d array

    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        org.apache.jena.query.ResultSet results = OpenOWL_milk.ExecSparQlMilk(queryString); //all method ExecSparQl from OpenOWL class
        int i = 0;
        while (results.hasNext()) {

            QuerySolution sol = results.nextSolution();
            String Milk = sol.get("Milk").toString(); 
            String Taste = sol.get("Taste").toString();
            String Disinfection = sol.get("Disinfection").toString();
            String Type = sol.get("Type").toString();
            String Detail = sol.get("Detail").toString();
            String Product_Form = sol.get("Product_Form").toString();
            
            String milk_individual[] = {Milk ,Taste, Disinfection, Type ,Detail , Product_Form};
           
            milkList[i] = milk_individual;
            System.out.println(Arrays.toString(milkList[i]));
            i++;
        }
        
        String[] columns = { "Milk", "Taste", "Disinfection" , "Type", "Detail", "Product Form"};
        panel.setLayout(null);
        JTable milkTable = new JTable(milkList, columns);
        milkTable.setDefaultEditor(Object.class, null); // Set all cells to non-editable

        JScrollPane milkScrollPane = new JScrollPane(milkTable);
        milkScrollPane.setBounds(21, 332, 830, 320);
        panel.add(milkScrollPane);
        milkScrollPane.setVisible(false);
        frame.getContentPane().add(panel);
        frame.setSize(1280, 720);
        frame.setVisible(true);
        
        JLabel MenuLabel = new JLabel("เลือกเมนู (Select Menu)");
		MenuLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		MenuLabel.setBounds(400, 15, 480, 58);
		panel.add(MenuLabel);
        
        JPanel BeverageListPanel = new JPanel();
        BeverageListPanel.setBackground(new Color(153, 204, 255));
        BeverageListPanel.setBounds(21, 97, 830, 172);
        panel.add(BeverageListPanel);
        BeverageListPanel.setLayout(null);
        JButton btnSparklingWater = new JButton("Sparkling Water");
        btnSparklingWater.setBounds(460, 131, 204, 32);
        BeverageListPanel.add(btnSparklingWater);
        btnSparklingWater.setFont(new Font("Tahoma", Font.BOLD, 20));
        
        JLabel SparklingWaterLogo = new JLabel("");
        SparklingWaterLogo.setBounds(509, 10, 100, 100);
        BeverageListPanel.add(SparklingWaterLogo);
        
        JButton MilkButton = new JButton("Milk");
        MilkButton.setBounds(318, 131, 121, 32);
        BeverageListPanel.add(MilkButton);
        MilkButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        
        JLabel Milk_Icon = new JLabel("");
        Milk_Icon.setBounds(326, 10, 100, 100);
        BeverageListPanel.add(Milk_Icon);
        Milk_Icon.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\milk.png").getImage().getScaledInstance(Milk_Icon.getWidth(), Milk_Icon.getHeight(), Image.SCALE_DEFAULT)));
        SparklingWaterLogo.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\sparkling_water.png").getImage().getScaledInstance(Milk_Icon.getWidth(), Milk_Icon.getHeight(), Image.SCALE_DEFAULT)));
        
        JButton AlcoholButton = new JButton("Alcohol");
        AlcoholButton.setBounds(166, 131, 121, 32);
        BeverageListPanel.add(AlcoholButton);
        AlcoholButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        
        JLabel Alcohol_Icon = new JLabel("");
        Alcohol_Icon.setBounds(179, 10, 100, 100);
        BeverageListPanel.add(Alcohol_Icon);
        Alcohol_Icon.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\alcohol.png").getImage().getScaledInstance(Alcohol_Icon.getWidth(), Alcohol_Icon.getHeight(), Image.SCALE_DEFAULT)));
        
        JButton JuiceButton = new JButton("Juice");
        JuiceButton.setBounds(22, 131, 121, 32);
        BeverageListPanel.add(JuiceButton);
        JuiceButton.setFont(new Font("Tahoma", Font.BOLD, 20));
                
        JLabel JuiceIcon = new JLabel("");
        JuiceIcon.setBounds(22, 10, 100, 100);
        BeverageListPanel.add(JuiceIcon);
        JuiceIcon.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\juice.png").getImage().getScaledInstance(JuiceIcon.getWidth(), JuiceIcon.getHeight(), Image.SCALE_DEFAULT)));
        
        JPanel MenuLabelBackground = new JPanel();
        MenuLabelBackground.setBackground(new Color(153, 204, 255));
        MenuLabelBackground.setBounds(0, 29, 385, 39);
        panel.add(MenuLabelBackground);
        
        JPanel MenuLabelBackground_1 = new JPanel();
        MenuLabelBackground_1.setBackground(new Color(153, 204, 255));
        MenuLabelBackground_1.setBounds(892, 29, 385, 39);
        panel.add(MenuLabelBackground_1);
        
        JLabel lblList = new JLabel("List");
        lblList.setFont(new Font("Tahoma", Font.BOLD, 30));
        lblList.setBounds(21, 279, 81, 58);
        panel.add(lblList);
        
        JPanel NoListPanel = new JPanel();
        NoListPanel.setBackground(new Color(153, 204, 255));
        NoListPanel.setBounds(21, 332, 830, 320);
        panel.add(NoListPanel);
        
        JPanel DecisionPanel = new JPanel();
        DecisionPanel.setBackground(new Color(153, 204, 255));
        DecisionPanel.setBounds(892, 97, 339, 172);
        panel.add(DecisionPanel);
        DecisionPanel.setLayout(null);
        
        JLabel lblLetUsDecide = new JLabel("Let us decide to you?");
        lblLetUsDecide.setBounds(41, 10, 263, 31);
        DecisionPanel.add(lblLetUsDecide);
        lblLetUsDecide.setFont(new Font("Tahoma", Font.BOLD, 25));
        
        JButton btnYes = new JButton("Yes");
        btnYes.setBounds(75, 64, 204, 63);
        DecisionPanel.add(btnYes);
        btnYes.setFont(new Font("Tahoma", Font.BOLD, 40));
        
        JLabel CowPic = new JLabel("");
        CowPic.setFont(new Font("Tahoma", Font.PLAIN, 16));
        CowPic.setBounds(915, 352, 300, 300);
        panel.add(CowPic);
        CowPic.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\image_processing20200410-20919-1h6iv2c.png").getImage().getScaledInstance(CowPic.getWidth(), CowPic.getHeight(), Image.SCALE_DEFAULT)));

        btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectType select_type = new SelectType();
				
				// Show the new page and hide the current page
		        select_type.setVisible(true);
		        frame.dispose();   
			}
		});
        
        
        JuiceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"No Juice");    
			}
		});
        
        
        AlcoholButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Stop drinking alcohol");    
			}
		});
        
        MilkButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		milkScrollPane.setVisible(true);
        	}
        });
        btnSparklingWater.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Sorry, Sparkling Water out of stock.");    
        	}
        });

	}
}
