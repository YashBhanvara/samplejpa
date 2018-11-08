package sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class updatestudent {
	
	public static void main(String[] args) {
	 EntityManagerFactory emFactory= Persistence.createEntityManagerFactory("sample" + "" + "");
			  EntityManager entitymanager = emFactory.createEntityManager();
			  entitymanager.getTransaction().begin();
			  student student =entitymanager.find(student.class,106);
			  
			  
			 // System.out.println(student);
			  student.setFee(6000);
			  entitymanager.getTransaction().commit();
			  
			  System.out.println(student);
			  entitymanager.close();
			  
			  
}
}