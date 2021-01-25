
package tarea3;

public class Instagram {
    String email;
    String contrasenaAlfa;
    String contrasenaNum;
    
    public Instagram(String email, String contrasenaAlfa, String contrasenaNum){
        this.email = email;
        this.contrasenaAlfa = contrasenaAlfa;
        this.contrasenaNum = contrasenaNum;
    }   
    
    @Override
    public String toString() {
        return "Instagram: " + email + " " + contrasenaAlfa + " " + contrasenaNum;
    }
}
