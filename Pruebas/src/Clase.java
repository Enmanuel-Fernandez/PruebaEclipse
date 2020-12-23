import java.util.Arrays;

public class Clase {
	private int[] posicion = new int[2];
	private int valor;
	private boolean[] vecinos;
	
	public Clase(int posX, int posY) {
		this.posicion[0] = posX;
		this.posicion[1] = posY;
		valor = 0;
		vecinos = new boolean[4];
		
		for (int i=0; i<vecinos.length; i++)
			vecinos[i] = false;
	}

	public int[] getPosicion() {
		return posicion;
	}
	
	public void setPosicion(int[] posicion) {
		this.posicion = posicion;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public boolean[] getVecinos() {
		return vecinos;
	}

	public void setVecinos(boolean[] vecinos) {
		this.vecinos = vecinos;
	}
	
	/*********************************************************************
	*
	* Nombre del metodo: visitar
	* Descripcion: dada una celda (instancia concreta de Celda) y una
	* posicion del 0 al 3 (int coordenada), se va a marcar como que dicha
	* celda tiene vecino en la posicion elegida.
	* Argumentos:
	*	int coordenada
	*
	*********************************************************************/
	
	public void visitar(int coordenada) {
		vecinos[coordenada] = true;
	}
	
	/*********************************************************************
	*
	* Nombre del metodo: desvisitar
	* Descripcion: dada una celda (instancia concreta de Celda) y una
	* posicion del 0 al 3 (int coordenada), se va a marcar como que dicha
	* celda no tiene vecino en la posicion elegida.
	* Argumentos:
	*	int coordenada
	*
	*********************************************************************/
	
	public void desvisitar(int coordenada) {
		vecinos[coordenada] = false;
	}

	public String toString() {
		return "("+posicion[0]+", "+posicion[1]+"): valor:" + valor + ", vecinos: [" + Arrays.toString(vecinos) + "]";
	}
	
	
}
