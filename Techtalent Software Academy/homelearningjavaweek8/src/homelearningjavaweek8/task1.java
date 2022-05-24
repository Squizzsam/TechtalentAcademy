package homelearningjavaweek8;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String sentence ="Are you as excited as I am ?";
		
		String reverseSentence="";
		
		String[]words= sentence.split(" ");
		
		
		for (int i=words.length-1;i>=0;i--) {
			
			reverseSentence=reverseSentence+words[i]+" ";
			 
			
		}
		
		reverseSentence=reverseSentence+" ?";
		System.out.println(reverseSentence);
		
	}

}
