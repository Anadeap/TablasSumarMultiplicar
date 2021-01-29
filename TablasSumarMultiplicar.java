import java.util.Scanner;

/*
   Programa java 
   Muestra las tablas de sumar y multiplicar
   de un número introducido por teclado
*/


public class TablasSumarMultiplicar {

        public static void main(String args[]) {
            
            // se inicializa la clase Scanner
            Scanner numero=new Scanner(System.in);
            // declaración de la variable
            int n;
            // se pide número a introducir
            System.out.println("Introduce un número");
            // se almacena el número introducido en la variable n
            n=numero.nextInt();
            // tabla de sumar
            System.out.println("Tabla de sumar del número " + n);
            for(int i=0;i<=10;i++){
                System.out.println(n + "+" + i + "=" + (n+i));
            }
            // tabla de multiplicar
            System.out.println("\nTabla de multiplicar del número " + n);
            for(int i=0;i<=10;i++){
                System.out.println(n + "*" + i + "=" + (n*i));
            }
            
        }// fin del main
        
    }// fin clase TablasSumarMultiplicar
