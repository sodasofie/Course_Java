package com.example.fitness.domain;

import javax.persistence.*;
import java.util.Objects;

//import java.time.
@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String lastname;
    private String birthday;
    private String email;
    private String phone;
    private String registration_date;

    public Users(){}
    public Users(String name, String surname, String lastname, String birthday, String email, String phone, String registration_date) {

        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.email = email;
        this.phone = phone;
        this.registration_date = registration_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(String registration_date) {
        this.registration_date = registration_date;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", registration_date='" + registration_date + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(id, users.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
