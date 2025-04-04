package pojos;

import pojos.Mes;

import java.util.Scanner;
public class Ejercicio6 {
    Scanner sc;
Mes[] meses = new Mes[12];
public Ejercicio6() {
    meses [0]= new Mes("Enero", 1,31);
    meses [1]=new Mes("Febrero", 2,28);
    meses [2]=new Mes("Marzo", 3,31);
    meses [3]=new Mes("Abril", 4,30);
    meses [4]=new Mes("Mayo", 5,31);
    meses [5]=new Mes("Junio", 4,30);
    meses [6]=new Mes("Julio", 7,30);
    meses [7]=new Mes("Agosto", 8,31);
    meses [8]=new Mes("Septiembre", 9,30);
    meses [9]=new Mes("octubre", 10,31);
    meses [10]=new Mes("Noviembre", 11,30);
    meses [11]=new Mes("Diciembre", 12,31);
    sc = new Scanner(System.in);
}
public void ejecutar() {
    System.out.println("Introduzca el numero del mes: ");
    int numero = sc.nextInt();
    Mes mes = meses[numero - 1];
    System.out.println(mes);
}}