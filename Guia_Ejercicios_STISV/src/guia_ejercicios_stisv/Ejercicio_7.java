
package guia_ejercicios_stisv;

import java.util.Scanner;

/* Crear un programa que permita ingresar el nombre de 5 niños, asi como la 
cantidad de ahorro diario que realizan por una semana. El objetivo es usar 
arreglos paralelos para el registro de estos datos y al final el programa 
imprimirá el total ahorrado por todos los niños y el promedio de ahorro diario.*/
public class Ejercicio_7 {
 
 public static void main(String[] args) {
    Scanner teclado =new Scanner(System.in);    
    // nombre de los niños
    String[] nombres=new String[5];
    //cantidad de ahorro
    double[] ahorro=new double[5];
    double total=0;
    System.out.println("Por Favor, Ingrese los datos de los niños");
    for (int i = 0; i <5; i++) {
        System.out.println("Nombre para el niño #"+(i+1));
        nombres[i]=teclado.next();
        System.out.println("Cantidad que ahorrara el niño #"+(i+1));
        ahorro[i]=teclado.nextDouble();
        total+=ahorro[i];
    }
    double prom=(total/ahorro.length);
     System.out.print("El Ahorro total de los niños: ");
     for (int i = 0; i < 5; i++) {
         System.out.print(nombres[i]+", ");
     }
     System.out.println("Es de: $"+total);
     System.out.println("Y el Promedio de ahorro de los niños es de $"+prom);
 }
}
