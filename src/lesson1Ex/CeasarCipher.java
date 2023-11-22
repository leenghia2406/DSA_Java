package lesson1Ex;
public class CeasarCipher {
	static int stepMoving;
	// Array of the alphabet includes uppercase_and_lowercase letters, and space
	static char[]alphabet = new char [53];
	public static void createAlphabet() {
		// Add uppercase_letters to the array
		for(int i = 0; i < 26; i++) {
			alphabet[i] = (char) ('A' + i);
		}
		// Add lowercase_letters to the array
		for (int i = 26; i < 52; i++) {
			alphabet[i] = (char) ('a' + (i -26));
		}
		// Add space character to the array
		alphabet[52] = ' '; 
	}
	public static int getIndexOfAlphabet(char c) {
		int result = -1;
		for (int i = 0; i < alphabet.length; i++) {
			if (c == alphabet[i]) {
				result = i;
			}
		}
		return result;
	}
	public static char encryptChar(char c) {
		return alphabet[(getIndexOfAlphabet(c)+ stepMoving) % 53];
	}
	public static char decryptChar(char c) {
		return alphabet[(getIndexOfAlphabet(c)- stepMoving + 53) % 53];
	}
	public static String encrypt(String text) {
		String result = "";
		for (int i = 0; i < text.length(); i++) {
			result += encryptChar(text.charAt(i));
		}
		return result;
	}
	public static String decrypt(String text) {
		String result = "";
		for (int i = 0; i < text.length(); i++) {
			result += decryptChar(text.charAt(i));
		}
		return result;
	}

	public static void main(String[] args) {
		// Create the alphabet array and set the step moving value
		createAlphabet();
		stepMoving = 3;
		 // Test the encryption and_decryption methods with different strings
		String myName1 = "LE TRONG NGHIA";
		String myName2 = "LETRONGNGHIA";
		String myName3 = "Le Trong Nghia";
		System.out.println(encrypt(myName1));
		System.out.println(decrypt(encrypt(myName1)));
		System.out.println(encrypt(myName2));
		System.out.println(decrypt(encrypt(myName2)));
		System.out.println(encrypt(myName3));
		System.out.println(decrypt(encrypt(myName3)));
	}
}
