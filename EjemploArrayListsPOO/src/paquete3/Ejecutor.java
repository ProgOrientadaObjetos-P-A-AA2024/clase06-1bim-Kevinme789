/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        String marcaPc;
        String marca1;
        String marca2;
        double costo1;
        double costo2;
        ArrayList<Computador> computadoras = new ArrayList<>();
        System.out.println("Ingrese el numero de computadoras que va a comprar: ");
        num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            sc.nextLine();
            System.out.println("Ingrese la marca de la Computadora:");
            marcaPc = sc.nextLine();
            System.out.println("Ingrese la marca del procesador:");
            marca1 = sc.nextLine();
            System.out.println("Ingrese la marca de la memoria:");
            marca2 = sc.nextLine();
            System.out.println("Ingrese el costo de el procesador:");
            costo1 = sc.nextDouble();
            System.out.println("Ingrese el costo de la memoria:");
            costo2 = sc.nextDouble();
            Procesador procesador = new Procesador(marca1, costo1);
            Memoria memoria = new Memoria(marca2, costo2);
            Computador computador = new Computador(marcaPc,procesador,memoria);
            computador.establecerCosto();
            computadoras.add(computador);
        }
        Venta venta = new Venta(computadoras);
        venta.establecerValorVenta();
        System.out.printf("%s",venta);
    }

}
