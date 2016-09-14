

package utilidades;
public class ganal {
	
	public int[] comprobar (char resultado[] [],char valor) {
		int contador=0,fila=9,columna=9,x,y,r=0;
		int [] devolucion = {9,9};
		
//comprobacion por filas tapar jugada o ganar pc
	for(x=0;x<3;x++){
			contador=0;
			fila=9;
			columna=9;
			for(y=0;y<3;y++){
			if (resultado[x][y]==valor){
				contador++;
				}
				
			if(resultado [x][y]=='.'){
				
				fila=x;
				
				columna=y;
				
				}	
			}
			
			if ((contador==2)&&(fila!=9)){
			devolucion [0]=fila;
			devolucion [1]=columna;
			return devolucion;
			}
		}
		//comprobacion FINAL por filas tapar jugada o ganar pc
		//comprobacion por columnas tapar juagada o ganar pc
		
//comprobacion por filas tapar jugada o ganar pc
	for(y=0;y<3;y++){
			contador=0;
			fila=9;
			columna=9;
			for(x=0;x<3;x++){
			if (resultado[x][y]==valor){
				contador++;
				}
				
			if(resultado [x][y]=='.'){
				
				fila=x;
				
				columna=y;
				
				}	
			}
			
			if ((contador==2)&&(fila!=9)){
			devolucion [0]=fila;
			devolucion [1]=columna;
			return devolucion;
			}
		}
		
		//comprobacion FINAL por columnas tapar juagada o ganar pc
		
		
//comprobacion diagonal [0.0][1.1][2.2]
		
		x=0;
		contador=0;
			fila=9;
			columna=9;
			for(y=0;y<3;y++){
			if (resultado[x][y]==valor){
				contador++;
				}
				
			if(resultado [x][y]=='.'){
				
				fila=x;
				
				columna=y;
				
				}	
			x++;	
			}
			
			if ((contador==2)&&(fila!=9)){
			devolucion [0]=fila;
			devolucion [1]=columna;
			return devolucion;
			}
		
		//comprobacion FINAL diagonal [0.0][1.1][2.2]
		
//comprobacion diagonal [0.2][1.1][2.0]
		
		y=2;
		contador=0;
			fila=9;
			columna=9;
			for(x=0;x<3;x++){
			if (resultado[x][y]==valor){
				contador++;
				}
				
			if(resultado [x][y]=='.'){
				
				fila=x;
				
				columna=y;
				
				}	
			y--;	
			}
			
			if ((contador==2)&&(fila!=9)){
			devolucion [0]=fila;
			devolucion [1]=columna;
			return devolucion;
			}
		
		
		//comprobacion FINAL diagonal [0.2][1.1][2.0]
		
		
				return devolucion;//VALORES POR DEFECTO 9,9
				
	}
}

