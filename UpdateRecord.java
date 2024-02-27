import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

 
public class UpdateRecord {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(Student.class).configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		Transaction tx=ss.beginTransaction();
        
		Student s=ss.get(Student.class, 1);	
		s.setName("Shatrughan");
		System.out.println(s);

		ss.update(s);

		ss.save(s);
		tx.commit();
		System.out.println("Updated");

		
	}

}
