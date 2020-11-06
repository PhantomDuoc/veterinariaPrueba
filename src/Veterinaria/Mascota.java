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
public abstract class Mascota implements Caja {

    protected String nombre;
    protected int edad;
    protected String nombreDuenyo;//dueño
    protected String telefonoDuenyo;//dueño
    protected String tipoOperacion;
    protected int precioOperacion;

    public Mascota() {
    }

    public Mascota(String nombre, int edad, String nombreDuenyo, String telefonoDuenyo, String tipoOperacion, int precioOperacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDuenyo = nombreDuenyo;
        this.telefonoDuenyo = telefonoDuenyo;
        this.tipoOperacion = tipoOperacion;
        this.precioOperacion = precioOperacion;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public int getPrecioOperacion() {
        return precioOperacion;
    }

    public void setPrecioOperacion(int precioOperacion) {
        this.precioOperacion = precioOperacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreDuenyo() {
        return nombreDuenyo;
    }

    public void setNombreDuenyo(String nombreDuenyo) {
        this.nombreDuenyo = nombreDuenyo;
    }

    public String getTelefonoDuenyo() {
        return telefonoDuenyo;
    }

    public void setTelefonoDuenyo(String telefonoDuenyo) {
        this.telefonoDuenyo = telefonoDuenyo;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", edad=" + edad + ", nombreDuenyo=" + nombreDuenyo + ", telefonoDuenyo=" + telefonoDuenyo + ", tipoOperacion=" + tipoOperacion + ", precioOperacion=" + precioOperacion + '}';
    }

    public int calcularIva() {
        return (int) (this.precioOperacion * Caja.IVA);
    }

    public int calcularTotal() {
        return (int) (this.precioOperacion + calcularIva() + calcularValorAnestesia() - calcularDescuento());
    }

    public int calcularValorAnestesia() {
        return (int) (this.precioOperacion * Caja.ANESTESIA);
    }

}
