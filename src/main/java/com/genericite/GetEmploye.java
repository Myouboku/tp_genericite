package com.genericite;

public class GetEmploye<typeNum, typeNom> {
    typeNum numero;
    typeNom nom;

    public GetEmploye(typeNum numero, typeNom nom) {
        this.numero = numero;
        this.nom = nom;
    }

    public typeNum getNumero() {
        return numero;
    }

    public typeNom getNom() {
        return nom;
    }
}
