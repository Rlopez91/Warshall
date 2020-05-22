package Warshall;

public class Warshall_Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][], n;
		/*para este caso usaremos la ultima matriz 
		 * desarrollada en clase 6x6
		 */
		matriz = new int [6][6];
		n=matriz.length;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++){
				matriz[i][j] = 0;
				//creamos una matriz inicial llena de 0
			}
		}
		
		//ingresamos las celdas donde hay intersecciones
		
		matriz[0][1] = 1;
		matriz[0][2] = 1;
		matriz[0][4] = 1;
		matriz[1][4] = 1;
		matriz[2][4] = 1;
		matriz[4][3] = 1;
		matriz[4][5] = 1;
		matriz[5][3] = 1;
		
		Warshall.procesowarshall(matriz);
		Warshall.mostrarMatriz(matriz);
	}

}
