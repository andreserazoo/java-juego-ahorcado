import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        //Clase scannee, permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        //Declaraciones y Asignaciones
        String palabra = "andres";
        int intentosMax = 6;
        int intentos = 0;

        boolean palabraV = false;

        //Arreglos

        char[] letrasAdivinadas = new char[palabra.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {

            letrasAdivinadas[i]= '_';
            
        }

        while (!palabraV && intentos < intentosMax) {
            System.out.println("Palabra a adivinar "+String.valueOf(letrasAdivinadas)+" ("+ palabra.length()+" letras )");

            System.out.println("Introduce una letra por favor: ");
            char letra = Character.toLowerCase(scanner.next().charAt(0)); 
            boolean letraCorrecta = false;
             for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i)== letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                
                    
                }

             }
             if (!letraCorrecta) {
                intentos++;
                System.out.println("INCORRECTO, Te quedan "+ (intentosMax-intentos)+" intentos");
                
             }
             if (String.valueOf(letrasAdivinadas).equals(palabra)) {
                palabraV =true;
                System.out.println("FELICIDADES, Has avidinados la palabra secreta: "+ palabra);
             }
        }
        if (!palabraV) {
            System.out.println("TE HAS QUEDADO SIN INTENTOS, FINN");
            
        }
        scanner.close();




    }
}
