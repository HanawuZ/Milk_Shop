package main;

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
import javax.swing.JTextField;

public class SelectProductFrom extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectProductFrom frame = new SelectProductFrom();
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
	public SelectProductFrom() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("กล่อง");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnNewRadioButton_2.setLocation(287, 100);
		rdbtnNewRadioButton_2.setBounds(435, 85, 82, 37);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ขวด,แกลลอน");
		rdbtnNewRadioButton.setSize(120, 50);
		rdbtnNewRadioButton.setLocation(287, 100);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnNewRadioButton.setBounds(79, 85, 122, 37);
		contentPane.add(rdbtnNewRadioButton);
		
		JLabel milkbottle = new JLabel("");
		milkbottle.setBounds(119, 147, 82, 202);
		contentPane.add(milkbottle);
		milkbottle.setIcon(new ImageIcon("C:\\Users\\Jajar\\Downloads\\milkbottle .jpg"));

		
		
		
		JLabel milkbox = new JLabel("");
		milkbox.setBounds(435, 147, 82, 202);
		contentPane.add(milkbox);
		milkbox.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Jajar\\Downloads\\milkbox.jpg").getImage().getScaledInstance(milkbox.getWidth(), milkbox.getHeight(), Image.SCALE_DEFAULT)));

		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Jajar\\Pictures\\Milk-splashing.jpg"));
		milkbox.setIcon(new ImageIcon("C:\\Users\\Jajar\\Downloads\\milkbox .jpg"));
		lblNewLabel.setBounds(10, 312, 636, 339);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setText("กรุณาเลือกรูปแบบผลิตภัณท์");
		textField.setBounds(218, 22, 198, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
	}
}
