package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class PerfumeGui extends javax.swing.JFrame {

	private JPanel contentPane;
	private JTable table;
	private JFrame frame;
	
	ArrayList <perfume> perfume;
	String header [] = new String [] {"Ref.No", "Type Of Perfume", "Perfume Brand ", "Online Shop"};
	DefaultTableModel dtm;
	int row, col;
	private JTextField textFieldRefNo;

	/**
	 * Launch the application.
	 * @return 
	 */
	
	public PerfumeGui() {
        initComponents();
        perfume = new ArrayList <>();
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
		
		JLabel lblNewLabel = new JLabel("PERFUME");
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 40));
		lblNewLabel.setBounds(154, 49, 222, 85);
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
		table.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Ref.No", "Type Of Perfume", "Perfume Brand ", "Online Shop"
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
		
		JLabel lblNewLabelTypeOfPerfume = new JLabel("Type Of Perfume");
		lblNewLabelTypeOfPerfume.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabelTypeOfPerfume.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		lblNewLabelTypeOfPerfume.setBounds(10, 80, 170, 56);
		panel_2.add(lblNewLabelTypeOfPerfume);
		
		JLabel lblNewLabelPerfumeBrand = new JLabel("Perfume Brand");
		lblNewLabelPerfumeBrand.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabelPerfumeBrand.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		lblNewLabelPerfumeBrand.setBounds(10, 147, 151, 56);
		panel_2.add(lblNewLabelPerfumeBrand);
		
		JLabel lblNewLabelOnlineShop = new JLabel("Online Shop");
		lblNewLabelOnlineShop.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabelOnlineShop.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		lblNewLabelOnlineShop.setBounds(10, 214, 151, 56);
		panel_2.add(lblNewLabelOnlineShop);
		
		JComboBox comboBoxType = new JComboBox();
		comboBoxType.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		comboBoxType.setModel(new DefaultComboBoxModel(new String[] {"- Please Select - ", "For Her ", "For Him"}));
		comboBoxType.setBounds(190, 96, 182, 30);
		panel_2.add(comboBoxType);
		
		JComboBox comboBoxOnlineShop = new JComboBox();
		comboBoxOnlineShop.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		comboBoxOnlineShop.setModel(new DefaultComboBoxModel(new String[] {"- Please Select - ", "Shopee"}));
		comboBoxOnlineShop.setBounds(190, 230, 182, 30);
		panel_2.add(comboBoxOnlineShop);
		
		JComboBox comboBoxPerfumeBrand = new JComboBox();
		comboBoxPerfumeBrand.setModel(new DefaultComboBoxModel(new String[] {"- Please Select - ", "DKNY - RM89", "CK - RM90", "Victoria Secret - RM120 ", "Givenchy - RM 80", "Bulgari - RM130", "Hugo Boss -RM 85"}));
		comboBoxPerfumeBrand.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		comboBoxPerfumeBrand.setBounds(190, 163, 182, 30);
		panel_2.add(comboBoxPerfumeBrand);
		
		JLabel lblNewLabelRefNo = new JLabel("Ref No");
		lblNewLabelRefNo.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabelRefNo.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		lblNewLabelRefNo.setBounds(29, 11, 151, 56);
		panel_2.add(lblNewLabelRefNo);
		
		textFieldRefNo = new JTextField();
		textFieldRefNo.setText("");
		textFieldRefNo.setBounds(190, 28, 182, 30);
		panel_2.add(textFieldRefNo);
		textFieldRefNo.setColumns(10);
		
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
						textFieldRefNo.getText(),
						comboBoxType.getSelectedItem(),
						comboBoxPerfumeBrand.getSelectedItem(),
						comboBoxOnlineShop.getSelectedItem(),
				});
				
				if(table.getSelectedRow() == -1) {
					if(table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Beauty Store System", "Beauty Data Information",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnNewButton.setBounds(120, 50, 130, 47);
		panel_3.add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldRefNo.setText("");
				comboBoxType.setSelectedItem("- Please Select - ");
				comboBoxPerfumeBrand.setSelectedItem("- Please Select - ");
				comboBoxOnlineShop.setSelectedItem("- Please Select - ");
			}
		});
		btnReset.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnReset.setBounds(275, 48, 130, 50);
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
		btnDelete.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnDelete.setBounds(756, 48, 139, 50);
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
		            bw.write("- Perfume Data Information -\n");
		            bw.write("Ref.No\t\tType Of Perfume\t\tPerfume Brand\t\tOnline Shop\n");
		            
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
		btnDisplay.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnDisplay.setBounds(917, 50, 142, 47);
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
		btnExit.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnExit.setBounds(1086, 50, 130, 47);
		panel_3.add(btnExit);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow() == -1) 
				{
					if(table.getRowCount() == 0) 
		   		{
		   			
		   		}
		   	}
		   	table.setValueAt(textFieldRefNo.getText(), table.getSelectedRow(), 0);
		   	table.setValueAt(comboBoxType.getSelectedItem(), table.getSelectedRow(), 1);
		   	table.setValueAt(comboBoxPerfumeBrand.getSelectedItem(), table.getSelectedRow(), 2);
		   	table.setValueAt(comboBoxOnlineShop.getSelectedItem(),table.getSelectedRow(), 3);
			}
			
		});
		btnUpdate.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnUpdate.setBounds(436, 50, 142, 47);
		panel_3.add(btnUpdate);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
			
			});

		btnSearch.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnSearch.setBounds(598, 50, 139, 47);
		panel_3.add(btnSearch);

		}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PerfumeGui frame = new PerfumeGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}