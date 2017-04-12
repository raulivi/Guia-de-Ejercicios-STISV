
package guia_ejercicios_stisv;


import java.util.Scanner;

public class Ejercicio_8 {
//Cree un programa que imprima una piramide de asteríscos de “n” altura
    
  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in); //crear entidad de la clase
    System.out.println("Ingrese la cantidad de lineas deseada");
    int cant = teclado.nextInt();
    int espa=cant-1;
    int aster=1;
      for (int i = 0; i < cant; i++) {
          for (int j = 0; j <espa; j++) {
              System.out.print(" ");
          }
          for (int j = 0; j < aster; j++) {
              System.out.print("* ");
          }
          System.out.println();
          espa--;
          aster +=1;
      }
    
  }    
}
