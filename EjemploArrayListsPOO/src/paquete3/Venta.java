/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Venta {

    private double valorVenta;
    private ArrayList<Computador> computadoras;

    public Venta( ArrayList<Computador> c) {
        computadoras = c;
    }

    public void establecerValorVenta() {
        for (int i = 0; i < computadoras.size(); i++) {
            valorVenta = valorVenta + computadoras.get(i).obtenerCosto();
        }

    }

    public void establecerComputadoras(ArrayList<Computador> c) {
        computadoras = c;
    }

    public double obtenerValor() {
        return valorVenta;
    }

    public ArrayList<Computador> obtenerComputadors() {
        return computadoras;

    }

    @Override
    public String toString() {
        String cadena = "";
        for (int i = 0; i < computadoras.size(); i++) {
            cadena = String.format("%sMarca de Computador: %s\nProcesador de la"
                    + " computadora: %s\nMemoria de la computadora: %s\n"
                    + "Costo de la computadora: %.2f\n"
                    + "---------------------------------------------------------"
                    + "\n",
                    cadena,computadoras.get(i).obtenerMarca(), 
                    computadoras.get(i).obtenerProcesador().obtenerMarca(), 
                    computadoras.get(i).obtenerMemoria().obtenerMarca(),
                    computadoras.get(i).obtenerCosto());

        }
        cadena = String.format("%sCosto de todas las computadora: %.2f\n",
                cadena,valorVenta);

        return cadena;
    }

}
