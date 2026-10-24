public class substitutioncipher {
    public static void main(String[] args) {
        String text = "HELLO WORLD";
        int key = 3;

        String encrypted = encrypt(text, key);
        String decrypted = decrypt(encrypted, key);

        System.out.println("Original Text: " + text);
        System.out.println("Encrypted Text: " + encrypted);
        System.out.println("Decrypted Text: " + decrypted);
    }

    static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) ((ch - 'A' + key) % 26 + 'A'));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    static String decrypt(String text, int key) {
        return encrypt(text, 26 - key % 26);
    }
}
