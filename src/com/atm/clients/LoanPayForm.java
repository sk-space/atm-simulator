package com.atm.clients;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.atm.serviceimpl.TranscatiionSercieImpl;
import com.atm.services.TranscationService;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoanPayForm extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JLabel label_1;
	private JTextField payLoanTextField;
	private JButton button;
	private JButton button_1;
	
	private int userAccount;

	/**
	 * Create the frame.
	 */
	public LoanPayForm() {
		setTitle("ATM - PAY LOAN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLabel());
		contentPane.add(getLabel_1());
		contentPane.add(getPayLoanTextField());
		contentPane.add(getButton());
		contentPane.add(getButton_1());
		
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("Amount");
			label.setBounds(90, 62, 46, 14);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("NRs.");
			label_1.setBounds(146, 62, 28, 14);
		}
		return label_1;
	}
	private JTextField getPayLoanTextField() {
		if (payLoanTextField == null) {
			payLoanTextField = new JTextField();
			payLoanTextField.setColumns(10);
			payLoanTextField.setBounds(184, 59, 155, 20);
		}
		return payLoanTextField;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("Apply");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					Long amount = Long.parseLong(payLoanTextField.getText());
					int uid = getUserAccount();
					
					TranscationService ts = new TranscatiionSercieImpl();
					if(ts.payLoan(uid, amount)){
						JOptionPane.showMessageDialog(null, "Loan amount NRs. "+amount+" has been paid.");
						dispose();
						new UserProfile().displayData(uid);
					}else{

						JOptionPane.showMessageDialog(null, "Loan pay amount exceeded.");
						new UserProfile().displayData(uid);
						dispose();
					}
					
					
				}
			});
			button.setBounds(192, 113, 89, 23);
		}
		return button;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("Back");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					int uid = getUserAccount();
					
					new UserProfile().displayData(uid);
					dispose();
					
				}
			});
			button_1.setBounds(192, 159, 89, 23);
		}
		return button_1;
	}

	public int getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(int userAccount) {
		this.userAccount = userAccount;
	}
	
	
}
