package randompassword;

import java.util.Random;

/**
 *
 * @author JoseLuis
 */
public class RandomPassword {

   private static final String NUM = "0123456789";
   private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
   private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   private static final String SPECIAL = "$@%&#_";
   private String buffer;

   public RandomPassword() {
      buffer = NUM + LOWERCASE + UPPERCASE + SPECIAL;
   }

   public String createPassword(int length) {
      Random r = new Random();
      int pos;
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < length; i++) {
         pos = r.nextInt(buffer.length());
         sb.append(buffer.substring(pos, pos + 1));
      }
      return sb.toString();
   }
}