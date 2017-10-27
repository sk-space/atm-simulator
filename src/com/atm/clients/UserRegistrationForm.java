package com.atm.clients;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import com.atm.models.Account;
import com.atm.models.User;
import com.atm.serviceimpl.TranscatiionSercieImpl;
import com.atm.serviceimpl.UserRegistrationServiceImpl;
import com.atm.services.TranscationService;
import com.atm.services.UserRegistraionService;

public class UserRegistrationForm extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPanel infoPanel;
	private JLabel lblFname;
	private JTextField fnameTextField;
	private JLabel label_1;
	private JTextField mnameTextField;
	private JTextField lnameTextField;
	private JLabel label_2;
	private JPanel panel;
	private JRadioButton maleRadioButton;
	private JRadioButton femaleRadioButton;
	private JLabel lblAddress;
	private JTextField addressTextField;
	private JLabel lblCitizenshipNo;
	private JTextField citizenTextField;
	private JPanel panel_1;
	private JLabel lblAccountType;
	private JComboBox accountTypeComboBox;
	private JLabel lblUsername;
	private JTextField usernameTextField;
	private JLabel lblPassword;
	private JPasswordField passwordField;
	private JButton btnRegister;
	private JButton btnClear;
	private JButton btnBack;
	private JLabel label;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JButton btnExit;
	private JLabel lblInitialDeposit;
	private JTextField initialDepositTextField;
	private JLabel lblNrs;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel lblAccountNo;
	private JTextField accountNoTextField;
	private JLabel label_12;
	private static int uid = 1;

	/**
	 * Create the frame.
	 */
	public UserRegistrationForm() {
		setTitle("ATM - Registration Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 425);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getInfoPanel());
		contentPane.add(getPanel_1());
		contentPane.add(getBtnRegister());
		contentPane.add(getBtnClear());
		contentPane.add(getBtnBack());
		contentPane.add(getBtnExit());
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	private JPanel getInfoPanel() {
		if (infoPanel == null) {
			infoPanel = new JPanel();
			infoPanel.setBorder(new TitledBorder(null, "User Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			infoPanel.setBounds(10, 11, 864, 160);
			infoPanel.setLayout(null);
			infoPanel.add(getLblFname());
			infoPanel.add(getFnameTextField());
			infoPanel.add(getLabel_1());
			infoPanel.add(getMnameTextField());
			infoPanel.add(getLnameTextField());
			infoPanel.add(getLabel_2());
			infoPanel.add(getPanel());
			infoPanel.add(getLblAddress());
			infoPanel.add(getAddressTextField());
			infoPanel.add(getLblCitizenshipNo());
			infoPanel.add(getCitizenTextField());
			infoPanel.add(getLabel());
			infoPanel.add(getLabel_3());
			infoPanel.add(getLabel_4());
			infoPanel.add(getLabel_8());
			infoPanel.add(getLabel_9());
			infoPanel.add(getLabel_10());
		}
		return infoPanel;
	}
	private JLabel getLblFname() {
		if (lblFname == null) {
			lblFname = new JLabel("First Name");
			lblFname.setHorizontalAlignment(SwingConstants.RIGHT);
			lblFname.setBounds(10, 35, 76, 14);
		}
		return lblFname;
	}
	private JTextField getFnameTextField() {
		if (fnameTextField == null) {
			fnameTextField = new JTextField();
			fnameTextField.setColumns(10);
			fnameTextField.setBounds(95, 32, 150, 20);
		}
		return fnameTextField;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("Middle Name");
			label_1.setHorizontalAlignment(SwingConstants.RIGHT);
			label_1.setBounds(272, 35, 103, 14);
		}
		return label_1;
	}
	private JTextField getMnameTextField() {
		if (mnameTextField == null) {
			mnameTextField = new JTextField();
			mnameTextField.setColumns(10);
			mnameTextField.setBounds(385, 33, 150, 20);
		}
		return mnameTextField;
	}
	private JTextField getLnameTextField() {
		if (lnameTextField == null) {
			lnameTextField = new JTextField();
			lnameTextField.setColumns(10);
			lnameTextField.setBounds(652, 34, 150, 20);
		}
		return lnameTextField;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("Last Name");
			label_2.setHorizontalAlignment(SwingConstants.RIGHT);
			label_2.setBounds(572, 35, 70, 14);
		}
		return label_2;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(new TitledBorder(null, "Gender", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(10, 74, 236, 75);
			panel.add(getMaleRadioButton());
			panel.add(getFemaleRadioButton());
		}
		return panel;
	}
	private JRadioButton getMaleRadioButton() {
		if (maleRadioButton == null) {
			maleRadioButton = new JRadioButton("Male");
			buttonGroup.add(maleRadioButton);
			maleRadioButton.setBounds(44, 28, 62, 23);
		}
		return maleRadioButton;
	}
	private JRadioButton getFemaleRadioButton() {
		if (femaleRadioButton == null) {
			femaleRadioButton = new JRadioButton("Female");
			buttonGroup.add(femaleRadioButton);
			femaleRadioButton.setBounds(119, 28, 68, 23);
		}
		return femaleRadioButton;
	}
	private JLabel getLblAddress() {
		if (lblAddress == null) {
			lblAddress = new JLabel("Address");
			lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);
			lblAddress.setBounds(304, 103, 71, 14);
		}
		return lblAddress;
	}
	private JTextField getAddressTextField() {
		if (addressTextField == null) {
			addressTextField = new JTextField();
			addressTextField.setColumns(10);
			addressTextField.setBounds(385, 100, 150, 20);
		}
		return addressTextField;
	}
	private JLabel getLblCitizenshipNo() {
		if (lblCitizenshipNo == null) {
			lblCitizenshipNo = new JLabel("Citizenship No.");
			lblCitizenshipNo.setHorizontalAlignment(SwingConstants.RIGHT);
			lblCitizenshipNo.setBounds(534, 103, 108, 14);
		}
		return lblCitizenshipNo;
	}
	private JTextField getCitizenTextField() {
		if (citizenTextField == null) {
			citizenTextField = new JTextField();
			citizenTextField.setColumns(10);
			citizenTextField.setBounds(652, 100, 150, 20);
		}
		return citizenTextField;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(null, "Account Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBounds(10, 185, 864, 144);
			panel_1.setLayout(null);
			panel_1.add(getLblAccountType());
			panel_1.add(getAccountTypeComboBox());
			panel_1.add(getLabel_7());
			panel_1.add(getLblAccountNo());
			panel_1.add(getAccountNoTextField());
			panel_1.add(getLabel_12());
			panel_1.add(getLblInitialDeposit());
			panel_1.add(getLblNrs());
			panel_1.add(getInitialDepositTextField());
			panel_1.add(getLabel_11());
			panel_1.add(getLblUsername());
			panel_1.add(getUsernameTextField());
			panel_1.add(getLabel_5());
			panel_1.add(getLblPassword());
			panel_1.add(getPasswordField());
			panel_1.add(getLabel_6());
		}
		return panel_1;
	}
	private JLabel getLblAccountType() {
		if (lblAccountType == null) {
			lblAccountType = new JLabel("Account Type");
			lblAccountType.setHorizontalAlignment(SwingConstants.RIGHT);
			lblAccountType.setBounds(10, 40, 80, 14);
		}
		return lblAccountType;
	}
	private JComboBox getAccountTypeComboBox() {
		if (accountTypeComboBox == null) {
			accountTypeComboBox = new JComboBox();
			accountTypeComboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Account Type", "General", "Saving", "Naari Bachat Khata", "Jestha Nagarik Khata", "Baal Bachat Khata"}));
			accountTypeComboBox.setBounds(100, 37, 160, 20);
		}
		return accountTypeComboBox;
	}
	private JLabel getLblUsername() {
		if (lblUsername == null) {
			lblUsername = new JLabel("Username");
			lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
			lblUsername.setBounds(312, 104, 70, 14);
		}
		return lblUsername;
	}
	private JTextField getUsernameTextField() {
		if (usernameTextField == null) {
			usernameTextField = new JTextField();
			usernameTextField.setBounds(392, 101, 145, 20);
			usernameTextField.setColumns(10);
		}
		return usernameTextField;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setBounds(566, 104, 70, 14);
		}
		return lblPassword;
	}
	private JPasswordField getPasswordField() {
		if (passwordField == null) {
			passwordField = new JPasswordField();
			passwordField.setBounds(646, 101, 150, 20);
		}
		return passwordField;
	}
	private JButton getBtnRegister() {
		
		
		
		if (btnRegister == null) {
			btnRegister = new JButton("Register");
			btnRegister.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try{
						User u = new User();
						Account a = new Account();
						
						u.setFname(fnameTextField.getText());
						u.setMname(mnameTextField.getText());
						u.setLname(lnameTextField.getText());
						
						if(maleRadioButton.isSelected()){
							u.setGender("Male");
						}
						if(femaleRadioButton.isSelected()){
							u.setGender("Female");
						}
						
						u.setAddress(addressTextField.getText());
						u.setCitizenship(Long.parseLong(citizenTextField.getText()));
						
						UserRegistraionService urs = new UserRegistrationServiceImpl();
						int resultUser = urs.addUser(u);
						
						System.out.println("This after user insertion.");
						System.out.println("THIS IS NEW id: "+resultUser);
						
						a.setUser(resultUser);
						a.setAccountType(accountTypeComboBox.getSelectedItem().toString());
						a.setAccountNo(accountNoTextField.getText());
						a.setTotalBalance(Long.parseLong(initialDepositTextField.getText()));
						a.setUsername(usernameTextField.getText());
						a.setPassword(passwordField.getText());
												
						TranscationService trs = new TranscatiionSercieImpl();
						boolean resultAccount = trs.createAccount(a);
						
						if(resultUser > 0 && resultAccount == true){
							JOptionPane.showMessageDialog(null, "User Registered Sucessfully.");
							
							new UserProfile().displayData(resultUser);
							dispose();
						}else{
							JOptionPane.showMessageDialog(null, "Operation Failed.");
						}
					}catch(Exception e){
						JOptionPane.showMessageDialog(null, "Invalid Input.");
					}
				}
			});
			btnRegister.setBounds(465, 347, 89, 23);
		}
		return btnRegister;
	}
	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("Clear");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					fnameTextField.setText("");
					mnameTextField.setText("");
					lnameTextField.setText("");
					addressTextField.setText("");
					citizenTextField.setText("");
					usernameTextField.setText("");
					passwordField.setText("");
					accountTypeComboBox.setSelectedIndex(0);
					buttonGroup.clearSelection();
					initialDepositTextField.setText("");
					accountNoTextField.setText("");
					
				}
			});
			btnClear.setBounds(290, 347, 89, 23);
		}
		return btnClear;
	}
	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					new UserLoginForm();
					dispose();
				}
			});
			btnBack.setBounds(10, 347, 89, 23);
		}
		return btnBack;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("*");
			label.setForeground(Color.RED);
			label.setFont(new Font("Tahoma", Font.BOLD, 14));
			label.setBounds(247, 33, 15, 14);
		}
		return label;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("*");
			label_3.setForeground(Color.RED);
			label_3.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_3.setBounds(804, 35, 15, 14);
		}
		return label_3;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("*");
			label_4.setForeground(Color.RED);
			label_4.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_4.setBounds(804, 103, 15, 14);
		}
		return label_4;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("*");
			label_5.setForeground(Color.RED);
			label_5.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_5.setBounds(537, 104, 15, 14);
		}
		return label_5;
	}
	private JLabel getLabel_6() {
		if (label_6 == null) {
			label_6 = new JLabel("*");
			label_6.setForeground(Color.RED);
			label_6.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_6.setBounds(797, 104, 15, 14);
		}
		return label_6;
	}
	private JLabel getLabel_7() {
		if (label_7 == null) {
			label_7 = new JLabel("*");
			label_7.setForeground(Color.RED);
			label_7.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_7.setBounds(263, 40, 15, 14);
		}
		return label_7;
	}
	private JLabel getLabel_8() {
		if (label_8 == null) {
			label_8 = new JLabel("*");
			label_8.setForeground(Color.RED);
			label_8.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_8.setBounds(538, 103, 15, 14);
		}
		return label_8;
	}
	private JLabel getLabel_9() {
		if (label_9 == null) {
			label_9 = new JLabel("*");
			label_9.setForeground(Color.RED);
			label_9.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_9.setBounds(247, 84, 15, 14);
		}
		return label_9;
	}
	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton("Exit");
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(null, "Exiting the SMS.");
					
					System.exit(0);
				}
			});
			btnExit.setBounds(785, 347, 89, 23);
		}
		return btnExit;
	}
	private JLabel getLblInitialDeposit() {
		if (lblInitialDeposit == null) {
			lblInitialDeposit = new JLabel("Initial Deposit");
			lblInitialDeposit.setHorizontalAlignment(SwingConstants.RIGHT);
			lblInitialDeposit.setBounds(10, 103, 80, 14);
		}
		return lblInitialDeposit;
	}
	private JTextField getInitialDepositTextField() {
		if (initialDepositTextField == null) {
			initialDepositTextField = new JTextField();
			initialDepositTextField.setBounds(130, 101, 120, 20);
			initialDepositTextField.setColumns(10);
		}
		return initialDepositTextField;
	}
	private JLabel getLblNrs() {
		if (lblNrs == null) {
			lblNrs = new JLabel("NRs.");
			lblNrs.setBounds(100, 103, 46, 14);
		}
		return lblNrs;
	}
	private JLabel getLabel_10() {
		if (label_10 == null) {
			label_10 = new JLabel("*");
			label_10.setForeground(Color.RED);
			label_10.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_10.setBounds(538, 35, 15, 14);
		}
		return label_10;
	}
	private JLabel getLabel_11() {
		if (label_11 == null) {
			label_11 = new JLabel("*");
			label_11.setForeground(Color.RED);
			label_11.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_11.setBounds(255, 104, 15, 14);
		}
		return label_11;
	}
	private JLabel getLblAccountNo() {
		if (lblAccountNo == null) {
			lblAccountNo = new JLabel("Account No.");
			lblAccountNo.setHorizontalAlignment(SwingConstants.RIGHT);
			lblAccountNo.setBounds(312, 40, 70, 14);
		}
		return lblAccountNo;
	}
	private JTextField getAccountNoTextField() {
		if (accountNoTextField == null) {
			accountNoTextField = new JTextField();
			accountNoTextField.setBounds(392, 37, 145, 20);
			accountNoTextField.setColumns(10);
		}
		return accountNoTextField;
	}
	private JLabel getLabel_12() {
		if (label_12 == null) {
			label_12 = new JLabel("*");
			label_12.setForeground(Color.RED);
			label_12.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_12.setBounds(540, 39, 15, 14);
		}
		return label_12;
	}
}
