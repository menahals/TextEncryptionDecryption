/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TextEncryption;

import java.util.Scanner;
public class TextEncryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int choice;
        
        do{
            System.out.println("\nCryptography ");
            System.out.println("  1. Caesar Cipher ");
            System.out.println("  2. Rail-fence Cipher ");
            System.out.println("  3. Exit System ");
            System.out.print("Enter a number: ");
            choice = input.nextInt();
            input.nextLine();

            switch(choice) {
                case 1:
                    System.out.print("\nEnter 1 for Encryption or 2 for Decryption: ");
                    int caeserOption = input.nextInt();
                    input.nextLine(); 
                    
                    if(caeserOption == 1){
                        System.out.println(" - Caesar Cipher Encryption - ");       
                        System.out.print("Enter text to encrypt: ");
                        String caesarText = input.nextLine();
                        System.out.print("Enter a shift value (1-25): ");
                        int shiftValue = input.nextInt();

                        while(shiftValue < 1 || shiftValue > 25) {
                            System.out.print("Enter a valid shift value (1-25): ");
                            shiftValue = input.nextInt();
                        }

                        String encryptedCaesarText = CaesarCipher.caesarEncryption(caesarText, shiftValue);
                        System.out.println("Encrypted text: " + encryptedCaesarText);
                    } 
                    else if(caeserOption == 2){
                        System.out.println(" - Caesar Cipher Decryption - ");       
                        System.out.print("Enter text to decrypt: ");
                        String caesarText = input.nextLine();
                        System.out.print("Enter a shift value (1-25): ");
                        int shiftValue = input.nextInt();

                        while(shiftValue < 1 || shiftValue > 25) {
                            System.out.print("Enter a valid shift value (1-25): ");
                            shiftValue = input.nextInt();
                        }

                        String decryptedCaesarText = CaesarCipher.caesarDecryption(caesarText, shiftValue);
                        System.out.println("Decrypted text: " + decryptedCaesarText);
                    }
                    break;

                case 2:
                    System.out.print("\nEnter 1 for Encryption or 2 for Decryption: ");
                    int railfenceOption = input.nextInt();
                    input.nextLine(); 
                    
                    if(railfenceOption == 1){
                        System.out.println(" - Rail-fence Cipher Encryption - ");
                        System.out.print("Enter text to encrypt: ");
                        String railFenceText = input.nextLine();

                        System.out.print("Enter a key value (greater than 1): ");
                        int key = input.nextInt();

                        while(key <= 1){
                            System.out.print("Enter a key value (greater than 1): ");
                            key = input.nextInt();
                        }

                        String encryptedRailText = RailFenceCipher.RailFenceEncryption(railFenceText, key);
                        System.out.println("Encrypted text: " + encryptedRailText);
                    }
                    else if(railfenceOption == 2){
                        System.out.println(" - Rail-fence Cipher Decryption - ");
                        System.out.print("Enter text to decrypt: ");
                        String railFenceText = input.nextLine();

                        System.out.print("Enter a key value (greater than 1): ");
                        int key = input.nextInt();

                        while(key <= 1){
                            System.out.print("Enter a key value (greater than 1): ");
                            key = input.nextInt();
                        }

                        String decryptedRailText = RailFenceCipher.RailFenceDecryption(railFenceText, key);
                        System.out.println("Encrypted text: " + decryptedRailText);
                    }
                    
                    break;

                case 3:
                    System.out.println("Exiting System. ");
                    break;

                default:
                    System.out.println("Invalid input! Try again. ");
            }
            
        }while(choice!=3);
    }
}