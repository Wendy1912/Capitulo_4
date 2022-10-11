import java.util.Scanner;
public class Ejercicio_431 {
    public static void main (String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.print("\nIngrese un numero binario: ");
        int binario=entrada.nextInt();
        int decimal=devolverDecimal(binario);
        System.out.println("\nEl número binario " +binario+ " tiene su equivalente decimal de " + decimal);

}
public static int devolverDecimal(int bin){
    int valor=1;
int decimal=0;
int residuo;
while(bin>0){//11
residuo=bin%10;
decimal=decimal+residuo*valor;
bin=bin/10;
valor=valor*2;
}
return decimal;
}

}
