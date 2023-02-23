package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class SelectType extends JFrame {

	private JPanel contentPane;
	private String milk_type;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public SelectType() {
		setTitle("SelectType");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("ต้องการนมที่ผลิตจาก สัตว์ หรือ พืช ?");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(330, 24, 588, 34);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel);
		
		JButton AnimalButton = new JButton("สัตว์");
		AnimalButton.setBorderPainted(false);
		AnimalButton.setBackground(new Color(255, 204, 51));
		AnimalButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		AnimalButton.setBounds(382, 86, 144, 50);
		contentPane.add(AnimalButton);
		
		JButton PlantButton = new JButton("พืช");
		PlantButton.setBorderPainted(false);
		PlantButton.setBackground(new Color(102, 255, 0));
		PlantButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		PlantButton.setBounds(613, 86, 144, 50);
		contentPane.add(PlantButton);
		
		
		JPanel animal = new JPanel();
		animal.setBackground(new Color(255, 255, 255));
		animal.setBounds(0, 146, 1295, 537);
		contentPane.add(animal);
		animal.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(195, 17, 0, 0);
		animal.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setBounds(200, 17, 0, 0);
		animal.add(lblNewLabel_1_1);
		
		JRadioButton AnimalRadioButton_1 = new JRadioButton("ควาย");
		AnimalRadioButton_1.setForeground(new Color(0, 0, 0));
		AnimalRadioButton_1.setBackground(new Color(255, 255, 255));
		AnimalRadioButton_1.setBounds(84, 86, 119, 41);
		AnimalRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		animal.add(AnimalRadioButton_1);
		
		JRadioButton AnimalRadioButton = new JRadioButton("วัว");
		AnimalRadioButton.setBackground(new Color(255, 255, 255));
		AnimalRadioButton.setForeground(new Color(0, 0, 0));
		AnimalRadioButton.setBounds(422, 86, 79, 41);
		AnimalRadioButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		animal.add(AnimalRadioButton);
		
		JRadioButton AnimalRadioButton_2 = new JRadioButton("แพะ");
		AnimalRadioButton_2.setForeground(new Color(0, 0, 0));
		AnimalRadioButton_2.setBackground(new Color(255, 255, 255));
		AnimalRadioButton_2.setBounds(729, 90, 88, 41);
		AnimalRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		animal.add(AnimalRadioButton_2);
		
		JRadioButton AnimalRadioButton_2_1 = new JRadioButton("แกะ");
		AnimalRadioButton_2_1.setForeground(new Color(0, 0, 0));
		AnimalRadioButton_2_1.setBackground(new Color(255, 255, 255));
		AnimalRadioButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		AnimalRadioButton_2_1.setBounds(1052, 88, 88, 45);
		animal.add(AnimalRadioButton_2_1);
		
		AnimalRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JRadioButton plantButton = (JRadioButton) e.getSource();
				if (plantButton.isSelected()) {
					milk_type = "buffalo";
					AnimalRadioButton.setSelected(false);
					AnimalRadioButton_2.setSelected(false);
					AnimalRadioButton_2_1.setSelected(false);

				}
			}
		});
		
		
		AnimalRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JRadioButton plantButton = (JRadioButton) e.getSource();
				if (plantButton.isSelected()) {
					milk_type = "cow";
					AnimalRadioButton_1.setSelected(false);
					AnimalRadioButton_2.setSelected(false);
					AnimalRadioButton_2_1.setSelected(false);
				}
			}
		});
		
		AnimalRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JRadioButton plantButton = (JRadioButton) e.getSource();
				if (plantButton.isSelected()) {
					milk_type = "goat";
					AnimalRadioButton.setSelected(false);
					AnimalRadioButton_1.setSelected(false);
					AnimalRadioButton_2_1.setSelected(false);
				}
			}
		});
		AnimalRadioButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JRadioButton plantButton = (JRadioButton) e.getSource();
				if (plantButton.isSelected()) {
					milk_type = "sheep";
					AnimalRadioButton.setSelected(false);
					AnimalRadioButton_1.setSelected(false);
					AnimalRadioButton_2.setSelected(false);
				}
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(367, 17, 0, 0);
		animal.add(lblNewLabel_1);
       
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(10, 156, 268, 244);
		animal.add(lblNewLabel_4);
		//lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Jajar\\Documents\\Learning\\SEMETIC\\vecteezy_cute-buffalo-head-in-flat-style_9203196.jpg"));
		lblNewLabel_4.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\vecteezy_cute-buffalo-head-in-flat-style_9203196.jpg").getImage().getScaledInstance(lblNewLabel_4.getWidth(), lblNewLabel_4.getHeight(), Image.SCALE_DEFAULT)));

		JLabel lblNewLabel_5 = new JLabel("");
		//lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Jajar\\Documents\\Learning\\SEMETIC\\แพะ.jpg"));
		lblNewLabel_5.setBounds(619, 156, 308, 244);
		animal.add(lblNewLabel_5);
		lblNewLabel_5.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\goat-face-bovine-farm-cartoon-animal-vector-29067944.jpg").getImage().getScaledInstance(lblNewLabel_5.getWidth(), lblNewLabel_5.getHeight(), Image.SCALE_DEFAULT)));

		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\istockphoto-1256233718-612x612.jpg"));
		lblNewLabel_6.setBounds(290, 156, 319, 244);
		animal.add(lblNewLabel_6);
		lblNewLabel_6.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\istockphoto-1256233718-612x612.jpg").getImage().getScaledInstance(lblNewLabel_6.getWidth(), lblNewLabel_6.getHeight(), Image.SCALE_DEFAULT)));
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\cute-cartoon-sheep-vector-19987664.jpg"));
		lblNewLabel_7.setBounds(943, 156, 297, 244);
		animal.add(lblNewLabel_7);
		lblNewLabel_7.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\cute-cartoon-sheep-vector-19987664.jpg").getImage().getScaledInstance(lblNewLabel_7.getWidth(), lblNewLabel_7.getHeight(), Image.SCALE_DEFAULT)));
	
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setOpaque(true);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(102, 153, 255));
		btnNewButton.setBounds(1063, 463, 178, 45);
		animal.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 204, 255));
		panel.setBounds(0, 17, 119, 26);
		animal.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 204, 255));
		panel_1.setBounds(214, 17, 1071, 26);
		animal.add(panel_1);
		
		JLabel lblNewLabel_8 = new JLabel("สัตว์");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_8.setBounds(139, 0, 109, 55);
		animal.add(lblNewLabel_8);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (milk_type == null) {
					JOptionPane.showMessageDialog(null,"Please select milk type"); 
				} else {
					DisinfectionSelect disinfection_select_page = new DisinfectionSelect(milk_type);
					// Show the new page and hide the current page
					disinfection_select_page.setVisible(true);
					setVisible(false);
				}
			}
		});

		animal.setVisible(false);
		
		
		JPanel plant = new JPanel();
		plant.setBackground(new Color(255, 255, 255));
		plant.setBounds(0, 146, 1284, 537);
		contentPane.add(plant);
		plant.setLayout(null);
		
		JLabel plantLabel_1_1 = new JLabel("");
		plantLabel_1_1.setBounds(139, 17, 0, 0);
		plant.add(plantLabel_1_1);
		
		JRadioButton plantRadioButton_1 = new JRadioButton("อัลมอนด์");
		plantRadioButton_1.setBackground(new Color(255, 255, 255));
		plantRadioButton_1.setForeground(new Color(0, 0, 0));
		plantRadioButton_1.setBounds(137, 109, 153, 33);
		plantRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		plant.add(plantRadioButton_1);
		
		JRadioButton plantRadioButton = new JRadioButton("ข้าวโพด");
		plantRadioButton.setForeground(new Color(0, 0, 0));
		plantRadioButton.setBackground(new Color(255, 255, 255));
		plantRadioButton.setBounds(448, 110, 139, 33);
		plantRadioButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		plant.add(plantRadioButton);
		
		
		JRadioButton plantRadioButton_2 = new JRadioButton("ถั่วเหลือง");
		plantRadioButton_2.setBackground(new Color(255, 255, 255));
		plantRadioButton_2.setForeground(new Color(0, 0, 0));
		plantRadioButton_2.setBounds(693, 108, 153, 33);
		plantRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		plant.add(plantRadioButton_2);
		
		
		JLabel plantLabel_1 = new JLabel("");
		plantLabel_1.setBounds(394, 17, 0, 0);
		plant.add(plantLabel_1);
		
		JRadioButton plantRadioButton_3 = new JRadioButton("ข้าวสาลี");
		plantRadioButton_3.setForeground(new Color(0, 0, 0));
		plantRadioButton_3.setBackground(new Color(255, 255, 255));
		plantRadioButton_3.setBounds(967, 111, 178, 33);
		plantRadioButton_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		plant.add(plantRadioButton_3);
		
		plantRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JRadioButton plantButton = (JRadioButton) e.getSource();
				if (plantButton.isSelected()) {
					System.out.println("Almond");
					milk_type = "almond";
					plantRadioButton.setSelected(false);
					plantRadioButton_2.setSelected(false);
					plantRadioButton_3.setSelected(false);

				}
			}
		});
		
		
		plantRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JRadioButton plantButton = (JRadioButton) e.getSource();
				if (plantButton.isSelected()) {
					System.out.println("Corn");
					milk_type = "corn";

					plantRadioButton_1.setSelected(false);
					plantRadioButton_2.setSelected(false);
					plantRadioButton_3.setSelected(false);
				}
			}
		});
		
		plantRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JRadioButton plantButton = (JRadioButton) e.getSource();
				if (plantButton.isSelected()) {
					System.out.println("Soy");
					milk_type = "soy";

					plantRadioButton.setSelected(false);
					plantRadioButton_1.setSelected(false);
					plantRadioButton_3.setSelected(false);
				}
			}
		});
		plantRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JRadioButton plantButton = (JRadioButton) e.getSource();
				if (plantButton.isSelected()) {
					System.out.println("Wheat");
					milk_type = "wheat";

					plantRadioButton.setSelected(false);
					plantRadioButton_1.setSelected(false);
					plantRadioButton_2.setSelected(false);
				}
			}
		});
		
		JLabel Almond = new JLabel("");
		Almond.setBounds(74, 157, 287, 235);
		plant.add(Almond);
		Almond.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\almond.jpg").getImage().getScaledInstance(Almond.getWidth(), Almond.getHeight(), Image.SCALE_DEFAULT)));
		
		JLabel Corn = new JLabel("");
		Corn.setBounds(399, 167, 263, 235);
		plant.add(Corn);
		Corn.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\corn.jpg").getImage().getScaledInstance(Corn.getWidth(), Corn.getHeight(), Image.SCALE_DEFAULT)));
		
		JLabel Soy = new JLabel("");
		Soy.setBounds(639, 170, 263, 235);
		plant.add(Soy);
		Soy.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\soy.jpg").getImage().getScaledInstance(Soy.getWidth(), Soy.getHeight(), Image.SCALE_DEFAULT)));
		
		JLabel Wheat = new JLabel("");
		Wheat.setBounds(930, 167, 243, 235);
		plant.add(Wheat);
		Wheat.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\SEMENTIC-WEBS\\Images\\r.jpg").getImage().getScaledInstance(Wheat.getWidth(), Wheat.getHeight(), Image.SCALE_DEFAULT)));
        
		JButton NextButton = new JButton("Next");
		NextButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		NextButton.setForeground(new Color(255, 255, 255));
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (milk_type == null) {
					JOptionPane.showMessageDialog(null,"Please select milk type"); 
				} else {
					DisinfectionSelect disinfection_select_page = new DisinfectionSelect(milk_type);
					// Show the new page and hide the current page
					disinfection_select_page.setVisible(true);
					setVisible(false);
				}
			}
		});
		NextButton.setOpaque(true);
		NextButton.setBorderPainted(false);
		NextButton.setBackground(new Color(102, 153, 255));
		NextButton.setBounds(1063, 463, 178, 45);
		plant.add(NextButton);
		
		JPanel HeaderPanel1_1 = new JPanel();
		HeaderPanel1_1.setBackground(new Color(153, 204, 255));
		HeaderPanel1_1.setBounds(-1, 11, 127, 34);
		plant.add(HeaderPanel1_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setForeground(new Color(102, 204, 255));
		lblNewLabel_3_2.setBackground(new Color(102, 204, 255));
		HeaderPanel1_1.add(lblNewLabel_3_2);
		
		JLabel Planelabel = new JLabel("พืช");
		Planelabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		Planelabel.setBounds(139, 8, 75, 45);
		plant.add(Planelabel);
		
		JPanel HeaderPanel1_1_1 = new JPanel();
		HeaderPanel1_1_1.setBackground(new Color(153, 204, 255));
		HeaderPanel1_1_1.setBounds(223, 11, 1101, 34);
		plant.add(HeaderPanel1_1_1);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("");
		lblNewLabel_3_2_1.setForeground(new Color(102, 204, 255));
		lblNewLabel_3_2_1.setBackground(new Color(102, 204, 255));
		HeaderPanel1_1_1.add(lblNewLabel_3_2_1);
		
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (milk_type == null) {
					JOptionPane.showMessageDialog(null,"Please select milk type"); 
				} else {
					DisinfectionSelect disinfection_select_page = new DisinfectionSelect(milk_type);
					// Show the new page and hide the current page
					disinfection_select_page.setVisible(true);
					setVisible(false);
				}		
			}
		});

		plant.setVisible(false);
		PlantButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
		        	plant.setVisible(true);
		        	animal.setVisible(false);
		            // do something if check box is selected
		        
		            // check box is unselected, do something else
		        
				
			}
		});
		AnimalButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				plant.setVisible(false);
	        	animal.setVisible(true);
				
			}
		});
		
		JPanel HeaderPanel1 = new JPanel();
		HeaderPanel1.setBackground(new Color(153, 204, 255));
		HeaderPanel1.setBounds(0, 24, 308, 34);
		contentPane.add(HeaderPanel1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		HeaderPanel1.add(lblNewLabel_3);
		lblNewLabel_3.setBackground(new Color(102, 204, 255));
		lblNewLabel_3.setForeground(new Color(102, 204, 255));
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Jajar\\Documents\\Learning\\SEMETIC\\1106299-illustration-minimalism-text-logo-cartoon-flag-cookies-brand-milk-screenshot-font.jpg"));
		
		JPanel HeaderPanel2 = new JPanel();
		HeaderPanel2.setBackground(new Color(153, 204, 255));
		HeaderPanel2.setBounds(928, 24, 356, 34);
		contentPane.add(HeaderPanel2);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setForeground(new Color(102, 204, 255));
		lblNewLabel_3_1.setBackground(new Color(102, 204, 255));
		HeaderPanel2.add(lblNewLabel_3_1);
		
	}		
}