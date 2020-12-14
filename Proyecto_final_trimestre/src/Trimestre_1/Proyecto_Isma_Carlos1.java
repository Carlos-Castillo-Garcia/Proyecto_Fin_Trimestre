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
		int pmc;
		int numerocimas = 0;
		int cimamasalta = 0;
		
		
		System.out.println("las filas:");
		fila = entrada.nextInt();
		System.out.println("las columnas:");
		columna = entrada.nextInt();
		System.out.println("perimetro de comparacion:");
		pmc = entrada.nextInt();
		
		int mapa [][] = new int [fila][columna];
		int zona [][] = new int [(pmc*2)+1][(pmc*2)+1];
		//rellenado de matriz mapa
		for(int cf = 0;cf < fila; cf++) {
			for(int cc = 0; cc < columna; cc++) {
				mapa[cf][cc] = (int) (Math.random()*10);
			}
		}
		//Impresion de matriz mapa
		for(int cf = 0;cf < fila; cf++) {
			for(int cc = 0; cc < columna; cc++) {
				System.out.printf("%d ", mapa[cf][cc]);
			}
			System.out.println("");
		}
		int z=0;
		int pf = 0;
		do {
			int pc = 0;
			do {
				for(int f = (0+pf), fz = 0; f < (pmc*2)+1; f++, fz++) {
 					for(int c = (0+pc), cz = 0; c < (pmc*2)+1; c++, cz++) {
						zona[fz][cz] = mapa[f][c];
					}
				}
				//comprobar el 1º centro con sus alrederores
				int m = 0;
				for(int f = 0 ; f < (pmc*2)+1; f++) {
					for(int c = 0; c < (pmc*2)+1; c++) {
						//Si (si sus alrederores son menores en almenos 1 es cima)
						if(zona[pmc][pmc] - zona[f][c] > 0 ) {
							
						}else {//Si no (no es cima)
							m++;
						}
					}
				}

//				if(m==1) {
//					//sumamos contador de cimas 
//					numerocimas++;
//					//comprobar si es valor maximo
//					if(zona[pmc][pmc] == 9) {
//						//sumar contador de cimas mayores
//						cimamasalta++;
//					}//si no es valor maximo solo contarlo
//				}
//			//rellenado de las siguentes zonas
				pc++;
				if(pc == columna-(pmc*2)) {
					pf++;
				}	
				System.out.println(z);
				z++;
			}while(pc < columna-(pmc*2) );
		}while(pf < fila-(pmc*2));
		System.out.println("el numero de cimas es:"+numerocimas);
		System.out.println("el numero de cimas mas altas es:"+cimamasalta);
	
	entrada.close();
	}

}
