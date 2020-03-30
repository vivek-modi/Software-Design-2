package com.ui.moblie;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import com.ui.MainFrame;
import com.utils.AddMoblie;
import com.utils.MoreFunctions;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchMoblieFrame {

	public JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchMoblieFrame window = new SearchMoblieFrame();
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
	public SearchMoblieFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 488, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Search Moblie");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(163, 35, 137, 28);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Moblie Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(99, 122, 95, 17);
		frame.getContentPane().add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(277, 122, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Search");

		btnNewButton.setBounds(179, 213, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnBack = new JButton("Back");

		btnBack.setBounds(10, 11, 66, 23);
		frame.getContentPane().add(btnBack);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(25, 264, 137, 14);
		frame.getContentPane().add(lblNewLabel_2);
		frame.setLocationRelativeTo(null);

		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainFrame().frame.setVisible(true);
				frame.dispose();
			}
		});
		AddMoblie addMoblie = AddMoblie.getInstance();
		MoreFunctions functions = new MoreFunctions();
		addMoblie.accept(functions);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_2.setText(functions.SearchItem(textField.getText()));
			}
		});
	}
}
