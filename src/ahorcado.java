import java.util.Scanner;

public class ahorcado {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10; 
        int intentos = 0;
        boolean palabrasAdivinada = false;

        char [] letrasAdivinadas = new char [palabraSecreta.length()];

        for ( int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';   
        }

        while(!palabrasAdivinada && intentos < intentosMaximos) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");
            System.out.println("Introduce una letra");
            char letra = scanner.next().charAt(0);

            boolean letraCorrecta = false; 

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }
                if(!letraCorrecta){
                intentos++;
                System.out.println("Incorrecta, te quedan " + (intentosMaximos - intentos) + " intentos");
            }
                if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabrasAdivinada = true;
                System.out.println("Felicidades has adivinadao la palabra secreta " + palabraSecreta);
            }
                } 
                if(!palabrasAdivinada){
                System.out.println("Que pena, te quedaste sin intentos");
        
        scanner.close();

        }
    }
}
