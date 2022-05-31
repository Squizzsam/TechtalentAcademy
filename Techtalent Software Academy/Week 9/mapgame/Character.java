package mapgame;

public class Character {

	private String name;
	private int lives;
	private String description;
	private String type;
	
	public Character (String passedInName, int passedInLives, String passedInDescription, String passedInType)
	{this.name=passedInName;
	this.lives=passedInLives;
	this.description=passedInDescription;
	this.type=passedInType;}

	public String getName() {
		return name;
	}



	public String getDescription() {
		return description;
	}

	public String getType() {
		return type;
	}
	
	public int getLives() {
		return lives;
	}
	

	public void setLives(int lives) {
		this.lives = lives;
	}
	
	
}
