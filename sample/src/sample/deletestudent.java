package sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class deletestudent {
	
	public static void main(String[] args) {
		 EntityManagerFactory emFactory= Persistence.createEntityManagerFactory("sample" + "" + "");
				  EntityManager entitymanager = emFactory.createEntityManager();
				  entitymanager.getTransaction().begin();
				  
				  student student =entitymanager.find(student.class,106);
				  entitymanager.remove(student);
				  
				  entitymanager.getTransaction().commit();
				  
				  entitymanager.close();
				  
				 

}
}
