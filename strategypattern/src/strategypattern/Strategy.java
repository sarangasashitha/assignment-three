package strategypattern;

public interface Strategy {
    public void executeParameters();
    
    public class Play implements Strategy{
        @Override
	public void executeParameters() {
		System.out.println("Play");
	}
    }
    
    public class HighScore implements Strategy{
        @Override
	public void executeParameters() {
		System.out.println("View High Scores");
	}
    }
    
    public class Rules implements Strategy{
        @Override
	public void executeParameters() {
		System.out.println("View Rules");
	}
    }

    public class Quit implements Strategy{
        @Override
	public void executeParameters() {
		System.out.println("Quit");
	}
    }
        
}
    
    

