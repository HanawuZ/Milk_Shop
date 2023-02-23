package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DisinfectionSelect extends JFrame {

	private JPanel contentPane;
	private String milk_type;
	private String disinfection_type;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public DisinfectionSelect(String milk_type) {
		this.milk_type = milk_type;
		System.out.println("===================================================");
		System.out.println("You're in page Disinfection Selection");
		System.out.println(milk_type);
		System.out.println("===================================================");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(223, 232, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel DisinfectionLabel = new JLabel("เลือกรูปแบบการฆ่าเชื้อ");
		DisinfectionLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		DisinfectionLabel.setBounds(402, 0, 410, 71);
		contentPane.add(DisinfectionLabel);
		
		JLabel ImageLabel = new JLabel();
		ImageLabel.setBounds(334, 0, 58, 71);
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
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(153, 204, 255));
        panel.setBounds(-12, 25, 336, 23);
        contentPane.add(panel);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(153, 204, 255));
        panel_1.setBounds(825, 25, 522, 23);
        contentPane.add(panel_1);
        
        JPanel Background = new JPanel();
        Background.setBounds(40, 89, 1173, 555);
        contentPane.add(Background);
        Background.setLayout(null);
        
        JButton UHTButton = new JButton("UHT");
        UHTButton.setBounds(119, 359, 217, 51);
        Background.add(UHTButton);
        UHTButton.setFont(new Font("Tahoma", Font.BOLD, 30));
        
        JButton PasteurizationSelectButton = new JButton("Pasteurization");
        PasteurizationSelectButton.setBounds(467, 362, 261, 45);
        Background.add(PasteurizationSelectButton);
        PasteurizationSelectButton.setFont(new Font("Tahoma", Font.BOLD, 30));
        
        JButton SterilizationSelectButton = new JButton("Sterilization");
        SterilizationSelectButton.setBounds(828, 362, 233, 45);
        Background.add(SterilizationSelectButton);
        SterilizationSelectButton.setFont(new Font("Tahoma", Font.BOLD, 30));
        
        JLabel SterilizationLogo = new JLabel();
        SterilizationLogo.setBounds(823, 80, 250, 250);
        Background.add(SterilizationLogo);
        
        SterilizationLogo.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\steillization.png").getImage().getScaledInstance(UHTLogo.getWidth(), UHTLogo.getHeight(), Image.SCALE_DEFAULT)));
        
        SterilizationSelectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disinfection_type = "sterilization";
				SelectProductFrom product_form_page = new SelectProductFrom(milk_type, disinfection_type);
				product_form_page.setVisible(true);
				setVisible(false);
			}
		});
        
        PasteurizationSelectButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		disinfection_type = "pasteurization";
        		SelectProductFrom product_form_page = new SelectProductFrom(milk_type, disinfection_type);
        		product_form_page.setVisible(true);
        		setVisible(false);
        	}
        });
        
        UHTButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		disinfection_type = "UHT";
        		SelectProductFrom product_form_page = new SelectProductFrom(milk_type, disinfection_type);
        		product_form_page.setVisible(true);
        		setVisible(false);
        	}
        });

	}
}
