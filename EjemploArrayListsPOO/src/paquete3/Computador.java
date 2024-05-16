/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Computador {

    private String marca;
    private Procesador procesador;
    private Memoria memoria;
    private double costoComputador;

    public Computador(String m, Procesador p, Memoria mem) {
        marca = m;
        procesador = p;
        memoria = mem;

    }

    public void establecerMarca(String m) {
        marca = m;

    }

    public void establecerProcesador(Procesador p) {
        procesador = p;
    }

    public void establecerMemoria(Memoria m) {
        memoria = m;
    }

    public void establecerCosto(Memoria m, Procesador p) {
        costoComputador = m.obtenerCosto() + p.obtenerCosto();
    }

    public String obtenerMarca() {
        return marca;
    }

    public Procesador obtenerProcesador() {
        return procesador;
    }

    public Memoria obtenerMemoria() {
        return memoria;
    }

    public double obtenerCosto() {
        return costoComputador;
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
