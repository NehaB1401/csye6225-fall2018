package com.cloud.model;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "transaction_id")
	private String transactionId;
	@Column(name = "description")
	@NotEmpty(message = "*Please provide some description of transaction")
    private String description;
	@Column(name = "merchant")
	@NotEmpty(message = "*Please provide merchant name here")
    private String merchant;
	@Column(name = "amount")
	@NotEmpty(message = "*Please provide transaction amount")
    private Float amount;
	@Column(name = "date")
	@NotEmpty(message = "*Please provide transaction date")
    private Date date;
	@Column(name = "category")
	@NotEmpty(message = "*Please provide transaction category")
    private String category;
	@OneToOne(cascade = CascadeType.ALL)
    private User user;
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMerchant() {
		return merchant;
	}
	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
 }

	
