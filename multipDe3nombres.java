import java.util.Scanner;

public class multipDe3nombres {

	public static void main(String[] args) {
        int num1, num2, num3, resultado;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero");
		 num1 = teclado.nextInt();
		
		System.out.println("Ingrese el segundo numero");
		 num2 = teclado.nextInt();
		
		System.out.println("Ingrese el tercer numero");
		 num3 = teclado.nextInt();
		
		 resultado = num1 * num2 * num3;
		
		System.out.println("El resultado es: " + resultado);
		
		    teclado.close();
	}
    }