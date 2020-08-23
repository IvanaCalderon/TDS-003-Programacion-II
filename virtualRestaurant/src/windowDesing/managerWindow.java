package windowDesing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class managerWindow {

	JFrame frameManager;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					managerWindow window = new managerWindow();
					window.frameManager.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public managerWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameManager = new JFrame();
		frameManager.setResizable(false);
		frameManager.setBounds(521, 472,824,334);
		frameManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameManager.getContentPane().setLayout(null);
		frameManager.setLocation(400,150);
		
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setBounds(10, 22, 46, 14);
		frameManager.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 36, 557, 9);
		frameManager.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Name: ");
		lblNewLabel_1.setBounds(594, 47, 46, 14);
		frameManager.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(594, 64, 178, 20);
		frameManager.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Description:");
		lblNewLabel_2.setBounds(594, 108, 91, 14);
		frameManager.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(594, 125, 178, 20);
		frameManager.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Price:");
		lblNewLabel_3.setBounds(594, 162, 46, 14);
		frameManager.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(594, 179, 178, 20);
		frameManager.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
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
		
		
        frameManager.getContentPane().add(scrollPane);
		
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
        
        model.addRow(row01);
        model.addRow(row02);
        model.addRow(row03);
        model.addRow(row04);
        
        
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				row[0] = textField.getText();
                row[1] = textField_1.getText();
                row[2] = textField_2.getText();
                
                
                
                model.addRow(row);
                JOptionPane.showMessageDialog( scrollPane, "Item added");
				
			}
		});
		btnNewButton.setBounds(594, 211, 80, 23);
		frameManager.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i = table.getSelectedRow();
                if(i >= 0){
                    
                    model.removeRow(i);
                    JOptionPane.showMessageDialog( scrollPane, "Item deleted");
                }
                else{
                    System.out.println("Delete Error");
                }
			}
		});
		btnNewButton_1.setBounds(692, 211, 80, 23);
		frameManager.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Logout");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				windowsMaker window = new windowsMaker();
				window.frame.setVisible(true);
				frameManager.dispose();
			}
		});
		btnNewButton_2.setBounds(596, 245, 176, 23);
		frameManager.getContentPane().add(btnNewButton_2);
		
		
        
		
        
		
		
		
		
	}
}
