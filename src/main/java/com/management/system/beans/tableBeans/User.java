package com.management.system.beans.tableBeans;

import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Indexed
@Entity
@Table(name = "user")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    @Column(length = 100)
    @NotNull
    @Field
    private String userName;

    @Column(length = 150)
    @NotNull
    @Field
    private String password;

    @Column(length = 100)
    @NotNull
    @Field
    private String firstName;

    @Column(length = 100)
    @NotNull
    @Field
    private String lastName;

    @Column(length = 100)
    @NotNull
    @Field
    private String authorization;

    @Column(length = 100)
    @NotNull
    @Field
    private Integer position;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
