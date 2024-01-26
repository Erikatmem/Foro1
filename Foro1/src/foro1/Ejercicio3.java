package foro1;

public class Ejercicio3 {
	    public static void main(String[] args) {
	        //For: Se utiliza cuando sabemos exactamente cuántas veces queremos que se ejecute el bucle.
	    	//Ejemplo de bucle for
	        System.out.println("Bucle for:");
	        String[] animales = {"Gato", "Perro", "Mono"};
	        for (int i = 0; i < animales.length; i++) {
	            System.out.println("Animal: " + animales[i]);
	        }
	        //While: Se utiliza cuando no sabemos cuántas veces se ejecutará el bucle, pero sí sabemos la condición bajo la cual debe continuar ejecutándose.
	        //Ejemplo de bucle while
	        System.out.println("Bucle while:");
	        int j = 0;
	        while (j < animales.length) {
	            System.out.println("Animal: " + animales[j]);
	            j++;
	        }
	    }
	}

