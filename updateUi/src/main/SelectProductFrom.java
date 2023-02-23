package UI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.Box;
import javax.swing.border.TitledBorder;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class SelectProductFrom extends JFrame {

	private JPanel contentPane;
	private String milk_type;
	private String disinfection_type;
	private String product_form;
	private JTextField textField_1;
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SelectProductFrom frame = new SelectProductFrom();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public SelectProductFrom(String milk_type, String disinfection_type) {
		this.milk_type = milk_type;
		this.disinfection_type = disinfection_type;
		System.out.println("-------------------------------------------------------");
		System.out.println(milk_type);
		System.out.println(disinfection_type);
		System.out.println("-------------------------------------------------------");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 204, 255));
		panel.setBounds(-13, 46, 445, 25);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 204, 255));
		panel_1.setBounds(864, 46, 445, 25);
		contentPane.add(panel_1);

		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		textField_1.setText("กรุณาเลือกรูปแบบผลิตภัณท์");
		textField_1.setBounds(442, 32, 400, 52);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("กล่อง");
		rdbtnNewRadioButton_2.setBackground(new Color(255, 204, 255));
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNewRadioButton_2.setLocation(287, 100);
		rdbtnNewRadioButton_2.setBounds(770, 173, 82, 37);
		contentPane.add(rdbtnNewRadioButton_2);
		
		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ขวด,แกลลอน");
		rdbtnNewRadioButton.setBackground(new Color(255, 204, 255));
		rdbtnNewRadioButton.setSize(120, 50);
		rdbtnNewRadioButton.setLocation(287, 100);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNewRadioButton.setBounds(407, 173, 170, 37);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JRadioButton Button = (JRadioButton) e.getSource();
				if (Button.isSelected()) {
					product_form = "box";
					rdbtnNewRadioButton.setSelected(false);
				}
			}
		});
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JRadioButton Button = (JRadioButton) e.getSource();
				if (Button.isSelected()) {
					product_form = "bottle";
					rdbtnNewRadioButton_2.setSelected(false);
				}
			}
		});
		
		JLabel milkbottle = new JLabel("");
		milkbottle.setBounds(328, 237, 330, 311);
		contentPane.add(milkbottle);
		//milkbottle.setIcon(new ImageIcon("C:\\Users\\Jajar\\Downloads\\milkbottle .jpg"));
		milkbottle.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\bottle.jpg").getImage().getScaledInstance(milkbottle.getWidth(), milkbottle.getHeight(), Image.SCALE_DEFAULT)));

		JButton NextButton = new JButton("Next");
		NextButton.setForeground(new Color(255, 255, 255));
		NextButton.setBackground(new Color(255, 0, 255));
		NextButton.setBorderPainted(false);
		NextButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		NextButton.setBounds(1062, 584, 137, 45);
		contentPane.add(NextButton);
		
		 
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println(milk_type);
				System.out.println(disinfection_type);
				System.out.println(product_form);
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				
				SelectAmount select_amount_page = new SelectAmount(milk_type, disinfection_type, product_form);
				select_amount_page.setVisible(true);
				setVisible(false);
			}
		});
		JLabel MilkBox = new JLabel("New label");
		MilkBox.setBounds(746, 237, 191, 311);
		contentPane.add(MilkBox);
		MilkBox.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\milkbox .jpg"));

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(273, 131, 747, 444);
		contentPane.add(lblNewLabel_1);
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 1280, 717);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\a923762fe695158722275a52f3bd6ba8.jpg").getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_DEFAULT)));
		

		
		
		
		
		
	}
}