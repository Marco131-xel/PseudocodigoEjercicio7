import java.util.* ;
public class Ejercicio7{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// p es el porcentaje 
		// p es par, m es impar, n es cero
		int p = 0;
		int n = 0;
		int m = 0;
		int suma1 = 0;
		int suma2 = 0;
		int suma3 = 0;
		double pp = 0;
		double pm = 0;
		double pn = 0;

		System.out.println("");
		System.out.println("*********Ejercicio7************");
		System.out.println("");

		for(int i = 0; i<= 15; i++){
			int aleatorio = (int)(Math.random()*36);
			System.out.println("" + aleatorio);
			if(aleatorio %2 == 0){
				suma1 = aleatorio + suma1;
				p = p + 1;

			}
				if(aleatorio == 0){
					suma2 = aleatorio +suma2;
					n = n + 1;

				}
				else{
					suma3 = aleatorio + suma3;
					m = m + 1;

				}

		}
		pp = suma1 * 0.15;
		pm = suma3 * 0.15;
		pn = suma2 * 0.15;

		System.out.println("La cantidad de pares generados son: " + p);
		System.out.println("La cantidad de impares generados son: " + m);
		System.out.println("La cantidad de ceros generados son: " + n);

		System.out.println("El porcentaje de los numeros pares es " + pp);
		System.out.println("El porcentaje de los numeros impares es " + pm);
		System.out.println("El porcentaje de los ceros generados es " + pn);

		
	}
}