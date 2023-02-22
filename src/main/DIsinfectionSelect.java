package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;

public class DIsinfectionSelect extends JFrame {

	private JPanel contentPane;
	private String milk_type;
	private String disinfection_type;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public DIsinfectionSelect(String milk_type) {
		this.milk_type = milk_type;
		System.out.println(milk_type);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(223, 232, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel DisinfectionLabel = new JLabel("เลือกรูปแบบการฆ่าเชื้อ");
		DisinfectionLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		DisinfectionLabel.setBounds(417, 10, 410, 71);
		contentPane.add(DisinfectionLabel);
		
		JButton UHTButton = new JButton("UHT");
		UHTButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		UHTButton.setBounds(205, 430, 116, 33);
		contentPane.add(UHTButton);
		
		UHTButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("UHT");
				disinfection_type = "UHT";
				SelectProductFrom product_form_page = new SelectProductFrom(milk_type, disinfection_type);
				product_form_page.setVisible(true);
				setVisible(false);
			}
		});
		
		JButton PasteurizationSelectButton = new JButton("Pasteurization");
		PasteurizationSelectButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		PasteurizationSelectButton.setBounds(530, 430, 204, 33);
		contentPane.add(PasteurizationSelectButton);
		
		PasteurizationSelectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Pasteurization");
				disinfection_type = "pasteurization";
				SelectProductFrom product_form_page = new SelectProductFrom(milk_type, disinfection_type);
				product_form_page.setVisible(true);
				setVisible(false);
			}
		});
		
		JLabel ImageLabel = new JLabel();
		ImageLabel.setBounds(349, 10, 58, 71);
		contentPane.add(ImageLabel);
		
		ImageIcon icon = new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\shop_logo.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(ImageLabel.getWidth(), ImageLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        ImageLabel.setIcon(scaledIcon);
        
        JLabel UHTLogo = new JLabel();
        UHTLogo.setBounds(137, 170, 250, 250);
        contentPane.add(UHTLogo);
        
        UHTLogo.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\dht.png").getImage().getScaledInstance(UHTLogo.getWidth(), UHTLogo.getHeight(), Image.SCALE_DEFAULT)));
        
        JLabel PasteurizationLogo = new JLabel();
        PasteurizationLogo.setBounds(507, 170, 250, 250);
        contentPane.add(PasteurizationLogo);
        
        PasteurizationLogo.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\pastuerize.jpg").getImage().getScaledInstance(UHTLogo.getWidth(), UHTLogo.getHeight(), Image.SCALE_DEFAULT)));
        
        JLabel SterilizationLogo = new JLabel();
        SterilizationLogo.setBounds(897, 170, 250, 250);
        contentPane.add(SterilizationLogo);
        
        SterilizationLogo.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\steillization.png").getImage().getScaledInstance(UHTLogo.getWidth(), UHTLogo.getHeight(), Image.SCALE_DEFAULT)));
        
        JButton SterilizationSelectButton = new JButton("Sterilization");
        SterilizationSelectButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        SterilizationSelectButton.setBounds(927, 430, 204, 33);
        contentPane.add(SterilizationSelectButton);
        
        SterilizationSelectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("sterilization");
				disinfection_type = "sterilization";
				SelectProductFrom product_form_page = new SelectProductFrom(milk_type, disinfection_type);
				product_form_page.setVisible(true);
				setVisible(false);
			}
		});

	}
}
