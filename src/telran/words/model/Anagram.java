package telran.words.model;

import java.util.HashMap;

public class Anagram {
    public static boolean isAnagram(String word, String part) {
        if (part == null || word == null || part.length() == 0 || word.length() == 0) {
            return false;
        }
        HashMap<Character, Integer> wordMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            wordMap.merge(word.charAt(i), 1, (oldV, v) -> oldV + v);
        }
        for (int i = 0; i < part.length(); i++) {
            Character character = part.toLowerCase().charAt(i);
            if (wordMap.get(character) == null || wordMap.get(character) == 0) {
                return false;
            }
            wordMap.put(character, wordMap.get(character) - 1);
        }
        return true;
    }

}
