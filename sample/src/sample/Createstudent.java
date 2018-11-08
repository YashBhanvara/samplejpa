package sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Createstudent {

	public static void main(String[] args) {
		EntityManagerFactory emFactory= Persistence.createEntityManagerFactory("sample");
		EntityManager entitymanager = emFactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		student student = new student();
		student.setId(106);
		student.setEname("Yash");
		student.setFee(100000);
		student.setNum(985544);
		
		entitymanager.persist(student);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emFactory.close();
		
	}

}

