package es.studium.EjemploTablas;

import java.util.Scanner;

public class Ejemplo3ablas
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		final int TAM=5;
		int tabla[] = new int[TAM] ;
		float tabla2[] = new float[TAM] ;
		int i;
		for(i=0; i<TAM; i++)
		{
			System.out.println("Dame el valor de tabla["+i+"]");
			tabla[i]=teclado.nextInt();
		}
		for(i=0; i<TAM; i++)
		{
			tabla2[i]=(float)tabla[i]/2;
			System.out.println("Valor en la tabla ["+i+"] = " + tabla2[i]);
		}
		teclado.close();
	}
}
