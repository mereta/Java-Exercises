public class MyString {
	// Returns a new string with the characters in str converted to lowercase.
	public static String toLowerCase(String str) {
		String lowString = "";
		char lowCh;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			lowCh = MyCharacter.toLowerCase(ch);
			lowString = lowString + lowCh;
		}
		return lowString;
	}

	// Returns a new string with the characters in str converted to uppercase.
	public static String toUpperCase(String str) {
		String highString = "";
		char highCh;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			highCh = MyCharacter.toUpperCase(ch);
			highString = highString + highCh;
		}
		return highString;
	}

	// Returns true if the two strings s1 and s2 are equal; false otherwise. 
	// Two strings are considered equal if they are of the same length and 
	// corresponding characters in the two strings are equal.
	public static boolean equals(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		} else {
			for (int i = 0; i < s1.length(); i++) {
				char ch1 = s1.charAt(i);
				char ch2 = s2.charAt(i);
				if (ch1 != ch2) {
					return false;
				}
			}
			return true;
		}
	}

	// Returns true if the two strings s1 and s2 are equal ignoring case; false 
	// otherwise. Two strings are considered equal if they are of the same length 
	// and corresponding characters in the two strings are equal ignoring case.
	public static boolean equalsIgnoreCase(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		} else {
			for (int i = 0; i < s1.length(); i++) {
				char ch1 = s1.charAt(i);
				char ch2 = s2.charAt(i);
				if (MyCharacter.toLowerCase(ch1) != MyCharacter.toLowerCase(ch2)) {
					return false;
				}
			}
			return true;
		}
	}

	// Returns a new string with every occurrence of character ch1 in str replaced 
	// with character ch2.	
	public static String replace(String str, char ch1, char ch2) {
		String newString = "";
		for (int i = 0; i < str.length(); i++) {
			char currentCh = str.charAt(i);
			if (currentCh == ch1) {
				newString = newString + ch2;
			} else {
				newString = newString + currentCh;
			}
		}
		return newString;
	}

	// Returns a new string with all leading and trailing whitespace characters (space 
	// or tab characters) in str removed.
	public static String trim(String str) {
		int start = 0;
		int finish = str.length();
		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			if (MyCharacter.isWhitespace(ch1) == false) {
				start = i;
				break;
			}
		}
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch2 = str.charAt(i);
			if (MyCharacter.isWhitespace(ch2) == false) {
				finish = i;
				break;
			}
		}
		return str.substring(start, finish);
	}

	// Returns true if str starts with the specified prefix; false otherwise.
	public static boolean startsWith(String str, String prefix) {
		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			for (int j = 0; j < prefix.length(); j++) {
				char ch2 = prefix.charAt(j);
				if (ch1 != ch2) {
					return false;
				}
			}
		}
		return true;
	}

	// Returns true if str ends with the specified suffix; false otherwise.
	public static boolean endsWith(String str, String suffix) {
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch1 = str.charAt(i);
			for (int j = suffix.length() - 1; j >= 0; j--) {
				char ch2 = suffix.charAt(j);
				if (ch1 != ch2) {
					return false;
				}
			}
		}
		return true;
	}
}
