import java.util.Scanner;
public class Ejercicio_435 {

 public static void main(String[] args) {
 int a=0,b=0,c=0;

 System.out.print("Digite el primer lado: ");
 Scanner h= new Scanner(System.in);

 a=h.nextInt();System.out.print("Digite el segundo lado: ");
 Scanner i= new Scanner(System.in);

 b=i.nextInt();System.out.print("Digite el tercer lado: ");
 Scanner j= new Scanner(System.in);

 c=j.nextInt();
if((a+b>c)&(a+c>b)&(c+b>a)){

 System.out.print("Si es un triangulo");}

 else{

 System.out.print("No es un triangulo");
                             }

             }

}

