import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        System.out.println("prueba2");

        String myString = "esto es una cadena de texto";
        myString = "aquí cambia la cadena de texto";
        System.out.println(myString);

        Integer myInt = 7;
        myInt = myInt + 4;
        System.out.println(myInt);
        System.out.println(myInt - 1);

        Double myDouble = 6.5;
        System.out.println(myDouble);

        Float myFloat = 6.5f; // Agregamos una "f" al valor para indicar que es un float.
        System.out.println(myFloat);

        System.out.println(myDouble + myFloat + " " + myString);

        Boolean myBoolean = true;
        System.out.println(myBoolean);

        // myBoolean = null; // Comentamos esto, ya que los booleanos no pueden ser nulos.

        myFloat = null;
        if (myFloat != null) {
            System.out.println(myFloat + 10);
        } else {
            System.out.println("myFloat es nulo");
        }

        List<String> myList = new ArrayList<>();
        myList.add(myString);
        // myList.add(myInt); // No puedes agregar un Integer a una lista de cadenas.
        System.out.println(myList);
        System.out.printf("hola mundo");
        System.out.println("hola gente");
        System.out.println("esto esta metido a mano");
    }
}


