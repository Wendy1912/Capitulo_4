import java.util.Scanner;
public class Ejercicio_418 {
    public static void main (String[] args) {
        int cuenta;
        int saldoInicio;
        int totalArticulos;
        int totalCreditos;
        int limiteCredito;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el numero de cuenta: ");
        cuenta=entrada.nextInt();
        
        System.out.print("Ingrese el saldo al inicio del mes: ");
        saldoInicio=entrada.nextInt();

        System.out.print("Ingrese el total de todos los articulos: ");
        totalArticulos=entrada.nextInt();

        System.out.print("Ingrese el total de creditos: ");
        totalCreditos=entrada.nextInt();

        System.out.print("Ingrese el límite de crédito: ");
        limiteCredito=entrada.nextInt();

        calcularSaldo(saldoInicio,totalArticulos,totalCreditos,limiteCredito);
    }

    public static void calcularSaldo(int saldoInicio,int totalArticulos,
    int totalCreditos,int limiteCredito) {
        int saldoFinal = saldoInicio + totalArticulos - totalCreditos;
        System.out.println("Su nuevo saldo es: " + saldoFinal);
        if (saldoFinal > limiteCredito) {
            System.out.println("Se excedió el límite de su crédito");
        }
    }
}
