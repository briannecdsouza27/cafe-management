

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Window;

public class Home extends JFrame {
public static String username;
	private JPanel contentPane;
	JButton btnManageCategory;
	JButton btnNewProduct;
	JButton btnViewBillOrderDet;
	JButton btnVerify;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		initialize();
		
	}
	
	   
		public void initialize(){
		String adminname="";
		username= adminname;
		if(!username.equals("Admin")) {
		
			try{btnManageCategory.setVisible(false);
			btnNewProduct.setVisible(false);
		 btnViewBillOrderDet.setVisible(false);
		 btnVerify.setVisible(false);
			}catch(Exception m) {
				
			}
		 
		}
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,998,602);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogout = new JButton("LogOut\r\n");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a= JOptionPane.showConfirmDialog(null,"Do you really want to LogOut","Select",JOptionPane.YES_NO_OPTION);
				if(a==0) {
					setVisible(false);
					new EXP11().setVisible(true);
				}
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogout.setBounds(59, 10, 101, 22);
		contentPane.add(btnLogout);
		
		JButton btnPlaceOrder = new JButton("Place Order");
		btnPlaceOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new bill().setVisible(true);
			}});
		btnPlaceOrder.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPlaceOrder.setBounds(212, 11, 130, 21);
		contentPane.add(btnPlaceOrder);
		
		JButton btnSecurityQuestion = new JButton("Security Question");
		btnSecurityQuestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSecurityQuestion.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSecurityQuestion.setBounds(735, 10, 178, 20);
		contentPane.add(btnSecurityQuestion);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a= JOptionPane.showConfirmDialog(null,"Do you really want to Close Application","Select",JOptionPane.YES_NO_OPTION);
				if(a==0) {
					System.exit(0);
					
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.setBounds(988, 11, 85, 21);
		contentPane.add(btnExit);
		
		JButton btnManageCategory = new JButton("Manage Category");
		btnManageCategory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new foodd().setVisible(true);
				
				
			}

			});
		btnManageCategory.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnManageCategory.setBounds(106, 148, 178, 21);
		contentPane.add(btnManageCategory);
		
		JButton btnNewProduct = new JButton("New Product");
		btnNewProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AddNewProduct().setVisible(true);
			}
		});
		btnNewProduct.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewProduct.setBounds(312, 700, 130, 21);
		contentPane.add(btnNewProduct);
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		
	}
}
