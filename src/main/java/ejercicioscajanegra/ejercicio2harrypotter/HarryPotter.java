package ejercicioscajanegra.ejercicio2harrypotter;

import java.util.Scanner;

public class HarryPotter {

    /*
    A partir del siguiente enunciado, deriva casos de prueba e impleméntalas en JUnit 5:
Harry Potter necesita ayuda para identificar lo que significa cada casa. Lee una cadena que represente una casa (puedes asociarla a un número para hacer más fácil la entrada por teclado) y que obtenga lo siguiente:
si es "gryffindor", salida "valentía" ;
si es "hufflepuff" , salida "lealtad" ;
si es "slytherin" , salida "astucia" ;
si es "ravenclaw" , salida "intelecto";
de lo contrario, la salida "no es una casa válida" .
Prográmalo en una clase como método que reciba por parámetro la casa de Harry Potter y devuelva un String.
Y después deriva casos de prueba.
Y luego haz las pruebas en JUnit5.

     */

    public static String identificarCasa(int casa){

        Scanner teclado = new Scanner(System.in);
        System.out.println("1. Gryffindor | 2. Hufflepuff | 3. Slytherin | 4. Ravenclaw");
        return switch (casa) {
            case 1 -> "valentía";
            case 2 -> "lealtad";
            case 3 -> "astucia";
            case 4 -> "intelecto";
            default -> "no es una casa válida";
        };
    }
}
