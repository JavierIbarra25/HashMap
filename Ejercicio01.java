// Import the HashMap class
import java.util.HashMap;

public class Ejercicio01 {
  public static void main(String[] args) {
    // Create a HashMap object called m
    HashMap<Integer, String> m = new HashMap<>();

    // Add keys and values (Country, City)
    m.put(924, "Amalia Núñez");
    m.put(921, "Cindy Nero");
    m.put(700, "César Vázquez");
    m.put(219, "Víctor Tilla");

    System.out.println("Los elementos de m son: "+ m);

    System.out.println(m.get(924));
    System.out.println(m.get(921));
    System.out.println(m.get(700));
    System.out.println(m.get(219));
  }
}