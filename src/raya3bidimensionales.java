

import utilidades.*;
import java.util.Scanner;
public class raya3bidimensionales {
	
	public static void main (String args[]) {
	Scanner introducir=new Scanner(System.in);
	tablero tabla=new tablero ();
	Aleatorio alea=new Aleatorio();
	comprobacionganador gana=new comprobacionganador();
	ganal ganador =new ganal();
	int [] valor = {9,9};
	
	int filau,colu,aleatorio,filap,colump,empate;
	char usuario,gp;
	boolean ganausu,ganapc,pcr=false;
	char resultado[][] = new char [3][3];
	resultado [0][0]='.';
	resultado [0][1]='.';
	resultado [0][2]='.';
	resultado [1][0]='.';
	resultado [1][1]='.';
	resultado [1][2]='.';
	resultado [2][0]='.';
	resultado [2][1]='.';
	resultado [2][2]='.';
	System.out.println ("estas son las posiciones en las que puedes jugar");
	System.out.println ("[0,0]"+"[0,1]"+"[0,2]");
	System.out.println ("[1,0]"+"[1,1]"+"[1,2]");
	System.out.println ("[2,0]"+"[2,1]"+"[2,2]");
	
	aleatorio=alea.CalcularNumero(1,2);//con el numero 1 empezara el usaurio, con el numero 2 empezara el ordenador
	
	if(aleatorio==1){
	empate=0;
	System.out.println ("numero de jugada del usuario"+empate);
	while (empate!=9){
	tabla.table(resultado);
	//introduccion del usuario
	do{
	do{//filtro para introducir valor correcto en la fila
	System.out.println ("introduce una fila (0,1,2)");
	filau=introducir.nextInt();
	}while ((filau<0) || (filau>2));
	//FIN filtro para introducir valor correcto en la fila
	//filtro para introducir valor correcto en la columna
	do{
	System.out.println ("introduce una columna (0,1,2)");
	colu=introducir.nextInt();
	}while(((colu<0) || (colu>2 )));
	//FIN filtro para introducir valor correcto en la fila
	//mensaje casilla ocupada
	if(resultado [filau][colu]!='.'){
		System.out.println("la casilla esta ocupada,vuelve a introducir");
		}
	}while(resultado [filau][colu]!='.');
	//escritura en el tablero
	while(resultado [filau][colu]=='.'){
	resultado [filau][colu]='X';
	}
	tabla.table(resultado);
	empate=empate+1;
		//comprobacion de si el usuario gana
	ganausu=gana.ganador(resultado,'X');
	System.out.println (ganausu+"  ¿ganador usuario?");
	if (ganausu==true){
		System.out.println ("GANA EL USUARIO");
		tabla.table(resultado);
		break;
		//FIN comprobacion de si el usuario gana
	//fin introduccion usuario	
	
		}//cierre if
		
		//introduccion ordenador
	//comprobacion de si el pc puede ganar	
	valor=ganador.comprobar(resultado,'O');
	
	if((valor[0]!=9)&&(valor [1]!=9)){
		do{
		resultado[valor[0]][valor[1]]='O';
		ganausu=gana.ganador(resultado,'O');
		empate=empate+1;
		}while(resultado[valor[0]][valor[1]]=='.');
		}
	//FIN comprobacion de si el pc puede ganar		
	//comprobacion de si el usuario puede ganar	
	valor=ganador.comprobar(resultado,'X');
	
	if((valor[0]!=9)&&(valor [1]!=9)){
		do{
		resultado[valor[0]][valor[1]]='O';
		ganausu=gana.ganador(resultado,'O');
		empate=empate+1;
		}while(resultado[valor[0]][valor[1]]=='.');
		
		}
	//FIN comprobacion de si el usuario puede ganar	
	//aleatorio
	if((valor[0]==9)&&(valor [1]==9)){
		while(pcr==false){//filtro para evitar que el ordenador sobre escriba
		filap=alea.CalcularNumero(0,2);
		colump=alea.CalcularNumero(0,2);
		System.out.println ("el ordenador juega con la fila  "+filap);
		System.out.println ("el ordenador juega con la columna  "+colump);
		if(resultado[filap][colump]=='.'){
		resultado[filap][colump]='O';
		pcr=true;
		empate=empate+1;
		}
		}
		pcr=false;//para volver el contador a false y poderlo utilizarlo en el bucle
		//FIN filtro para evitar que el ordenador sobre escriba
		}	
	//FIN aleatorio
	
	System.out.println ("numero de jugada del ordenador"+empate);
		//comprobacion ganador pc
	ganapc=gana.ganador(resultado,'O');
	System.out.println (ganapc+"  ¿ganador pc?");
	if (ganapc==true){
		System.out.println ("GANA EL ORDENADOR");
		tabla.table(resultado);
		break;
	}
	//FIN comprobacion ganador pc
	//fin introduccion ordenador
		
	}//cierre bucle
	if (empate==9) {
		System.out.println("EMPATE NO HAY GANADOR");
		}
}else {
	empate=0;
	System.out.println ("numero de jugada del usuario"+empate);
	while (empate<=9){
	
	//introduccion ordenador
	//comprobacion de si el pc puede ganar	
	valor=ganador.comprobar(resultado,'O');
	
	if((valor[0]!=9)&&(valor [1]!=9)){
		do{
		resultado[valor[0]][valor[1]]='O';
		ganausu=gana.ganador(resultado,'O');
		empate=empate+1;
		System.out.println("el ordenador ha jugado");
		}while(resultado[valor[0]][valor[1]]=='.');
		}
	//FIN comprobacion de si el pc puede ganar		
	//comprobacion de si el usuario puede ganar	
	valor=ganador.comprobar(resultado,'X');
	
	if((valor[0]!=9)&&(valor [1]!=9)){
		do{
		resultado[valor[0]][valor[1]]='O';
		ganausu=gana.ganador(resultado,'O');
		empate=empate+1;
		System.out.println("el ordenador ha jugado");
		}while(resultado[valor[0]][valor[1]]=='.');
		}
	//FIN comprobacion de si el usuario puede ganar	
	//aleatorio
	if((valor[0]==9)&&(valor [1]==9)){
		while(pcr==false){//filtro para evitar que el ordenador sobre escriba
		filap=alea.CalcularNumero(0,2);
		colump=alea.CalcularNumero(0,2);
		if(resultado[filap][colump]=='.'){
		resultado[filap][colump]='O';
		pcr=true;
		empate=empate+1;
		System.out.println("el ordenador ha jugado");
		}
		}
		pcr=false;//para volver el contador a false y poderlo utilizarlo en el bucle
		//FIN filtro para evitar que el ordenador sobre escriba
		}	
	//FIN aleatorio
	if(empate==9){
			System.out.println("EMPATE,NO HAY GANADOR");
			break;
			}
		//comprobacion ganador pc
	ganapc=gana.ganador(resultado,'O');
	if (ganapc==true){
		System.out.println ("GANA EL ORDENADOR");
		tabla.table(resultado);
		break;
	}
	//FIN comprobacion ganador pc
	tabla.table(resultado);
	//fin introduccion ordenador
//introduccion del usuario
	do{
	do{//filtro para introducir valor correcto en la fila
	System.out.println ("introduce una fila (0,1,2)");
	filau=introducir.nextInt();
	}while ((filau<0) || (filau>2));
	//FIN filtro para introducir valor correcto en la fila
	//filtro para introducir valor correcto en la columna
	do{
	System.out.println ("introduce una columna (0,1,2)");
	colu=introducir.nextInt();
	}while(((colu<0) || (colu>2 )));
	//FIN filtro para introducir valor correcto en la fila
	//mensaje casilla ocupada
	if(resultado [filau][colu]!='.'){
		System.out.println("la casilla esta ocupada,vuelve a introducir");
		}
	}while(resultado [filau][colu]!='.');
	//escritura en el tablero
	while(resultado [filau][colu]=='.'){
	resultado [filau][colu]='X';
	}
	tabla.table(resultado);
	empate=empate+1;
		//comprobacion de si el usuario gana
	ganausu=gana.ganador(resultado,'X');
	if (ganausu==true){
		System.out.println ("GANA EL USUARIO");
		tabla.table(resultado);
		break;
		//FIN comprobacion de si el usuario gana
	//fin introduccion usuario	
	
		}//cierre if	
	}//cierre bucle
	}
	}//cierre main
}//cierre clase

