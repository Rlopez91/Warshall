package Warshall;

public class Warshall {
	public static void procesowarshall(int mat[][]) {
		int n = mat.length;
		for(int k=0; k<n; k++) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(mat[i][j] != 1) {
						mat[i][j] = mat[i][k] & mat[k][j];
					}
				}
			}
		}
	}
	
	public static void mostrarMatriz(int [][] mat) {
		int n = mat.length;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(" "+mat[i][j]);
			}
			System.out.println(" ");	
		}
	}
}
