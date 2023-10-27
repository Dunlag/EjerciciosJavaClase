import java.util.Scanner;

public class areatriangulo {
    public static void main(String[] args) {
        int area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("dime la base del triangulo");
        int base = scanner.nextInt();
        System.out.println("dime la altura del triangulo");
        int altura = scanner.nextInt();
        area = (base * altura)/2;
        System.out.println("el area del triangulo es: "+area);
    }
}
