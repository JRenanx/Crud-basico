package com.renan.crud.model;

import javax.persistence.*;

@Entity
@Table(name = "REGISTER")
public class Register {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;

    @Column(name = "FIRSTNAME")
    private String nome;

    @Column(name = "LASTNAME")
    private String sobreNome;

    @Column(name = "EMAIL")
    private String email;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return nome;
    }

    public void setFirstName(String firstName) {
        this.nome = firstName;
    }

    public String getLastName() {
        return sobreNome;
    }

    public void setLastName(String lastName) {
        this.sobreNome = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
