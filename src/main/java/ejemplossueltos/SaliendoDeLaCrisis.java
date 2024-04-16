package ejemplossueltos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SaliendoDeLaCrisis {
    public static void main(String[] args) {
        //mientras  no introduzcamos un cero seguimos pidiendo números
        Scanner teclado = new Scanner(System.in);

        //pido un número:
        int numero = teclado.nextInt();
        //si es distinto de cero entro en bucle hasta que introduzca un cero

        while (numero != 0){
            teclado.nextLine();
            String cadena = teclado.nextLine(); // ejemplo "1 3 6"
            String[] numeros = cadena.split(" ");


            int[] arrayNumeros = new int[numeros.length];
            for (int i = 0; i < numeros.length; i++) {
                arrayNumeros[i] = Integer.parseInt(numeros[i]);
            }

            boolean aumento = true;
            for (int i = 1; i < arrayNumeros.length; i++) {
                if (arrayNumeros[i] <= arrayNumeros[i - 1]){ //aquí al haber incicializado el bucle en 1, cuando hacemos la comprobación en la sentencia if, estaríamos comprobando que el valor de la posición del array 1, es menor que el valor de la posición 0 (arrayNumeros[i] <= arrayNumeros[i - 1]), si esto ocurre, ya sabemos que el aumento es falso y no necesitamos seguir comprobando
                    aumento = false;
                    break;
                } else if (arrayNumeros[i] == arrayNumeros[i - 1]) {
                    aumento = false;
                    break;
                }
            }

            System.out.println(Arrays.toString(arrayNumeros));
            if (aumento == false){
                System.out.println("NO");
            }else {
                System.out.println("SI");
            }

            //ante de salir pedir el siguiente número
            numero = teclado.nextInt();

        }



    }
}
