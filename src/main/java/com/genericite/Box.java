package com.genericite;

public class Box<type> {
    private type object;

    public void set(type object) {
        this.object = object;
    }

    public type get() {
        return object;
    }

    // retourne le type de l'objet
    public Class getType() {
        return object.getClass();
    }
}
