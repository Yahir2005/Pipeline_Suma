public class Operaciones {
    public static void main(String[]args){
        int n1 = 0,n2=0;

        try {
        System.out.println("Ingrese el Número 1");
        n1 = Integer.parseInt(args[0]);
        System.out.println("Ingrese el Número 2");
        n2 = Integer.parseInt(args[1]);
        System.out.print("La suma es: "+sumar(n1,n2));
        } catch (Exception e) {
            System.out.println("Error en tiempo de ejecución: "+e.getMessage());
        }
        
    }
    public static int sumar(int n1, int n2){
        
        return n1+n2;
    }
}

