
package Guia_9;


import Guia_9.Cadena.Cadena;
import Guia_9.Cadena.Servicio.CadenaServicio;
import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena frase = new Cadena("Oceano Azul");
        CadenaServicio fs = new CadenaServicio();

       // Imprimir la interfaz cuadrada
       System.out.println("╔════════════════════════════════════╗");
System.out.println("║        Bienvenido a la cadena        ║");
System.out.println("╠════════════════════════════════════╣");
System.out.println("║    1. Contar vocales                ║");
System.out.println("║    2. Invertir frase                ║");
System.out.println("║    3. Repetición de letra           ║");
System.out.println("║    4. Comparar longitudes           ║");
System.out.println("║    5. Unir frases                   ║");
System.out.println("║    6. Reemplazar letra              ║");
System.out.println("║    7. Buscar letra                  ║");
System.out.println("╚════════════════════════════════════╝");
       
        System.out.println("╔════════════════╗");
        System.out.println("║  Bienvenido a la cadena ║");
        System.out.println("╠════════════════╣");
        System.out.println("║ 1. Contar vocales      ║");
        System.out.println("║ 2. Invertir frase      ║");
        System.out.println("║ 3. Repetición de letra ║");
        System.out.println("║ 4. Comparar longitudes ║");
        System.out.println("║ 5. Unir frases         ║");
        System.out.println("║ 6. Reemplazar letra    ║");
        System.out.println("║ 7. Buscar letra        ║");
        System.out.println("╚════════════════╝");

        // Leer la opción del usuario
        System.out.print("Ingrese una opción: ");
        int opcion = leer.nextInt();

        // Ejecutar la opción seleccionada
        switch (opcion) {
            case 1:
                fs.mostrarVocales(frase);
                break;
            case 2:
                fs.invertirFrase(frase);
                break;
            case 3:
                System.out.print("Ingrese un char: ");
                String car = leer.next();
                fs.vecesRepetido(frase, car);
                break;
            case 4:
                System.out.print("Ingrese un frase: ");
                String frase2 = leer.next();
                fs.compararLongitud(frase, frase2);
                break;
            case 5:
                System.out.print("Ingrese un frase: ");
                String frase3 = leer.next();
                fs.unirFrases(frase, frase3);
                break;
            case 6:
                fs.reemplazar(frase);
                break;
            case 7:
                System.out.println(fs.contiene(frase));
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

       
    }
}
    
    

