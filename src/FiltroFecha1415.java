/*
 * 
 */

import utilidades.*;
import java.util.Scanner;
public class FiltroFecha1415 {
public static void main (String args[]) {
Scanner intro=new Scanner(System.in);
int dia,mes,any;
boolean resultado;
System.out.print("Introduce el dia: ");
dia=intro.nextInt();
System.out.print("Introduce el mes: ");
mes=intro.nextInt();
System.out.print("Introduce el año: ");
any=intro.nextInt();
FiltroFecha data =new FiltroFecha();
data.setDia(dia);
data.setMes(mes);
data.setAny(any);
resultado=data.filtro();
if(resultado){
System.out.println("la fecha ES correcta");
}
else{
System.out.println("la fecha NO ES correcta");
}
}
}


