package com.ezoqc.defijava.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Client {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;

    @Column(unique = true)
    private String socialSecurityNumber;
    private Date birthdate;

    @JsonIgnore
    public int getAge() {
        return (int) ((new Date().getTime() - this.birthdate.getTime()) / 1000 / 60 / 60 / 24 / 365f);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
