/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package barang;

/**
 *
 * @author Lenovo
 */
//OVERLOADING
public class Barang {
    // Method untuk mencetak informasi barang dengan parameter dasar
    public void printProductInfo(String name, double price, int stock) {
        System.out.println("Product: " + name);
        System.out.println("Price: Rp." + price);
        System.out.println("Stock: " + stock);
    }

    // Overloading method untuk mendukung informasi tambahan
    public void printProductInfo(String name, double price, int stock, String description) {
        System.out.println("Product: " + name);
        System.out.println("Price: Rp." + price);
        System.out.println("Stock: " + stock);
        System.out.println("Description: " + description);
    }

    public static void main(String[] args) {
        Barang product = new Barang();
        
        // Memanggil method dengan parameter dasar
        product.printProductInfo("Smartphone", 799.99, 15);
        
        // Memanggil method dengan parameter tambahan deskripsi
        product.printProductInfo("Laptop", 1299.99, 10, "Performa laptop yang tinggi untuk bermain game dan multitasking");
    }
}

