

package utilidades;
public class tablero {
	
	public  void table (char table [] []) {
		int x,y;
		for(x=0;x<3;x++){
			for(y=0;y<3;y++){
				System.out.print(" "+table[x][y]+" ");
				}
				System.out.println("");
			}
	}
}

