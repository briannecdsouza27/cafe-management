package dao;

import javax.swing.JOptionPane;

public class Tables {
	public static void main(String[] args) {
		try {
			
			String userTable="create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),MobileNumber varchar(10),address varchar(200),password varchar(200),securityquestion varchar(200),answer varchar(200),status varchar(20),UNIQUE (email))";
		String  productTable="create table product(id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200),price varchar(200))";
			String categoryTable="create table category(id int AUTO_INCREMENT primary key,name varchar(200))";
			
			//DbOperation.setDataorDelete(userTable,"User Table Created Successfully");
	//	DbOperation.setDataorDelete(productTable,"Product Table Created Successfully");
			DbOperation.setDataorDelete(categoryTable,"Category Table Created Successfully");
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,e);
		}
	}

}
