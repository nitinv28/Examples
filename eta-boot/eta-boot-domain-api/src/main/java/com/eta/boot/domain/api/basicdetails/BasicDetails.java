package com.eta.boot.domain.api.basicdetails;

public class BasicDetails {

	private int sno;
	private String firstName;
	private String lastName;
	
	public BasicDetails(int sno, String firstName, String lastName) {
		this.sno = sno;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
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
	
	
	@Override
	public String toString() {
		return "BasicDetails [sno=" + sno + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", getSno()=" + getSno()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
