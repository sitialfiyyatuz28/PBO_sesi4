/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menukopi;

/**
 *
 * @author Lenovo
 */
//OVERRIDING
/*

/**
 *
 * @author Lenovo
 */
//OVERRIDING

class Coffee {
   
    public void deskripsi() {
        System.out.println("Ini adalah menu kopi kami.");
    }
}


class latte extends Coffee {
    @Override
    public void deskripsi() {
        System.out.println("Ini adalah kopi latte.");
    }
}

//ekspresso
class ekspresso extends Coffee {
    @Override
    public void deskripsi() {
        System.out.println("Ini adalah kopi ekspresso.");
    }
}

//mocha
class mocha extends Coffee {
    @Override
    public void deskripsi() {
        System.out.println("Ini adalah kopi mocha.");
    }
}

public class MenuKopi {
    public static void main(String[] args) {
        Coffee menu1 = new latte();
        Coffee menu2 = new ekspresso();
        Coffee menu3 = new mocha();
        
        menu1.deskripsi(); // Output: Ini kopi latte.
        menu2.deskripsi(); // Output: Ini kopi ekspresso.
        menu3.deskripsi(); // Output: Ini adalah kopi mocha.
    }
}

