/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.example_1;

/**
 *
 * @author macui
 */
import java.util.Scanner;
public class Example_1 {

    public static void main(String[] args) {
        int numero = 12;
        String nombre="UNAL";
        
        System.out.println("Hello World!");
        System.out.println(numero);
        System.out.println(nombre);
        System.out.println(numero +" "+ nombre);
        Scanner entrada;
        entrada = new Scanner(System.in);
        String a=entrada.nextLine();
        entrada.close();
        System.out.println(a);
        
    }
}
