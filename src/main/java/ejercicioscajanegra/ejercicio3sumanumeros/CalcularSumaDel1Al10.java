package ejercicioscajanegra.ejercicio3sumanumeros;
/*
A partir del siguiente enunciado, deriva casos de prueba e impleméntalas en JUnit 5:
Escribir un programa que calcule la suma de los números enteros del 1 al 10 (inclusive).
Programa una clase que contenga un método estático que devuelva la suma indicada.
Después, deriva casos de prueba.
Luego, haz las pruebas en Junit.

 */
public class CalcularSumaDel1Al10 {
    public static int calcularSuma(){
        // Debemos esperar que el método devuelva 55 siempre
        int suma = 0;
        for (int i = 1; i <= 10 ; i++) {
            suma += i;
        }
        return suma;
    }
}
