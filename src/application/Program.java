package application;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDAO selDao = DAOFactory.creatSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = selDao.findById(3);
		
		System.out.println(seller);
	}

}
