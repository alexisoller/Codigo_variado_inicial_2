//v1

import java.util.Scanner;
import utilidades.*;
public class superdomino {
	
	public static void main (String args[]) {
		int x,y,cantidad,m,n,i=1;
		int ficha1;
		int ficha11;
		int ficha2;
		int ficha22;
		Scanner introducir=new Scanner(System.in);
		Aleatorio alea =new Aleatorio();
		System.out.println("introduce una cantidad de fichas");
		cantidad=introducir.nextInt();
		
		x=alea.CalcularNumero(1,25000);
		ficha1 =x;
		y=alea.CalcularNumero(1,25000);
		ficha11 =y;
	System.out.println("FICHA INICIAL           "+ficha1+"   "+ficha11);

		do{
		m=alea.CalcularNumero(1,25000);
		ficha2 =m;
	
		n=alea.CalcularNumero(1,25000);
		ficha22 =n;
		
			if((ficha1==ficha2)||(ficha1==ficha22)||(ficha11==ficha2)||(ficha11==ficha22)){
			System.out.println (ficha2+"       "+ficha22);
			ficha1=ficha2;
			ficha11=ficha22;
			i++;
			}
		}while(i<=cantidad);
		
	}
}

