import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveRecord2 {

	public static void main(String[] args) {
		
		 Configuration cfg =new Configuration(); 
		 cfg.addAnnotatedClass(Customer.class).configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		Transaction tx=ss.beginTransaction();
		
		Customer c=new Customer();
		
		c.setId(1);
		c.setName("Sonali");
		c.setBal(1234);
		c.setAdd("Pune");
		c.setAccNo(3421);
		
		c.setId(2);
		c.setName("Wanve");
		c.setBal(4533);
		c.setAdd("Dharashiv");
		c.setAccNo(3454);
		
		
		

		tx.commit();

		ss.save(c);

		System.out.println("save record done");
		
		
		

	}

}
