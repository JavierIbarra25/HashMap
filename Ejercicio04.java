import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio04 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    HashMap<Integer, String> m = new HashMap<>();
    
    m.put(924, "Amalia Núñez");
    m.put(921, "Cindy Nero");
    m.put(700, "César Vázquez");
    m.put(219, "Víctor Tilla");
    m.put(537, "Alan Brito");
    m.put(605, "Esteban Quito ");

    System.out.print("Por favor, introduzca un número: ");
    int codigoIntroducido = input.nextInt();

    if (m.containsKey(codigoIntroducido)) {
      System.out.print("El número " + codigoIntroducido + " corresponde a ");
      System.out.println(m.get(codigoIntroducido));
    } else {
      System.out.print("El código introducido no existe.");
    }
    input.close();
  }
}
