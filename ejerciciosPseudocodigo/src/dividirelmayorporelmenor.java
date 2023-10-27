import java.util.Scanner;

public class dividirelmayorporelmenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dime dos numeros");
        double x = scanner.nextInt();
        double y = scanner.nextInt();
        double division;
        if (x>=y){
            division = x/y;
            System.out.println(x+" es el numero mayor y "+y+" el numero menor");
        }
        else {
            division = y/x;
            System.out.println(y+" es el numero mayor y "+x+" el numero menor");
        }
        System.out.println("el resultado de la division es: "+division);
    }
}