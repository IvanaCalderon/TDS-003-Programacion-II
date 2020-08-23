package windowDesing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class customerWindow {

	JFrame frameCustomer;
		private  JTable table; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customerWindow window = new customerWindow();
					window.frameCustomer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public customerWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameCustomer = new JFrame();
		frameCustomer.setBounds(521, 472,602,359);
		frameCustomer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameCustomer.getContentPane().setLayout(null);
		frameCustomer.setLocation(400,150);
		
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setBounds(10, 22, 46, 14);
		frameCustomer.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 36, 557, 9);
		frameCustomer.getContentPane().add(separator);
		
		table = new JTable();
		Object[] columns = {"Name","Descripction","Price"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        
        
        table.setModel(model);
        
        
        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);
        table.setRowHeight(30);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 47, 557, 221);
		
		
        frameCustomer.getContentPane().add(scrollPane);
        
        JButton btnNewButton = new JButton("Back");
        btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				windowsMaker window = new windowsMaker();
				window.frame.setVisible(true);
				frameCustomer.dispose();
			}});
        btnNewButton.setBounds(478, 282, 89, 23);
        frameCustomer.getContentPane().add(btnNewButton);
		
        Object[] row = new Object[3];
        Object[] row01 = new Object[3];
        row01[0] = "Burguer";
        row01[1] = "tomato, double cheese";
        row01[2] = "$200";
        
        Object[] row02 = new Object[3];
        row02[0] = "Pizza";
        row02[1] = "bacon, mushroom,";
        row02[2] = "$500";
        
        Object[] row03 = new Object[3];
        row03[0] = "Lasagna";
        row03[1] = "bechamel, chicken,";
        row03[2] = "$300";
        
        Object[] row04 = new Object[3];
        row04[0] = "Pasta";
        row04[1] = "cheese, garlic,";
        row04[2] = "$300";
        
        Object[] row05 = new Object[3];
        row05[0] = "Coffe";
        row05[1] = "Milk, Cinnamon";
        row05[2] = "$150";
        
        model.addRow(row01);
        model.addRow(row02);
        model.addRow(row03);
        model.addRow(row04);
        model.addRow(row05);
		
	}
}
