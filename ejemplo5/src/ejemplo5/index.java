package ejemplo5;

import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		  float peseta ;
		  float euro = (float) 0.00601;
		  System.out.println("ingresa la cantidad de peseta a convertir:");
		  peseta = teclado.nextFloat();
		  System.out.println("el valor de la Euro es:");
		  float conversion = peseta * euro;
		  System.out.println(conversion);
		  teclado.close();
	}

}
