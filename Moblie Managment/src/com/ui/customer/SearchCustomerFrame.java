package com.ui.customer;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.message.DialogMessage;
import com.ui.MainFrame;
import com.utils.AddCustomer;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class SearchCustomerFrame {

	public JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchCustomerFrame window = new SearchCustomerFrame();
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
	public SearchCustomerFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 444, 355);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		JLabel lblNewLabel = new JLabel("Search & Print Bill");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(134, 31, 177, 28);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(87, 122, 57, 22);
		frame.getContentPane().add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(257, 126, 113, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		AddCustomer addEmployee = AddCustomer.getInstance();

		JButton btnNewButton = new JButton("Search");

		btnNewButton.setBounds(43, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBounds(302, 227, 83, 23);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Print");

		btnNewButton_2.setBounds(173, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_2);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(10, 280, 134, 14);
		frame.getContentPane().add(lblNewLabel_2);

		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (textField.getText().equals("")) {
						DialogMessage.showWarningDialog("Field is missing");
					} else {
						DialogMessage.showInfoDialog(addEmployee.printbill(textField.getText()));
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("")) {
					DialogMessage.showWarningDialog("Field is missing");
				} else {
					lblNewLabel_2.setText(addEmployee.SearchCustomer(textField.getText()));
				}
			}
		});

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainFrame().frame.setVisible(true);
				frame.dispose();
			}
		});
	}
}
