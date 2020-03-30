package com.ui.customer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import com.message.DialogMessage;
import com.ui.MainFrame;
import com.utils.AddCustomer;
import com.utils.AddMoblie;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CustomerFrame {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerFrame window = new CustomerFrame();
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
	public CustomerFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("unchecked")
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 560, 432);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		JLabel lblNewLabel = new JLabel("Add Customer");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(204, 39, 136, 28);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Id");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(127, 127, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(127, 181, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Model name");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(131, 224, 114, 22);
		frame.getContentPane().add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("Price");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1.setBounds(131, 274, 57, 22);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);

		textField = new JTextField();
		textField.setBounds(337, 121, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(337, 181, 86, 20);
		frame.getContentPane().add(textField_1);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(337, 278, 86, 20);
		frame.getContentPane().add(textField_3);

		JButton btnNewButton = new JButton("Add ");
		btnNewButton.setBounds(221, 347, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnBack = new JButton("Back");
		btnBack.setBounds(10, 11, 71, 23);
		frame.getContentPane().add(btnBack);

		@SuppressWarnings("rawtypes")
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(337, 228, 86, 20);
		frame.getContentPane().add(comboBox);

		AddMoblie addMoblie = AddMoblie.getInstance();
		ArrayList<String> ls = new ArrayList<String>();
		Set<String> keys = addMoblie.getData().keySet();
		for (String key : keys) {
			ls.add(key);
		}

		comboBox.setModel(new DefaultComboBoxModel<String>(ls.toArray(new String[0])));

		comboBox.addItemListener(new ItemListener() {
			@SuppressWarnings("rawtypes")
			@Override
			public void itemStateChanged(ItemEvent e) {
				JComboBox comboBox = (JComboBox) e.getSource();
				Object item = e.getItem();

				if (e.getStateChange() == ItemEvent.SELECTED) {
					textField_3.setText("" + (addMoblie.getData().get(comboBox.getSelectedItem().toString())));
				}

			}
		});

		AddCustomer addEmployee = AddCustomer.getInstance();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (textField.getText().equals("") || textField_1.getText().equals("")
						|| textField_3.getText().equals("")) {
					DialogMessage.showWarningDialog("Some Fields are missing");
				} else {
					addEmployee.addCustomerData(Integer.parseInt(textField.getText()), textField_1.getText(),
							comboBox.getSelectedItem().toString(), Integer.parseInt(textField_3.getText()));
					DialogMessage.showInfoDialog("Customer Added SuccessFully");
					textField.setText("");
					textField_1.setText("");
					textField_3.setText("");
				}
			}
		});

		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainFrame().frame.setVisible(true);
				frame.dispose();
			}
		});
	}
}
