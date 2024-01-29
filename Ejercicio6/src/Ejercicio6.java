import java.util.Scanner;

import java.util.HashMap;

public class Ejercicio6{
    public static void main(String[] args) {

        String usuario;
        int clave;
        boolean salir = false;
        int intentos = 3;


        HashMap <String, Integer> datos = new HashMap<>();
        datos.put("Antonio",1234);
        datos.put("Jose",1111);
        datos.put("Sergio",4040);

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca los datos y comprobaremos si son correctors");

        do{

            System.out.println("Tienes " + intentos + " intentos");
            System.out.println("Diga el nombre:");
            usuario = sc.next();
            System.out.println("Diga la clave:");
            clave = sc.nextInt();

            if(datos.containsKey(usuario)){
                if(datos.get(usuario).equals(clave)){
                    System.out.println("Ha accedido al área restringida");
                    salir = true;
                    intentos++;
                }else{
                    System.out.println("La contraseña es incorrecta");

                }
            }else { 
                System.out.println("El usuario introducido no existe");
            }

            intentos--;

            if(intentos < 0){
                salir = true;
                System.out.println("Lo siento, no tiene acceso");
            }

        }while(!salir);

        sc.close();
    }
}