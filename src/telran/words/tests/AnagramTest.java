package telran.words.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static telran.words.model.Anagram.isAnagram;

class AnagramTest {
    String word = "electricity";

    @Test
    void testIsAnagram() {

        System.out.println(isAnagram(word, "cityX11 00 1"));

        assertTrue(isAnagram(word, "city"));
        assertTrue(isAnagram(word, "cYclE"));
        assertTrue(isAnagram(word, "city"));
        assertTrue(isAnagram(word, "tele"));
        assertTrue(isAnagram(word, "yticirtcele"));

        assertFalse(isAnagram(word, "tell"));
        assertFalse(isAnagram(word, "select"));
        assertFalse(isAnagram(word, "collect"));
        assertFalse(isAnagram(word, "reter"));
        assertFalse(isAnagram(word, ""));
        assertFalse(isAnagram(word, null));


    }
}