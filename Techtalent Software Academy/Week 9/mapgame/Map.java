package mapgame;

public class Map {

	
	private int x;
	//private int x height of map north south
	private int y;
	//private int y width of map east west
	private int currentX;
	//current location on the vertical
	private int currentY;
	//current location on the horizontal
	
	
	public Map( int passedInX, int passedInY ) {
		this.x=passedInX;
		this.y=passedInY; }
	
	
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	// getters for map location
	
	
	public int getCurrentX() {
		return currentX;
	}
	public void setCurrentX(int currentX) {
		this.currentX = currentX;
	}
	public int getCurrentY() {
		return currentY;
	}
	public void setCurrentY(int currentY) {
		this.currentY = currentY;
	}
	
	//getters and setters for current location
	
	
	
	
	public void move(String direction) {
	if(direction.equals("N")) {
		if(this.currentX==this.x) {
			this.currentX=0;
		
		}else {
			this.currentX=this.currentX+1;
		}
		
	} else if(direction.equals("S")) {
		if(this.currentX==this.x) {
			this.currentX=0;
		} else if(this.currentX==0) {
			System.out.println("You can't go that way");
		} else {
			this.currentX=this.currentX-1;
		}
		
	} else if(direction.equals("E")) {
		if(this.currentY==this.y) {
			this.currentY=0;
			
		}else {
		}
			this.currentY=this.currentY+1;
		}
		
	else if (direction.equals("W")) {
		if (this.currentY==this.y) {
			this.currentY=0;
		}else if (this.currentY==0){
			System.out.println("You can't go that way");	
		} else {
			this.currentY=this.currentY-1;
		}}
		else {
			System.out.println("Please choose a direction, find those snackies quick!");
			System.out.println("\tN to go North"+ System.lineSeparator()+"\tS to go South");
			System.out.println("\tE to go East"+ System.lineSeparator()+"\tW to go West"); 
	}
	}
	
}

