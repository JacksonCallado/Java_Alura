
public class Tabuada {
	
	public static void main(String[] args) {
		
		for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			System.out.println("Tabuada do " + multiplicador);
			for(int contador = 0; contador <= 10; contador++) {
				int resultado = multiplicador * contador;
				String message = String.format("%s x %s = %s", multiplicador, contador, resultado);
				System.out.print(message);
				System.out.print(", ");
			}
			System.out.println();
		}
	}
}
