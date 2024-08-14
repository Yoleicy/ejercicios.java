package ejemplo4;

import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner teclado = new Scanner (System.in);
  float euro ;
  float peseta = (float) 166.386;
  System.out.println("ingresa la cantidad de Euros a convertir:");
  euro = teclado.nextFloat();
  System.out.println("el valor de la Peseta es:");
  float conversion = euro * peseta;
  System.out.println(conversion);
  teclado.close();
	}

}
