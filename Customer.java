import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	int id;
	String Name;
	int AccNo;
	int Bal; 
	String Add;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String name, int accNo, int bal, String add) {
		super();
		this.id = id;
		Name = name;
		AccNo = accNo;
		Bal = bal;
		Add = add;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAccNo() {
		return AccNo;
	}
	public void setAccNo(int accNo) {
		AccNo = accNo;
	}
	public int getBal() {
		return Bal;
	}
	public void setBal(int bal) {
		Bal = bal;
	}
	public String getAdd() {
		return Add;
	}
	public void setAdd(String add) {
		Add = add;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", Name=" + Name + ", AccNo=" + AccNo + ", Bal=" + Bal + ", Add=" + Add + "]";
	}
		
	
	
	
	
	
}