/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.practicados;

public class PracticaDos {

    public static void main(String[] args) {
        
       Estudiantes estudianteUno= new Estudiantes(); //primer objeto 
       estudianteUno.nombre= "Fernanda";
       estudianteUno.identificacion=2100882899; 
      
        System.out.println("Estudiante "+ estudianteUno.nombre);
        System.out.println("identificacion "+estudianteUno.identificacion);
       
       Estudiantes estudianteDos= new Estudiantes(); //primer objeto
       estudianteDos.nombre= "Jona";
       estudianteDos.identificacion=12452899; 
       
       System.out.println("Estudiante "+ estudianteDos.nombre);
       System.out.println("identificacion "+estudianteDos.identificacion);
       
    }
}
