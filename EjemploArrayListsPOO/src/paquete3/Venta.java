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

    public Venta(double v, ArrayList<Computador> c) {
        valorVenta = v;
        computadoras = c;
    }

    public void establecerValorVenta(double v) {
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
    public String toString(){
    String cadena = String.format("Marca de Computador: %s\nProcesador de la"
            + " computadora: %s\nMemoria de la computadora: %s\nCosto de la "
            + "computadora: %.2f"
            + "---------------------------------------------------------", 
            obtenerMarca(),procesador.obtenerMarca(),
            memoria.obtenerMarca(),costoComputador);
    return cadena;
    }
    

}
