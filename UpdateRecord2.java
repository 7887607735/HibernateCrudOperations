import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateRecord2 {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(Employee.class).configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		Transaction tx=ss.beginTransaction();
		
		Employee e=new Employee();
		e.setId(5);
		e.setName("Shraddha");
		e.setAddress("Mumbai");
		
		ss.update(e);
		tx.commit();
		
		}
	
}
