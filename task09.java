import java.util.*;

public class Main {
	public static void main(String[] args) {
		outputVowels("Umuzi");
	}
	
	static void outputVowels(String words) {
		String word = words.toLowerCase();
		ArrayList<Character> letterArray = new ArrayList<Character>();
		for ( int i = 0; i < word.length(); i++) {
						boolean itemInArray;
						itemInArray = letterArray.contains(word.charAt(i));
						if (itemInArray)
							continue;
						else if (word.charAt(i) == 'a')
							letterArray.add(word.charAt(i));
						if (itemInArray)
							continue;
						else if (word.charAt(i) == 'e')
							letterArray.add(word.charAt(i));
						if (itemInArray)
							continue;
						else if (word.charAt(i) == 'i')
							letterArray.add(word.charAt(i));
						if (itemInArray)
							continue;
						else if (word.charAt(i) == 'o')
							letterArray.add(word.charAt(i));
			  	if (itemInArray)
			  			continue;
			  		else if (word.charAt(i) == 'u')
			  			letterArray.add(word.charAt(i));
		}
		
		System.out.print("Vowels: ");
		for (int j = 0; j < letterArray.size(); j++) {
		 	 		System.out.print(letterArray.get(j) + " ");
		 	 		
		}
					
}

	}
	
		
