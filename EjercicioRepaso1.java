import java.util.ArrayList;

public class EjercicioRepaso1 {

    public static void main(String[] args) {

        ArrayList <String> a = new ArrayList<String>();

        System.out.println("Numero de elementos: " + a.size());

        a.add("rojo");
        a.add("verde");
        a.add("negro");

        System.out.println("Numero de elementos " + a.size());

        System.out.println("El elemento que hay en la posición 0 es " + a.get(0));
        System.out.println("El elemento que hay en la posición 3 es " + a.get(3));


    }
    
    

}
