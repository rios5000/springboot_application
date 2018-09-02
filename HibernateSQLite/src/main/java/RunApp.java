import model.User;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;


public class RunApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			User user = new User();
			user.setName("apple");
			user.setPassword("123456");
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			session.save(user);
			tx.commit();
			session.close();
			HibernateUtil.shutdown();
		
	}

}
