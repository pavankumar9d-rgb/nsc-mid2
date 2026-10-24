import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class desalgorithm {
    public static void main(String[] args) throws Exception {
        String text = "Hello Java";
        byte[] keyBytes = "12345678".getBytes("UTF-8");
        SecretKeySpec key = new SecretKeySpec(keyBytes, "DES");

        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        String encrypted = Base64.getEncoder().encodeToString(
                cipher.doFinal(text.getBytes("UTF-8")));

        cipher.init(Cipher.DECRYPT_MODE, key);
        String decrypted = new String(
                cipher.doFinal(Base64.getDecoder().decode(encrypted)), "UTF-8");

        System.out.println("Original Text: " + text);
        System.out.println("Encrypted Text: " + encrypted);
        System.out.println("Decrypted Text: " + decrypted);
    }
}
