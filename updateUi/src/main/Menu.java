package main;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("เลือกเมนู (Select Menu)");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(419, 10, 480, 58);
		contentPane.add(lblNewLabel);
		
		JLabel JuiceIcon = new JLabel("");
		JuiceIcon.setBounds(109, 161, 250, 250);
		contentPane.add(JuiceIcon);
		
        JuiceIcon.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\juice.png").getImage().getScaledInstance(JuiceIcon.getWidth(), JuiceIcon.getHeight(), Image.SCALE_DEFAULT)));
        
        JLabel Alcohol_Icon = new JLabel("");
        Alcohol_Icon.setBounds(520, 161, 250, 250);
        contentPane.add(Alcohol_Icon);
        Alcohol_Icon.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\alcohol.png").getImage().getScaledInstance(Alcohol_Icon.getWidth(), Alcohol_Icon.getHeight(), Image.SCALE_DEFAULT)));
        
        JLabel Milk_Icon = new JLabel("");
        Milk_Icon.setBounds(939, 161, 250, 250);
        contentPane.add(Milk_Icon);
        Milk_Icon.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\milk.png").getImage().getScaledInstance(Milk_Icon.getWidth(), Milk_Icon.getHeight(), Image.SCALE_DEFAULT)));
        
        JButton JuiceButton = new JButton("Juice");
        JuiceButton.setFont(new Font("Tahoma", Font.BOLD, 30));
        JuiceButton.setBounds(152, 431, 199, 52);
        contentPane.add(JuiceButton);
        JuiceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"No Juice");    
			}
		});
        
        JButton AlcoholButton = new JButton("Alcohol");
        AlcoholButton.setFont(new Font("Tahoma", Font.BOLD, 30));
        AlcoholButton.setBounds(547, 431, 199, 52);
        contentPane.add(AlcoholButton);
        
        AlcoholButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Stop drinking alcohol");    
			}
		});
        
        JButton MilkButton = new JButton("Milk");
        MilkButton.setFont(new Font("Tahoma", Font.BOLD, 30));
        MilkButton.setBounds(968, 431, 199, 52);
        contentPane.add(MilkButton);
        MilkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectType select_type = new SelectType();
				
				
				 // Show the new page and hide the current page
		        select_type.setVisible(true);
		        setVisible(false);
			}
		});


	}

}
