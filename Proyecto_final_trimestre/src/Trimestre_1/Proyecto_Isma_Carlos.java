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
		
		
		System.out.println("Escribe el numero de filas que quieres que tenga el mapa:");
		fila=sc.nextInt();
		System.out.println("Escribe el numero de columnas que quieres que tenga el mapa:");
		columna=sc.nextInt();
		
		montana= new int[fila][columna];
		
		for(int i=0; i<fila; i++) {
			for(int j=0; j<columna; j++) {
				montana[i][j]=(int) (Math.random()*10);
			}
		}
		
		for(int i=0; i<fila; i++) {
			for(int j=0; j<columna; j++) {
				System.out.printf("%d ",montana[i][j]);
			}
			System.out.println("");
		}
		
		sc.close();

	}

}
