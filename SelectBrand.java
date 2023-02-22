package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JButton;

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
		BrandLabel.setBounds(513, 10, 251, 37);
		BrandLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(BrandLabel);
		
		JButton ChitraladaButton = new JButton("Chitralada");
		ChitraladaButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		ChitraladaButton.setBounds(68, 199, 179, 44);
		contentPane.add(ChitraladaButton);
		
		JButton DutchMilkButton = new JButton("Dutch Milk");
		DutchMilkButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		DutchMilkButton.setBounds(285, 199, 185, 44);
		contentPane.add(DutchMilkButton);
		
		JButton ForemostButton = new JButton("Foremost");
		ForemostButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		ForemostButton.setBounds(68, 281, 179, 44);
		contentPane.add(ForemostButton);
		
		JButton btnMeji = new JButton("Meji");
		btnMeji.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMeji.setBounds(285, 281, 185, 44);
		contentPane.add(btnMeji);
		
		JButton btnMmilk = new JButton("Mmilk");
		btnMmilk.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMmilk.setBounds(68, 363, 179, 44);
		contentPane.add(btnMmilk);
		
		JButton btnMurrah = new JButton("Murrah");
		btnMurrah.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMurrah.setBounds(285, 363, 185, 44);
		contentPane.add(btnMurrah);
		
		JButton btnNestle = new JButton("Nestle");
		btnNestle.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNestle.setBounds(68, 439, 179, 44);
		contentPane.add(btnNestle);
		
		JButton btnNongpho = new JButton("Nongpho");
		btnNongpho.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNongpho.setBounds(285, 439, 185, 44);
		contentPane.add(btnNongpho);
		
		JButton btnSirichai = new JButton("Sirichai");
		btnSirichai.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSirichai.setBounds(68, 518, 179, 44);
		contentPane.add(btnSirichai);
		
		JButton btnThaiDenmark = new JButton("Thai Denmark");
		btnThaiDenmark.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnThaiDenmark.setBounds(285, 518, 185, 44);
		contentPane.add(btnThaiDenmark);
		
		JButton btnYanaFarm = new JButton("Yana Farm");
		btnYanaFarm.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnYanaFarm.setBounds(68, 592, 179, 44);
		contentPane.add(btnYanaFarm);
	}

}
