/*
 * 
 * 
 */
import utilidades.*;
import java.util.Scanner;
public class fechaaleatoria {
	
	public static void main (String args[]) {
	int d,m,a,p=1;
	boolean resultado;
	
	do {
	Scanner introducir =new Scanner(System.in);
	Aleatorio fecha =new Aleatorio();
	d=fecha.CalcularNumero (1,31); //nombredelobjetocreado.public (nombre)
	System.out.print(d+"/");
	m=fecha.CalcularNumero (1,12);//nombredelobjetocreado.public (nombre)
	System.out.print(m+"/");
	a=fecha.CalcularNumero (1900,2100);//nombredelobjetocreado.public (nombre)
	System.out.print(a);
	FiltroFecha fechabien =new FiltroFecha();
	fechabien.setDia(d);//comprobacion de si d es correcto respecto a m
	fechabien.setMes(m);//comprobacion de si m es correcto
	fechabien.setAny(a);//comprobacion de si a es correcto
	resultado=fechabien.filtro();//respueta del metodo filtro (es el que calcula si esta bien o mal y da true o false)
	System.out.println("");
	if(resultado){
		System.out.println("la fecha es correcta");
			System.out.println("");
		}else{
			System.out.println("la fecha es incorrecta");
				System.out.println("");
			}
			p=p+1;
			}while(p!=1500);
		
	}
	}


