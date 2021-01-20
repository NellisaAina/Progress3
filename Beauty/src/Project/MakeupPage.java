package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MakeupPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MakeupPage frame = new MakeupPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MakeupPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 1283, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 128, 114));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(128, 0, 0), 2, true));
		panel.setBackground(new Color(255, 228, 225));
		panel.setBounds(10, 11, 762, 167);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\1024529.png"));
		lblNewLabel.setBounds(27, 11, 303, 145);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Makeup");
		lblNewLabel_1.setFont(new Font("Script MT Bold", Font.PLAIN, 50));
		lblNewLabel_1.setBounds(281, 11, 266, 145);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(128, 0, 0), 2, true));
		panel_1.setBackground(new Color(255, 228, 225));
		panel_1.setBounds(10, 189, 359, 461);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("LIPSTICK");
		btnNewButton.setBackground(new Color(255, 192, 203));
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\lipstick-icon.png"));
		btnNewButton.setBounds(42, 11, 279, 101);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("EYESHADOW");
		btnNewButton_1.setBackground(new Color(255, 192, 203));
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\Makeup-icon.png"));
		btnNewButton_1.setBounds(42, 123, 279, 101);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MASCARA");
		btnNewButton_2.setBackground(new Color(255, 192, 203));
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\08-mascara-icon.png"));
		btnNewButton_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnNewButton_2.setBounds(42, 235, 279, 101);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("BLUSHER");
		btnNewButton_3.setBackground(new Color(255, 192, 203));
		btnNewButton_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\blusher.png"));
		btnNewButton_3.setBounds(42, 349, 279, 101);
		panel_1.add(btnNewButton_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(128, 0, 0), 2, true));
		panel_2.setBackground(new Color(255, 228, 225));
		panel_2.setBounds(782, 11, 475, 167);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("BUY");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_4.setBackground(new Color(255, 192, 203));
		btnNewButton_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\shopping-bag-full.png"));
		btnNewButton_4.setBounds(66, 21, 346, 122);
		panel_2.add(btnNewButton_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(128, 0, 0), 2, true));
		panel_3.setBackground(new Color(255, 228, 225));
		panel_3.setBounds(379, 189, 878, 461);
		contentPane.add(panel_3);
	}

}
