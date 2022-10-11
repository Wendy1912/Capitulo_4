public class Ejercicio_433 {
    public static void main (String[] args) {
    int multiplo=1;
    for(;;){
    multiplo=multiplo*2;
    System.out.println(multiplo);
    if(multiplo>50000)//Uso esta condición para evitar que el programa se cuelgue
    break;
    }
    }
    /*¿Qué ocurre cuando ejecuta este programa?
     * El ciclo no termina y el espacio de memoria se va consumiendo
     * lo que ocasiona que el programa se detenga o mejor dicho se
    cuelgue
     * trae consigo problemas de rendimiento
     */
    }
    
