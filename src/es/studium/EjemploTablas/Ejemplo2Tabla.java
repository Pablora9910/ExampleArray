package es.studium.EjemploTablas;

import java.util.Scanner;

public class Ejemplo2Tabla
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		final int TAM=5;
		int tabla[] = new int[TAM] ;
		int i;
		for(i=0; i<TAM; i++)
		{
			System.out.println("Dame el valor de tabla["+i+"]");
			tabla[i]=teclado.nextInt();
		}
		for(i=0; i<TAM; i++)
		{
			System.out.println("Valor en la tabla ["+i+"] = " + tabla[i]);
		}
		teclado.close();
	}
}
