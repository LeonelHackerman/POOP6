/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop6;

/**
 * Es la clase POOP6 y es el main
 * @author Casas.Rojas.Torres
 */
public class POOP6 {

    /**
     * Imprimimos un "Hola mundo" y creamos un objeto Persona, asignandole 
     * el nombre, la edad y el color de los ojos además de asignarle una comida al método de acción comer
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");
        Persona persona = new Persona("Emanuel", 15, "Verdes");
        System.out.println(persona);
        System.out.println(persona.comer("pescado"));
    }
    
}


