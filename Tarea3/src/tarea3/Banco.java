
package tarea3;

public class Banco {
    String email;
    String contrasenaAlfa;
    String contrasenaNum;
    
    public Banco(String email, String contrasenaAlfa, String contrasenaNum){
        this.email = email;
        this.contrasenaAlfa = contrasenaAlfa;
        this.contrasenaNum = contrasenaNum;   
    }   
    
    @Override
    public String toString() {
        return "Banco: " + email + " " + contrasenaAlfa + " " + contrasenaNum;
    }
}
