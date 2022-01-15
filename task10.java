public class Main {
	public static void main(String[] args) {
		commonCharacters("house", "computers");
		
	}
	static void commonCharacters(String word1, String word2) {
		System.out.print("Common letters: ");
		for (int i = 0; i < word1.length(); i++) {
			for (int j= 0; j < word2.length(); j++) {
			
				if (word1.charAt(i) == word2.charAt(j)) {
					StringBuilder builder= new StringBuilder();
					builder.append(word1.charAt(i));
					if ( word1.indexOf(word1.charAt(i)) != word1.length() -1){
        	builder.append(", ");
        			}
					System.out.print(builder.toString());
					
				}
			}
		}
	}	
			
		
}