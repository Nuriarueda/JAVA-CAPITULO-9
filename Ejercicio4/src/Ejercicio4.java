/* Realiza un programa equivalente al anterior pero en esta ocasión, el programa
debe ordenar palabras en lugar de números. */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class Ejercicio4{
    public static void main(String[] args) {

        ArrayList <String> palabras = new ArrayList <String>();

        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i < 10 ; i++){
            System.out.println("Intrdoduzca una palabra");
            palabras.add(sc.nextLine());
        }

        sc.close();

        Collections.sort(palabras);

        for(int i = 0 ; i < 10 ; i++){
            System.out.println(palabras.get(i) + " ");
        }
    

    }
}