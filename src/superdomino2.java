//v2

import java.util.Scanner;
import utilidades.*;
public class superdomino2 {
	
	public static void main (String args[]) {
		int x,y,cantidad,m,n,i=1;
		int ficha1[][] = new int [1][0];
		int ficha2[][] = new int [1][0];
		ficha1[0][0]=5999;
		ficha1[1][0]=5999;
		ficha2[0][0]=5999;
		ficha2[1][0]=5999;
		Scanner introducir=new Scanner(System.in);
		Aleatorio alea =new Aleatorio();
		System.out.println("introduce una cantidad de fichas");
		cantidad=introducir.nextInt();
		
		x=alea.CalcularNumero(1,25000);
		System.out.println(x);
		ficha1[0][0] =x;
		y=alea.CalcularNumero(1,25000);
		ficha1[1][0] =y;
	System.out.println("FICHA INICIAL           "+ficha1[0][0]+"   "+ficha1 [1][0]);

		do{
		m=alea.CalcularNumero(1,25000);
		ficha2[0][0] =m;
		n=alea.CalcularNumero(1,25000);
		ficha2[1][0] =n;
		
			if((ficha1[0][0]==ficha2[0][0])||(ficha1[0][0]==ficha2[1][0])||(ficha1[1][0]==ficha2[0][0])||(ficha1[1][0]==ficha2[1][0])){
			System.out.println (ficha2[0][0]+"       "+ficha2[1][0]);
			ficha1 [0][0]=ficha2[0][0];
			ficha1[1][0]=ficha2[1][0];
			i++;
			}
		}while(i<=cantidad);
		
	}
}


