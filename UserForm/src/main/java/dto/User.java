package dto;

public class User {

private String Name;
private String FatherName;
private String EmailId;
private String PhoneNo;
private String Address;

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public String getFatherName() {
	return FatherName;
}

public void setFatherName(String fatherName) {
	FatherName = fatherName;
}

public String getEmailId() {
	return EmailId;
}

public void setEmailId(String emailId) {
	EmailId = emailId;
}

public String getPhoneNo() {
	return PhoneNo;
}

public void setPhoneNo(String phoneNo) {
	PhoneNo = phoneNo;
}

public String getAddress() {
	return Address;
}

public void setAddress(String address) {
	Address = address;
}

public User(String name, String fatherName, String emailId, String phoneNo, String address) {
	super();
	Name = name;
	FatherName = fatherName;
	EmailId = emailId;
	PhoneNo = phoneNo;
	Address = address;
}
}

 
 