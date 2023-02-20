package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import java.awt.Color;


import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.UIManager;


public class HomePage extends JFrame {

	private JPanel contentPane;


	private void LabelSetting(JPanel contentPane) {
		JLabel MilkShopTitile = new JLabel("MILK SHOP");
		MilkShopTitile.setBounds(353, 108, 572, 120);
		contentPane.add(MilkShopTitile);
		MilkShopTitile.setHorizontalAlignment(SwingConstants.CENTER);
		MilkShopTitile.setFont(new Font("Tahoma", Font.BOLD, 99));
		
		JPanel DividerLine = new JPanel();
		DividerLine.setBackground(Color.BLACK);
		DividerLine.setBounds(347, 220, 600, 8);
		contentPane.add(DividerLine);
		JLabel Group07Label = new JLabel("By Group 07");
		Group07Label.setFont(new Font("Tahoma", Font.BOLD, 40));
		Group07Label.setBounds(520, 230, 248, 49);
		contentPane.add(Group07Label);
		
		JLabel QuoteLabel = new JLabel("\"Drinking Milk is better that drinking Alcohol\"");
		QuoteLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		QuoteLabel.setBounds(340, 289, 607, 49);
		contentPane.add(QuoteLabel);
		
		
		JLabel SemanticWebLabel = new JLabel("523415 Semantic Webs");
		SemanticWebLabel.setForeground(Color.WHITE);
		SemanticWebLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		SemanticWebLabel.setBounds(10, 633, 346, 41);
		contentPane.add(SemanticWebLabel);
		
	}
	
	private void HomePageButtonSetting(JPanel contentPane) {
		
		
		JButton VisitShopButton = new JButton("Visit Shop");
		VisitShopButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DisplayFrame page = new DisplayFrame();
				
				 // Show the new page and hide the current page
		        page.setVisible(true);
		        setVisible(false);
			}
		});
		VisitShopButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		VisitShopButton.setBounds(422, 382, 197, 57);
		contentPane.add(VisitShopButton);
		
		JButton CloseButton = new JButton("Close");
		CloseButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		CloseButton.setBackground(Color.RED);
		CloseButton.setOpaque(true);
		CloseButton.setBorderPainted(false);
		CloseButton.setBounds(655, 382, 175, 57);
		CloseButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                SwingUtilities.getWindowAncestor(contentPane).dispose();
	            }
	        });
		contentPane.add(CloseButton);
		
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public HomePage(){
		setTitle("Milk Shop");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		HomePageButtonSetting(contentPane);
		LabelSetting(contentPane);
		JPanel WhiteOpacityBackground = new JPanel();
		WhiteOpacityBackground.setOpaque(true); // make the panel transparent
		Color bgColor = new Color(255, 255, 255, 128); // create a color with 50% opacity
		WhiteOpacityBackground.setBackground(bgColor); // set the background color of the panel

		WhiteOpacityBackground.setBounds(0, 0, 1266, 484);
		contentPane.add(WhiteOpacityBackground);

		JLabel HomePageBackground = new JLabel("");
		HomePageBackground.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\Milk_background3.jpg"));
		HomePageBackground.setBounds(0, 0, 1266, 484);

		contentPane.add(HomePageBackground);
		
		JPanel FooterPanel = new JPanel();
		FooterPanel.setBackground(Color.GRAY);
		FooterPanel.setBounds(0, 481, 1280, 720);
		contentPane.add(FooterPanel);

		
		
//		 BufferedImage logoImage = ImageIO.read(new File("\"C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\shop_logo.png\""));

		
		
		
	
		
		
		
	}
}
