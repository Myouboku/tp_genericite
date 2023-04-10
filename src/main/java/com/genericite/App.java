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

        // Question 2
        // GetEmploye employe = new GetEmploye("EMP001", "Paul");
        // Double numEmploye = (Double) employe.getNumero();
        // String nomEmploye = (String) employe.getNom();
        // System.out.println("Numéro employé: " + numEmploye);
        // System.out.println("Nom employé: " + nomEmploye);

        // j'ai cette erreur ci dessous :
        // Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class
        // java.lang.Double (java.lang.String and java.lang.Double are in module java.base of loader 'bootstrap')

        GetEmploye<String, String> employe1 = new GetEmploye<String, String>("EMP001", "Paul");
        String numEmploye1 = employe1.getNumero();
        String nomEmploye1 = employe1.getNom();
        System.out.println("Numéro employé 1: " + numEmploye1);
        System.out.println("Nom employé 1: " + nomEmploye1);

        GetEmploye<Integer, String> employe2 = new GetEmploye<Integer, String>(002, "Michel");
        Integer numEmploye2 = employe2.getNumero();
        String nomEmploye2 = employe2.getNom();
        System.out.println("Numéro employé 2: " + numEmploye2);
        System.out.println("Nom employé 2: " + nomEmploye2);
        // on peut passer plusieurs paramètres de type générique
    }
}
