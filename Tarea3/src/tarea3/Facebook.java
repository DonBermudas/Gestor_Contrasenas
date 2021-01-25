
package tarea3;

public class Facebook {
    String email;
    String contrasenaAlfa;
    String contrasenaNum;
    
    public Facebook(String email, String contrasenaAlfa, String contrasenaNum){
        this.email = email;
        this.contrasenaAlfa = contrasenaAlfa;
        this.contrasenaNum = contrasenaNum; 
    }   
    
    @Override
    public String toString() {
        return "Facebook: " + email + " " + contrasenaAlfa + " " + contrasenaNum;
    }
}
