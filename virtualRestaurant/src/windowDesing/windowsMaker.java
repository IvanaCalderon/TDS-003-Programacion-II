package windowDesing;

import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;


import windowDesing.Login;

public class windowsMaker {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windowsMaker window = new windowsMaker();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public windowsMaker() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 67));
		frame.getContentPane().setBackground(new Color(255, 228, 225));
		frame.getContentPane().setLayout(null);
		frame.setLocation(800, 400);
		
		JButton btnNewButton = new JButton("Manager");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Login window = new Login();
				window.frameLogin.setVisible(true);
				frame.dispose();
				
			}
		});
		btnNewButton.setBounds(97, 161, 110, 33);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("SELECT ONE CHOICE");
		lblNewLabel_1.setBounds(166, 136, 178, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("Customer");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				customerWindow window = new customerWindow();
				window.frameCustomer.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_2.setBounds(217, 161, 110, 33);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("\u00A1WELCOME!");
		lblNewLabel.setBounds(107, 61, 237, 47);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setFont(new Font("Sitka Heading", Font.ITALIC, 43));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
}
