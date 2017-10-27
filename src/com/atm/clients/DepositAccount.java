package com.atm.clients;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

public class DepositAccount extends JFrame {

	private JPanel contentPane;
	private JLabel lblAmount;
	private JTextField depositTextField;
	private JLabel lblNrs;
	private JButton btnDeposit;
	private JButton btnBack;
	
	private int userAccount;

	/**
	 * Create the frame.
	 */
	public DepositAccount() {
		setTitle("ATM - DEPOSIT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 210);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblAmount());
		contentPane.add(getDepositTextField());
		contentPane.add(getLblNrs());
		contentPane.add(getBtnDeposit());
		contentPane.add(getBtnBack());
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	private JLabel getLblAmount() {
		if (lblAmount == null) {
			lblAmount = new JLabel("Amount");
			lblAmount.setHorizontalAlignment(SwingConstants.RIGHT);
			lblAmount.setBounds(46, 49, 46, 14);
		}
		return lblAmount;
	}
	private JTextField getDepositTextField() {
		if (depositTextField == null) {
			depositTextField = new JTextField();
			depositTextField.setBounds(131, 46, 170, 20);
			depositTextField.setColumns(10);
		}
		return depositTextField;
	}
	private JLabel getLblNrs() {
		if (lblNrs == null) {
			lblNrs = new JLabel("NRs.");
			lblNrs.setBounds(102, 49, 30, 14);
		}
		return lblNrs;
	}
	private JButton getBtnDeposit() {
		if (btnDeposit == null) {
			btnDeposit = new JButton("Deposit");
			btnDeposit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					int uid = getUserAccount();
					
					Long deposit = Long.parseLong(depositTextField.getText());
					System.out.println("UID inner: " + uid);

//					new UserProfile().dispose();
					TranscationService ts = new TranscatiionSercieImpl();
					
					if(ts.depositAccount(uid, deposit)){
						JOptionPane.showMessageDialog(null, "Amount NRs. "+deposit+" deposited");
						dispose();
						new UserProfile().displayData(uid);
					}	
//					dispose();
					
				}
			});
			btnDeposit.setBounds(143, 90, 89, 23);
		}
		return btnDeposit;
	}
	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					dispose();
					
				}
			});
			btnBack.setBounds(143, 137, 89, 23);
		}
		return btnBack;
	}
	
	public int getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(int userAccount) {
		this.userAccount = userAccount;
//		new UserProfile().dispose();
	}
	
	
	
}
