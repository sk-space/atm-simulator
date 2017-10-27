package com.atm.clients;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.atm.models.Account;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AccountRegistrationForm extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel label;
	private JComboBox accountTypeComboBox;
	private JLabel label_1;
	private JLabel label_2;
	private JTextField accountNoTextField;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JTextField depostiTextField;
	private JLabel label_6;
	private JLabel label_7;
	private JTextField usernameTextField;
	private JLabel label_8;
	private JLabel label_9;
	private JPasswordField passwordField;
	private JLabel label_10;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;

	/**
	 * Create the frame.
	 */
	public AccountRegistrationForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getButton());
		contentPane.add(getButton_1());
		contentPane.add(getButton_2());
		contentPane.add(getButton_3());
		
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(new TitledBorder(null, "Account Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(10, 11, 864, 144);
			panel.add(getLabel());
			panel.add(getAccountTypeComboBox());
			panel.add(getLabel_1());
			panel.add(getLabel_2());
			panel.add(getAccountNoTextField());
			panel.add(getLabel_3());
			panel.add(getLabel_4());
			panel.add(getLabel_5());
			panel.add(getDepostiTextField());
			panel.add(getLabel_6());
			panel.add(getLabel_7());
			panel.add(getUsernameTextField());
			panel.add(getLabel_8());
			panel.add(getLabel_9());
			panel.add(getPasswordField());
			panel.add(getLabel_10());
		}
		return panel;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("Account Type");
			label.setHorizontalAlignment(SwingConstants.RIGHT);
			label.setBounds(10, 40, 80, 14);
		}
		return label;
	}
	private JComboBox getAccountTypeComboBox() {
		if (accountTypeComboBox == null) {
			accountTypeComboBox = new JComboBox();
			accountTypeComboBox.setBounds(100, 37, 160, 20);
		}
		return accountTypeComboBox;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("*");
			label_1.setForeground(Color.RED);
			label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_1.setBounds(263, 40, 15, 14);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("Account No.");
			label_2.setHorizontalAlignment(SwingConstants.RIGHT);
			label_2.setBounds(312, 40, 70, 14);
		}
		return label_2;
	}
	private JTextField getAccountNoTextField() {
		if (accountNoTextField == null) {
			accountNoTextField = new JTextField();
			accountNoTextField.setColumns(10);
			accountNoTextField.setBounds(392, 37, 145, 20);
		}
		return accountNoTextField;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("*");
			label_3.setForeground(Color.RED);
			label_3.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_3.setBounds(540, 39, 15, 14);
		}
		return label_3;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("Initial Deposit");
			label_4.setHorizontalAlignment(SwingConstants.RIGHT);
			label_4.setBounds(10, 103, 80, 14);
		}
		return label_4;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("NRs.");
			label_5.setBounds(100, 103, 46, 14);
		}
		return label_5;
	}
	private JTextField getDepostiTextField() {
		if (depostiTextField == null) {
			depostiTextField = new JTextField();
			depostiTextField.setColumns(10);
			depostiTextField.setBounds(130, 101, 120, 20);
		}
		return depostiTextField;
	}
	private JLabel getLabel_6() {
		if (label_6 == null) {
			label_6 = new JLabel("*");
			label_6.setForeground(Color.RED);
			label_6.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_6.setBounds(255, 104, 15, 14);
		}
		return label_6;
	}
	private JLabel getLabel_7() {
		if (label_7 == null) {
			label_7 = new JLabel("Username");
			label_7.setHorizontalAlignment(SwingConstants.RIGHT);
			label_7.setBounds(312, 104, 70, 14);
		}
		return label_7;
	}
	private JTextField getUsernameTextField() {
		if (usernameTextField == null) {
			usernameTextField = new JTextField();
			usernameTextField.setColumns(10);
			usernameTextField.setBounds(392, 101, 145, 20);
		}
		return usernameTextField;
	}
	private JLabel getLabel_8() {
		if (label_8 == null) {
			label_8 = new JLabel("*");
			label_8.setForeground(Color.RED);
			label_8.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_8.setBounds(537, 104, 15, 14);
		}
		return label_8;
	}
	private JLabel getLabel_9() {
		if (label_9 == null) {
			label_9 = new JLabel("Password");
			label_9.setBounds(566, 104, 70, 14);
		}
		return label_9;
	}
	private JPasswordField getPasswordField() {
		if (passwordField == null) {
			passwordField = new JPasswordField();
			passwordField.setBounds(646, 101, 150, 20);
		}
		return passwordField;
	}
	private JLabel getLabel_10() {
		if (label_10 == null) {
			label_10 = new JLabel("*");
			label_10.setForeground(Color.RED);
			label_10.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_10.setBounds(797, 104, 15, 14);
		}
		return label_10;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("Back");
			button.setBounds(9, 173, 89, 23);
		}
		return button;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("Clear");
			button_1.setBounds(289, 173, 89, 23);
		}
		return button_1;
	}
	private JButton getButton_2() {
		if (button_2 == null) {
			button_2 = new JButton("Register");
			button_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					Account a = new Account();
					
					a.setAccountType(accountTypeComboBox.getSelectedItem().toString());
					a.setAccountNo(accountNoTextField.getText());
					a.setTotalBalance(Long.parseLong(depostiTextField.getText()));
					a.setUsername(usernameTextField.getText());
					a.setPassword(passwordField.getText());
					
				}
			});
			button_2.setBounds(464, 173, 89, 23);
		}
		return button_2;
	}
	private JButton getButton_3() {
		if (button_3 == null) {
			button_3 = new JButton("Exit");
			button_3.setBounds(784, 173, 89, 23);
		}
		return button_3;
	}
}
