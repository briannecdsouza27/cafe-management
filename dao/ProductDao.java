package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.Product;

public class ProductDao {
	
	
	public static void save(Product product) {
		String query="insert into product(name,category,price)values('"+product.getName()+"','"+product.getCategory()+"','"+product.getPrice()+"')";
		DbOperation.setDataorDelete(query,"Product Added Successfully");	
		}
	}


