// Import the HashMap class
import java.util.HashMap;

public class Ejercicio02 {
  public static void main(String[] args) {
    // Create a HashMap object called m
    HashMap<Integer, String> m = new HashMap<>();

    // Add keys and values (Country, City)
    m.put(924, "Amalia Núñez");
    m.put(921, "Cindy Nero");
    m.put(700, "César Vázquez");
    m.put(219, "Víctor Tilla");

    System.out.println("Todas las entradas del diccionario extraídas con entrySet:");
    System.out.println(m.entrySet());

    System.out.println("\nEntradas del diccionario extraidas una a una");
    for (Integer pareja: m.keySet()) {
        System.out.println(pareja);
    }


  }
}