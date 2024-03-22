/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop6;

/**
 * Es la clase que se llama persona y tiene 3 atributos
 * @author Diego Rojas Nava
 */
public class Persona {
    private String nombre;
    private int edad;
    private String color;
    
/**
 * Constructor vacio que se inicializa en 0
 */

    public Persona() {
    }

/**
 * Constructor lleno
 * @param nombre nombre de la persona
 * @param edad edaad de la persona
 * @param color color de ojos de laa persona
 */

    public Persona(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }
    
/**
 * Regresa el nombre de una persona
 * @return regresa una variable nombre
 */

    public String getNombre() {
        return nombre;
    }

 /**
  * Modifica el nombre de una persona
  * @param nombre 
  */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
/**
 * Regresa la edad de una persona
 * @return regresa una variable edad
 */

    public int getEdad() {
        return edad;
    }
    
/**
 * Modifica la edad de una persona
 * @param edad 
 */    

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
/**
 * Regresa un color de ojos de una persona
 * @return regresa una variable color
 */

    public String getColor() {
        return color;
    }
    
/**
 * Modifica el color de ojos de una persona
 * @param color 
 */

    public void setColor(String color) {
        this.color = color;
    }  
    
/**
 * Ejecuta la acción de comer 
 * @param comida
 * @return regresa una acción de la variable comida
 */
    
    public String comer(String comida){
        return "Estoy comiendo " +comida;
    }
    
/**
 * Método para sobreescribir heredado de la clase object
 * @return regresa una cadena con los atributos de la Persona
 */

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", color=" + color + '}';
    }
    
}
