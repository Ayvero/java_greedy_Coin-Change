package Greddy;


	

	import java.util.ArrayList;
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
	public class Greedy {

		private Double[] cajero;

		public Greedy() {
			// Los billetes del cajero est�n ordenados de mayor a menor
			cajero = new Double[5];
			cajero[0] = 100.0;
			cajero[1] = 25.0;
			cajero[2] = 10.0;
			cajero[3] = 5.0;
			cajero[4] = 1.0;
		}

		public List<Double> getDinero(Double total_a_pagar) {
			List<Double> extraccion = new ArrayList<Double>();
			Double total = 0.0;
			int indice = 0;
			while (cajero.length > 0 && indice < cajero.length && total < total_a_pagar) {
				Double billete = cajero[indice];
				if ((billete + total) <= total_a_pagar) {
					extraccion.add(billete);
					total += billete;
				} else {
					indice++;
				}
			}
			return extraccion;
		}

	}


