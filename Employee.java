
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	int id;
	String name;
	String Address;
	
	
	public int getId() {
		return id;
	}
	public  void setId(int id) {
		this.id = id;
	}
	public  String getName(String string) {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public  String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Address=" + Address + "]";
	}
	
		
	
	
	
	

	}



