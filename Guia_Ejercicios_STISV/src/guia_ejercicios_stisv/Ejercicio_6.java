package guia_ejercicios_stisv;

import java.io.IOException;
import java.util.Scanner;


public class Ejercicio_6 {

//6) Crear un programa en que se ingrese la cantidad de minutos y en ese tiempo la computadora se apagará.
    
public static void main(String[] args) throws IOException{
 
    Scanner teclado = new Scanner(System.in);
    System.out.println("Con este comando, se apagará su PC\nIngrese la cantidad de tiempo en minutos para apagar la PC.");
    int time=teclado.nextInt();
    int seg=time*60;
    System.out.println("Su PC se apagará en "+time+" minutos");
    try{
        Runtime.getRuntime().exec("SHUTDOWN -s -t "+seg);
        
    }
    catch(IOException ioe){
        ioe.getMessage();
        System.out.println(ioe);
    }
  
 }
    
}
