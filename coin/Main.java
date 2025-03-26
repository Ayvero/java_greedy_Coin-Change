package Greddy;


import java.util.List;



/**
 * Ejercicio 1 Cambio de monedas.
 * 
 * Dado un conjunto C de N tipos de monedas con un n�mero ilimitado de
 * ejemplares de cada tipo, se requiere formar, si se puede, una cantidad M
 * empleando el m�nimo n�mero de ellas.
 * 
 * Por ejemplo, un cajero autom�tico dispone de billetes de distintos valores:
 * 100$, 25$, 10$, 5$ y 1$, si se tiene que pagar 289$, la mejor soluci�n
 * consiste en dar 10 billetes: 2 de 100$, 3 de 25$, 1 de 10$ y 4 de 1$.
 * 
 * 
 *
 */
public class Main {

	public static void main(String[] args) {

		Double total_a_pagar = 231.0;

		Greedy greedy = new Greedy();

		List<Double> resultado = greedy.getDinero(total_a_pagar);

		System.out.println("Para " + total_a_pagar + " se sustrajeron los billetes: \n");
		for (Double billete : resultado) {
			System.out.print(" - " + billete);
		}

	}

}
