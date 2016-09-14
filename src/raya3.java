import utilidades.*;
import java.util.Scanner;
public class raya3 {
	
	public static void main (String args[]) {
		char a='1',b='2',c='3',d='4',e='5',f='6',g='7',h='8',i='9',ordenador;
		int usuario,ordenadoral ;
		Scanner introducir = new Scanner (System.in);
		Aleatorio ale=new Aleatorio ();
		ganamaquina ganama=new ganamaquina();
		while((a!='X')||(b!='X')||(c!='X')||(d!='X')||(e!='X')||(f!='X')||(g!='X')||(h!='X')||(i!='X')||(a!='O')||(b!='O')||(c!='O')||(d!='O')||(e!='O')||(f!='O')||(g!='O')||(h!='O')||(i!='O')){
		System.out.print (" "+a+" ");//inicio del tablero
		System.out.print (" "+b+" ");
		System.out.println (" "+c+" ");
		System.out.println ();
		System.out.print (" "+d+" ");
		System.out.print (" "+e+" ");
		System.out.println (" "+f+" ");
		System.out.println ();
		System.out.print (" "+g+" ");
		System.out.print (" "+h+" ");
		System.out.println (" "+i+" ");
		System.out.println ();//fin del tablero
		System.out.println ("MUEVE FICHA USUARIO");
		usuario=introducir.nextInt();
		
		if(usuario==1 ){
			a='X';
			}else {//cierre del if + else 1
				if(usuario==2 ){
					b='X';
					}else{//cierre del if + else2
						if(usuario==3 ){
							c='X';
							}else{//cierre if + else3
								if(usuario==4 ){
									d='X';
									}else {//cierre if + else 4
										if(usuario==5 ){
											e='X';
											}else{//cierre if + else5
												if(usuario==6 ){
													f='X';
													}else{//cierre if + else6
														if(usuario==7 ){
															g='X';
															}else{//cierre if + else7
																if(usuario==8 ){
																h='X';
																}else{//cierre if + else 8
																	if(usuario==9 ){
																		i='X';
																		}
																	}//cierre else8
																}//cierre else 7
														}//else 6
												}//cierre else 5
										}//cierre else 4
								}//cierre else 3
						} //cierre else2
				
				}//fin else1
	
	
	
	ordenador=ganama.maquina(a,b,c,d,e,f,g,h,i);
	
	if((ordenador==1)||(ordenador==2)||(ordenador==3)||(ordenador==4)||(ordenador==5)||(ordenador==6)||(ordenador==7)||(ordenador==8)||(ordenador==9)){
	if(ordenador==1){
			a='O';
			}else {//cierre del if + else 1
				if(ordenador==2){
					b='O';
					}else{//cierre del if + else2
						if(ordenador==3){
							c='O';
							}else{//cierre if + else3
								if(ordenador==4){
									d='O';
									}else {//cierre if + else 4
										if(ordenador==5){
											e='O';
											}else{//cierre if + else5
												if(ordenador==6){
													f='O';
													}else{//cierre if + else6
														if(ordenador==7){
															g='O';
															}else{//cierre if + else7
																if(ordenador==8){
																h='O';
																}else{//cierre if + else 8
																	if(ordenador==9){
																		i='O';
																		}
																	}//cierre else8
																}//cierre else 7
														}//else 6
												}//cierre else 5
										}//cierre else 4
								}//cierre else 3
						} //cierre else2
				
				}//fin else1
	}
	
	if(ordenador=='K'){
	ordenadoral=ale.CalcularNumero(1,9);//LLAMADA AL METODO ALEATORIO ENTRE 1 Y 9
	System.out.println ("EL ORDENADO JUEGA CON "+ordenadoral);
		if(ordenadoral==1){
			a='O';
			}else {//cierre del if + else 1
				if(ordenadoral==2){
					b='O';
					}else{//cierre del if + else2
						if(ordenadoral==3){
							c='O';
							}else{//cierre if + else3
								if(ordenadoral==4){
									d='O';
									}else {//cierre if + else 4
										if(ordenadoral==5){
											e='O';
											}else{//cierre if + else5
												if(ordenadoral==6){
													f='O';
													}else{//cierre if + else6
														if(ordenadoral==7){
															g='O';
															}else{//cierre if + else7
																if(ordenadoral==8){
																h='O';
																}else{//cierre if + else 8
																	if(ordenadoral==9){
																		i='O';
																		}
																	}//cierre else8
																}//cierre else 7
														}//else 6
												}//cierre else 5
										}//cierre else 4
								}//cierre else 3
						} //cierre else2
				
				}//fin else1
			}//cierre del if ordenador=='k'
				
		}//cierre de bucle
				System.out.print (" "+a+" ");//inicio del tablero
		System.out.print (" "+b+" ");
		System.out.println (" "+c+" ");
		System.out.println ();
		System.out.print (" "+d+" ");
		System.out.print (" "+e+" ");
		System.out.println (" "+f+" ");
		System.out.println ();
		System.out.print (" "+g+" ");
		System.out.print (" "+h+" ");
		System.out.println (" "+i+" ");
		System.out.println ();//fin del tablero
		
	}//cierre main
}//cierre de clase

