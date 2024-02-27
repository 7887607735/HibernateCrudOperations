import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetRecord {

	public static void main(String[] args) {
		
				
				Configuration cfg=new Configuration();
				cfg.addAnnotatedClass(Student.class).configure();
				
				SessionFactory sf=cfg.buildSessionFactory();
				Session ss=sf.openSession();
				
				Transaction tx=ss.beginTransaction();
				
				Student s=ss.get(Student.class, 111);
				System.out.println(s);
				
				tx.commit();
				ss.save(s);
				System.out.println("Get Record");
	}

}
