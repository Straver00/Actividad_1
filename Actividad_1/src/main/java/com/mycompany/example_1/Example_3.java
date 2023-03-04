/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.example_1;
import java.util.Scanner;
/**
 *
 * @author macui
 */

public class Example_3 {
    public static void main(String[] args) {
        int x;
        System.out.println("Escribe un numero: ");
        Scanner entrada =new Scanner(System.in);
        x=entrada.nextInt();
        System.out.println("El cuadrado del número es: "+Math.pow(x, 2)+"\nEl cubo del número es: "+Math.pow(x, 3));

    }
}
