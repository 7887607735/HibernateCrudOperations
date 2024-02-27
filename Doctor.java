import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Doctor {
	@Id
	int id;
	String name;
	
	

	public Doctor() {
		super();
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

	