
package guia_ejercicios_stisv;

import java.util.Scanner;

public class Ejercicio_4 {
//Crear un programa que resuelva ecuaciones de tipo ax + by + c =0

public static void main(String[] args){    
    Scanner teclado = new Scanner(System.in);
    System.out.println("SOLUCION DE ECUACIONES ax+by+c=0\nPOR FAVOR INGRESE EL VALOR DE 'a':");
    int A = teclado.nextInt();
    System.out.println("INGRESE EL VALOR DE 'b':");
    int B = teclado.nextInt();
    System.out.println("INGRESE EL VALOR DE 'c':");
    int C = teclado.nextInt();
    double m=((A*C)/(B*C))*-1;
    double x=(C/A)*-1;
    double y=(C/B)*-1;
    double Rad=Math.atan(m);
    double gra=Math.toDegrees(Rad);
    System.out.println("La Recta pasa por los puntos: ("+x+" , 0.0) y (0.0 , "+y+"),");
    System.out.println("Su pendiente es: "+m+", lo que equivale a "+gra+" grados");



}

}
