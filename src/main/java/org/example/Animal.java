package org.example;

public class Animal {

    public String nombre;

    public String genero;
    public double  peso;
    Animal pareja;


    public Animal() {
    }

    public Animal(String nombre, String genero, double peso) {
        this.nombre = nombre;
        this.genero = genero;
        this.peso = peso;
    }

    public void encontrarPareja(Animal pareja){

        this.pareja=pareja;
    }


}
