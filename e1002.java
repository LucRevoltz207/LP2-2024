import java.io.IOException;
import java.util.Scanner;

 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class e1002 {
 
    public static void main(String[] args) throws IOException {
 Scanner scan = new Scanner(System.in);
 

double a = scan.nextDouble();
double n = 3.14159;

double Result = (a*a*n);
System.out.printf("A=%.4f\n",Result);
}}