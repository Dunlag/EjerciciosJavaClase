public class multiplos23entre1y100 {
    public static void main(String[] args) {
        int contNumero = 0;
        for (int cont = 1;cont <= 100; cont ++ ){
            if ((cont % 2 == 0) && (cont % 3 == 0)){
                contNumero++;
            }
        }
        System.out.println("el total de numeros multiplos de 2 y 3 entre 1 y 100 es:" + contNumero);
    }
}