/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.example_1;
import java.util.Scanner;
/**
 *
 * @author macui
 */

public class Example_5 {
    public static void main(String[] args) {
        double r, l, a;
        Scanner entrada=new Scanner(System.in);
        r=entrada.nextDouble();
        a=Math.pow(r,2)*Math.PI;
        l=2*Math.PI*r;
        System.out.println("El area del circulo es: "+String.format("%.2f",a)+"\nLa longitud de la circunferencia del circulo es: "+String.format("%.2f",l));


        
    }
}
