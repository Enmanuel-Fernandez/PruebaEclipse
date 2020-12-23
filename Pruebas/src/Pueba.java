import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

import org.json.JSONArray;
import org.json.JSONObject;

public class Pueba {

	public static void main(String[] args){
		String accion;
		int [] estado = new int[2];
		int costo;
		
		String sucesor = "['N', (2,3), 1]";
		StringTokenizer tokens=new StringTokenizer(sucesor, ", ");
		
		accion = tokens.nextToken().substring(2, 3);
		System.out.println(accion);
		
		String e1 = tokens.nextToken();
		String e2 = tokens.nextToken();
		estado[0] = Integer.parseInt(e1.substring(1));
		estado[1] = Integer.parseInt(e2.substring(0,e2.length()-1));
		System.out.println(Arrays.toString(estado));
		
		String c = tokens.nextToken();
		costo = Integer.parseInt(c.substring(0, c.length()-1));
		System.out.println(costo);

	}
}
