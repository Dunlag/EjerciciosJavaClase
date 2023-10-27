import java.util.Scanner;

public class pedirnumeroporteclado {
    public static void main(String[] args) {
        int num=0;
        Scanner scanner= new Scanner(System.in);
        do {
        System.out.println("dime un numero positivo");
        num = scanner.nextInt();
        }while (num<=0);
    }
}
