
package guia_ejercicios_stisv;

public class Ejercicio_2 {
//Crear un programa que imprima los numeros impares del 100 al 1 usando bucles while
    
    public static void main(String[] args){
        int i=100;
        while (i>0) {            
            if (i%2!=0) {
                System.out.print(i+"\n");
                }
            i--;
        }   
    }
}