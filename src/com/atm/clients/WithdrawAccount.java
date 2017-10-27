package com.atm.clients;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.atm.serviceimpl.TranscatiionSercieImpl;
import com.atm.services.TranscationService;

public class WithdrawAccount extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JTextField withdrawTextField;
	private JLabel label_1;
	private JButton btnBack;
	private JButton btnWithdraw;
	
	private int userAccount;

	/**
	 * Create the frame.
	 */
	public WithdrawAccount() {
		setTitle("ATM - WITHDRAW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLabel());
		contentPane.add(getWithdrawTextField());
		contentPane.add(getLabel_1());
		contentPane.add(getBtnBack());
		contentPane.add(getBtnWithdraw());
		
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("Amount");
			label.setHorizontalAlignment(SwingConstants.RIGHT);
			label.setBounds(84, 71, 46, 14);
		}
		return label;
	}
	private JTextField getWithdrawTextField() {
		if (withdrawTextField == null) {
			withdrawTextField = new JTextField();
			withdrawTextField.setColumns(10);
			withdrawTextField.setBounds(169, 68, 170, 20);
		}
		return withdrawTextField;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("NRs.");
			label_1.setBounds(140, 71, 30, 14);
		}
		return label_1;
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
			btnBack.setBounds(181, 159, 89, 23);
		}
		return btnBack;
	}
	private JButton getBtnWithdraw() {
		if (btnWithdraw == null) {
			btnWithdraw = new JButton("Withdraw");
			btnWithdraw.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					int uid = getUserAccount();
					
					Long amount = Long.parseLong(withdrawTextField.getText());
					TranscationService ts = new TranscatiionSercieImpl();
					if(ts.withdrawAccount(uid, amount)){
						JOptionPane.showMessageDialog(null, "Amount NRs. "+amount+" withdrawn.");
						new UserProfile().displayData(uid);
						dispose();
					}else{
						withdrawTextField.setText("");
					}
					
				}
			});
			btnWithdraw.setBounds(181, 113, 89, 23);
		}
		return btnWithdraw;
	}

	public int getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(int userAccount) {
		this.userAccount = userAccount;
	}
	
	
	
}
