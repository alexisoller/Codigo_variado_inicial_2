/*
 * 
 */

package utilidades;
import java.util.Random;
public class Aleatorio {
	private int numero;
	public int CalcularNumero (int a,int b) {
		int r;
		Random rdn =new Random();
		r = rdn.nextInt(b-a+1)+a;
		return r;
		}
}

