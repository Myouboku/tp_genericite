package com.genericite;

public final class App {
    public static void main(String[] args) {
        // Box box = new Box();
        // box.set(27);
        // Integer i = (Integer) box.get();
        // box.set("27");
        // String s = (String) box.get();
        
        // pour améliorer le code, on peut utiliser une classe générique,
        // pour éviter les castings
        Box<Integer> box2 = new Box<>();
        box2.set(27);
        Integer i2 = box2.get();
        box2.set("27");
        Box<Object> s2 = box2.get();
    }
}
