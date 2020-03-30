package com.ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.ui.customer.CustomerFrame;
import com.ui.customer.SearchCustomerFrame;
import com.ui.moblie.Moblie;
import com.ui.moblie.SearchMoblieFrame;
import com.ui.vendor.Vendor;
import javax.swing.JLabel;
import javax.swing.JButton;

public class MainFrame {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
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
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 482, 338);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 757, 26);
		frame.getContentPane().add(menuBar);

		JMenu mnEmployees = new JMenu("Customer");
		mnEmployees.setForeground(SystemColor.desktop);
		mnEmployees.setFont(new Font("Arial Black", Font.BOLD, 16));
		mnEmployees.setBackground(Color.LIGHT_GRAY);
		menuBar.add(mnEmployees);

		JMenuItem menu_Add_Employee = new JMenuItem("Add Customer");
		menu_Add_Employee.setBackground(SystemColor.activeCaption);
		menu_Add_Employee.setForeground(SystemColor.desktop);
		menu_Add_Employee.setFont(new Font("Arial", Font.BOLD, 14));
		mnEmployees.add(menu_Add_Employee);

		JMenuItem mntmSearchEmployee = new JMenuItem("Search Customer");
		mntmSearchEmployee.setForeground(SystemColor.desktop);
		mntmSearchEmployee.setFont(new Font("Arial", Font.BOLD, 14));
		mntmSearchEmployee.setBackground(SystemColor.activeCaption);
		mnEmployees.add(mntmSearchEmployee);

		JMenu mnProducts = new JMenu("Mobile");
		mnProducts.setForeground(SystemColor.desktop);
		mnProducts.setFont(new Font("Arial Black", Font.BOLD, 16));
		mnProducts.setBackground(Color.LIGHT_GRAY);
		menuBar.add(mnProducts);

		JMenuItem menu_Add_Products = new JMenuItem("Add Mobile");
		menu_Add_Products.setForeground(SystemColor.desktop);
		menu_Add_Products.setFont(new Font("Arial", Font.BOLD, 14));
		menu_Add_Products.setBackground(SystemColor.activeCaption);
		mnProducts.add(menu_Add_Products);

		JMenuItem mntmSearchProducts = new JMenuItem("Search Mobile");
		mntmSearchProducts.setForeground(SystemColor.desktop);
		mntmSearchProducts.setFont(new Font("Arial", Font.BOLD, 14));
		mntmSearchProducts.setBackground(SystemColor.activeCaption);
		mnProducts.add(mntmSearchProducts);

		JMenu mnCustomers = new JMenu("Vendor");
		mnCustomers.setForeground(SystemColor.desktop);
		mnCustomers.setFont(new Font("Arial Black", Font.BOLD, 16));
		mnCustomers.setBackground(Color.LIGHT_GRAY);
		menuBar.add(mnCustomers);

		JMenuItem mntmAddCustomer = new JMenuItem("Add Vendor");
		mntmAddCustomer.setForeground(SystemColor.activeCaptionText);
		mntmAddCustomer.setFont(new Font("Arial", Font.BOLD, 14));
		mntmAddCustomer.setBackground(SystemColor.activeCaption);
		mnCustomers.add(mntmAddCustomer);

		JLabel lblNewLabel = new JLabel("Welcome to Moblie Store");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(118, 71, 214, 14);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(178, 236, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JLabel lblFirstAddMoblie = new JLabel("Add Moblie First");
		lblFirstAddMoblie.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFirstAddMoblie.setBounds(153, 131, 214, 14);
		frame.getContentPane().add(lblFirstAddMoblie);

		menu_Add_Employee.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new CustomerFrame().frame.setVisible(true);
				frame.dispose();
			}
		});

		mntmSearchEmployee.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new SearchCustomerFrame().frame.setVisible(true);
				frame.dispose();
			}
		});

		menu_Add_Products.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Moblie().frame.setVisible(true);
				frame.dispose();
			}
		});

		mntmSearchProducts.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new SearchMoblieFrame().frame.setVisible(true);
				frame.dispose();
			}
		});

		mntmAddCustomer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Vendor().frame.setVisible(true);
				frame.dispose();
			}
		});

	}
}
