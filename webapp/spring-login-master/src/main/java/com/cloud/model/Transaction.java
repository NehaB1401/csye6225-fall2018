package com.cloud.model;

<<<<<<< HEAD
import java.util.UUID;
=======
>>>>>>> 02868f3e2bc79d5af9176a95f4841f5aeccca19d

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
<<<<<<< HEAD

import org.hibernate.annotations.GenericGenerator;

=======
import org.hibernate.annotations.GenericGenerator;
>>>>>>> 02868f3e2bc79d5af9176a95f4841f5aeccca19d
import lombok.Data;

@Data
@Entity
@Table(name = "transaction")
public class Transaction {

	@Id
<<<<<<< HEAD
=======

>>>>>>> 02868f3e2bc79d5af9176a95f4841f5aeccca19d
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "transaction_id", columnDefinition = "BINARY(16)")
	private UUID transactionId;
<<<<<<< HEAD
    @Column(name = "description")
=======
  @Column(name = "description")
>>>>>>> 02868f3e2bc79d5af9176a95f4841f5aeccca19d
	@NotEmpty(message = "*Please provide some description of transaction")
	private String description;
	@Column(name = "merchant")
	@NotEmpty(message = "*Please provide merchant name here")
	private String merchant;
	// @NotEmpty(message = "*Please provide transaction amount")
	private Float amount;
	@Column(name = "date")
	// @NotEmpty(message = "*Please provide transaction date")
	private String date;
	@Column(name = "category")
	// @NotEmpty(message = "*Please provide transaction category")
	private String category;
	@OneToOne(fetch = FetchType.LAZY, orphanRemoval = false)
	@JoinColumn(name = "user_id")
	private User user;

	public Transaction() {

	}

	public Transaction(UUID transactionId, String description, String merchant, Float amount, String date, String category,
			User user) {
		this.transactionId = transactionId;
		this.description = description;
		this.merchant = merchant;
		this.amount = amount;
		this.date = date;
		this.category = category;
		this.user = user;
	}

	public UUID getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(UUID transactionId) {
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

	public String getDate() {
		return date;
	}

	public void setDate(String string) {
		this.date = string;
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
