package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DAOFactory {
	
	public static SellerDAO creatSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDAO creatDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
