import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;

public class HelloWorld {
	public static void main(String[] args) {
		int[] estado = {1,1};
		int[] esucesor = {2,0};
		
		boolean[] vecinos =  {true, true, false, true};
		Celda cs = new Celda(2, 0, 3, vecinos);
		
		//System.out.println(cs.toString());
		
		int coste = (((estado[0] % 2)+1) * ((cs.getValor())+1));
		
		System.out.println(((estado[0] % 2)+1));
		System.out.println(((cs.getValor())+1));
		System.out.println(coste);
	}
}
