package homelearningjavaweek8;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String sentence= "We promptly judged antique ivory buckles for the next prize";
		 boolean a, b, c, d, e, f, g, h, i, j , k , l , m, n, o, p, q, r, s ,t, u , v, w, x, y, z;
		 a=b=c=d=e=f=g=h=i=j=k=l=m=n=o=p=q=r=s=t=u=v=w=x=y=z=false;
		//booleans created for switch operator to use
		 
		 String sentencel=sentence.toLowerCase();
		 //processing data for evaluation, made a new string to transform to lower case 
		 
		 String letters[]=sentencel.split("");
		 //split new string into an array of just its letters.
		 
		 for(byte in=0; in < letters.length;in++) {
			 //used in instead of i, as i was already in use
			// System.out.println(letters[in]);
			 //for loop, loops through array to scan sentence to see which values to switch on
			 switch (letters [in]) {	
			 //the switch, i changed initial values to false as I felt this made more logical sense to 'turn the values on'
			 case "a":
				 a=true;
				 break;
			 case "b":
				 b=true;
				 break;
			 case "c":
				 c=true; 
				 break;
			 case "d":
				 d=true;
				 break;
			 case "e":
				 e=true;
				 break;
			 case "f":
				 f=true;
				 break;
			 case "g":
				 g=true;
				 break;
			 case "h":
				 h=true;
				 break;
			 case "i":
				 i=true;
				 break;
			 case "j":
				 j=true;
				 break;
			 case "k":
				 k=true;
				 break;
			 case "l":
				 l=true;
				 break;
			 case "m":
				 m=true;
				 break;
			 case "n":
				 n=true;
				 break;
			 case "o":
				 o=true;
				 break;
			 case "p":
				 p=true;
				 break;
			 case "q":
				 q=true;
				 break;
			 case "r":
				 r=true;
				 break;
			 case "s":
				 s=true;
				 break;
			 case "t":
				 t=true;
				 break;
			 case "u":
				 u=true;
				 break;
			 case "v":
				 v=true;
				 break;
			 case "x":
				 x=true;
				 break;
			 case "y":
				 y=true;
				 break;
			 case "z":
				 z=true;
			
			 }
		
			  }
		 //check if all values are true and return message to console
		 if(a=b=c=d=e=f=g=h=i=j=k=l=m=n=o=p=q=r=s=t=u=v=w=x=y=z==true) {
			 System.out.println("The Sentence '"+ sentence +"' is a pangram!");
		 }
		 
		 //return an else statement if any letter booleans are switched off
		 else {
			 System.out.println("The Sentence '"+ sentence +"' is not a pangram!");
		 }
	
	}

}
