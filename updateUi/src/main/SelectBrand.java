package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class SelectBrand extends JFrame {

	private JPanel contentPane;
	private String milk_type;
	private String disinfection_type;
	private String product_form;
	private String amount;
	private String taste;
	private String brand;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	private void SelectMilk() {
		ShowResult result_page = new ShowResult(milk_type, disinfection_type, product_form, amount, taste, brand);
		result_page.setVisible(true);
		dispose();
	}
	
	public SelectBrand(String milk_type, String disinfection_type, String product_form, String amount, String taste) {
		this.milk_type = milk_type;
		this.disinfection_type = disinfection_type;
		this.product_form = product_form;
		this.amount = amount;
		this.taste = taste;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel BrandLabel = new JLabel("กรุณาเลือกแบรนด์");
		BrandLabel.setForeground(new Color(0, 0, 0));
		BrandLabel.setBounds(551, 34, 251, 37);
		BrandLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(BrandLabel);
		
		JButton ChitraladaButton = new JButton("Chitralada");
		ChitraladaButton.setForeground(new Color(0, 0, 0));
		ChitraladaButton.setBorderPainted(false);
		ChitraladaButton.setBackground(new Color(204, 153, 0));
		ChitraladaButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		ChitraladaButton.setBounds(541, 439, 179, 44);
		contentPane.add(ChitraladaButton);
		ChitraladaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				brand = "chitralada";
				SelectMilk();
			}
		});
		
		JButton DutchMilkButton = new JButton("Dutch Milk");
		DutchMilkButton.setBorderPainted(false);
		DutchMilkButton.setBackground(new Color(255, 153, 102));
		DutchMilkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				brand = "dutch_milk";
				SelectMilk();
			}
		});
		DutchMilkButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		DutchMilkButton.setBounds(541, 363, 185, 44);
		contentPane.add(DutchMilkButton);
		
		JButton ForemostButton = new JButton("Foremost");
		ForemostButton.setBorderPainted(false);
		ForemostButton.setBackground(new Color(153, 255, 51));
		ForemostButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		ForemostButton.setBounds(674, 521, 179, 44);
		contentPane.add(ForemostButton);
		ForemostButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			brand = "foremost";
			SelectMilk();
		}
	});
		
		JButton btnMeji = new JButton("Meji");
		btnMeji.setBorderPainted(false);
		btnMeji.setBackground(new Color(204, 102, 255));
		btnMeji.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMeji.setBounds(781, 363, 185, 44);
		contentPane.add(btnMeji);
		btnMeji.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			brand = "meji";
			SelectMilk();
		}
	});
		
		JButton btnMmilk = new JButton("Mmilk");
		btnMmilk.setBorderPainted(false);
		btnMmilk.setBackground(new Color(102, 255, 255));
		btnMmilk.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMmilk.setBounds(85, 363, 179, 44);
		contentPane.add(btnMmilk);
		btnMmilk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				brand = "mmilk";
				SelectMilk();
			}
		});
		
		
		JButton btnMurrah = new JButton("Murrah");
		btnMurrah.setBorderPainted(false);
		btnMurrah.setBackground(new Color(102, 255, 204));
		btnMurrah.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMurrah.setBounds(303, 363, 185, 44);
		contentPane.add(btnMurrah);
		btnMurrah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				brand = "murrah";
				SelectMilk();
			}
		});
		
		JButton btnNestle = new JButton("Nestle");
		btnNestle.setBorderPainted(false);
		btnNestle.setBackground(new Color(255, 204, 0));
		btnNestle.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNestle.setBounds(85, 439, 179, 44);
		contentPane.add(btnNestle);
		btnNestle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				brand = "nestle";
				SelectMilk();
				
			}
		});
		
		
		JButton btnNongpho = new JButton("Nongpho");
		btnNongpho.setBorderPainted(false);
		btnNongpho.setBackground(new Color(153, 204, 255));
		btnNongpho.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNongpho.setBounds(303, 439, 185, 44);
		contentPane.add(btnNongpho);
		btnNongpho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				brand = "nongpho";
				SelectMilk();
			}
		});
		
		
		JButton btnSirichai = new JButton("Sirichai");
		btnSirichai.setBorderPainted(false);
		btnSirichai.setBackground(new Color(255, 255, 0));
		btnSirichai.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSirichai.setBounds(1004, 363, 179, 44);
		contentPane.add(btnSirichai);
		btnSirichai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				brand = "sirichai";
				SelectMilk();
			}
		});
		
		JButton btnThaiDenmark = new JButton("Thai Denmark");
		btnThaiDenmark.setForeground(new Color(255, 255, 255));
		btnThaiDenmark.setBorderPainted(false);
		btnThaiDenmark.setBackground(new Color(204, 0, 153));
		btnThaiDenmark.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnThaiDenmark.setBounds(781, 439, 185, 44);
		contentPane.add(btnThaiDenmark);
		btnThaiDenmark.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				brand = "thai_denmark";
				SelectMilk();
			}
		});
		
		JButton btnYanaFarm = new JButton("Yana Farm");
		btnYanaFarm.setBorderPainted(false);
		btnYanaFarm.setBackground(new Color(0, 204, 255));
		btnYanaFarm.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnYanaFarm.setBounds(1004, 439, 179, 44);
		contentPane.add(btnYanaFarm);
		btnYanaFarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				brand = "yana_farm";
				SelectMilk();
			}
		});
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Jajar\\Documents\\Learning\\SEMETIC\\White_Background_(To_id_screen_dust_during_cleanup).jpg"));
		lblNewLabel_1.setBounds(521, 23, 306, 55);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setBounds(0, 0, 1295, 722);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\332628790_1373582603423366_3791753411426047467_n.jpg").getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_DEFAULT)));
		
	}

}

