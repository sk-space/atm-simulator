package com.atm.clients;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.atm.models.Account;
import com.atm.models.User;
import com.atm.serviceimpl.TranscatiionSercieImpl;
import com.atm.serviceimpl.UserLoginServiceImpl;
import com.atm.services.TranscationService;
import com.atm.services.UserLoginService;

public class UserProfile extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblFullName;
	private JTextField fullNameTextField;
	private JLabel lblAddress;
	private JTextField addressTextField;
	private JLabel lblGender;
	private JTextField genderTextField;
	private JLabel lblCitizenshipNo;
	private JTextField citizenTextField;
	private JLabel lblAccountType;
	private JTextField accountTypeTextField;
	private JButton btnEdit;
	private JLabel lblTotalAccountBalance;
	private JTextField totalBalanceTextField;
	private JLabel lblRs;
	private JButton btnDeposit;
	private JButton btnWithdraw;
	private JButton btnSummary;
	private JLabel lblLoanAmount;
	private JTextField loanTextField;
	private JLabel lblNrs;
	private JButton btnExit;
	private JButton btnLogOut;
	private JLabel lblAccountNumber;
	private JTextField accountNoTextField;
	private JButton btnPayLoan;
	
	private int uid;
	/**
	 * Create the frame.
	 */
	public UserProfile() {
		setTitle("ATM - USER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getPanel_1());
		contentPane.add(getBtnLogOut());
		contentPane.add(getBtnExit());
				
		setLocationRelativeTo(null);
		setVisible(true);
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "User Profile", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(10, 11, 614, 185);
			panel.setLayout(null);
			panel.add(getLblFullName());
			panel.add(getFullNameTextField());
			panel.add(getLblAddress());
			panel.add(getAddressTextField());
			panel.add(getLblGender());
			panel.add(getGenderTextField());
			panel.add(getLblCitizenshipNo());
			panel.add(getCitizenTextField());
			panel.add(getBtnEdit());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(null, "Account Profile", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBounds(10, 215, 614, 200);
			panel_1.setLayout(null);
			panel_1.add(getLblAccountType());
			panel_1.add(getAccountTypeTextField());
			panel_1.add(getLblTotalAccountBalance());
			panel_1.add(getTotalBalanceTextField());
			panel_1.add(getLblRs());
			panel_1.add(getBtnDeposit());
			panel_1.add(getBtnWithdraw());
			panel_1.add(getLblLoanAmount());
			panel_1.add(getLoanTextField());
			panel_1.add(getLblNrs());
			panel_1.add(getLblAccountNumber());
			panel_1.add(getAccountNoTextField());
			panel_1.add(getBtnSummary());
			panel_1.add(getBtnPayLoan());
		}
		return panel_1;
	}
	private JLabel getLblFullName() {
		if (lblFullName == null) {
			lblFullName = new JLabel("Full Name");
			lblFullName.setHorizontalAlignment(SwingConstants.RIGHT);
			lblFullName.setBounds(10, 35, 90, 14);
		}
		return lblFullName;
	}
	private JTextField getFullNameTextField() {
		if (fullNameTextField == null) {
			fullNameTextField = new JTextField();
			fullNameTextField.setEditable(false);
			fullNameTextField.setBounds(110, 32, 175, 20);
			fullNameTextField.setColumns(10);
		}
		return fullNameTextField;
	}
	private JLabel getLblAddress() {
		if (lblAddress == null) {
			lblAddress = new JLabel("Address");
			lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);
			lblAddress.setBounds(320, 35, 70, 14);
		}
		return lblAddress;
	}
	private JTextField getAddressTextField() {
		if (addressTextField == null) {
			addressTextField = new JTextField();
			addressTextField.setEditable(false);
			addressTextField.setBounds(400, 32, 175, 20);
			addressTextField.setColumns(10);
		}
		return addressTextField;
	}
	private JLabel getLblGender() {
		if (lblGender == null) {
			lblGender = new JLabel("Gender");
			lblGender.setHorizontalAlignment(SwingConstants.RIGHT);
			lblGender.setBounds(54, 90, 46, 14);
		}
		return lblGender;
	}
	private JTextField getGenderTextField() {
		if (genderTextField == null) {
			genderTextField = new JTextField();
			genderTextField.setEditable(false);
			genderTextField.setBounds(110, 87, 110, 20);
			genderTextField.setColumns(10);
		}
		return genderTextField;
	}
	private JLabel getLblCitizenshipNo() {
		if (lblCitizenshipNo == null) {
			lblCitizenshipNo = new JLabel("Citizenship No.");
			lblCitizenshipNo.setHorizontalAlignment(SwingConstants.RIGHT);
			lblCitizenshipNo.setBounds(300, 90, 90, 14);
		}
		return lblCitizenshipNo;
	}
	private JTextField getCitizenTextField() {
		if (citizenTextField == null) {
			citizenTextField = new JTextField();
			citizenTextField.setEditable(false);
			citizenTextField.setBounds(400, 87, 175, 20);
			citizenTextField.setColumns(10);
		}
		return citizenTextField;
	}
	private JLabel getLblAccountType() {
		if (lblAccountType == null) {
			lblAccountType = new JLabel("Account Type");
			lblAccountType.setHorizontalAlignment(SwingConstants.RIGHT);
			lblAccountType.setBounds(304, 44, 90, 14);
		}
		return lblAccountType;
	}
	private JTextField getAccountTypeTextField() {
		if (accountTypeTextField == null) {
			accountTypeTextField = new JTextField();
			accountTypeTextField.setEditable(false);
			accountTypeTextField.setBounds(404, 41, 172, 20);
			accountTypeTextField.setColumns(10);
		}
		return accountTypeTextField;
	}
	private JButton getBtnEdit() {
		if (btnEdit == null) {
			btnEdit = new JButton("Edit Profile");
			btnEdit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.out.println("Inside UserProfile constructor: "+ uid);
//					int uid = getId();		
					new UserEditForm().displayData(uid);
					dispose();
					
				}
			});
			btnEdit.setBounds(255, 138, 110, 23);
		}
		return btnEdit;
	}
	private JLabel getLblTotalAccountBalance() {
		if (lblTotalAccountBalance == null) {
			lblTotalAccountBalance = new JLabel("Total Balance");
			lblTotalAccountBalance.setHorizontalAlignment(SwingConstants.RIGHT);
			lblTotalAccountBalance.setBounds(0, 88, 114, 14);
		}
		return lblTotalAccountBalance;
	}
	private JTextField getTotalBalanceTextField() {
		if (totalBalanceTextField == null) {
			totalBalanceTextField = new JTextField();
			totalBalanceTextField.setEditable(false);
			totalBalanceTextField.setBounds(154, 85, 140, 20);
			totalBalanceTextField.setColumns(10);
		}
		return totalBalanceTextField;
	}
	private JLabel getLblRs() {
		if (lblRs == null) {
			lblRs = new JLabel("NRs.");
			lblRs.setBounds(124, 88, 28, 14);
		}
		return lblRs;
	}
	private JButton getBtnDeposit() {
		if (btnDeposit == null) {
			btnDeposit = new JButton("Deposit");
			btnDeposit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.out.println("UID inside Deposit Button: "+uid);
					new DepositAccount().setUserAccount(uid);
					dispose();
				}
			});
			btnDeposit.setBounds(63, 141, 89, 23);
		}
		return btnDeposit;
	}
	private JButton getBtnWithdraw() {
		if (btnWithdraw == null) {
			btnWithdraw = new JButton("Withdraw");
			btnWithdraw.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.out.println("UID inside Deposit Button: "+uid);
					new WithdrawAccount().setUserAccount(uid);
					dispose();
				}
			});
			btnWithdraw.setBounds(205, 141, 89, 23);
		}
		return btnWithdraw;
	}
	private JButton getBtnSummary() {
		if (btnSummary == null) {
			btnSummary = new JButton("Apply Loan");
			btnSummary.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					new LoanApplyForm().setUserAccount(uid);
					dispose();
					
				}
			});
			btnSummary.setBounds(343, 141, 109, 23);
		}
		return btnSummary;
	}
	private JLabel getLblLoanAmount() {
		if (lblLoanAmount == null) {
			lblLoanAmount = new JLabel("Loan Amount");
			lblLoanAmount.setHorizontalAlignment(SwingConstants.RIGHT);
			lblLoanAmount.setBounds(308, 88, 86, 14);
		}
		return lblLoanAmount;
	}
	private JTextField getLoanTextField() {
		if (loanTextField == null) {
			loanTextField = new JTextField();
			loanTextField.setEditable(false);
			loanTextField.setBounds(435, 85, 141, 20);
			loanTextField.setColumns(10);
		}
		return loanTextField;
	}
	private JLabel getLblNrs() {
		if (lblNrs == null) {
			lblNrs = new JLabel("NRs.");
			lblNrs.setBounds(404, 88, 29, 14);
		}
		return lblNrs;
	}
	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton("Exit");
			btnExit.setBounds(535, 426, 89, 23);
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
//					First logout and then exit operation
					JOptionPane.showMessageDialog(null, "Thank You For Using ATM - SIMULATOR.");
					System.exit(0);
				}
			});
		}
		return btnExit;
	}
	private JButton getBtnLogOut() {
		if (btnLogOut == null) {
			btnLogOut = new JButton("Log Out");
			btnLogOut.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					new UserLoginForm();
					dispose();
				}
			});
			btnLogOut.setBounds(262, 426, 89, 23);
		}
		return btnLogOut;
	}
	private JLabel getLblAccountNumber() {
		if (lblAccountNumber == null) {
			lblAccountNumber = new JLabel("Account Number");
			lblAccountNumber.setHorizontalAlignment(SwingConstants.RIGHT);
			lblAccountNumber.setBounds(10, 44, 105, 14);
		}
		return lblAccountNumber;
	}
	private JTextField getAccountNoTextField() {
		if (accountNoTextField == null) {
			accountNoTextField = new JTextField();
			accountNoTextField.setEditable(false);
			accountNoTextField.setBounds(123, 41, 171, 20);
			accountNoTextField.setColumns(10);
		}
		return accountNoTextField;
	}
	private JButton getBtnPayLoan() {
		if (btnPayLoan == null) {
			btnPayLoan = new JButton("Pay Loan");
			btnPayLoan.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					new LoanPayForm().setUserAccount(uid);
					dispose();
					
				}
			});
			btnPayLoan.setBounds(487, 141, 89, 23);
		}
		return btnPayLoan;
	}

	
	public void displayData(int id){
		
		uid = id;
		
		System.out.println("Setter of ID in UserProfile displayData(): "+id);
		Account a = new Account();
		UserLoginService uls = new UserLoginServiceImpl();
		User u = uls.getById(id);
		
		fullNameTextField.setText(u.getFname()+" "+u.getMname()+" "+u.getLname());
		addressTextField.setText(u.getAddress());
		genderTextField.setText(u.getGender());
		citizenTextField.setText(u.getCitizenship().toString());
		accountNoTextField.setText(u.getAccount().getAccountNo());
		accountTypeTextField.setText(u.getAccount().getAccountType());
		totalBalanceTextField.setText(u.getAccount().getTotalBalance().toString());
		loanTextField.setText(u.getAccount().getLoan().toString());
	}
}
