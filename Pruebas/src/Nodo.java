import java.util.Arrays;

/*********************************************************************
* Nombre de la clase: Nodo
* Autores: B1_5 
* Descripcion: clase con la informacion de un Nodo.
*
**********************************************************************
*/

public class Nodo implements Comparable<Nodo> {
	private int id;
	private double costo;
	private int[] estado;
	private Nodo padre;
	private String accion;
	private int profundidad;
	private double heuristica;
	private double valor;
	
	public Nodo(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public int[] getEstado() {
		return estado;
	}

	public void setEstado(int[] estado) {
		this.estado = estado;
	}

	public Nodo getPadre() {
		return padre;
	}

	public void setPadre(Nodo padre) {
		this.padre = padre;
	}

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	public int getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(int profundidad) {
		this.profundidad = profundidad;
	}

	public double getHeuristica() {
		return heuristica;
	}

	public void setHeuristica(double heuristica) {
		this.heuristica = heuristica;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	/*********************************************************************
	*
	* Nombre del metodo: CompareTo
	* Descripcion: clase que va a servir para ordenar los nodos segun su valor,
	* fila y columna, en caso de empates.
	* 
	* Argumentos:
	*	Nodo n: nodo con el que comparar
	*
	*********************************************************************/
	
	public int compareTo(Nodo n) {
		int valorComparar = 0;
		if (valor < n.getValor())
			valorComparar = -1;
		else if (valor > n.getValor())
			valorComparar = 1;
		else {
			if (estado[0] < n.getEstado()[0])
				valorComparar = -1;
			else if (estado[0] > n.getEstado()[0])
				valorComparar = 1;
			else {
				if (estado[1] < n.getEstado()[1])
					valorComparar = -1;
				else if (estado[1] > n.getEstado()[1])
					valorComparar = 1;
				else {
					if (id < n.getId())
						valorComparar = -1;
					else
						valorComparar = 1;
				}
			}
		}
		
		return valorComparar;
	}

	public String toString() {
		return "Nodo [id=" + id + ", estado=" + Arrays.toString(estado) + ", valor=" + valor + "]";
	}
}