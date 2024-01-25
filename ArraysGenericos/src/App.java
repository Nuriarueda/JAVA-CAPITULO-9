import java.util.ArrayList;

import generics.MyArrayList;
import generics.Perro;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> miarray = new ArrayList<>(100);
        MyArrayList<Integer> array = new MyArrayList<Integer>(10);
        for(int i = 0; i < 1000; i++)
            array.add(i);
        System.out.println(array);
        System.out.println("Position: 100 = "+array.get(100));
        array.set(100, -100);
        array.remove(100);
        array.add(100, 100);
        array.clear();
        array.add(100);
        System.out.println(array);
        MyArrayList<Perro> arrayPerros = new MyArrayList<Perro>(100);
        for(int i = 0; i < 100; i++){
            String nombre = "";
            for(int j=0; j<10;j++){
                nombre+=""+(char)(65+(int)(Math.random()*20));
            }
            arrayPerros.add(new Perro(nombre));
        }

        System.out.println(arrayPerros);
        arrayPerros.remove(0);
        System.out.println(arrayPerros);
    }
}
