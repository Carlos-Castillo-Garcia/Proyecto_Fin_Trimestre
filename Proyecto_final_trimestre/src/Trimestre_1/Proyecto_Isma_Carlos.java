/**
 * 
 */
package Trimestre_1;
import java.util.Scanner;
/**
 * @author CARLOS
 *
 */
public class Proyecto_Isma_Carlos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int montana[][];
		int fila;
		int columna;
		int cimas=0;
		int cimasm=0;
		
		System.out.println("Escribe el numero de filas que quieres que tenga el mapa:");
		fila=sc.nextInt();
		System.out.println("Escribe el numero de columnas que quieres que tenga el mapa:");
		columna=sc.nextInt();
		
		montana= new int[fila][columna];
		
		for(int i=0; i<fila; i++) {
			for(int j=0; j<columna; j++) {
				montana[i][j]=(int) (Math.random()*10);
				System.out.printf("%d ",montana[i][j]);
			}
			System.out.println("");
		}
		
		for(int i=1; i<fila-1; i++) {
			for(int j=1; j<columna-1; j++) {
				if(montana[i][j]>montana[i-1][j-1] && montana[i][j]>montana[i-1][j] && montana[i][j]>montana[i-1][j+1] && montana[i][j]>montana[i][j-1] && montana[i][j]>montana[i][j+1] && montana[i][j]>montana[i+1][j-1] && montana[i][j]>montana[i+1][j] && montana[i][j]>montana[i+1][j+1]) {
					cimas++;
					if(montana[i][j]==9) {
						cimasm++;
					}
				}
			}
		}
		
		System.out.printf("hay %d cimas\n",cimas);
		System.out.printf("Y hay %d con la cima mas alta",cimasm);
		
		sc.close();

	}
}