package com.ui.vendor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import com.data.VendorNode;
import com.message.DialogMessage;
import com.ui.MainFrame;
import com.utils.BinarySearch;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vendor {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vendor window = new Vendor();
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
	public Vendor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 538, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Add Vendor");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(197, 46, 131, 28);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Id");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(131, 123, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(131, 167, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Password");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(131, 215, 86, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1);

		textField = new JTextField();
		textField.setBounds(292, 122, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(292, 166, 86, 20);
		frame.getContentPane().add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(292, 214, 86, 20);
		frame.getContentPane().add(textField_2);

		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBounds(197, 284, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnBack = new JButton("Back");
		btnBack.setBounds(10, 11, 68, 23);
		frame.getContentPane().add(btnBack);

		JButton btnNewButton_1 = new JButton("Search");

		btnNewButton_1.setBounds(292, 374, 89, 23);
		frame.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel_1_1_2 = new JLabel("Id");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_2.setBounds(26, 376, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(107, 373, 86, 20);
		frame.getContentPane().add(textField_3);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(26, 429, 277, 14);
		frame.getContentPane().add(lblNewLabel_2);
		frame.setLocationRelativeTo(null);

		BinarySearch binarySearch = BinarySearch.getInstance();

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("") || textField_1.getText().equals("")
						|| textField_2.getText().equals("")) {
					DialogMessage.showWarningDialog("Some Fields are missing");
				} else {
					binarySearch.InsertVendor(Integer.parseInt(textField.getText()), textField_1.getText(),
							textField_2.getText());
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					DialogMessage.showInfoDialog("Vendor Added Successfully");
				}
			}
		});

		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainFrame().frame.setVisible(true);
				frame.dispose();
			}
		});

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VendorNode node = binarySearch.search(Integer.parseInt(textField.getText()));
				if (node != null)
					lblNewLabel_2.setText("Name : " + node.getName() + "  Age : " + node.getPassword());
				else
					lblNewLabel_2.setText("No User Found");
			}
		});

	}

}
