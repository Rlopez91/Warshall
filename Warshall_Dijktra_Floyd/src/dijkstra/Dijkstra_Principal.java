package dijkstra;

import java.util.*;

public class Dijkstra_Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int nodes,source,i,j;
		  Scanner in = new Scanner(System.in);
		  System.out.println("Introduzca el numero de nodos: ");
		  nodes = in.nextInt();
		  Dijkstra d = new Dijkstra();
		  System.out.println("Introduzca la matriz de pesos: ");
		        for(i=1;i<=nodes;i++)
		          for(j=1;j<=nodes;j++)
		    {
		            d.cost[i][j]=in.nextInt();
		            if(d.cost[i][j]==0)
		              d.cost[i][j]=999;
		          }
		  System.out.println("Introduzca el nodo inicial: ");
		  source=in.nextInt();
		  
		     d.calc(nodes,source);
		  System.out.println("El camino mas corto desde el nodo "+source+" a los otro vertices es: ");
		        for(i=1;i<=nodes;i++)
		          if(i!=source)
		 System.out.println("Inicio:"+source+"\t destino:"+i+"\t costo minimo:"+d.distance[i]+"\t");
	}

}
