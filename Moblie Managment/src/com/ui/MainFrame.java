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
		frame.setBounds(100, 100, 757, 481);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 757, 26);
		frame.add(menuBar);

		JMenu mnFile = new JMenu("Options");
		mnFile.setBackground(new Color(192, 192, 192));
		mnFile.setForeground(SystemColor.desktop);
		mnFile.setFont(new Font("Arial Black", Font.BOLD, 16));
		menuBar.add(mnFile);

		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.setForeground(SystemColor.desktop);
		mntmLogout.setFont(new Font("Arial", Font.BOLD, 14));
		mntmLogout.setBackground(SystemColor.activeCaption);
		mnFile.add(mntmLogout);

		JMenu mnEmployees = new JMenu("Employees");
		mnEmployees.setForeground(SystemColor.desktop);
		mnEmployees.setFont(new Font("Arial Black", Font.BOLD, 16));
		mnEmployees.setBackground(Color.LIGHT_GRAY);
		menuBar.add(mnEmployees);
		JMenuItem menu_Add_Employee = new JMenuItem("Add Employee");
		menu_Add_Employee.setBackground(SystemColor.activeCaption);
		menu_Add_Employee.setForeground(SystemColor.desktop);
		menu_Add_Employee.setFont(new Font("Arial", Font.BOLD, 14));
		mnEmployees.add(menu_Add_Employee);

		JMenuItem mntmSearchEmployee = new JMenuItem("Search Employee");
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

		JMenuItem mntmSearchCustomer = new JMenuItem("Search Vendor");
		mntmSearchCustomer.setForeground(SystemColor.desktop);
		mntmSearchCustomer.setFont(new Font("Arial", Font.BOLD, 14));
		mntmSearchCustomer.setBackground(SystemColor.activeCaption);
		mnCustomers.add(mntmSearchCustomer);

		JMenu mnReports = new JMenu("Reports");
		mnReports.setForeground(SystemColor.desktop);
		mnReports.setFont(new Font("Arial Black", Font.BOLD, 16));
		mnReports.setBackground(Color.LIGHT_GRAY);
		menuBar.add(mnReports);

		JMenuItem mntmProductsReport = new JMenuItem("Mobile Report");
		mntmProductsReport.setForeground(SystemColor.desktop);
		mntmProductsReport.setFont(new Font("Arial", Font.BOLD, 14));
		mntmProductsReport.setBackground(SystemColor.activeCaption);
		mnReports.add(mntmProductsReport);

		JMenuItem mntmCustomerReport = new JMenuItem("Vendor Report");
		mntmCustomerReport.setForeground(SystemColor.desktop);
		mntmCustomerReport.setFont(new Font("Arial", Font.BOLD, 14));
		mntmCustomerReport.setBackground(SystemColor.activeCaption);
		mnReports.add(mntmCustomerReport);

		JMenuItem mntmEmployeereport = new JMenuItem("Employee Report");
		mntmEmployeereport.setForeground(SystemColor.desktop);
		mntmEmployeereport.setFont(new Font("Arial", Font.BOLD, 14));
		mntmEmployeereport.setBackground(SystemColor.activeCaption);
		mnReports.add(mntmEmployeereport);

		menu_Add_Employee.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Employee().frame.setVisible(true);
				frame.dispose();
			}
		});
	}

}
