package com.ui.moblie;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import com.message.DialogMessage;
import com.ui.MainFrame;
import com.utils.AddMoblie;
import com.utils.MoreFunctions;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Moblie {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Moblie window = new Moblie();
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
	public Moblie() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 510, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		JLabel lblNewLabel = new JLabel("Add Moblie");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(186, 32, 113, 34);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Moblie Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(94, 119, 102, 22);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Moblie Price");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(94, 192, 102, 22);
		frame.getContentPane().add(lblNewLabel_1_1);

		textField = new JTextField();
		textField.setBounds(293, 123, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(293, 196, 86, 20);
		frame.getContentPane().add(textField_1);

		JButton btnNewButton = new JButton("Add ");
		btnNewButton.setBounds(196, 282, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MainFrame().frame.setVisible(true);
				frame.dispose();
			}
		});
		btnBack.setBounds(10, 11, 68, 23);
		frame.getContentPane().add(btnBack);

		AddMoblie addMoblie = AddMoblie.getInstance();
		MoreFunctions functions = new MoreFunctions();
		addMoblie.accept(functions);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textField.getText().equals("") || textField_1.getText().equals("")) {
					DialogMessage.showWarningDialog("Some Fields are missing");
				} else {
					addMoblie.insertMoblie(textField.getText(), Integer.parseInt(textField_1.getText()));
					DialogMessage.showInfoDialog("Moblie Added SuccessFully");
					textField.setText("");
					textField_1.setText("");
				}
			}
		});

	}
}
