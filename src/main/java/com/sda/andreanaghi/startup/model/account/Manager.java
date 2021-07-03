package com.sda.andreanaghi.startup.model.account;

import com.sda.andreanaghi.startup.model.account.Account;

import javax.persistence.*;

@Entity
@Table(name = "manager")
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;

    public Manager(Long id, Account account) {
        this.id = id;
        this.account = account;
    }

    public Manager() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", account=" + account +
                '}';
    }
}
