package ciclos;
import java.util.Scanner;
public class Ciclos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n; //Valor N=5
        System.out.println("Programa para calcular el producto de 10, 100 y1000");
        System.out.println("Digite un valor para N : ");
        n = entrada.nextInt();
 System.out.println("N\t10*N\t100*N\t1000*N");
 for(int i=1; i<=n; i++){
    System.out.println((i)+"\t "+(10*i)+"\t "+(100*i)+"\t"+(1000*i));
}
}
}


