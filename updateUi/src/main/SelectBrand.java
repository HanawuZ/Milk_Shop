package main;

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectBrand frame = new SelectBrand();
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
	public SelectBrand() {
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
		ChitraladaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ChitraladaButton.setBorderPainted(false);
		ChitraladaButton.setBackground(new Color(204, 153, 0));
		ChitraladaButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		ChitraladaButton.setBounds(541, 439, 179, 44);
		contentPane.add(ChitraladaButton);
		
		JButton DutchMilkButton = new JButton("Dutch Milk");
		DutchMilkButton.setBorderPainted(false);
		DutchMilkButton.setBackground(new Color(255, 153, 102));
		DutchMilkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		
		JButton btnMeji = new JButton("Meji");
		btnMeji.setBorderPainted(false);
		btnMeji.setBackground(new Color(204, 102, 255));
		btnMeji.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMeji.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMeji.setBounds(781, 363, 185, 44);
		contentPane.add(btnMeji);
		
		JButton btnMmilk = new JButton("Mmilk");
		btnMmilk.setBorderPainted(false);
		btnMmilk.setBackground(new Color(102, 255, 255));
		btnMmilk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMmilk.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMmilk.setBounds(85, 363, 179, 44);
		contentPane.add(btnMmilk);
		
		JButton btnMurrah = new JButton("Murrah");
		btnMurrah.setBorderPainted(false);
		btnMurrah.setBackground(new Color(102, 255, 204));
		btnMurrah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMurrah.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMurrah.setBounds(303, 363, 185, 44);
		contentPane.add(btnMurrah);
		
		JButton btnNestle = new JButton("Nestle");
		btnNestle.setBorderPainted(false);
		btnNestle.setBackground(new Color(255, 204, 0));
		btnNestle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNestle.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNestle.setBounds(85, 439, 179, 44);
		contentPane.add(btnNestle);
		
		JButton btnNongpho = new JButton("Nongpho");
		btnNongpho.setBorderPainted(false);
		btnNongpho.setBackground(new Color(153, 204, 255));
		btnNongpho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNongpho.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNongpho.setBounds(303, 439, 185, 44);
		contentPane.add(btnNongpho);
		
		JButton btnSirichai = new JButton("Sirichai");
		btnSirichai.setBorderPainted(false);
		btnSirichai.setBackground(new Color(255, 255, 0));
		btnSirichai.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSirichai.setBounds(1004, 363, 179, 44);
		contentPane.add(btnSirichai);
		
		JButton btnThaiDenmark = new JButton("Thai Denmark");
		btnThaiDenmark.setForeground(new Color(255, 255, 255));
		btnThaiDenmark.setBorderPainted(false);
		btnThaiDenmark.setBackground(new Color(204, 0, 153));
		btnThaiDenmark.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnThaiDenmark.setBounds(781, 439, 185, 44);
		contentPane.add(btnThaiDenmark);
		
		JButton btnYanaFarm = new JButton("Yana Farm");
		btnYanaFarm.setBorderPainted(false);
		btnYanaFarm.setBackground(new Color(0, 204, 255));
		btnYanaFarm.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnYanaFarm.setBounds(1004, 439, 179, 44);
		contentPane.add(btnYanaFarm);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Jajar\\Documents\\Learning\\SEMETIC\\White_Background_(To_id_screen_dust_during_cleanup).jpg"));
		lblNewLabel_1.setBounds(521, 23, 306, 55);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setBounds(0, 0, 1295, 722);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(new ImageIcon("C:\\\\Users\\\\Jajar\\\\Documents\\\\Learning\\\\SEMETIC\\\\332628790_1373582603423366_3791753411426047467_n.jpg").getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_DEFAULT)));
		
	}

}
