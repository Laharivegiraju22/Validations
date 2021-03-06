package com.mindtree.bankmanagement.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DebitCard {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int debitCardId;
	private long debitCardNumber;
	private int amount;
	private Date expiry;

	public DebitCard() {
		super();
	}

	public DebitCard(int debitCardId, long debitCardNumber, int amount, Date expiry) {
		super();
		this.debitCardId = debitCardId;
		this.debitCardNumber = debitCardNumber;
		this.amount = amount;
		this.expiry = expiry;
	}

	public int getDebitCardId() {
		return debitCardId;
	}

	public void setDebitCardId(int debitCardId) {
		this.debitCardId = debitCardId;
	}

	public long getDebitCardNumber() {
		return debitCardNumber;
	}

	public void setDebitCardNumber(long debitCardNumber) {
		this.debitCardNumber = debitCardNumber;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getExpiry() {
		return expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (debitCardNumber ^ (debitCardNumber >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DebitCard other = (DebitCard) obj;
		if (debitCardNumber != other.debitCardNumber)
			return false;
		return true;
	}

}
