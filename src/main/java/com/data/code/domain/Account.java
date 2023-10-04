package com.data.code.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accountTest")
public class Account {

    @Id
    private  String userId;
    private  String username;
    private  String password;

    public  String  getUserId() { return userId; }

    public void setUserId(String userId) { this.userId = userId; }

    public  String  getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public  String  getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

}
