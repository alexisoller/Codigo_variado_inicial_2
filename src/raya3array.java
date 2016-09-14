/*
 *
 * 
 * 
 */
import utilidades.*;
import java.util.Scanner;
public class raya3array {
	
	public static void main (String args[]) {
	Scanner introducir=new Scanner(System.in);
	char [] resultado= new char [10];
	Aleatorio aleatorio=new Aleatorio();
	ganamaquina gana=new ganamaquina();
	ganador ganar=new ganador();
	tablero tabla=new tablero();
	int i,usuario,alea,ordenador,x;
	int comp,comp2;
	boolean winner,winner2;
	
	resultado[0]='.';
	resultado[1]='.';
	resultado[2]='.';
	resultado[3]='.';
	resultado[4]='.';
	resultado[5]='.';
	resultado[6]='.';
	resultado[7]='.';
	resultado[8]='.';

	
	//alea=aleatorio.CalcularNumero(1,2);//1 sera el usuario,2 sera el pc
	alea=1;
	if(alea==1){
		System.out.println("EMPIEZA EL USUARIO");
		while(resultado[0]=='.'){
	tabla.metodopintar(resultado);
	//introduccion del usuario
		System.out.print ("el usuario juega con ");
		usuario=introducir.nextInt();
		while((resultado[usuario]!='X')&&(resultado[usuario]!='O')){
		resultado[usuario]='X';
		}
		winner=ganar.winner(resultado[1],resultado[2],resultado[3],resultado[4],resultado[5],resultado[6],resultado[7],resultado[8],resultado[9],'X');
		if (winner==true){
		System.out.println("el ganador es el USUARIO");
		break;
		}//fin del if
	//fin introduccion usuario
	tabla.metodopintar(resultado);
	//introduccion ordenador
		comp=gana.maquina(resultado[1],resultado[2],resultado[3],resultado[4],resultado[5],resultado[6],resultado[7],resultado[8],resultado[9],'O','X');
		comp2=gana.maquina(resultado[1],resultado[2],resultado[3],resultado[4],resultado[5],resultado[6],resultado[7],resultado[8],resultado[9],'X','O');
		//filtrado de tiradas del ordenador
		System.out.println("el ordenador ha jugado");
		do{
		if(comp!=0){
			resultado[comp]='O';
			}
		}while((resultado[comp]=='X')&&(resultado[comp]=='O'));
		do{
		if(comp2!=0){
			resultado[comp2]='O';
			}
		}while((resultado[comp2]=='X')&&(resultado[comp2]=='O'));
		ordenador=aleatorio.CalcularNumero(1,9);		
		do{
		if((comp2==0)&&(comp==0)) {
		ordenador=aleatorio.CalcularNumero(1,9);
		do{
		resultado[ordenador]='O';
		}while(resultado[ordenador]==ordenador);				
		}//fin del if (comp==10) && (comp2==10)
		}while((resultado[ordenador]=='X')&&(resultado[ordenador]=='O'));
		//fin filtrado
		//fin introduccion ordenador
	winner2=ganar.winner(resultado[1],resultado[2],resultado[3],resultado[4],resultado[5],resultado[6],resultado[7],resultado[8],resultado[9],'O');
		if (winner2==true){
		System.out.println("el ganador es el ORDENADOR");
		break;
		}//fin del if
	}//fin bucle
	tabla.metodopintar(resultado);
		}
		
	
	
}
}
