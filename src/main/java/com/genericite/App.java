package com.genericite;

public final class App {
    public static void main(String[] args) {
        Box box = new Box();
        box.set(27);
        Integer i = (Integer) box.get();
        box.set("27");
        String s = (String) box.get();
    }
}
