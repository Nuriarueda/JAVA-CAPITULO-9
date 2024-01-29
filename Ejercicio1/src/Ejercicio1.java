/* Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
todo el ArrayList sin usar ningún índice. */
import java.util.ArrayList;
public class Ejercicio1 {
public static void main(String[] args) {

    ArrayList<String> a = new ArrayList<String>();

        a.add("Nuria Rueda");
        a.add("Victoria Antiñolo");
        a.add("Francisco Cuadra");
        a.add("Francisco Heredia");
        a.add("Claudia Casilari");
        System.out.println("Lista de nombres: ");

        for(String nombres: a) {
            System.out.println(nombres);
        }
    }
}
