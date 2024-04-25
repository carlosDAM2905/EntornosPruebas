package ejercicioscajanegra.ejercicio5calcularfactorial;

import java.util.Scanner;

/*
A partir del siguiente enunciado, deriva casos de prueba e impleméntalas en JUnit 5:
Calcular el factorial de un número introducido por teclado
(NOTA:
// Simular la entrada estándar System.in
String input = "34";
InputStream in = new ByteArrayInputStream(input.getBytes());
System.setIn(in);
)

 */
public class CalcularFactorial {

    public static int calcularFactorial() {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }
}
