package eta.com.domain.impl;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "basic_details")
public class EtaDetailsImpl {
	
	@Id
	private int sNo;
	private String firstName;
	private String lastName;
	
	public int getSno() {
		return sNo;
	}
	public void setSno(int sNo) {
		this.sNo = sNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
