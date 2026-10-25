# NSC Mid-2 Java Lab Programs

These programs use standard Java APIs and are intended to run on Linux and in Geany. No external libraries are required.

## Files

All Java source filenames are lowercase and stored in `internal 2/`:

- `substitutioncipher.java`
- `rijndaelaes.java`
- `sha1digest.java`
- `desalgorithm.java`

## Install Java on Linux

Check that both the runtime and compiler are installed:

```bash
java -version
javac -version
```

On Ubuntu/Debian, install the JDK if needed:

```bash
sudo apt update
sudo apt install default-jdk
```

## Compile and run from the repository root

The directory name has a space, so keep the quotation marks:

```bash
javac "internal 2"/*.java

java -cp "internal 2" substitutioncipher
java -cp "internal 2" rijndaelaes
java -cp "internal 2" sha1digest
java -cp "internal 2" desalgorithm
```

You can also compile and run each file individually. For example:

```bash
javac "internal 2/substitutioncipher.java"
java -cp "internal 2" substitutioncipher
```

## Configure Geany on Linux

1. Install Geany using your Linux package manager/software center.
2. Open one of the Java files from the `internal 2` directory.
3. Open **Build → Set Build Commands**.
4. Set the **Compile** command to:

   ```bash
   javac "%f"
   ```

5. Set the **Execute** command to:

   ```bash
   java -cp "%d" %e
   ```

6. Save the settings. Select the Java source file, then use **Build → Compile** and **Build → Execute**.

The quoted `%d` path handles the space in `internal 2`. Do not add a Java `package` declaration to these files. If your Geany version uses slightly different labels, set the equivalent Compile and Execute fields.

## Makefile shortcuts

If `make` is installed, run these from the repository root:

```bash
make
make substitutioncipher
make rijndaelaes
make sha1digest
make desalgorithm
make clean
```

## Notes

- The substitution example is a Caesar shift of 3 for uppercase English letters.
- AES is the standardized Rijndael variant exposed by Java's AES implementation.
- SHA-1 returns a 160-bit digest and cannot be decrypted.
- DES is included for lab learning only.
- SHA-1 and DES are obsolete for modern security. The AES example uses ECB mode for simplicity in a lab, not for production data.
