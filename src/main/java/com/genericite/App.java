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
        Box<Integer> box1 = new Box<>();
        box1.set(27);
        Integer i = box1.get();
        Box<String> box2 = new Box<>();
        box2.set("27");
        String s = box2.get();
        
        // on peut aussi récupérer le type de l'objet
        System.out.println(box2.getType());
    }
}
