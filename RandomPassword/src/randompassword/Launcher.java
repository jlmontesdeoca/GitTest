package randompassword;

/**
 *
 * @author JoseLuis
 */
public class Launcher {
   public static void main(String[] args) {
      RandomPassword rp = new RandomPassword();
      for (int i = 0; i < 100; i++) {
         System.out.println(rp.createPassword(14));
      }
   }
}
