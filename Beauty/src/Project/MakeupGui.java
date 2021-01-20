package Project;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class MakeupGui extends javax.swing.JFrame {

	private JPanel contentPane;
	private JTable table;
	private JFrame frame;
	
	ArrayList<MakeupArray> makeuplist;
	String header [] = new String [] {"Type of Makeup", "Brand", "How to Use", "Where to Buy"};
	DefaultTableModel dtm;
	int row, col;

	/**
	 * Launch the application.
	 */
	
	public MakeupGui() {
        initComponents();
        makeuplist = new ArrayList <>();
        dtm = new DefaultTableModel (header, 0);
        table.setModel(dtm);
        this.setLocationRelativeTo(null);
    }
		
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 1360, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 128, 114));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		panel.setBackground(new Color(255, 228, 225));
		panel.setBounds(10, 11, 397, 179);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Makeup");
		lblNewLabel.setFont(new Font("Script MT Bold", Font.PLAIN, 40));
		lblNewLabel.setBounds(188, 51, 222, 85);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\1024529.png"));
		lblNewLabel_1.setBounds(10, 11, 168, 157);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		panel_1.setBackground(new Color(255, 228, 225));
		panel_1.setBounds(417, 11, 917, 492);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 897, 470);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Type of Makeup", "Brand", "How to Use", "Where to buy"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(169);
		table.getColumnModel().getColumn(1).setPreferredWidth(78);
		table.getColumnModel().getColumn(2).setPreferredWidth(217);
		table.getColumnModel().getColumn(3).setPreferredWidth(158);
		scrollPane.setViewportView(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		panel_2.setBackground(new Color(255, 228, 225));
		panel_2.setBounds(10, 201, 397, 301);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Type of Makeup :");
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2.setBounds(10, 11, 151, 56);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Brand :");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(10, 80, 151, 56);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("How to Use :");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_2_2.setBounds(10, 147, 151, 56);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Where to Buy :");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_2_3.setBounds(10, 214, 151, 56);
		panel_2.add(lblNewLabel_2_3);
		
		JComboBox comboBox_type = new JComboBox();
		comboBox_type.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		comboBox_type.setModel(new DefaultComboBoxModel(new String[] {"- Please Select - ", "Lipstick", "Eyeshadow", "Mascara", "Blusher"}));
		comboBox_type.setBounds(171, 23, 201, 30);
		panel_2.add(comboBox_type);
		
		JComboBox comboBox_brand = new JComboBox();
		comboBox_brand.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		comboBox_brand.setModel(new DefaultComboBoxModel(new String[] {"- Please Select - ", "Fenty Beauty", "Maybelline", "MAC", "Revlon"}));
		comboBox_brand.setBounds(171, 96, 201, 30);
		panel_2.add(comboBox_brand);
		
		JComboBox comboBox_buy = new JComboBox();
		comboBox_buy.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		comboBox_buy.setModel(new DefaultComboBoxModel(new String[] {"- Please Select - ", "Midvalley Megamall", "Aeon Shah Alam"}));
		comboBox_buy.setBounds(171, 230, 201, 30);
		panel_2.add(comboBox_buy);
		
		JComboBox comboBox_use = new JComboBox();
		comboBox_use.setModel(new DefaultComboBoxModel(new String[] {"- Please Select - ", "Lipstick - Apply thinly on your lip.", "Eyeshadow - Apply it on your eye lid with your favourite colour.", "Mascara - Apply it on your eyelash, curl it upward.", "Blusher - Apply thinly use blusher brush."}));
		comboBox_use.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		comboBox_use.setBounds(171, 161, 201, 30);
		panel_2.add(comboBox_use);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		panel_3.setBackground(new Color(255, 228, 225));
		panel_3.setBounds(10, 513, 1324, 137);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {
						comboBox_type.getSelectedItem(),
						comboBox_brand.getSelectedItem(),
						comboBox_use.getSelectedItem(),
						comboBox_buy.getSelectedItem(),
				});
				
				if(table.getSelectedRow() == -1) {
					if(table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Beauty Store System", "Beauty Data Information",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 29));
		btnNewButton.setBounds(193, 36, 142, 67);
		panel_3.add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_type.setSelectedItem("- Please Select - ");
				comboBox_brand.setSelectedItem("- Please Select - ");
				comboBox_use.setSelectedItem("- Please Select - ");
				comboBox_buy.setSelectedItem("- Please Select - ");
			}
		});
		btnReset.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 29));
		btnReset.setBounds(386, 36, 142, 67);
		panel_3.add(btnReset);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if(table.getSelectedRow() == -1) {
					if(table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "No Data to delete", "Beauty Data Information",
								JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null, "Select which data to delete", "Beauty Data Information",
								JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 29));
		btnDelete.setBounds(578, 36, 166, 67);
		panel_3.add(btnDelete);
		
		JButton btnDisplay = new JButton("SAVE");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
		        {
		            File file = new File ("/Users/user/Desktop/DataBase.txt");
		            if(!file.exists())
		            {
		                file.createNewFile();
		            }
		            
		            FileWriter fw = new FileWriter(file.getAbsoluteFile());
		            BufferedWriter bw = new BufferedWriter(fw);
		            bw.write("- Makeup Data Information -\n");
		            bw.write("Type of Makeup\t\tBrand\t\tHow To Use\t\t\t\t\t\tWhere To Buy\n");
		            
		            for(int i = 0; i < table.getRowCount(); i++)
		            {
		                for(int j = 0; j < table.getColumnCount(); j++)
		                {
		                    bw.write(table.getModel().getValueAt(i, j) + "\t\t");
		                }
		                bw.write("\n");
		            }
		            bw.close();
		            fw.close();
		            JOptionPane.showConfirmDialog(frame, "Save To File", "Beauty Data Information",
		            		JOptionPane.OK_OPTION);
		        }
		        catch(Exception ex)
		        {
		            ex.printStackTrace();
		        }
			}
		});
		btnDisplay.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 29));
		btnDisplay.setBounds(793, 36, 180, 67);
		panel_3.add(btnDisplay);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit ?", "Beauty Data Information",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 29));
		btnExit.setBounds(1027, 36, 142, 67);
		panel_3.add(btnExit);
	}


	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MakeupGui frame = new MakeupGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

	/**
	 * Create the frame.
	 */
	