
package guia_ejercicios_stisv;

import java.util.Scanner;

public class Ejercicio_5 {
/*Elaborar un programa que contenga un menu con 5 opciones:
1. Programa 1
2. Programa 2
3. Programa 3
4. Programa 4
5. Salir
El objetivo es que el menu estará siempre visible y el programa no cerrará hasta que seleccione 
la opción 5 (de salir) y por cada opción a seleccionar ejecutará el programa respectivo (los 4 anteriores)    
*/
    
public static void main(String[] args){
   Scanner teclado = new Scanner(System.in);
   int op=0; 
   while (op!=5) {        
       System.out.println("Por Favor Elija una opcion\n1. Programa 1\n2. Programa 2\n3. Programa 3\n4. Programa 4\n5. Salir");
       op=teclado.nextInt();
       switch(op){
            case 1:
                System.out.println("Programa 1 Ejecutado con Exito\nVolviendo al Menu...\n");
            break;
            case 2:
                System.out.println("Programa 2 Ejecutado con Exito\nVolviendo al Menu...\n");
            break;
            case 3:
                System.out.println("Programa 3 Ejecutado con Exito\nVolviendo al Menu...\n");
            break;
            case 4:
                System.out.println("Programa 4 Ejecutado con Exito\nVolviendo al Menu...\n");
            break;
            case 5:
                System.out.println("Adios!");
            break;
            default:
                System.out.println("Error, Opcion No Reconocida\n");
            break;
       }
    }

}
    
}
