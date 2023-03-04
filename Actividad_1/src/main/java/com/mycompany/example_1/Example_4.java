/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.example_1;

/**
 *
 * @author macui
 */

public class Example_4 {
    public static void main(String[] args) {
        double horas=48, valHora=5000, salBruto, retFue, salNet;
        salBruto=horas*valHora;
        retFue=salBruto*0.125;
        salNet=salBruto-retFue;
        System.out.println("El salario bruto es: "+salBruto+"\nLa retención de la fuente: "+retFue+"\nEl salario neto es: "+salNet);



        
    }
}
