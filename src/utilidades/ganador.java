/*

 * 
 */

package utilidades;
import utilidades.*;
public class ganador {
	
	public boolean winner (char num1,char num2,char num3,char num4,char num5,char num6,char num7,char num8,char num9,char ficha) {
		boolean r=false;
		if(((num1==ficha)&&(num2==ficha)&&(num3==ficha))){
			r=true;
			return r;
			}
		if(((num1==ficha)&&(num4==ficha)&&(num7==ficha))){
			r=true;
			return r;
			}
		if(((num1==ficha)&&(num5==ficha)&&(num9==ficha))){
			r=true;
			return r;
			}
		if(((num2==ficha)&&(num5==ficha)&&(num8==ficha))){
			r=true;
			return r;
			}
		if(((num3==ficha)&&(num6==ficha)&&(num9==ficha))){
			r=true;
			return r;
			}
		if(((num3==ficha)&&(num5==ficha)&&(num7==ficha))){
			r=true;
			return r;
			}
		if(((num4==ficha)&&(num5==ficha)&&(num6==ficha))){
			r=true;
			return r;
			}
		
		if(((num7==ficha)&&(num8==ficha)&&(num9==ficha))){
			r=true;
			return r;
			}
		
		
		return r;
	
			
	}
}

