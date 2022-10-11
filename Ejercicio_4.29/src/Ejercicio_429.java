import java.util.Scanner;

   public class Ejercicio_429 {

public static void main (String[] args) {

int lado;
Scanner entrada=new Scanner(System.in);
do{

System.out.print("\nIngrese el lado del cuadrado, entre <1,20], excluyendo el 1: ");

lado = entrada.nextInt();
if(lado<2 || lado>20)

System.out.println("Numero incorrecto. Intente de nuevo");
}while(lado<2 || lado>20);
int fila = 1;
int columna = 2;
while( fila++ <= lado){
    
System.out.print("*");
}
System.out.print("\n");
//nueva fila
fila = 1;
while ( columna++ < lado){
while ( lado >= fila){
if ((1 == fila) || (lado == fila))
System.out.print("*");
else
System.out.print(" ");
fila++;
}
System.out.print("\n");
fila = 1;
}
fila = 1;
while ( fila++ <= lado){
System.out.print("*");
}
System.out.println("\n");
}
}
