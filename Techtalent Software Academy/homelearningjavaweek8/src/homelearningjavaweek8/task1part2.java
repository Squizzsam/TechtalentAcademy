package homelearningjavaweek8;

public class task1part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
String[]wordList= {"Stressed","Parts", "Straw","Keep","Wolf"};
		
		String reversedWord;
		
	
		
		for(byte i=0;i<wordList.length;i++) {
			reversedWord="";
			
			String editWord=wordList[i];
			
			String letters[]=editWord.split("");
			
			//System.out.println(editWord);
			
			
			
			for(int j=letters.length-1;j>=0;j--) {
				
				reversedWord=reversedWord+ letters[j];
				
				
				
			}
			
			
			System.out.println(reversedWord);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
