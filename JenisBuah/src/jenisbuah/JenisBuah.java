/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jenisbuah;

/**
 *
 * @author Lenovo
 */
//Override
class Fruit {
    void display() {
        System.out.println("Ini adalah Buah.");
    }
}

class Apple extends Fruit {
    @Override
    void display() {
        System.out.println("Ini adalah buah Apel.");
    }
}

public class JenisBuah {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.display(); // Output: Ini adalah Buah.

        Apple apple = new Apple();
        apple.display(); // Output: Ini adalah Buah Apel.
    }
}
