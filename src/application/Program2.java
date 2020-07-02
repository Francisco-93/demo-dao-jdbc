package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DAOFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDAO depDao = DAOFactory.creatDepartmentDao();
		
		System.out.println("=== TEST 1: dep. findById ===");
		Department department = depDao.findById(3);
		
		System.out.println(department);
		
		
		System.out.println("\n=== TEST 3: dep. findAll ===");
		List<Department> list = null;
		list = depDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: dep. insert ===");
		Department newDep = new Department(null, "Musics");
		depDao.insert(newDep);
		System.out.println("Inserted! New Id = " + newDep.getId());
	
		System.out.println("\n=== TEST 5: dep. update ===");
		department = depDao.findById(1);
		department.setName("Guns");
		depDao.update(department);
		System.out.println("Update Completed!!");
		
		System.out.println("\n=== TEST 5: delete =======");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		depDao.deleteById(id);
		System.out.println("Delete completed");

	
		sc.close();
	}
}
