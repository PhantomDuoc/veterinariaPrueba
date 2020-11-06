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
public final class Canino extends Mascota {

    private String raza;

    public Canino() {
    }

    public Canino(String raza, String nombre, int edad, String nombreDuenyo, String telefonoDuenyo, String tipoOperacion, int precioOperacion) {
        super(nombre, edad, nombreDuenyo, telefonoDuenyo, tipoOperacion, precioOperacion);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString() + " Canino{" + "raza=" + raza + '}';
    }

    public int calcularDescuento() {
        return (int) (super.precioOperacion * Caja.DESCUENTO_PERRO);
    }

    public void mostrarDescuento() {
        System.out.println("Descuento Perro >> " + Caja.DESCUENTO_PERRO * 100 + "%");
    }

}
