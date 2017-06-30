package com.ricktech.relation.entities;

import javax.persistence.*;

/**
 * Created by a021672 on 2017/6/30.
 */

@Entity
@Table(name = "R_USER")
public class User {
    @Id
    @Column(name = "ID")
    @SequenceGenerator(name = "R_USER_ID_GENERATOR", sequenceName = "R_USER_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "R_USER_ID_GENERATOR")
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PASSWORD")
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
