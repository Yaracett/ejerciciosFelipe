package sumaDeDigitos;

import java.util.Scanner;

public class sumaDeDigitos {

	public static void main(String[] args){
		        
		        Scanner sc = new Scanner(System.in);
		        int numero;
		        
		        do {
		            System.out.print("Ingrese un número (0 para salir): ");
		            numero = sc.nextInt();
		            
		            if (numero != 0) {
		                int suma = sumarDigitos(numero);
		                System.out.println("La suma de los dígitos es: " + suma);
		            }
		            
		        } while (numero != 0);
		        
		        System.out.println("Programa finalizado.");
		        sc.close();
		    }
		    
		    public static int sumarDigitos(int num) {
		        int suma = 0;
		        
		        while (num > 0) {
		            suma += num % 10;
		            num /= 10;
		        }
		        
		        return suma;
		    }
		


	}


