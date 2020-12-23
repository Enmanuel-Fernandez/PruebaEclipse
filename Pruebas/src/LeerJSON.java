import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import org.json.*;


public class LeerJSON {
	public static void main(String[] args) {
		
		//Obtener un objeto JSON con los datos del JSON
		try {
			JSONTokener tokener = new JSONTokener(new FileReader("JSON.json"));
			JSONObject obj = new JSONObject(tokener);
			System.out.println(obj);
			
			//Leer valores unicos
			int valor = obj.getInt("value");
			System.out.println(valor);
			
			//Leer array
			boolean[] v = new boolean[4];
			JSONArray vecinos = obj.getJSONArray("neighbors");
			v[0] = vecinos.getBoolean(0);
			v[1] = vecinos.getBoolean(1);
			v[2] = vecinos.getBoolean(2);
			v[3] = vecinos.getBoolean(3);
			System.out.println(Arrays.toString(v));
			
			//Leer otro objeto JSON dentro del objeto JSON tocho
			JSONObject cosa = obj.getJSONObject("Cosa");
			System.out.println(cosa);
			int nose = cosa.getInt("no se");
			System.out.println(nose);
			boolean lmao = cosa.getBoolean("lmao");
			System.out.println(lmao);
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
