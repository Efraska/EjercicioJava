import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Generar un numero aleatorio entre 0 y 100
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100);
        System.out.println(numeroAleatorio);

        // Generar un objeto Scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        // Definir el numero maximo de intentos
        int maxIntentos = 5;
        int intentos = 0;
        boolean acertado = false;

        System.out.println("¡Bienvenido al Juego de las Adivinanzas!");
        System.out.println("Tienes " + maxIntentos + " intentos para adivinar un número entre 0 y 100.");

        // Bucle para los intentos
        while (intentos < maxIntentos) {
            System.out.println("Ingresa tu intento #" + (intentos + 1) + ": ");
            int numeroUsuario = teclado.nextInt();
            intentos++;

            if (numeroUsuario == numeroAleatorio) {
                System.out.println("¡Felicidades! Has adivinado el número.");
                acertado = true;
                break;// Salimos del bucle si se adivino el número
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("El número que ingresaste es mayor que el número a adivinar.");
            } else {
                System.out.println("El número que ingresaste es menor que el número a adivinar.");
            }
        }

        // Si se agotaron los intentos y no se ha adivinado el número
        if (!acertado) {
            System.out.println("Lo siento, has agotado todos tus intentos.");
            System.out.println("El número correcto era: " + numeroAleatorio);
        }

        // Cerrar el Scanner
        teclado.close();
    }
}