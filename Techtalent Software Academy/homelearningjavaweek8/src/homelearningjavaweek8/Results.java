package homelearningjavaweek8;

public class Results {
	short mPhysics=120;
	//physics exam mark
	short mChemistry=90;
	//chemistry exam mark
	short mBiology=80;
	//biology exam mark
	
	int mTotal= mPhysics + mChemistry + mBiology;
	//total mark, had to change from short to int
	
	int percentage;
	// had to change to int,would not work with byte
	
	public void displayResults() {
		
		System.out.println("Your Physics Exam Result was");
		System.out.println( mPhysics + " out of 150");
		System.out.println();
		System.out.println("Your Chemistry Exam Result was");
		System.out.println( mChemistry + " out of 150");
		System.out.println();
		System.out.println("Your Biology Exam Result was");
		System.out.println( mBiology + " out of 150");
		System.out.println();
		System.out.println("Your Total mark was "+ mTotal + " out of 450");
		
		
		
	}
	
	public void createPercentage() {
		
		percentage=(mTotal*100)/450;
		
		
		
		if (percentage >=60)
		{
		System.out.println( "Your total percentage is " + percentage+"% .");
		System.out.println("You have passed your exams!");
	}
		else {
		System.out.println( "Your total percentage is " + percentage+"% .");
		System.out.println("You haven't passed your exams! Exam retakes are in September.");
	}
		}
	

		
		
	}
