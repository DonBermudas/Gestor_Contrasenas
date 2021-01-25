package tarea3;

import java.util.Scanner;
import java.util.ArrayList;

public class Tarea3 {

    public static void main(String[] args) {

        ArrayList<Instagram> cuentasInstagram = new ArrayList();
        ArrayList<Facebook> cuentasFacebook = new ArrayList();
        ArrayList<Gmail> cuentasGmail = new ArrayList();
        ArrayList<Banco> cuentasBanco = new ArrayList();

        // Declaración de variables:
        String tipoCuenta;
        String otrasOperaciones;
        String eleccionApp;

// Sistema para guardar las cuentas
        // Inicialización del programa:
        System.out.println("¡Bienvenido al gestor de contraseñas!");

        // Proceso de registro de la primera cuenta
        Scanner entrada = new Scanner(System.in);

        do {
            do{
            System.out.println("¿Qué tipo de cuenta deseas añadir?");
            System.out.println("1. Instagram");
            System.out.println("2. Facebook");
            System.out.println("3. Gmail");
            System.out.println("4. Banco");
            tipoCuenta = entrada.nextLine();
            }while(!"1".equals(tipoCuenta) && !"2".equals(tipoCuenta) && !"3".equals(tipoCuenta) && !"4".equals(tipoCuenta));

            if (tipoCuenta.equals("1")) {
                Instagram cuentaInsta = new Instagram(pedirEmail(), pedirContrasenaAlfa(), pedirContrasenaNum()); // Usas tu objeto Instagram y lo rellenas con un email y las contraseñas ya validadas
                cuentasInstagram.add(cuentaInsta);   // Guardas el nuevo registro en el ArrayList de cuentas de Instagram
            }

            if (tipoCuenta.equals("2")) {
                Facebook cuentaFb = new Facebook(pedirEmail(), pedirContrasenaAlfa(), pedirContrasenaNum());
                cuentasFacebook.add(cuentaFb);
            }

            if (tipoCuenta.equals("3")) {
                Gmail cuentaGmail = new Gmail(pedirEmail(), pedirContrasenaAlfa(), pedirContrasenaNum());
                cuentasGmail.add(cuentaGmail);
            }

            if (tipoCuenta.equals("4")) {
                Banco cuentaBanco = new Banco(pedirEmail(), pedirContrasenaAlfa(), pedirContrasenaNum());
                cuentasBanco.add(cuentaBanco);
            }

            // Una vez tienes un primer registro creado puedes, o seguir registrando más cuentas o consultar los registros existentes
            do{
            System.out.println("¿Qué desea hacer ahora?");
            System.out.println("1. Añadir otra cuenta");
            System.out.println("2. Consultar mis registros");
            otrasOperaciones = entrada.nextLine();
            }while(!"1".equals(otrasOperaciones) && !"2".equals(otrasOperaciones));   // Que se repita la pregunta hasta que conteste 1 o 2

        } while ("1".equalsIgnoreCase(otrasOperaciones));    // Vuelve a la línea 21  

        if (otrasOperaciones.equals("2")) {
            do{
            System.out.println("¿De qué app quiere consultar sus registros?");
            System.out.println("1. Instagram");
            System.out.println("2. Facebook");
            System.out.println("3. Gmail");
            System.out.println("4. Banco");
            System.out.println("5. Consultar todos");
            eleccionApp = entrada.nextLine();
            }while(!"1".equals(eleccionApp) && !"2".equals(eleccionApp) && !"3".equals(eleccionApp) && !"4".equals(eleccionApp) && !"5".equals(eleccionApp));

            if (eleccionApp.equals("1")) {
                for (int i = 0; i < cuentasInstagram.size(); i++) {
                    Instagram registros = cuentasInstagram.get(i);
                    System.out.println(registros);
                }
            }   // Mostrar los registros guardados en el ArrayList cuentasInstagram

            if (eleccionApp.equals("2")) {
                for (int i = 0; i < cuentasFacebook.size(); i++) {
                    Facebook registros = cuentasFacebook.get(i);
                    System.out.println(registros);
                }
            }

            if (eleccionApp.equals("3")) {
                for (int i = 0; i < cuentasGmail.size(); i++) {
                    Gmail registros = cuentasGmail.get(i);
                    System.out.println(registros);
                }
            }

            if (eleccionApp.equals("4")) {
                for (int i = 0; i < cuentasBanco.size(); i++) {
                    Banco registros = cuentasBanco.get(i);
                    System.out.println(registros);
                }
            }

            if (eleccionApp.equals("5")) {    // Imprime los registros de todas las apps                
                for (int i = 0; i < cuentasInstagram.size(); i++) {
                    Instagram registros = cuentasInstagram.get(i);
                    System.out.println(registros);
                }

                for (int i = 0; i < cuentasFacebook.size(); i++) {
                    Facebook registros = cuentasFacebook.get(i);
                    System.out.println(registros);
                }

                for (int i = 0; i < cuentasGmail.size(); i++) {
                    Gmail registros = cuentasGmail.get(i);
                    System.out.println(registros);
                }

                for (int i = 0; i < cuentasBanco.size(); i++) {
                    Banco registros = cuentasBanco.get(i);
                    System.out.println(registros);
                }
            }

        }

    }

////////////////////////// MÉTODOS //////////////////////////////   
    // Método de pedir el email:
    public static String pedirEmail() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Un email válido: ");
        String email = entrada.nextLine();
        return email;
    }
    
    // Método de pedir la contraseña alfanumérica y validarla:
    public static String pedirContrasenaAlfa() {
        Scanner entrada = new Scanner(System.in);

        Boolean resultadoFiltro;
        resultadoFiltro = false;

        String contrasenaAlfanumerica;

        do {
            System.out.println("Una contraseña alfanumérica válida: ");
            contrasenaAlfanumerica = entrada.nextLine();
            resultadoFiltro = filtroContrasena(contrasenaAlfanumerica); // Metes tu contraseña en el filtro y le asignas la variable resultado a lo que de el filtro  
        } while (resultadoFiltro == false);   // Mientras el resultado del filtro sea falso se repetirá el bucle de pedir una contraseña

        if (resultadoFiltro == true) {
            System.out.println("Contraseña aceptada");
        }
        return contrasenaAlfanumerica;
    }

    // Método de pedir la contraseña numérica y validarla:
    public static String pedirContrasenaNum() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Quiere añadir también una contraseña numérica válida?: ");
        System.out.println("1. Sí");
        System.out.println("2. No");
        String respuestaNum = entrada.nextLine();

        if (respuestaNum.equals("1")) {

            Boolean ResulFiltroNum;
            ResulFiltroNum = false;
            
            String contrasenaNumerica;

            do {
                System.out.println("Una contraseña numérica válida: ");
                contrasenaNumerica = entrada.nextLine();
                ResulFiltroNum = filtroContrasenaNum(contrasenaNumerica);
            } while (ResulFiltroNum == false);

            if (ResulFiltroNum == true) {
                System.out.println("Contraseña aceptada");
            }
            return contrasenaNumerica;
            
        } else {
            System.out.println("Contraseña numérica no añadida");
            return null;
        }
    }

