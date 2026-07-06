/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TextEncryption;

public class RailFenceCipher {
   public static String RailFenceEncryption(String railFenceText, int key){
        railFenceText = railFenceText.toUpperCase();
        String encryptedText = "";
 
        for (int row = 0; row < key; row++ ){
            int currentCharacter = row;    
            int move = (key - 1) * 2;
            int down = (key-row-1)*2;
            int up = row*2;
            boolean direction = true;
            
            while(currentCharacter < railFenceText.length()){
                encryptedText += railFenceText.charAt(currentCharacter);
                
                if(row == 0 || row == key - 1 ){currentCharacter += move;}
                else if (direction == true) {currentCharacter += down;}
                else {currentCharacter += up;}
                    direction =! direction;
            }
        }
        return encryptedText;
    } 
   
    public static String RailFenceDecryption(String railFenceText, int key){
        railFenceText = railFenceText.toUpperCase();
        String decryptedText = "";
        int len = railFenceText.length();
        char[][] rail = new char[key][len];
        int index = 0;
        boolean down = false;
        int row = 0;

        for (int col = 0; col < len; col++) {
            rail[row][col] = '-'; 

            if (row == 0 || row == key - 1) {down = !down;}

            if (down) {row++;} 
            else {row--; }
        }

        for (int i = 0; i < key; i++) {
            for (int j = 0; j < len; j++) {
                if (rail[i][j] == '-') {
                    rail[i][j] = railFenceText.charAt(index++);
                }
            }
        }
        
        row = 0;
        down = false;
        for (int col = 0; col < len; col++) {
            decryptedText += rail[row][col]; 
            if (row == 0 || row == key - 1) {down = !down; }
            if (down) {row++;} 
            else {row--;}
        }
        return decryptedText;
    } 
}
