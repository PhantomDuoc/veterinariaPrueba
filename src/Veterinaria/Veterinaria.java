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
public class Veterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear 3 objetos de cada una de las subclases
        Canino c1 = new Canino("Labrador", "Bonnie", 5, "Andrew Fajardo", "912345678", "Esterilizacion", 20000);
        Felino f1 = new Felino("Indoor", "Misifus", 15, "Monica Melendez", "998765432", "Extraccion Tumor", 70000);
        //pacientes para demostrar que funciona el filtro creado para agregar a la lista de mascotas
        Canino c2 = new Canino("Labrador", "Bonnie", 5, "Nombre Inventado", "911112222", "Esterilizacion", 20000);
        Felino f2 = new Felino("Indoor", "Misifus 2.0", 15, "Monica Melendez", "922221111", "Tumor Extraccion", 70001);
        //mostrar la informacion contenida dentro de los objetos
        System.out.println(c1.toString());
        System.out.println(f1.toString());
        //crear una lista de mascotas
        ListaMascotas l1 = new ListaMascotas();
        //agregar paciente 1
        l1.agregarPaciente(c1);
        //agregar paciente con nombre repetido
        l1.agregarPaciente(c2);
        //agregar paciente con nombre duenyo repetido
        l1.agregarPaciente(f2);
        //verificar que se haya agregado mostrando su informacion
        //l1.listarMascotas();
        //agregar paciente 2
        l1.agregarPaciente(f1);
        //verificar que se haya agregado mostrando su informacion
        l1.listarMascotas();
        //mostrar perros
        l1.mostrarCaninos();
        //mostrar gatos
        l1.mostrarFelinos();
        //mostrar cantidad de ambos
        System.out.println("//////////");
        l1.mostrarTipo();
    }

}
