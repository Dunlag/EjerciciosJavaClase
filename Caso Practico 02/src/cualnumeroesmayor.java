public class cualnumeroesmayor {
    public static void main(String[] args) {
        int a,b,c;
        a = 15;
        b= 2;
        c = 100000;
        if (a>=b){
            if (a>=c){
                System.out.println("el numero a "+a+" es el mayor");

            } else {
                System.out.println("el numero c " + c + " es el mayor");
            }
            } else if (b>=c) {
                System.out.println("el numero b " + b +" es el mayor");
            }
        else {
            System.out.println("el numero c"+ c+ " es el mayor");
    }
    }
}
