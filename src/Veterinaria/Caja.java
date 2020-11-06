/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veterinaria;

/**
 *
 * @author Hugo Cerda jara
 */
public interface Caja {

    double IVA = 0.19;
    double ANESTESIA = 0.3;
    double DESCUENTO_GATO = 0.25;
    double DESCUENTO_PERRO = 0.1;

    int calcularIva();

    int calcularTotal();

    int calcularDescuento();

    int calcularValorAnestesia();

    void mostrarDescuento();

}
