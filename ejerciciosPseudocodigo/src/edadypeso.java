import java.util.Scanner;

public class edadypeso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dime tu edad");
        int edad = scanner.nextInt();
        System.out.println("dime tu paso");
        int peso = scanner.nextInt();
        System.out.println("tu edad es " + edad + " y tu peso es "+ peso);
    }
}