//package UI;
//
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//import javax.swing.JLabel;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.FlowLayout;
//import javax.swing.JButton;
//
//public class SelectBrand extends JFrame {
//
//	private JPanel contentPane;
//	private String milk_type;
//	private String disinfection_type;
//	private String product_form;
//	private String amount;
//	private String taste;
//	private String brand;
//
//	/**
//	 * Launch the application.
//	 */
//	/**
//	 * Create the frame.
//	 */
//	private void SelectMilk() {
//		ShowResult result_page = new ShowResult(milk_type, disinfection_type, product_form, amount, taste, brand);
//		result_page.setVisible(true);
//		dispose();
//	}
//	
//	public SelectBrand(String milk_type, String disinfection_type, String product_form, String amount, String taste) {
//		
//		this.milk_type = milk_type;
//		this.disinfection_type = disinfection_type;
//		this.product_form = product_form;
//		this.amount = amount;
//		this.taste = taste;
//		
//		
//		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(0, 0, 1280, 720);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
//		
//		JLabel BrandLabel = new JLabel("กรุณาเลือกแบรนด์");
//		BrandLabel.setBounds(513, 10, 251, 37);
//		BrandLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
//		contentPane.add(BrandLabel);
//		
//		JButton ChitraladaButton = new JButton("Chitralada");
//		ChitraladaButton.setFont(new Font("Tahoma", Font.BOLD, 20));
//		ChitraladaButton.setBounds(68, 199, 179, 44);
//		contentPane.add(ChitraladaButton);
//		
//		ChitraladaButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				brand = "chitralada";
//				SelectMilk();
//			}
//		});
//		JButton DutchMilkButton = new JButton("Dutch Milk");
//		DutchMilkButton.setFont(new Font("Tahoma", Font.BOLD, 20));
//		DutchMilkButton.setBounds(285, 199, 185, 44);
//		contentPane.add(DutchMilkButton);
//		DutchMilkButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				brand = "dutch_milk";
//				SelectMilk();
//			}
//		});
//		
//		JButton ForemostButton = new JButton("Foremost");
//		ForemostButton.setFont(new Font("Tahoma", Font.BOLD, 20));
//		ForemostButton.setBounds(68, 281, 179, 44);
//		contentPane.add(ForemostButton);
//		ForemostButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				brand = "foremost";
//				SelectMilk();
//			}
//		});
//		JButton btnMeji = new JButton("Meji");
//		btnMeji.setFont(new Font("Tahoma", Font.BOLD, 20));
//		btnMeji.setBounds(285, 281, 185, 44);
//		contentPane.add(btnMeji);
//		btnMeji.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				brand = "meji";
//				SelectMilk();
//			}
//		});
//		
//		JButton btnMmilk = new JButton("Mmilk");
//		btnMmilk.setFont(new Font("Tahoma", Font.BOLD, 20));
//		btnMmilk.setBounds(68, 363, 179, 44);
//		contentPane.add(btnMmilk);
//		btnMmilk.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				brand = "mmilk";
//				SelectMilk();
//			}
//		});
//		
//		JButton btnMurrah = new JButton("Murrah");
//		btnMurrah.setFont(new Font("Tahoma", Font.BOLD, 20));
//		btnMurrah.setBounds(285, 363, 185, 44);
//		contentPane.add(btnMurrah);
//		btnMurrah.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				brand = "murrah";
//				SelectMilk();
//			}
//		});
//		
//		JButton btnNestle = new JButton("Nestle");
//		btnNestle.setFont(new Font("Tahoma", Font.BOLD, 20));
//		btnNestle.setBounds(68, 439, 179, 44);
//		contentPane.add(btnNestle);
//		btnNestle.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				brand = "nestle";
//				SelectMilk();
//			}
//		});
//		
//		JButton btnNongpho = new JButton("Nongpho");
//		btnNongpho.setFont(new Font("Tahoma", Font.BOLD, 20));
//		btnNongpho.setBounds(285, 439, 185, 44);
//		contentPane.add(btnNongpho);
//		btnNongpho.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				brand = "nongpho";
//				SelectMilk();
//			}
//		});
//		
//		JButton btnSirichai = new JButton("Sirichai");
//		btnSirichai.setFont(new Font("Tahoma", Font.BOLD, 20));
//		btnSirichai.setBounds(68, 518, 179, 44);
//		contentPane.add(btnSirichai);
//		btnSirichai.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				brand = "sirichai";
//				SelectMilk();
//			}
//		});
//		
//		
//		JButton btnThaiDenmark = new JButton("Thai Denmark");
//		btnThaiDenmark.setFont(new Font("Tahoma", Font.BOLD, 20));
//		btnThaiDenmark.setBounds(285, 518, 185, 44);
//		contentPane.add(btnThaiDenmark);
//		btnThaiDenmark.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				brand = "thai_denmark";
//				SelectMilk();
//			}
//		});
//		
//		
//		JButton btnYanaFarm = new JButton("Yana Farm");
//		btnYanaFarm.setFont(new Font("Tahoma", Font.BOLD, 20));
//		btnYanaFarm.setBounds(68, 592, 179, 44);
//		contentPane.add(btnYanaFarm);
//		btnYanaFarm.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				brand = "yana_farm";
//				SelectMilk();
//			}
//		});
//	}
//
//}
