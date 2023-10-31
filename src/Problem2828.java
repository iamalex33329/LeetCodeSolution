/**
 *  2828. Check if a String Is an Acronym of Words
 *
 *  Given an array of strings words and a string s, determine if
 *  s is an acronym of words.
 *
 *  The string s is considered an acronym of words if it can be
 *  formed by concatenating the first character of each string
 *  in words in order. For example, "ab" can be formed from
 *  ["apple", "banana"], but it can't be formed from ["bear", "aardvark"].
 *
 *  Return true if s is an acronym of words, and false otherwise.
 *
 */

import java.util.List;

public class Problem2828 {
    public boolean isAcronym(List<String> words, String s) {

        if (words.size() != s.length()) return false;

        for (int i=0; i<words.size(); i++) {
            if (words.get(i).charAt(0) != s.charAt(i)) return false;
        }

        return true;
    }
}
