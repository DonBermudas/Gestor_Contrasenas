
package tarea3;

public class Gmail {
    String email;
    String contrasenaAlfa;
    String contrasenaNum;
    
    public Gmail(String email, String contrasenaAlfa, String contrasenaNum){
        this.email = email;
        this.contrasenaAlfa = contrasenaAlfa;
        this.contrasenaNum = contrasenaNum;   
    }   
    
    @Override
    public String toString() {
        return "Gmail: " + email + " " + contrasenaAlfa + " " + contrasenaNum;
    }
}
