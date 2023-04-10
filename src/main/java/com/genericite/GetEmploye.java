package com.genericite;

public class GetEmploye {
    Object numero;
    Object nom;

    public GetEmploye(Object numero, Object nom) {
        this.numero = numero;
        this.nom = nom;
    }

    public Object getNumero() {
        return numero;
    }

    public Object getNom() {
        return nom;
    }
}
