package com.sda.andreanaghi.startup.model.account;

import com.sda.andreanaghi.startup.model.account.Account;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "billing_address")
    private String billingAddress;

    @Column(name = "delivery_address")
    private String deliveryAddress;

    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;

    public Customer(Long id, String billingAddress, String deliveryAddress, Account account) {
        this.id = id;
        this.billingAddress = billingAddress;
        this.deliveryAddress = deliveryAddress;
        this.account = account;
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", billingAddress='" + billingAddress + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", account=" + account +
                '}';
    }
}
