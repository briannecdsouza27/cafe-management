

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;

public class PlaceOrder extends JFrame {
	private JTextField txtName;
	private JTextField txtMobno;
	private JTextField txtEmail;
	private JTextField txtSearch;
	private JTextField txtitname;
	private JTextField txtPrice;
	private JTextField txttotal;
	private JTextField tTotal;
	private JTable tablename;
	private JTable tablecategory;
	public String username;
	public int billId=1;
	public int grandTotal=0;
	public int productTotal=0;
	public int productPrice=0;
	public String emailPattern="^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
	public String MobileNumberPattern="^[0-9]*$"; 
	private JButton btnAddtoCart;
	private JButton btnGenerateBill;
	private JSpinner spinner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlaceOrder frame = new PlaceOrder();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 */
	public PlaceOrder() {
		initComponents();
	}
	public PlaceOrder(String name) {
		initComponents();
		txtitname.setEditable(false);
		txtPrice.setEditable(false);
		txttotal.setEditable(false);
		btnAddtoCart.setEnabled(false);
		btnGenerateBill.setEnabled(false);
		JFormattedTextField tf=((JSpinner.DefaultEditor)spinner.getEditor()).getTextField();
		tf.setEnabled(false);
		username=name;
	
	}
	public void productNameByCategory(String category) {
		DefaultTableModel dtm=(DefaultTableModel) tablecategory.getModel();
		dtm.setRowCount(0);
		ArrayList<Product>List =Product
	}
	
	
	public void initComponents() {
		String col1[][]= {{"Name"}};
		String col[]= {""};
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Place Order");
		lblNewLabel.setBounds(5, 5, 95, 27);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Home().setVisible(true);
				
			}
		});
		btnClose.setBounds(851, 10, 85, 21);
		contentPane.add(btnClose);
		
		JLabel lblBillId = new JLabel("Bill ID:");
		lblBillId.setBounds(28, 54, 95, 27);
		lblBillId.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblBillId);
		
		JLabel lblCustomerDetails = new JLabel("Customer Details");
		lblCustomerDetails.setBounds(28, 94, 131, 27);
		lblCustomerDetails.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblCustomerDetails);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(28, 178, 95, 27);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblName);
		
		txtName = new JTextField();
		txtName.setBounds(172, 178, 215, 19);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblMobileNumber = new JLabel("Mobile Number");
		lblMobileNumber.setBounds(28, 229, 131, 27);
		lblMobileNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblMobileNumber);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(28, 291, 95, 27);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblEmail);
		
		txtMobno = new JTextField();
		txtMobno.setBounds(172, 229, 215, 19);
		txtMobno.setColumns(10);
		contentPane.add(txtMobno);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(172, 291, 215, 19);
		txtEmail.setColumns(10);
		contentPane.add(txtEmail);
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setBounds(28, 355, 95, 27);
		lblCategory.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblCategory);
		
		JComboBox comboCategory = new JComboBox();
		comboCategory.setBounds(172, 360, 215, 21);
		contentPane.add(comboCategory);
		
		JLabel lblSearch = new JLabel("Search");
		lblSearch.setBounds(28, 417, 95, 27);
		lblSearch.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblSearch);
		
		txtSearch = new JTextField();
		txtSearch.setBounds(172, 423, 221, 19);
		contentPane.add(txtSearch);
		txtSearch.setColumns(10);
		
		JLabel lblItem = new JLabel("ItemName");
		lblItem.setBounds(484, 54, 95, 27);
		lblItem.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblItem);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(740, 54, 95, 27);
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblPrice);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(484, 178, 95, 27);
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblQuantity);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(740, 178, 95, 27);
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblTotal);
		
		txtitname = new JTextField();
		txtitname.setBounds(484, 100, 174, 19);
		contentPane.add(txtitname);
		txtitname.setColumns(10);
		
		txtPrice = new JTextField();
		txtPrice.setBounds(740, 100, 174, 19);
		txtPrice.setColumns(10);
		contentPane.add(txtPrice);
		
		txttotal = new JTextField();
		txttotal.setBounds(740, 235, 174, 19);
		txttotal.setColumns(10);
		contentPane.add(txttotal);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(483, 291, 85, 21);
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(btnClear);
		
		JButton btnAddtoCart = new JButton("Add to cart");
		btnAddtoCart.setBounds(736, 291, 116, 21);
		btnAddtoCart.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(btnAddtoCart);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(484, 229, 174, 20);
		contentPane.add(spinner);
		
		JLabel lblPage = new JLabel("Place Order Page");
		lblPage.setBounds(10, 680, 354, 54);
		lblPage.setHorizontalAlignment(SwingConstants.CENTER);
		lblPage.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(lblPage);
		
		JButton btnGenerateBill = new JButton("Generate Bill");
		btnGenerateBill.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGenerateBill.setBounds(759, 668, 126, 54);
		contentPane.add(btnGenerateBill);
		
		JLabel lbltotal = new JLabel("Grand Total");
		lbltotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbltotal.setBounds(507, 693, 126, 36);
		contentPane.add(lbltotal);
		
		tTotal = new JTextField();
		tTotal.setBounds(608, 695, 85, 27);
		contentPane.add(tTotal);
		tTotal.setColumns(10);
		
		tablename = new JTable();
		tablename.setBounds(484, 337, 427, 316);
		contentPane.add(tablename);
		
		tablecategory = new JTable();
		tablecategory.setBounds(82, 500, 311, 148);
		contentPane.add(tablecategory);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(487, 363, 427, 290);
		contentPane.add(scrollBar);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(82, 500, 311, 148);
		contentPane.add(scrollBar_1);
	}
}
