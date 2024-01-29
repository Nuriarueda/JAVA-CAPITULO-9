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
