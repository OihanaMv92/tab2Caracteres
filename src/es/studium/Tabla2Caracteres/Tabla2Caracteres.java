package es.studium.Tabla2Caracteres;

import java.util.Scanner;

public class Tabla2Caracteres
{

	public static void main(String[] args)
	{

        
                final int FILAS = 3;
                final int COLUMNAS = 4;
                char tabla[][] = new char[FILAS][COLUMNAS];
                Scanner teclado = new Scanner(System.in);
                int i,j;
                for(i=0;i<FILAS;i++)
                {
                        for(j=0;j<COLUMNAS;j++)
                        {
                                System.out.println("Dame el carácter ["+i+"]["+j+"]:");
                                // Dame el carácter [0][1]:
                                tabla[i][j] = teclado.nextLine().charAt(0);
                                // "h" --> 'h'
                        }
                }
                teclado.close();
                for(i=0;i<FILAS;i++)
                {
                        for(j=0;j<COLUMNAS;j++)
                        {
                                System.out.print(tabla[i][j]+"\t");
                        }
                        System.out.println();
                }
        }
}