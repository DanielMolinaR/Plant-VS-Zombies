/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 *
 * @author daniel
 */

public class Validation {

    char[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public Validation() {

    }

    public boolean canBeIntroduced(HashMap<User, Integer> users_stored, String dni){
        boolean can_introduce_dni = false; 
        try{
            if (dniCorrectAndRegistered(users_stored, dni)) can_introduce_dni = true;
        } catch(Exception e){
        } finally {
            return can_introduce_dni;
        }
    }
    
    public boolean dniCorrectAndRegistered (HashMap<User, Integer> users_stored, String dni) {
        if(!verifyLength(dni)) return false; 
        if(!verifyNumbers(dni)) return false;
        if(!verifyLastCharacter(dni)) return false;
        if(!verifyLetterIsCorrect(dni)) return false;
        if(dniExists(users_stored, dni)) return false;
        return true;
    }

    public boolean verifyLength (String dni){
        if(dni.length()!=9) return false;
            else return true;
    }

    public boolean verifyNumbers (String dni){
        List<Character> chars = convertStringToList(dni);
        if (allAreNumbers(chars)) return true;
        else return false;

    }

    public List<Character> convertStringToList(String dni) {
        List<Character> chars = new ArrayList<>();
        for (char ch : dni.toCharArray()) { 
            chars.add(ch); 
        } 
        return chars;
    }

    public boolean allAreNumbers (List<Character> chars){
        for (int i=0; i < 8; i++ ){
            char c = chars.get(i);
            int ascii_numbers = (int) c;
                if (ascii_numbers>47 && ascii_numbers<58);
                else return false;
        }
        return true;
    }

    public boolean verifyLastCharacter(String dni){
        char dni_letter = dni.charAt(8);
        int ascii_letter = (int) dni_letter;
        if ((ascii_letter > 64 && ascii_letter < 91) || (ascii_letter > 96 && ascii_letter < 123)) return true;
        else return false;

    }

    public boolean verifyLetterIsCorrect(String dni) {
        int numbers_dni = Integer.parseInt(dni.substring(0, 8)); 
        int letter_position = numbers_dni%23;
        char correct_letter = letters[letter_position];
        if (correct_letter == dni.charAt(8)) return true;
        else return false;
    }

    public boolean dniExists (HashMap<User, Integer> users_stored, String dni){

        for(User u : users_stored.keySet()){
            if(u.getDni().equals(dni)) return true;
        }
        return false;

    }

}
