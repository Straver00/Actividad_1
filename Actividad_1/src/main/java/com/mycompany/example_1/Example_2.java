/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.example_1;
import java.util.Scanner;
/**
 *
 * @author macui
 */

public class Example_2 {
    public static void main(String[] args) {
    int agejuan, agealb, ageana, agemom;
    Scanner entrada= new Scanner(System.in);
    System.out.println("Ingrese la edad Juan: ");
    agejuan=entrada.nextInt();
    agealb=agejuan*2/3;
    ageana=agejuan*4/3;
    agemom=agejuan+agealb+ageana;
    System.out.println("Edad de Juan: "+agejuan+"\nEdad de Alberto: "+agealb+"\nEdad de Ana: "+ageana+"\nEdad de la madre: "+agemom);
    }
}
