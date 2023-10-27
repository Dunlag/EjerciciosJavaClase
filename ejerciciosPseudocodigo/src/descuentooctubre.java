import java.util.Scanner;
public class descuentooctubre {
    public static void main(String[] args) {
        int preciototal = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime cual es el importe total");
        int importe = scanner.nextInt();
        scanner.nextLine();
        System.out.println("dime en que mes estamos");
        String mes = scanner.nextLine();
        if (mes.equalsIgnoreCase("octubre")){
            preciototal=importe-(importe % 15);
        }
        else {
            preciototal = importe;
        }
        System.out.println("el importe es: "+ preciototal);
    }
}