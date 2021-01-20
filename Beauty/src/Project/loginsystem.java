package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class loginsystem {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginsystem window = new loginsystem();
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
	public loginsystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(233, 150, 122));
		frame.setBounds(100, 100, 549, 349);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER LOGIN");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(194, 58, 173, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(28, 121, 86, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(28, 183, 86, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(214, 112, 244, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(214, 174, 244, 36);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton.setBackground(new Color(250, 235, 215));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username =textField.getText();
				String password =passwordField.getText();
				
				if (password.contains("code")&& username.contains("Beauty"))
				{
					textField.setText(null);
					passwordField.setText(null);
					Menu.main(null);
					
			   }
				else 
				{
					JOptionPane.showMessageDialog(null,      "INVALID LOGIN","ERROR",JOptionPane.ERROR_MESSAGE);
					textField.setText(null);
					passwordField.setText(null);
					Menu.main(null);
				}
			}
		});
		btnNewButton.setBounds(25, 261, 89, 38);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnReset.setBackground(new Color(250, 235, 215));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				passwordField.setText(null);
			}
		});
		btnReset.setBounds(214, 261, 89, 38);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnExit.setBackground(new Color(250, 235, 215));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(402, 261, 89, 38);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(22, 236, 469, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(28, 88, 469, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_3 = new JLabel("BEAUTY STORE");
		lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.BOLD, 29));
		lblNewLabel_3.setBounds(153, 11, 276, 36);
		frame.getContentPane().add(lblNewLabel_3);
	}

}
