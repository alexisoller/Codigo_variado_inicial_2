package utilidades;
public class posibilidadganar {
	
	public int tapa ( char resultado [] [], char ficha) {
		int c,y,x;
		int r='0';
		
		
		
		//COMPROBACION POR FILAS
		for(x=0;x<=2;x++){
			c=0;
			for(y=0;y<=2;y++){
				if(resultado [x] [y]==ficha){
					c++;
				if (c==2){
					if(resultado [x][y]=='.'){
					return resultado [x][y];
					}
					}//cierre 2 if
					}//cierre primer if
				
				
				}//fin 2º for
			
		}//fin 1 º for

	/*	
		c=0;
		// FINCOMPROBACION POR FILAS
		
		
		//COMPROBACION POR columnas
		for(y=0;y<=2;y++){
			c=0;
			for(x=0;x<=2;x++){
				if(resultado [x] [y]==ficha){
					c++;
				if (c==2){
					r=true;
					return r;
					}//cierre 2 if
					}//cierre primer if
				
				
				}//fin 2º for
			
			}//fin 1 º for
		
		
		c=0;
		// FINCOMPROBACION POR columnas
		
		
		
		
		
		//COMPROBACION DIAGONAL [0.0] [1.1] [2.2]
		x=0;
			for(y=0;y<3;y++){
			if (resultado [x][y]==ficha){
				c++;
			if (c==2){
				r=true;
				return r;
			}//CIERRE DEL IF
				
		}//CIERRE DEL IF
		x++;	
		
		}//CIERRE  FOR
		c=0;
		
	//FIN COMPROBACION DIAGONAL [0.0] [1.1] [2.2]
	
	
	
	//COMPROBACION DIAGONAL [0.2] [1.1] [2.0]
		y=2;
			for(x=0;x<3;x++){
			if (resultado [x][y]==ficha){
				c++;
			if (c==2){
				r=true;
				return r;
			}//CIERRE DEL IF
				
		}//CIERRE DEL IF
		y--;	
		
		}//CIERRE  FOR
	
		c=0;
	//FIN COMPROBACION DIAGONAL [0.2] [1.1] [2.0]
	
	
	*/
		
				
		return r;
	}
}
