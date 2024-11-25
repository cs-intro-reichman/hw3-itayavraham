/** Functions for checking if a given string is an anagram. */
public class Anagram {
	public static void main(String args[]) {
		// Tests the isAnagram function.
		System.out.println(isAnagram("silent","listen"));  // true
		System.out.println(isAnagram("William Shakespeare","I am a weakish speller")); // true
		System.out.println(isAnagram("Madam Curie","Radium came")); // true
		System.out.println(isAnagram("Tom Marvolo Riddle","I am Lord Voldemort")); // true
		System.out.println(isAnagram("abba","aba")); // true

		// Tests the preProcess function.
		System.out.println(preProcess("What? No way!!!"));
		
		// Tests the randomAnagram function.
		System.out.println("silent and " + randomAnagram("silent") + " are anagrams.");
		
		// Performs a stress test of randomAnagram 
		String str = "1234567";
		Boolean pass = true;
		//// 10 can be changed to much larger values, like 1000
		for (int i = 0; i < 10; i++) {
			String randomAnagram = randomAnagram(str);
			System.out.println(randomAnagram);
			pass = pass && isAnagram(str, randomAnagram);
			if (!pass) break;
		}
		System.out.println(pass ? "test passed" : "test Failed");
	}  

	// Returns true if the two given strings are anagrams, false otherwise.
	public static boolean isAnagram(String str1, String str2) {
		Boolean appearance = false;
		// Initializing str1 and str2 using PreProcess()
		str1 = preProcess(str1);
		str2 = preProcess(str2);
		String newStr1 = "", newStr2 = "";
		for (int i = 0; i < str1.length(); i++)
		{
			if (str1.charAt(i) != ' ')
			newStr1 += str1.charAt(i);
		}
		for (int i = 0; i < str2.length(); i++)
		{
			if (str2.charAt(i) != ' ')
			newStr2 += str2.charAt(i);
		}

		if (newStr1.length() != newStr2.length())
		return false;

		// Checking if a character in str1 appears in str2, if yes move on to the next character. Else return false.
		for (int i = 0; i < newStr1.length(); i++) {
			appearance = false;
			for (int j = 0; j < newStr2.length(); j++) {
				if(newStr1.charAt(i) == newStr2.charAt(j)) {
                newStr2 = newStr2.substring(0, j) + "!" + newStr2.substring(j + 1);
                appearance = true;
                break;
				}
			}
			if (appearance == false)
			return false;
		}

		return true;
	}
	   
	// Returns a preprocessed version of the given string: all the letter characters are converted
	// to lower-case, and all the other characters are deleted, except for spaces, which are left
	// as is. For example, the string "What? No way!" becomes "whatnoway"
	public static String preProcess(String str) {
		str = str.toLowerCase();
		String newStr = "";
		// Creating a new string composed only of the smaller case letters.
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) >= 'a' || str.charAt(i) == ' ')
			newStr += str.charAt(i);
		}
		str = newStr;
		return str;
	} 
	   
	// Returns a random anagram of the given string. The random anagram consists of the same
	// characters as the given string, re-arranged in a random order. 
	public static String randomAnagram(String str) {
		String newStr = "", remains = str;
		int i;
		// generating a random index into i and adding this character into newStr, then said index from remains.
		while (remains.length() > 0) {
			i = (int)(Math.random() * remains.length());
			newStr += remains.charAt(i);
			remains = remains.substring(0, i) + remains.substring(i + 1);
		}
		return newStr;
	}
}
