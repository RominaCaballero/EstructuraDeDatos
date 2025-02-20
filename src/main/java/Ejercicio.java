import java.util.Scanner;

public class Ejercicio {
    // crear un programa que cambie ciertos caracteres 5 a s, 0 a o y 1 a i
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el texto a modificar: ");
        String texto = scanner.nextLine();

        StringBuilder textoModificado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char a = texto.charAt(i);

            if (a == '5') {
                textoModificado.append('s');
            } else if (a == '0') {
                textoModificado.append('o');
            } else if (a == '1') {
                textoModificado.append('i');
            } else {
                textoModificado.append(a);
            }
        }

        System.out.println("El texto modificado es: " + textoModificado);
        scanner.close();
    }
}
