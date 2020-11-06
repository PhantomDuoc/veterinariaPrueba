/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veterinaria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hugo Cerda jara
 */
public final class ListaMascotas {

    private List<Mascota> listaMascotas;

    public ListaMascotas() {
        listaMascotas = new ArrayList<>();
    }

    public boolean agregarPaciente(Mascota newMascota) {
        for (Mascota tmp : listaMascotas) {
            if (tmp.getNombre().equals(newMascota.getNombre())) {
                System.out.println("La mascota de nombre >> " + tmp.getNombre() + " ya se encuentra en la lista.");
                return false;
            }
            if (tmp.getNombreDuenyo().equals(newMascota.getNombreDuenyo())) {
                System.out.println("El dueño de nombre >> " + tmp.getNombreDuenyo() + " ya se encuentra en la lista.");
                return false;
            }
        }
        return listaMascotas.add(newMascota);
    }

    public void listarMascotas() {
        System.out.println("-----Mascotas-----");
        for (Mascota tmp : listaMascotas) {
            System.out.println(tmp.toString());
        }
    }

    public void mostrarFelinos() {
        System.out.println("-----Felinos-----");
        for (Mascota tmp : listaMascotas) {
            if (tmp instanceof Felino) {
                System.out.println(tmp.toString());
            }
        }
    }

    public void mostrarCaninos() {
        System.out.println("-----Caninos-----");
        for (Mascota tmp : listaMascotas) {
            if (tmp instanceof Canino) {
                System.out.println(tmp.toString());
            }
        }
    }

    public void mostrarTipo() {
        int contCanino = 0, contFelino = 0;
        for (Mascota tmp : listaMascotas) {
            if (tmp instanceof Canino) {
                contCanino++;
            }
            if (tmp instanceof Felino) {
                contFelino++;
            }
        }
        System.out.println("Cantidad de Caninos >> " + contCanino);
        System.out.println("Cantidad de Felinos >> " + contFelino);
    }

}
