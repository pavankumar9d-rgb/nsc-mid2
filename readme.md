# NSC Mid-2 Java Lab Programs

Four simple Java programs with algorithms and expected outputs.

## Files

- `internal 2/substitutioncipher.java` — substitution (Caesar shift) encryption and decryption
- `internal 2/rijndaelaes.java` — Rijndael/AES encryption and decryption
- `internal 2/sha1digest.java` — SHA-1 message digest
- `internal 2/desalgorithm.java` — DES encryption and decryption

## Compile and run

Run these commands from the repository root:

```bash
javac "internal 2/substitutioncipher.java"
java -cp "internal 2" substitutioncipher

javac "internal 2/rijndaelaes.java"
java -cp "internal 2" rijndaelaes

javac "internal 2/sha1digest.java"
java -cp "internal 2" sha1digest

javac "internal 2/desalgorithm.java"
java -cp "internal 2" desalgorithm
```

## Notes

- AES is the standardized Rijndael variant used by Java's `AES` cipher implementation.
- The substitution example is a Caesar shift of 3 for uppercase English letters.
- SHA-1 produces a 160-bit digest and cannot be decrypted. SHA-1 and DES are obsolete for modern security use; these examples are for lab learning only.
- Java's built-in cryptography APIs are used for AES, SHA-1, and DES.