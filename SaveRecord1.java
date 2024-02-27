import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class SaveRecord1 {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(Student.class).configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		Transaction tx=ss.beginTransaction();
		
		Student s=new Student();
		s.setId(47);
		s.setName("Pinku");
		
		s.setId(48);
		s.setName("Chintya");
		
		s.setId(49);
		s.setName("Rani");
		
		s.setId(50);
		s.setName("Dipak");
		

		tx.commit();
		
		
		System.out.println("Inserted");

	}

}
