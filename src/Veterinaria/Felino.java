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
public final class Felino extends Mascota {

    private String estado; //indoor o outdoor

    public Felino() {
    }

    public Felino(String estado, String nombre, int edad, String nombreDuenyo, String telefonoDuenyo, String tipoOperacion, int precioOperacion) {
        super(nombre, edad, nombreDuenyo, telefonoDuenyo, tipoOperacion, precioOperacion);
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.toString() + " Felino{" + "estado=" + estado + '}';
    }

    public int calcularDescuento() {
        return (int) (super.precioOperacion * Caja.DESCUENTO_GATO);
    }

    public void mostrarDescuento() {
        System.out.println("Descuento Gato >> " + Caja.DESCUENTO_GATO * 100 + "%");
    }

}
