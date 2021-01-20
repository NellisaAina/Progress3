package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Makeup {

	private JFrame frame;
	private JTextPane textPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Makeup window = new Makeup();
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
	public Makeup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 192, 203));
		frame.setBounds(10, 10, 1283, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(128, 0, 0), 2, true));
		panel.setBackground(new Color(255, 228, 225));
		panel.setBounds(10, 11, 762, 167);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\1024529.png"));
		lblNewLabel.setBounds(72, 11, 245, 145);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Makeup");
		lblNewLabel_1.setFont(new Font("Script MT Bold", Font.PLAIN, 50));
		lblNewLabel_1.setBounds(304, 25, 276, 119);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(128, 0, 0), 2, true));
		panel_1.setBackground(new Color(255, 228, 225));
		panel_1.setBounds(10, 189, 359, 461);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("LIPSTICK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText("Lipstick:"
						+"\nBrand: \n1) Fenty Beauty \n2) Maybelline \n3) MAC \n4) Revlon"
						+ "\nHow to Use: Apply thinly on your lip."
						+ "\nWhere to buy: \n1) Midvalley \n2) AEON Shah Alam");
				/*JOptionPane.showMessageDialog(null, "Lipstick:"
						+ \nBrand: \n1) Fenty Beauty \n2) Maybelline \n3) MAC \n4) Revlon"
						+ "\nHow to Use: Apply thinly on your lip."
						+ "\nWhere to buy: \n1) Midvalley \n2) AEON Shah Alam");*/
			}
		});
		btnNewButton.setBackground(new Color(255, 192, 203));
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\lipstick-icon.png"));
		btnNewButton.setBounds(42, 11, 279, 101);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("EYESHADOW");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText("Eyeshadow:"
						+"\nBrand: \n1) Fenty Beauty \n2) Maybelline \n3) MAC \n4) Revlon"
						+ "\nHow to Use: Apply it on your eye lid with your favourite colour."
						+ "\nWhere to buy: \n1) Midvalley \n2) AEON Shah Alam");
				/*JOptionPane.showMessageDialog(null, "Eyeshadow:"
						+ \nBrand: \n1) Fenty Beauty \n2) Maybelline \n3) MAC \n4) Revlon"
						+ "\nHow to Use: Apply it on your eye lid with your favourite colour."
						+ "\nWhere to buy: \n1) Midvalley \n2) AEON Shah Alam");*/
			}
		});
		btnNewButton_1.setBackground(new Color(255, 192, 203));
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\Makeup-icon.png"));
		btnNewButton_1.setBounds(42, 123, 279, 101);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MASCARA");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText("Mascara:"
						+"\nBrand: \n1) Fenty Beauty \n2) Maybelline \n3) MAC \n4) Revlon"
						+ "\nHow to Use: Apply it on your eyelash, curl it upward."
						+ "\nWhere to buy: \n1) Midvalley \n2) AEON Shah Alam");
				/*JOptionPane.showMessageDialog(null, "Mascara:"
						+ \nBrand: \n1) Fenty Beauty \n2) Maybelline \n3) MAC \n4) Revlon"
						+ "\nHow to Use: Apply it on your eyelash, curl it upward."
						+ "\nWhere to buy: \n1) Midvalley \n2) AEON Shah Alam");*/
			}
		});
		btnNewButton_2.setBackground(new Color(255, 192, 203));
		btnNewButton_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\08-mascara-icon.png"));
		btnNewButton_2.setBounds(42, 235, 279, 101);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("BLUSHER");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText("Blusher:"
						+"\nBrand: \n1) Fenty Beauty \n2) Maybelline \n3) MAC \n4) Revlon"
						+ "\nHow to Use: Apply thinly use blusher brush."
						+ "\nWhere to buy: \n1) Midvalley \n2) AEON Shah Alam");
				/*JOptionPane.showMessageDialog(null, "Blusher:"
						+ \nBrand: \n1) Fenty Beauty \n2) Maybelline \n3) MAC \n4) Revlon"
						+ "\nHow to Use: Apply thinly use blusher brush."
						+ "\nWhere to buy: \n1) Midvalley \n2) AEON Shah Alam");*/
			}
		});
		btnNewButton_3.setBackground(new Color(255, 192, 203));
		btnNewButton_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\blusher.png"));
		btnNewButton_3.setBounds(42, 347, 279, 101);
		panel_1.add(btnNewButton_3);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		textPane.setBackground(new Color(255, 228, 225));
		textPane.setEditable(false);
		textPane.setBounds(379, 189, 878, 461);
		frame.getContentPane().add(textPane);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(128, 0, 0), 2, true));
		panel_3.setBackground(new Color(255, 228, 225));
		panel_3.setBounds(782, 11, 475, 167);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("BUY ");
		btnNewButton_4.setBackground(new Color(255, 192, 203));
		btnNewButton_4.setForeground(new Color(0, 0, 0));
		btnNewButton_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\shopping-bag-full.png"));
		btnNewButton_4.setBounds(88, 23, 289, 119);
		panel_3.add(btnNewButton_4);
	}
}
