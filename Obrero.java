package Prácticas;


/**
 *Autor: Miguel Figueroa
 *Fecha: 20/11/2024
 *Objetivo: Usar el printin y scanner
 */

import java.util.Scanner;
public class Obrero {
    String nombre;
    int horas_trabajadas;
    double sueldo_hora;
    double sueldofinal;
    Scanner leer = new Scanner (System.in);
// metodos 
    public void capturar_datos(){
        System.out.println("Programa para mostrar el sueldo final de un obrero");   
        System.out.println("ingrese nombre del obrero: ");
        nombre=leer.nextLine();
        System.out.println("ingrese las horas trabajadas: ");
        horas_trabajadas=leer.nextInt();
        System.out.println("ingrese sueldo hora: "); 
        sueldo_hora=leer.nextDouble();
        sueldofinal=horas_trabajadas*sueldo_hora;
        }
    public void mostrar(){
        double sueldofinal = horasTrabajadas * sueldoPorHora;
        System.out.println("Nombre del obrero: "+nombre);    
        System.out.println("Horas trabajadas: "+horas_trabajadas);
        System.out.println("Sueldo por hora: "+sueldo_hora);
        System.out.println("=====================");
    }
    public static void main(String[] args) {
           Obrero obrero =new Obrero();
        obrero.capturar_datos();
        obrero.mostrar();
    }}