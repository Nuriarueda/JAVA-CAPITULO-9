package ecentro;

public class Usuario {
    private int id;
    private String nombre;
    private String apellidos;
    private String email;
    private String password;
    


    Usuario(String nombre, String appellidos, String email, String password){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.password = password;

    }
    public String getNombre(){
        return nombre;
        
    }

    public String getApellidos(){
        return apellidos;
    }

}
