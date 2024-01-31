/* Realiza un programa que escoja al azar 10 cartas de la baraja española
(10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
almacenarlas y asegúrate de que no se repite ninguna. */
import java.util.ArrayList;

public class Ejercicio8 {
    public static void main(String[] args) {
        ArrayList<Carta> c = new ArrayList<>();
        Carta cartaAux;

        for(int i = 0 ; i < 10 ; i++){
            do{
                cartaAux = new Carta();
            }while(c.contains(cartaAux));
            c.add(cartaAux);
        }

        for(Carta d : c){
            System.out.println(d);
        }
    }
}