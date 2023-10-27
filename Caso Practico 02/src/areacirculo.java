import java.util.Scanner;

public class areacirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el radio del circulo");
        double radio = scanner.nextInt();
        double circulo;
        circulo = Math.PI * radio * radio;
        System.out.println("el area del circulo es: "+circulo);
    }
}
