/**
 * 
 */
package Trimestre_1;
import java.util.Scanner;

/**
 * @author CARLOS
 *
 */
public class Proyecto_Isma_Carlos1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int fila;
		int columna;
		int numerocimas = 0;
		int cimamasalta = 0;
		int zona [][] = new int [3][3];
		
		System.out.println("Ecriba las filas que quiere que tenga el mapa:");
		fila = entrada.nextInt();
		System.out.println("Ecriba las columnas que quiere que tenga el mapa:");
		columna = entrada.nextInt();
		int mapa [][] = new int [fila][columna];
		
		for(int cf = 0;cf < fila; cf++) {
			for(int cc = 0; cc < columna; cc++) {
				mapa[cf][cc] = (int) (Math.random()*10);
				System.out.printf("%d ", mapa[cf][cc]);
			}
			System.out.println("");
		}
		
		int pf = 0;
		do {
			int pc = 0;
			do {
				for(int f = (0+pf), fz = 0; f < (pf+3); f++, fz++) {
 					for(int c = (0+pc), cz = 0; c < (pc+3); c++, cz++) {
						zona[fz][cz] = mapa[f][c];
					}
				}
				int m = 0;
				for(int f = 0 ; f < 3; f++) {
					for(int c = 0; c < 3; c++) {
						if(zona[1][1] > zona[f][c]) {
							m++;
						}
					}
				}
				if(m==8) {
					numerocimas++;
					if(zona[1][1] == 9) {
						cimamasalta++;
					}
				}
				pc++;
				if(pc == columna-2) {
					pf++;
				}				
			}while(pc < columna-2 );
		}while(pf < fila-2);
		System.out.println("el numero de cimas es:"+numerocimas);
		System.out.println("el numero de cimas mas altas es:"+cimamasalta);
	entrada.close();
	}
}