import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<String, String> favQuotes = new HashMap<String,String>();
		//create hashmap string, string as I want to do author and then quote.
		
		favQuotes.put("Walt Disney", "Why worry? If you've done the very best you can, worrying won't make it any better.");
		favQuotes.put("Ingvar Kamprad", "Making mistakes is the privilege of the active. It is always the mediocre people who are negative, who spend their time proving that they were not wrong.");
		favQuotes.put("Victor Hugo", "You have enemies? Good that means you've stood up for something, sometime in your life.");
		favQuotes.put("Winston Churchill", "Success is not final, failure is not fatal: it is the courage to continue that counts.");
		
		
		
		for( String i : favQuotes.keySet()) 
		{System.out.println(i);}
		// print all available keys/ authors
		
		
		System.out.println(System.lineSeparator());
		
		
		
		System.out.println(favQuotes.get("Walt Disney"));
		//fetch single entry
		
		
		
		
		System.out.println(System.lineSeparator());
		
		for (String i:favQuotes.keySet()) {
			System.out.println("'"+favQuotes.get(i)+"'"+ System.lineSeparator() + "\t" + i);
			
			System.out.println(System.lineSeparator());
		}
		//print all quotes and authors to console with formating. iterate through with for loop, i creates indexable values for keys, for values use get(i)

	}

}
