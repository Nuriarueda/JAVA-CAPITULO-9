import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        HashMap <String,String> dictionary = new HashMap<>();
        String palabra;

        dictionary.put("water", "agua");
        dictionary.put("cat", "gato");
        dictionary.put("house", "casa");
        dictionary.put("book", "libro");
        dictionary.put("pen", "bolígrafo");
        dictionary.put("computer", "computadora");
        dictionary.put("brother", "hermano");
        dictionary.put("tree", "árbol");
        dictionary.put("flower", "flor");
        dictionary.put("dog", "perro");
        dictionary.put("sky", "cielo");
        dictionary.put("sun", "sol");
        dictionary.put("moon", "luna");
        dictionary.put("food", "comida");
        dictionary.put("friend", "amigo");
        dictionary.put("father", "padre");
        dictionary.put("cat", "gato");
        dictionary.put("sister", "hermana");
        dictionary.put("brother", "hermano");

        System.out.println("Diga una palabra en ingles");

        Scanner sc = new Scanner(System.in);
        palabra = sc.next();
        sc.close();

        if(dictionary.containsKey(palabra)){
            System.out.println("En español es: " + dictionary.get(palabra));
        }else{
            System.out.println("Esa palabra no esta en el diccionario");
        }


    }
    
}