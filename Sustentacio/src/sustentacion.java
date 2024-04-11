import java.util.Scanner;

public class sustentacion {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		/*
		 * int num;
		 * 
		 * System.out.
		 * println("Ingrese el nùmero de veces que quiere que el cilo se ejecute: ");
		 * int cantnum = 0 ; cantnum = leer.nextInt();
		 * 
		 * //Determinar cuantos son pares la cantidad y la suma de todos los numeros
		 * 
		 * int sumaPares = 0; int sumaImpares = 0; int cantidadPares = 0;
		 * 
		 * 
		 * for (int i = 0; i<cantnum; i++) { System.out.println("Ingrese un nùmero: ");
		 * num = leer.nextInt();
		 * 
		 * if (num % 2 == 0) { System.out.println("El número es par");
		 * 
		 * sumaPares += num;
		 * 
		 * cantidadPares++;
		 * 
		 * } else { System.out.println("El numero es impar"); sumaImpares += num; }
		 * 
		 * } int sumatotal = sumaPares + sumaImpares;
		 * 
		 * System.out.println("La suma de los pares es: "+ sumaPares);
		 * System.out.println("La cantidad de pares es: "+ cantidadPares);
		 * System.out.println("La suma total es: "+ sumatotal);
		 */

		// Realice un algoritmoque almacene N numeros enteros en un array
		//Calcular e imprimir la suma y promedio de los elmentos del array  
		
		System.out.print("Ingrese el tamaño del array: ");
		int N = leer.nextInt() *2;
		
		int[] numEnt = new int[N];
		
		 
		
		
		// funcion para almacenar el array
		almacenarNumeros(numEnt);

		
		System.out.println("Los números almacenados en el array son:");
		for (int i = 0; i < N; i++) {
			System.out.println(numEnt[i]);
			
		}
	}
	
	
	
	public static void almacenarNumeros(int[] numEnt) {
		
		Scanner leer = new Scanner(System.in);
		int sumatotal = 0; 
		double promedio = 0;
		
		for (int i = 0; i < numEnt.length; i++) {
			System.out.print("Ingrese el número entero " + (i + 1) + ": ");
			numEnt[i] = leer.nextInt(); // Almacenar el número en el array en la posición i
			sumatotal += (numEnt[i]);
			promedio = sumatotal / (numEnt[i]);
		}
			
		

		System.out.println("La suma toatl es: " + sumatotal);
		System.out.println("EL promedio de la suma total es: " + promedio);
	}
	 

	
	
}
