import java.util.Scanner;
public class problema421 {
public static int contador=0;
public static int número;
public static int mayor;
public static int[] num = new int[10];
public static void main( String args[] ){
try (Scanner leer = new Scanner(System.in)) {
    System.out.println("Ingrese números enteros : ");
    do {
    System.out.print("N° "+(contador+1)+" : ");
    num[contador]=leer.nextInt();
     contador++;
    } while (contador<9);
}
MostrarUltimo();
OrdFormCreciente();
Mostrar();
}
public static void MostrarUltimo(){
System.out.println("El ultimo numero fue : "+ num[contador-1]);
}
public static void OrdFormCreciente(){
int aux;
for(int i=0;i<=contador;i++) {
for(int j=i+1;j<=contador;j++) {
if(num[j]>num[i]) {
 aux = num[i];
num[i]=num[j];
num[j] = aux;}
}
}
}
public static void Mostrar(){
System.out.println("El numero mayor de los ingresados es : "+num[0]);
}

}

