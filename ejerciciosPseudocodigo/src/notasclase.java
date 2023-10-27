import java.util.Scanner;

public class notasclase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dime una nota");
        int nota = scanner.nextInt();
        if (nota<5){
            System.out.println("Insuficiente");
        } else if (nota>=5 && nota<=6) {
            System.out.println("Suficiente");
        } else if (nota>=6 && nota<7) {
            System.out.println("Bien");
        } else if (nota>=7 && nota <9) {
            System.out.println("notable");
        } else if (nota>=9 && nota<=10) {
            System.out.println("sobresaliente");
        }
    }
}