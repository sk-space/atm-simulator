package com.atm.clients;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.atm.models.User;
import com.atm.serviceimpl.UserLoginServiceImpl;
import com.atm.services.UserLoginService;

public class UserLoginForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblUsername;
	private JTextField usernameTextField;
	private JPasswordField passwordTextField;
	private JLabel lblPassword;
	private JButton btnLogin;
	private JButton btnRegister;
	private JLabel lblAtm;
	private JButton btnExit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLoginForm frame = new UserLoginForm();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserLoginForm() {
		setTitle("ATM - Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblAtm());
		contentPane.add(getLblUsername());
		contentPane.add(getUsernameTextField());
		contentPane.add(getPasswordTextField());
		contentPane.add(getLblPassword());
		contentPane.add(getBtnLogin());
		contentPane.add(getBtnRegister());
		contentPane.add(getBtnExit());
		
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	private JLabel getLblUsername() {
		if (lblUsername == null) {
			lblUsername = new JLabel("Username");
			lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
			lblUsername.setBounds(62, 80, 71, 20);
		}
		return lblUsername;
	}
	private JTextField getUsernameTextField() {
		if (usernameTextField == null) {
			usernameTextField = new JTextField();
			usernameTextField.setBounds(147, 77, 221, 25);
			usernameTextField.setColumns(10);
		}
		return usernameTextField;
	}
	private JPasswordField getPasswordTextField() {
		if (passwordTextField == null) {
			passwordTextField = new JPasswordField();
			passwordTextField.setColumns(10);
			passwordTextField.setBounds(147, 123, 221, 25);
		}
		return passwordTextField;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
			lblPassword.setBounds(62, 128, 71, 20);
		}
		return lblPassword;
	}
	private JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton("Login");
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
//					User u = new User();
					
					String username = usernameTextField.getText();
					String password = passwordTextField.getText();
					
//					System.out.println("Username: "+username);
//					System.out.println("Password: "+password);
					
					
					UserLoginService ul = new UserLoginServiceImpl();
					
					int id = ul.loginUser(username, password);
//					System.out.println("This is after login submit..");
//					System.out.println("ID: "+id);
//					System.out.println("After id display");
					
					if(id != 0){
						new UserProfile().displayData(id);
						dispose();
						JOptionPane.showMessageDialog(null, "Welcome "+username.toUpperCase());
					}else{
						JOptionPane.showMessageDialog(null, "Invalid Username and Password!!!");
						return;
					}
					
				}
			});
			btnLogin.setBounds(147, 175, 89, 23);
		}
		return btnLogin;
	}
	private JButton getBtnRegister() {
		if (btnRegister == null) {
			btnRegister = new JButton("Register");
			btnRegister.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					new UserRegistrationForm();
					dispose();
					
				}
			});
			btnRegister.setBounds(279, 175, 89, 23);
		}
		return btnRegister;
	}
	private JLabel getLblAtm() {
		if (lblAtm == null) {
			lblAtm = new JLabel("ATM");
			lblAtm.setFont(new Font("Segoe UI Symbol", Font.BOLD, 34));
			lblAtm.setBounds(185, 25, 89, 41);
		}
		return lblAtm;
	}
	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton("Exit");
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(null, "Thank You For Using ATM - SIMULATOR.");
					System.exit(0);
					
				}
			});
			btnExit.setBounds(213, 227, 89, 23);
		}
		return btnExit;
	}
}
