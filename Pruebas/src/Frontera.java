import java.util.PriorityQueue;

public class Frontera {
	private PriorityQueue<Nodo> listaNodos;
	
	public Frontera() {
		 listaNodos = new PriorityQueue<Nodo>();
	}
	
	public void push (Nodo n) {
		listaNodos.add(n);
	}
	
	public Nodo pop () {
		return listaNodos.poll();
	}

	public boolean isEmpty() {
		return listaNodos.isEmpty();
	}
	
	public String toString() {
		PriorityQueue<Nodo> listaAux = new PriorityQueue<Nodo>();
		String msg = "Frontera [";
		Nodo n;
		
		while (!listaNodos.isEmpty()) {
			n = listaNodos.poll();
			msg += n.toString() + " ";
			listaAux.add(n);
		}
		listaNodos = listaAux;
		msg += "]";
		
		return msg;
	}	

}
