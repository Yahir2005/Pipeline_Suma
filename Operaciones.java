import java.util.*;

public class Operaciones {
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        int n1,n2;
        System.out.println("Ingrese su numero 1");
        n1 = read.nextInt();

        System.out.println("Ingrese su numero 2");
        n2 = read.nextInt();

        System.out.print(sumar(n1,n2));

    }
    public static int sumar(int n1, int n2){
        
        return n1+n2;
    }
}

