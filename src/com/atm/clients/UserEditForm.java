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
import javax.swing.border.TitledBorder;

import com.atm.models.User;
import com.atm.serviceimpl.UserLoginServiceImpl;
import com.atm.services.UserLoginService;

public class UserEditForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblFirstName;
	private JTextField fnameTextField;
	private JLabel label_1;
	private JTextField addressTextField;
	private JLabel label_2;
	private JTextField genderTextField;
	private JLabel label_3;
	private JTextField citizenTextField;
	private JButton btnSave;
	private JButton btnBack;
	private JLabel lblMiddleName;
	private JTextField mnameTextField;
	private JLabel lblLastName;
	private JTextField lnameTextField;

	private int uid;
	
	/**
	 * Create the frame.
	 */
	public UserEditForm() {
		setTitle("ATM - EDIT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, "Edit Profile", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblFirstName());
		contentPane.add(getFnameTextField());
		contentPane.add(getLabel_1());
		contentPane.add(getAddressTextField());
		contentPane.add(getLabel_2());
		contentPane.add(getGenderTextField());
		contentPane.add(getLabel_3());
		contentPane.add(getCitizenTextField());
		contentPane.add(getBtnSave());
		contentPane.add(getBtnBack());
		contentPane.add(getLblMiddleName());
		contentPane.add(getMnameTextField());
		contentPane.add(getLblLastName());
		contentPane.add(getLnameTextField());
		
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private JLabel getLblFirstName() {
		if (lblFirstName == null) {
			lblFirstName = new JLabel("First Name");
			lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
			lblFirstName.setBounds(80, 48, 90, 14);
		}
		return lblFirstName;
	}
	private JTextField getFnameTextField() {
		if (fnameTextField == null) {
			fnameTextField = new JTextField();
			fnameTextField.setColumns(10);
			fnameTextField.setBounds(180, 45, 175, 20);
		}
		return fnameTextField;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("Address");
			label_1.setHorizontalAlignment(SwingConstants.RIGHT);
			label_1.setBounds(100, 190, 70, 14);
		}
		return label_1;
	}
	private JTextField getAddressTextField() {
		if (addressTextField == null) {
			addressTextField = new JTextField();
			addressTextField.setColumns(10);
			addressTextField.setBounds(180, 187, 175, 20);
		}
		return addressTextField;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("Gender");
			label_2.setHorizontalAlignment(SwingConstants.RIGHT);
			label_2.setBounds(122, 240, 46, 14);
		}
		return label_2;
	}
	private JTextField getGenderTextField() {
		if (genderTextField == null) {
			genderTextField = new JTextField();
			genderTextField.setColumns(10);
			genderTextField.setBounds(180, 237, 175, 20);
		}
		return genderTextField;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("Citizenship No.");
			label_3.setHorizontalAlignment(SwingConstants.RIGHT);
			label_3.setBounds(80, 286, 90, 14);
		}
		return label_3;
	}
	private JTextField getCitizenTextField() {
		if (citizenTextField == null) {
			citizenTextField = new JTextField();
			citizenTextField.setColumns(10);
			citizenTextField.setBounds(180, 283, 175, 20);
		}
		return citizenTextField;
	}
	private JButton getBtnSave() {
		if (btnSave == null) {
			btnSave = new JButton("Save");
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					User u = new User();
					
					u.setId(uid);
					u.setFname(fnameTextField.getText());
					u.setMname(mnameTextField.getText());
					u.setLname(lnameTextField.getText());
					u.setGender(genderTextField.getText());
					u.setAddress(addressTextField.getText());
					u.setCitizenship(Long.parseLong(citizenTextField.getText()));
					
					UserLoginService uls = new UserLoginServiceImpl();
					if(uls.updateUser(u)){
						JOptionPane.showMessageDialog(null, "User Profile Updated Successfully.");
						new UserProfile().displayData(uid);
						dispose();
					}
				}
			});
			btnSave.setBounds(214, 340, 89, 23);
		}
		return btnSave;
	}
	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					new UserProfile().displayData(uid);
					dispose();
					
				}
			});
			btnBack.setBounds(214, 386, 89, 23);
		}
		return btnBack;
	}
	
	private JLabel getLblMiddleName() {
		if (lblMiddleName == null) {
			lblMiddleName = new JLabel("Middle Name");
			lblMiddleName.setHorizontalAlignment(SwingConstants.RIGHT);
			lblMiddleName.setBounds(80, 95, 90, 14);
		}
		return lblMiddleName;
	}
	private JTextField getMnameTextField() {
		if (mnameTextField == null) {
			mnameTextField = new JTextField();
			mnameTextField.setColumns(10);
			mnameTextField.setBounds(180, 92, 175, 20);
		}
		return mnameTextField;
	}
	private JLabel getLblLastName() {
		if (lblLastName == null) {
			lblLastName = new JLabel("Last Name");
			lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
			lblLastName.setBounds(80, 142, 90, 14);
		}
		return lblLastName;
	}
	private JTextField getLnameTextField() {
		if (lnameTextField == null) {
			lnameTextField = new JTextField();
			lnameTextField.setColumns(10);
			lnameTextField.setBounds(180, 139, 175, 20);
		}
		return lnameTextField;
	}
	
	public void displayData(int id){
		
		System.out.println("ID in edit: "+id);
		
		uid = id;
		
		UserLoginService uls = new UserLoginServiceImpl();
		User u = uls.getById(id);
		
		fnameTextField.setText(u.getFname());
		mnameTextField.setText(u.getMname());
		lnameTextField.setText(u.getLname());
		genderTextField.setText(u.getGender());
		addressTextField.setText(u.getAddress());
		citizenTextField.setText(u.getCitizenship().toString());
		
	}
}
