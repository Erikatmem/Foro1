package foro1;

public class Ejercicio4 {
	
	    public static void main(String[] args) {
	    	// Bucle while solo repite las acciones si se cumple una condición desde el principio
	        // Bucle while que imprime el menú de tres restaurantes.
	        System.out.println("Bucle while:");

	        String[] restaurantes = {"KFC", "Burger King", "McDonald's"};
	        int i = 0;

	        while (i < restaurantes.length) {
	            System.out.println("Menú " + restaurantes[i]);
	            i++;
	        }

	        // Bucle do-while repite las acciones al menos una vez, aunque la condición no se cumpla al principio
	        // Bucle do-while que imprime el menú de tres restaurantes
	        System.out.println("Bucle do-while:");

	        int j = 0;
	        do {
	            System.out.println("Menú x de " + restaurantes[j]);
	            j++;
	        } while (j < restaurantes.length);
	    }
	}

