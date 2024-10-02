package com.PJ.kfs.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class userEntity {
    @Id
    @GeneratedValue
    Long id;
    @Column
    public String name;
    @Column
    String pw;
    @Column
    String address;
    @Column
    String email;
    @Column
    Long  iq;
    @Column
    Long eq;
    @Column
    Long mt;
    @Column
    Long rk;

}
