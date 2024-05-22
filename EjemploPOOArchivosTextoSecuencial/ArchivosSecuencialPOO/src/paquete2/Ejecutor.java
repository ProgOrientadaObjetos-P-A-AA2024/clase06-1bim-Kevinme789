    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Profesor;

public class Ejecutor {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "profesores2.txt";
        
        Profesor profesor1 = new Profesor("Tara Hernandez", "contratado");
        Profesor profesor2 = new Profesor("Gregory Walsh", "nombramiento");
        Profesor profesor3 = new Profesor("Kevin Page", "nombramiento");
        
        
        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);
        // Crea el archivo en la ruta designada y el contructor llama un String
        // el cual sera el nombre que se le dara al archivo txt..
        
        // establecer el valor del atributo registro
        archivo.establecerRegistro(profesor1);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();
        
        // establecer el valor del atributo registro
        archivo.establecerRegistro(profesor2);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();
            
        // establecer el valor del atributo registro
        archivo.establecerRegistro(profesor3);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();
        
        // proceso para lectura del archivo
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        // Guarda linea por linea en un ArrayList de tipo profesor.
        lectura.establecerLista();
        // System.out.println(lectura.toString());
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}
