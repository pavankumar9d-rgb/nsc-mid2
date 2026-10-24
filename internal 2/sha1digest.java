import java.security.MessageDigest;

public class sha1digest {
    public static void main(String[] args) throws Exception {
        String text = "Hello Java";
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        byte[] digest = md.digest(text.getBytes("UTF-8"));

        StringBuilder hex = new StringBuilder();
        for (byte b : digest) {
            hex.append(String.format("%02x", b & 0xff));
        }

        System.out.println("Original Text: " + text);
        System.out.println("SHA-1 Digest: " + hex);
    }
}