// MÉTODOS PARA VALIDAR LA CONTRASEÑA ALFANUMÉRICA
    // Que tenga como mínimo 8 caracteres:
    public static Boolean minimocaracteres(String contrasenaAlfanumerica) {
        if (contrasenaAlfanumerica.length() >= 8) {
            return true;
        } else {
            System.out.println("Longitud no válida, escribe mínimo 8 caracteres");
            return false;
        }
    }

    // Que contenga al menos un número:
    public static Boolean buscarnumero(String contrasenaAlfanumerica) {
        for (int i = 0; i < contrasenaAlfanumerica.length(); i++) {
            if (contrasenaAlfanumerica.charAt(i) <= '9') {
                return true;
            }
        }
        System.out.println("La contraseña debe contener al menos un número.");
        return false;
    }

    // Que contenga al menos una mayúscula:
    public static Boolean mayuscula(String contrasenaAlfanumerica) {
        for (int i = 0; i < contrasenaAlfanumerica.length(); i++) {
            if (Character.isUpperCase(contrasenaAlfanumerica.charAt(i))) {
                return true;
            }
        }
        System.out.println("La contraseña debe contener al menos una mayúscula.");
        return false;
    }

    // Que contenga al menos un carácter especial:
    // Método que compara cada caracter con los números:
    public static boolean comprobarnumero(String contrasenaAlfanumerica) {

        char[] numero = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < contrasenaAlfanumerica.length(); i++) {
            if (i == numero[i]) {
                return true;
            }
        }
        return false;
    }

    // Método que compara cada caracter con las letras:
    public static boolean comprobarletra(String contrasenaAlfanumerica) {

        char[] letra = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 0; i < contrasenaAlfanumerica.length(); i++) {
            if (i == letra[i]) {
                return true;
            }
        }
        return false;
    }

    // Método que aplica los dos anteriores a la contraseña:
    public static boolean comprobarambas(String contrasenaAlfanumerica) {

        Boolean Cnumero = comprobarnumero(contrasenaAlfanumerica);
        Boolean Cletra = comprobarletra(contrasenaAlfanumerica);

        if (Cnumero == false && Cletra == false) {
            return true;
        }
        System.out.println("La contraseña debe contener al menos un caracter especial");
        return false;
    }

// Filtro final que agrupa todos los métodos:
    public static boolean filtroContrasena(String contrasenaAlfanumerica) {

        Boolean Bminimo = minimocaracteres(contrasenaAlfanumerica);
        Boolean Bbuscar = buscarnumero(contrasenaAlfanumerica);
        Boolean Bmayuscula = mayuscula(contrasenaAlfanumerica);
        Boolean Bcomprobar = comprobarambas(contrasenaAlfanumerica);

        if (Bminimo == true && Bbuscar == true && Bmayuscula == true && Bcomprobar == true) {
            return true;
        }
        return false;
    }

// MÉTODOS PARA VALIDAR LA CONTRASEÑA NUMÉRICA
    // Que tenga como mínimo 4 caracteres:
    public static Boolean cuatroCaracteres(String contrasenaNumerica) {
        if (contrasenaNumerica.length() >= 4) {
            return true;
        } else {
            System.out.println("Longitud no válida, escribe mínimo 4 caracteres");
            return false;
        }
    }

    // Que sólo contenga números:
    public static boolean buscarNumeros(String contrasenaNumerica) {

        char[] numero = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < contrasenaNumerica.length(); i++) {
            if (i == numero[i]) {
                return true;
            }
        }
        System.out.println("Debe contener sólo números");
        return false;
    }

    // Filtro final de la contraseña numérica:
    public static boolean filtroContrasenaNum(String contrasenaNumerica) {

        Boolean BminimoNum = minimocaracteres(contrasenaNumerica);
        Boolean buscarNumeros = buscarnumero(contrasenaNumerica);

        if (BminimoNum == true && buscarNumeros == true) {
            return true;
        }
        return false;
    }

}
