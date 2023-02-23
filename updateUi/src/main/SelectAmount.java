package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.jena.query.QuerySolution;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;

public class SelectAmount extends JFrame {

	private JPanel contentPane;
	private String milk_type;
	private String disinfection_type;
	private String product_form;
	private String amount;
	private String queryString;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectAmount frame = new SelectAmount("","","");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	private void SelectMilk(){
		
	}
	
	public SelectAmount(String milk_type, String disinfection_type, String product_form) {
		this.milk_type = milk_type;
		this.disinfection_type = disinfection_type;
		this.product_form = product_form;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 204, 255));
		panel.setBounds(-72, 27, 537, 22);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 204, 255));
		panel_1.setBounds(846, 27, 537, 22);
		contentPane.add(panel_1);
		
		JLabel Product_Detail_Label = new JLabel("กรุณาเลือกปริมาณ");
		Product_Detail_Label.setFont(new Font("Tahoma", Font.BOLD, 40));
		Product_Detail_Label.setBounds(486, 10, 361, 49);
		contentPane.add(Product_Detail_Label);
		
		JButton detail_180ML_button = new JButton("180 ml");
		detail_180ML_button.setFont(new Font("Tahoma", Font.BOLD, 30));
		detail_180ML_button.setBounds(423, 140, 158, 56);
		contentPane.add(detail_180ML_button);

		detail_180ML_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount = "180_ml";
				SelectTaste select_taste_page = new SelectTaste(milk_type, disinfection_type, product_form, amount);
				select_taste_page.setVisible(true);
				setVisible(false);
				
			}
		});
		JButton detail_200ML_button = new JButton("200 ml");
		detail_200ML_button.setFont(new Font("Tahoma", Font.BOLD, 30));
		detail_200ML_button.setBounds(627, 140, 158, 56);
		contentPane.add(detail_200ML_button);
		detail_200ML_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount = "200_ml";
				SelectTaste select_taste_page = new SelectTaste(milk_type, disinfection_type, product_form, amount);
				select_taste_page.setVisible(true);
				setVisible(false);

			}
		});
		
		JButton detail_230ML_button = new JButton("230 ml");
		detail_230ML_button.setFont(new Font("Tahoma", Font.BOLD, 30));
		detail_230ML_button.setBounds(877, 140, 158, 56);
		contentPane.add(detail_230ML_button);
		detail_230ML_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount = "230_ml";
				SelectTaste select_taste_page = new SelectTaste(milk_type, disinfection_type, product_form, amount);
				select_taste_page.setVisible(true);
				setVisible(false);
			}
		});
		
		JButton detail_430ML_button = new JButton("430 ml");
		detail_430ML_button.setFont(new Font("Tahoma", Font.BOLD, 30));
		detail_430ML_button.setBounds(423, 221, 158, 56);
		contentPane.add(detail_430ML_button);
		detail_430ML_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount = "430_ml";
				SelectTaste select_taste_page = new SelectTaste(milk_type, disinfection_type, product_form, amount);
				select_taste_page.setVisible(true);
				setVisible(false);
			}
		});
		
		JButton detail_830ML_button = new JButton("830 ml");
		detail_830ML_button.setFont(new Font("Tahoma", Font.BOLD, 30));
		detail_830ML_button.setBounds(627, 221, 158, 56);
		contentPane.add(detail_830ML_button);
		detail_830ML_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount = "830_ml";
				SelectTaste select_taste_page = new SelectTaste(milk_type, disinfection_type, product_form, amount);
				select_taste_page.setVisible(true);
				setVisible(false);
				
		

			}
		});
		
		JButton detail_1L_button = new JButton("1 Litre");
		detail_1L_button.setFont(new Font("Tahoma", Font.BOLD, 30));
		detail_1L_button.setBounds(877, 221, 158, 56);
		contentPane.add(detail_1L_button);
		detail_1L_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount = "1_liter";
				SelectTaste select_taste_page = new SelectTaste(milk_type, disinfection_type, product_form, amount);
				select_taste_page.setVisible(true);
				setVisible(false);
	

			}
		});
		
		JButton detail_2L_button = new JButton("2 Litre");
		detail_2L_button.setFont(new Font("Tahoma", Font.BOLD, 30));
		detail_2L_button.setBounds(170, 140, 158, 56);
		contentPane.add(detail_2L_button);
		detail_2L_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount = "2_liter";
				SelectMilk();
				SelectTaste select_taste_page = new SelectTaste(milk_type, disinfection_type, product_form, amount);
				select_taste_page.setVisible(true);
				setVisible(false);

			}
		});
		
		
		JButton detail_5L_button = new JButton("5 Litre");
		detail_5L_button.setFont(new Font("Tahoma", Font.BOLD, 30));
		detail_5L_button.setBounds(170, 221, 158, 56);
		contentPane.add(detail_5L_button);
		
		JLabel lblNewLabel = new JLabel("");
		//lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Jajar\\Documents\\Learning\\SEMETIC\\liter.jpg"));
		lblNewLabel.setBounds(0, 0, 1286, 683);
		contentPane.add(lblNewLabel);
		detail_5L_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount = "5_liter";
				SelectMilk();
				SelectTaste select_taste_page = new SelectTaste(milk_type, disinfection_type, product_form, amount);
				select_taste_page.setVisible(true);
				setVisible(false);

			}
		});
		lblNewLabel.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\liter.jpg").getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_DEFAULT)));
		

		
	
		

		
		
		
	}
	
}