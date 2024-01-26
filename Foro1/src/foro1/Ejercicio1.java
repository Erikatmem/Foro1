package foro1;
//Una estructura de control condicional permite que ciertos fragmentos de código se ejecuten solo si se cumple una condición específica.
//Una estructura de control iterativa, permite la repetición de un bloque de código mientras se cumpla una condición.

public class Ejercicio1 {
	
    public static void main(String[] args) { 
    	// Se utiliza una estructura de control iterativa (for) para recorrer los números del 1 al 10.
        for (int i = 1; i <= 10; i++) {
        	
        	// Dentro de este bucle, se utiliza una estructura de control condicional (if) para verificar si cada número es par o impar.
            if (i % 2 == 0) {
                System.out.println(i + " es un número par.");
            } else {
                System.out.println(i + " es un número impar.");
            }
        }
    }
}
