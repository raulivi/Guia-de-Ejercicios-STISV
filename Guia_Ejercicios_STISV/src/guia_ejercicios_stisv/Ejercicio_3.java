/*Crear un programa que permita el ingreso de los siguientes datos:
    a. Nombre
    b. Apellidos
    c. Salario
    d. Horas trabajadas
    e. Horas extras tabajadas
    f. Horas nocturnas trabajadas
Calcular el total a pagar, si la hora se le paga a $5.00, la hora extra vale 1.5 la hora normal 
y la hora nocturna el doble de la hora normal, al final se descontará un 10% de renta 
y recibirá un bono en efectivo del 5% sobre su salario liquido a recibir si las horas pasan las 60 horas en total.
 */

package guia_ejercicios_stisv;


import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
        System.out.println("CALCULO DE SALARIO\nPOR FAVOR INGRESE LOS SIGUIENTES DATOS\nNombre:");
        String nom = teclado.next();
        System.out.println("Apellido:");
        String ape = teclado.next();
        System.out.println("Salario Base:");
        double sal = teclado.nextDouble();
        System.out.println("Horas Trabajadas:");
        double hora = teclado.nextDouble();
        System.out.println("Horas Extras Trabajadas:");
        double horex = teclado.nextDouble();
        System.out.println("Horas Nocturnas Trabajadas:");
        double hornoc = teclado.nextDouble();
        double vhora = hora*5;
        double vhorex = 1.5*(horex*5);
        double vhornoc = 2*(hornoc*5);
        double suebr = sal+vhora+vhorex+vhornoc;
        double desc = suebr*0.1;
        double suefi=suebr-desc;
        double bono = 0;
        if ((hora+horex+hornoc)>=60) {
           bono=suefi*0.05; 
        }
        double total=suefi+bono;
        System.out.println("El Salario Liquido Pagadero al empleado "+nom+" "+ape+" es de $"+total);
    }
}
