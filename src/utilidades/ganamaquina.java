

package utilidades;
import utilidades.*;
public class ganamaquina {
	
	public int maquina (char num1,char num2,char num3,char num4,char num5,char num6,char num7,char num8,char num9,char m,char f ) {
		int r=0;
	
	//ver si el ordenador puede ganar con las diferentes combinaciones
		if ((num1==m)&&(num2==m)&&(num3!=f)){
			r=3;
			return r;
			}//fin if
			
		if ((num1==m)&&(num3==m)&&(num2!=f)){
			r=2;
			return r;
			}//fin if
			
		if ((num2==m)&&(num3==m)&&(num1!=f)){
			r=1;
			return r;
			}//fin if	
			
		if ((num4==m)&&(num5==m)&&(num4!=f)){
			r=6;
			return r;
			}//fin if	
			
		if ((num4==m)&&(num6==m)&&(num5!=f)){
			r=5;
			return r;
			}//fin if	
				
		if ((num5==m)&&(num6==m)&&(num4!=f)){
			r=4;
			return r;
			}//fin if
				
		if ((num7==m)&&(num8==m)&&(num9!=f)){
			r=9;
			return r;
			}//fin if
				
		if ((num7==m)&&(num9==m)&&(num8!=f)){
			r=8;
			return r;
			}//fin if	
			
		if ((num8==m)&&(num9==m)&&(num7!=f)){
			r=7;
			return r;
			}//fin if	
			
		if ((num1==m)&&(num4==m)&&(num7!=f)){
			r=7;
			return r;
			}//fin if
				
		if ((num1==m)&&(num7==m)&&(num4!=f)){
			r=4;
			return r;
			}//fin if
				
		if ((num4==m)&&(num7==m)&&(num1!=f)){
			r=1;
			return r;
			}//fin if
				
		if ((num1==m)&&(num5==m)&&(num9!=f)){
			r=9;
			return r;
			}//fin if
				
		if ((num5==m)&&(num9==m)&&(num1!=f)){
			r=1;
			return r;
			}//fin if
				
		if ((num1==m)&&(num9==m)&&(num5!=f)){
			r=5;
			return r;
			}//fin if	
			
		if ((num7==m)&&(num5==m)&&(num3!=f)){
			r=3;
			return r;
			}//fin if	
			
		if ((num5==m)&&(num3==m)&&(num7!=f)){
			r=7;
			return r;
			}//fin if
				
		if ((num3==m)&&(num7==m)&&(num5!=f)){
			r=5;
			return r;
			}//fin if
				
		if ((num2==m)&&(num5==m)&&(num8!=f)){
			r=8;
			return r;
			}//fin if	
			
		if ((num2==m)&&(num8==m)&&(num5!=f)){
			r=5;
			return r;
			}//fin if
				
		if ((num5==m)&&(num8==m)&&(num2!=f)){
			r=2;
			return r;
			}//fin if
				
		if ((num3==m)&&(num6==m)&&(num9!=f)){
			r=9;
			return r;
			}//fin if
				
		if ((num6==m)&&(num9==m)&&(num3!=f)){
			r=3;
			return r;
			}//fin if	
			
		if ((num3==m)&&(num9==m)&&(num6!=f)){
			r=6;
			return r;
			}//fin if	
	
				
					
		return r;
		}
}
