package game;

public class BotShip extends Ship {
	
	private State state;
	private int scoreAlive;
	public final int IdNumber;
	public final int X;
	public final int Y;
	
	public BotShip(int countDeck, int position, Orientation orientation, int number, int x, int y)
	{	
		super(position, orientation, countDeck);
		this.X = x;
		this.Y = y; 
		this.IdNumber = number;
		this.scoreAlive = countDeck;
		this.state = State.alive;
	}
	public BotShip()
	{
		super();
		this.X = 0;
		this.Y = 0;
		this.IdNumber = 0;
	}
	BotShip(int countDeck, int position, Orientation orientation, int number, int scoreAlive)
	{
		super(position, orientation, countDeck);
		if (countDeck == scoreAlive)
			this.state = State.alive;
		else if (scoreAlive == 0)
			this.state = State.killed;
		else 
			this.state = State.damaged;
		this.IdNumber = number;
		this.scoreAlive = scoreAlive;
		this.X = position % 10;
		this.Y = position / 10;
	}
	
	public int Position()
	{
		return this.position;
	}
	
	public int CountDeck()
	{
		return this.length;
	}
	
	public Orientation Orientation()
	{
		return this.orientation;
	}
	
	public State State()
	{
		return this.state;
	}
	
	public int ScoreAlive()
	{
		return this.scoreAlive;
	}
	
	protected void changState()
	{
		this.scoreAlive--;
		if (this.scoreAlive == 0)
			this.state = State.killed;
		else
			this.state = State.damaged;
	}
}

