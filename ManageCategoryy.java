import java.awt.Color;



import java.util.Iterator;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import net.proteanit.sql.DbUtils;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.html.HTMLDocument;

//import net.proteanit.sql.DbUtils;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import model.Category;
import dao.CategoryDao;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;

public class ManageCategoryy extends JFrame {

	private JPanel contentPane;
	private JButton btnsave;
	private String[] col;
	private JTextField txtsearch;
	private JTextField txtfoodname;
	private JTextField txtprice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageCategoryy frame = new ManageCategoryy();
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
	
	public ManageCategoryy() {
	
	initComponents();
		
		
	}


	public void initComponents(){
		String col1[][] = { { "ID", "Category" } };
		String col[] = { "", "" };

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 134, 1144, 616);
		contentPane = new JPanel();
		contentPane.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				
				
			}
		});
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*int a = JOptionPane.showConfirmDialog(null, "Do you want really want to Close Application", "Select",
						JOptionPane.YES_NO_OPTION);
				if (a == 0) {
					System.exit(0);
				}*/
				setVisible(false);
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClose.setBounds(356, 10, 85, 21);
		contentPane.add(btnClose);
		if (txtAddnew.getText().length() > 0) {
			btnsave.setEnabled(true);
		} else {
			// btnsave.setEnabled(false);
		}

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new ManageCategoryy().setVisible(true);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClear.setBounds(208, 10, 85, 21);
		contentPane.add(btnClear);
		
		JButton btnlinsert = new JButton("INSERT");
		btnlinsert.setBounds(586, 25, 90, 28);
		contentPane.add(btnlinsert);
		
		JButton btnlupdate = new JButton("UPDATE");
		btnlupdate.setBounds(708, 25, 90, 28);
		contentPane.add(btnlupdate);
		
		JButton btnldelete = new JButton("DELETE");
		btnldelete.setBounds(810, 25, 90, 28);
		contentPane.add(btnldelete);
		
		JLabel lblsearch = new JLabel("Search");
		lblsearch.setFont(new Font("SansSerif", Font.BOLD, 14));
		lblsearch.setBounds(921, 30, 55, 16);
		contentPane.add(lblsearch);
		
		txtsearch = new JTextField();
		txtsearch.setBounds(988, 25, 122, 21);
		contentPane.add(txtsearch);
		txtsearch.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(585, 65, 508, 158);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtfoodname = new JTextField();
		txtfoodname.setBounds(180, 18, 322, 28);
		panel.add(txtfoodname);
		txtfoodname.setColumns(10);
		
		JLabel lblname = new JLabel("Food Name");
		lblname.setBounds(53, 23, 102, 16);
		panel.add(lblname);
		lblname.setFont(new Font("SansSerif", Font.BOLD, 14));
		
		JLabel lblNewLabel = new JLabel("Type");
		lblNewLabel.setBounds(53, 66, 62, 16);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 14));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(178, 65, 139, 21);
		panel.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Food Price");
		lblNewLabel_1.setBounds(53, 116, 85, 16);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 14));
		
		txtprice = new JTextField();
		txtprice.setBounds(180, 114, 320, 21);
		panel.add(txtprice);
		txtprice.setColumns(10);

	}
}
