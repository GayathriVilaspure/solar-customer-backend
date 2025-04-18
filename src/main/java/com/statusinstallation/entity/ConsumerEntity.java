package com.statusinstallation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ConsumerEntity {
	
@Id	
@GeneratedValue(strategy=GenerationType.IDENTITY)	
Long id;
String consumerName;
String consumerEmail;
String consumerNumber;
String statusInstallation;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getConsumerName() {
	return consumerName;
}
public void setConsumerName(String consumerName) {
	this.consumerName = consumerName;
}
public String getConsumerEmail() {
	return consumerEmail;
}
public void setConsumerEmail(String consumerEmail) {
	this.consumerEmail = consumerEmail;
}
public String getConsumerNumber() {
	return consumerNumber;
}
public void setConsumerNumber(String consumerNumber) {
	this.consumerNumber = consumerNumber;
}
public String getStatusInstallation() {
	return statusInstallation;
}
public void setStatusInstallation(String statusInstallation) {
	this.statusInstallation = statusInstallation;
}
@Override
public String toString() {
	return "ConsumerEntityy [id=" + id + ", consumerName=" + consumerName + ", consumerEmail=" + consumerEmail
			+ ", consumerNumber=" + consumerNumber + ", statusInstallation=" + statusInstallation + "]";
}
public ConsumerEntity(Long id, String consumerName, String consumerEmail, String consumerNumber,
		String statusInstallation) {
	super();
	this.id = id;
	this.consumerName = consumerName;
	this.consumerEmail = consumerEmail;
	this.consumerNumber = consumerNumber;
	this.statusInstallation = statusInstallation;
}
public ConsumerEntity() {
	super();
}

}
