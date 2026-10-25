.PHONY: all substitutioncipher rijndaelaes sha1digest desalgorithm clean

all:
	javac "internal 2"/*.java

substitutioncipher: all
	java -cp "internal 2" substitutioncipher

rijndaelaes: all
	java -cp "internal 2" rijndaelaes

sha1digest: all
	java -cp "internal 2" sha1digest

desalgorithm: all
	java -cp "internal 2" desalgorithm

clean:
	rm -f "internal 2"/*.class
