/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TextEncryption;

public class CaesarCipher {
    public static String caesarEncryption(String caesarText, int shiftValue) {
        caesarText = caesarText.toUpperCase();
        String encryptedText = "";
        
        for (int i = 0; i < caesarText.length(); i++) {
            char currentCharacter = caesarText.charAt(i);
            if (currentCharacter >= 'A' && currentCharacter <= 'Z') {
                char shiftedCharacter = (char) ((currentCharacter - 'A' + shiftValue) % 26 + 'A');
                encryptedText += shiftedCharacter;
            }
            else {encryptedText += currentCharacter;}   
        }
        return encryptedText;
    }
    
    public static String caesarDecryption(String caesarText, int shiftValue) {
        caesarText = caesarText.toUpperCase();
        String decryptedText = "";
        
        for (int i = 0; i < caesarText.length(); i++) {
            char currentCharacter = caesarText.charAt(i);
            if (currentCharacter >= 'A' && currentCharacter <= 'Z') {
                char shiftedCharacter = (char) (((currentCharacter - 'A' - shiftValue + 26) % 26) + 'A');
                decryptedText += shiftedCharacter;
            }
            else {decryptedText += currentCharacter;}   
        }
        return decryptedText;
    }
    
}
