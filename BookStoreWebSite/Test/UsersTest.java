import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstore.entity.users;

public class UsersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		users user1 = new users();
		user1.setEmail("abc@gmail.com");
		user1.setFull_name("vijayendra");
		user1.setPassword("abc");
		user1.setUser_id(1);
				
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(user1);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
		System.out.println("A user object was persisted");
	}

}
