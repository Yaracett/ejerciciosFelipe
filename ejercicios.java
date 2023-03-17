package ejerciciosNumeroPrimos;

import java.util.Scanner;


package ejerciciosNumeroPrimos;



import java.util.Scanner;

public class ejerciciosNumeroPrimos {

	public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);

		        System.out.print("Ingrese un número entero: ");
		        int num = input.nextInt();

		        boolean esPrimo = true;
                //for para ingresar desde 2 hasta la mitad del numero ingresado
		        for (int i = 2; i <= num / 2; i++) {
                // si wl numeeo es divisible el valoe dd la variable ws peimo 
		            if (num % i == 0) {
		                esPrimo = false;
		                break;
		            }
		        }
                // Analiza valor de esPrimo. Si sigue siendo true, se imprime un mensaje indicando que el número es primo. De lo contrario, se imprime un mensaje indicando que no es primo.

		        if (esPrimo) {
		            System.out.println(num + " es un número primo.");
		        } else {
		            System.out.println(num + " no es un número primo.");
		        }
		    
		}


	}


