package model;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

//import utility.InputScanner;



public class BeanClass
{
 private String firstName;
 private String  lastName;
 private String address;
 private String city;
 private String state;
 private String zip;
 private String phoneNumber;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 public BeanClass() throws IOException
 {
 System.out.print("Enter the firstName:");
 this.firstName=br.readLine();
 System.out.print("Enter the lastName:");
 this.lastName=br.readLine();
 System.out.print("Enter the address:");
 this.address=br.readLine();
 System.out.print("Enter the city:");
 this.city=br.readLine();
 System.out.print("Enter the state:");
 this.state=br.readLine();
 System.out.print("Enter the zip:");
 this.zip=br.readLine();
 System.out.print("Enter the phoneNumber:");
 this.phoneNumber=br.readLine();

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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getZip() {
	return zip;
}
public void setZip(String zip) {
	this.zip = zip;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
}
