package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PAYMENT")
public class Payment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="my_payment_seq")
	@SequenceGenerator(sequenceName="payment_seq",allocationSize=1,name="my_payment_seq")
	@Column(name="TRANSACTION_ID")
	private int transactionId;
	
	@Column(name="PAYMENT_DATE")
	private LocalDate paymentdate;
	
	@Column(name="PAYMENT_TYPE")
	private String paymenttype;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="TICKET_ID")
	private int ticketId;
	
	@Column(name="USER_ID")
	private int userId;
	
	@Column(name="AMOUNT_PAID")
	private float amountPaid;
	
	@OneToOne
	@JoinColumn(name="TICKET_ID")
	private Booking booking;
	
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public LocalDate getPaymentdate() {
		return paymentdate;
	}
	public void setPaymentdate(LocalDate paymentdate) {
		this.paymentdate = paymentdate;
	}
	public String getPaymenttype() {
		return paymenttype;
	}
	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public float getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(float amountPaid) {
		this.amountPaid = amountPaid;
	}
	

}
