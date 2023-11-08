/*
 * Realizar un programa en java que permita determinar
 * si un estudiante ha pasado el ciclo
 * se ingresa el promedio del estudiante
 * - Un estudiante pasa el ciclo si tiene un promedio
 * mayor o igual a 7.5. Si el estudiante aprueba el ciclo, presentar
 * un mensaje como sigue, Estudiante aprobado con un promedio: 8.1 
 * CASO CONTRARIO presentar un mensaje con el siguiente texto, 
 * Estudiante reprobado con un promedio: 7.4 
 */
package ejemplo2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Condicionales compuestos
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // 10,2 / 10.2
        String nombre;
        String apellido;
        double nota1;
        double nota2;
        double promedio;
        double suma;
       
        System.out.println("Ingrese el Nombre , por favor");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el Apellido, por favor");
        apellido = entrada.nextLine();
        System.out.println("Ingrese el nota 1, por favor");
        nota1 = entrada.nextDouble();
        System.out.println("Ingrese el nota 2, por favor");
        nota2 = entrada.nextDouble();
        suma = nota1 + nota2;
        promedio = suma / 2;
        
        if (promedio >= 7.5) {
            System.out.printf("Estudiante %s %s,con notas %.2f y %.2f aprobado con un "
                    + "promedio: %.2f\n",nombre ,apellido,nota1,nota2, promedio);
        }else{
            System.out.printf("Estudiante %s %s,con notas %.2f y %.2f reprobado con un "
                    + "promedio: %.2f\n",nombre ,apellido,nota1,nota2, promedio);
        }
    }
    
}
