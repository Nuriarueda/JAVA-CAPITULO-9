package ecentro;

public class Grupo {
    private String id;
    private String nombre;

    Grupo(){
        this.id = id;
        this.nombre = nombre;
    }

    public String getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    @Override
    public boolean equals(Object obj){
        return this==obj || this.nombre.equals(((Grupo)obj).nombre);
    }


    @Override
    public int compareTo(Grupo o){
        return this.nombre.compareTo(o.nombre);
    }
}
