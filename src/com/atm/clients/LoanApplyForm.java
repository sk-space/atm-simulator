package com.atm.clients;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.atm.serviceimpl.TranscatiionSercieImpl;
import com.atm.services.TranscationService;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoanApplyForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblAmount;
	private JLabel lblNrs;
	private JTextField loanTextField;
	private JButton btnApply;
	private JButton btnBack;
	
	private int userAccount;
	
	/**
	 * Create the frame.
	 */
	public LoanApplyForm() {
		setTitle("ATM - LOAN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, "Apply Loan", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblAmount());
		contentPane.add(getLblNrs());
		contentPane.add(getLoanTextField());
		contentPane.add(getBtnApply());
		contentPane.add(getBtnBack());
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	private JLabel getLblAmount() {
		if (lblAmount == null) {
			lblAmount = new JLabel("Amount");
			lblAmount.setBounds(89, 46, 46, 14);
		}
		return lblAmount;
	}
	private JLabel getLblNrs() {
		if (lblNrs == null) {
			lblNrs = new JLabel("NRs.");
			lblNrs.setBounds(145, 46, 28, 14);
		}
		return lblNrs;
	}
	private JTextField getLoanTextField() {
		if (loanTextField == null) {
			loanTextField = new JTextField();
			loanTextField.setBounds(183, 43, 155, 20);
			loanTextField.setColumns(10);
		}
		return loanTextField;
	}
	private JButton getBtnApply() {
		if (btnApply == null) {
			btnApply = new JButton("Apply");
			btnApply.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					long amount = Long.parseLong(loanTextField.getText());
					int uid = getUserAccount();
					
					TranscationService ts = new TranscatiionSercieImpl();
					if(ts.applyLoan(uid, amount)){
						JOptionPane.showMessageDialog(null, "Loan Application Approved.");
						dispose();
						new UserProfile().displayData(uid);
					}
					new UserProfile().displayData(uid);
					dispose();
//					System.out.println("Apply: " + amount + " By: "+ uid);
					
				}
			});
			btnApply.setBounds(191, 97, 89, 23);
		}
		return btnApply;
	}
	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int uid = getUserAccount();
					
					new UserProfile().displayData(uid);
					dispose();
				}
			});
			btnBack.setBounds(191, 143, 89, 23);
		}
		return btnBack;
	}
	
	public int getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(int userAccount) {
		this.userAccount = userAccount;
	}
		
}
