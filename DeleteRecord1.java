import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteRecord1 {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(Student.class).configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		Transaction tx=ss.beginTransaction();
		
		Student s=ss.get(Student.class, 114);
		
		ss.delete(s);
		
		tx.commit();
		System.out.println("Deleted");

	}

}
