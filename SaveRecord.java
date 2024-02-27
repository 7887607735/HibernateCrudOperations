import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveRecord {
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(Student.class).configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		Transaction tx=ss.beginTransaction();
		Student s=new Student();
		s.setId(65);
		s.setName("Sonali");
		ss.save(s);
		
		tx.commit();
		
		System.out.println("Data Inserted");
		
	}
	}
	


	