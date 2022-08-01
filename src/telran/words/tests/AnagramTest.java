package telran.words.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static telran.words.model.Anagram.isAnagram;

class AnagramTest {
    String word = "electricity";

    @Test
    void testIsAnagram() {
        assertTrue(isAnagram(word,"city"));
        assertTrue(isAnagram(word,"tray"));
        assertTrue(isAnagram(word,"city"));
        assertTrue(isAnagram(word,"tele"));

        assertFalse(isAnagram(word, "tell"));
        assertFalse(isAnagram(word, "select"));
        assertFalse(isAnagram(word, "collect"));
        assertFalse(isAnagram(word, "reter"));
        assertFalse(isAnagram(word, ""));
        assertFalse(isAnagram(word, null));




    }
}