import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import dao.ProductDao;
import dao.CategoryDao;
import model.Category;
import model.Product;
import net.proteanit.sql.DbUtils;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class AddNewProduct {

	private JFrame frame;
	private JTextField txtname;
	private JTextField txtprice;
	private JButton btnlsave;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddNewProduct window = new AddNewProduct();
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
	private void updateCombo() {
		try{Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","jovi12102001");
		String query="select *from category";
		PreparedStatement ps=con.prepareStatement(query);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			comboBox.addItem(rs.getString("name"));
		}
		
		
			
		}catch(Exception ee) {
			
		}
		
	}
	public AddNewProduct() {
		initialize();
		updateCombo();
		//btnlsave.setEnabled(false);
	}
	public void validateField() {
		String name=txtname.getText();
		String price=txtprice.getText();
		if(!name.equals("")&& !price.equals(""))
			btnlsave.setEnabled(false);
		else
			btnlsave.setEnabled(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				
			}
		});
		frame.setBounds(0, 0, 800,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblname = new JLabel("Name");
		lblname.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblname.setBounds(189, 121, 97, 14);
		frame.getContentPane().add(lblname);
		
		JLabel lblcategory = new JLabel("Category");
		lblcategory.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblcategory.setBounds(189, 169, 97, 34);
		frame.getContentPane().add(lblcategory);
		
		JLabel lblNewLabel = new JLabel("Price");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(196, 240, 76, 14);
		frame.getContentPane().add(lblNewLabel);
		
		txtname = new JTextField();
		txtname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validateField();
			}
		});
		txtname.setBounds(282, 121, 367, 20);
		frame.getContentPane().add(txtname);
		txtname.setColumns(10);
		
		txtprice = new JTextField();
		txtprice.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validateField();
			}
		});
		txtprice.setBounds(282, 240, 375, 20);
		frame.getContentPane().add(txtprice);
		txtprice.setColumns(10);
		
		JButton btnlsave = new JButton("SAVE");
		btnlsave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Product product=new Product();
				product.setName(txtname.getText());
				product.setCategory((String)comboBox.getSelectedItem());
				product.setPrice(txtprice.getText());
				ProductDao.save(product);
			}
		});
		btnlsave.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnlsave.setForeground(new Color(0, 0, 0));
		btnlsave.setBounds(282, 324, 97, 23);
		frame.getContentPane().add(btnlsave);
		
		JButton btnNewButton = new JButton("CLEAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				 new AddNewProduct().setVisible(true);
				
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(578, 324, 97, 23);
		frame.getContentPane().add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(282, 178, 367, 20);
		frame.getContentPane().add(comboBox);
		
		JButton btnlclose = new JButton("Close");
		btnlclose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			}
		});
		btnlclose.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnlclose.setBounds(685, 11, 89, 23);
		frame.getContentPane().add(btnlclose);
		
		JLabel lblNewLabel_1 = new JLabel("New Product");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(24, 16, 97, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}

	protected void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

	
}
