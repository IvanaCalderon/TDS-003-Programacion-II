package windowDesing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.Font;

public class Login {

	
	JFrame frameLogin;
	private JTextField textField;
	private JPasswordField passwordField;
	
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameLogin = new JFrame();
		frameLogin.getContentPane().setBackground(new Color(255, 255, 255));
		frameLogin.getContentPane().setLayout(null);
		frameLogin.setLocation(400,800);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(25, 46, 65, 14);
		frameLogin.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(100, 43, 122, 20);
		frameLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(100, 86, 122, 20);
		frameLogin.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(25, 89, 65, 14);
		frameLogin.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Sitka Subheading", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(47, 117, 187, 14);
		frameLogin.getContentPane().add(lblNewLabel_2);
		frameLogin.setBounds(100, 100, 303, 239);
		frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				String User = textField.getText();
				String Pass = passwordField.getText();
				
				if (User.equals("IC") && Pass.equals("1234")) {
					
					managerWindow window = new managerWindow();
					window.frameManager.setVisible(true);
					frameLogin.dispose();
				}
				else {
					lblNewLabel_2.setText("Invalid Username or Password");
				}
					
			}
		});
		btnNewButton.setToolTipText("");
		btnNewButton.setBounds(45, 147, 65, 23);
		frameLogin.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				windowsMaker window = new windowsMaker();
				window.frame.setVisible(true);
				frameLogin.dispose();
			}
			
		});
		btnNewButton_1.setBounds(140, 147, 89, 23);
		frameLogin.getContentPane().add(btnNewButton_1);
		
		
	}
}
