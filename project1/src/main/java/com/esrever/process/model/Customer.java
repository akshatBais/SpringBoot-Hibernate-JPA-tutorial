package com.esrever.process.model;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;



@Entity
@Table(name="Customer")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, 
    allowGetters = true)

public class Customer implements Serializable {

	@Id
	 @Column(name = "customer_key")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long customer_key;
	
	@JsonProperty("address")
	 @Column(name = "address")
	private String address;
	
	@JsonProperty("contactNumber")
	@Column(name = "contact_number")
	private Long contactNumber;
	
	
	
	 @Column(name="created_date", nullable = false, updatable = false)
	    @Temporal(TemporalType.TIMESTAMP)
	    @CreatedDate
	private Date createdDate;
	
	 @JsonProperty("customerName")
	 @Column(name = "customer_name")
	private String customerName;
	
	


}
