package strategypattern;

import strategypattern.Strategy.Play;
import strategypattern.Strategy.HighScore;
import strategypattern.Strategy.Rules;
import strategypattern.Strategy.Quit;

public class Context {
	    private final Strategy strategy1 = new Play();
        private final Strategy strategy2 = new HighScore();
        private final Strategy strategy3 = new Rules();
        private final Strategy strategy4 = new Quit();
        
	public void execute(){
		        strategy1.executeParameters();
                strategy2.executeParameters();
                strategy3.executeParameters();
                strategy4.executeParameters();
	}
	public void setStrategy(Strategy strategy){
		        strategy = strategy1;
                strategy = strategy2;
                strategy = strategy3;
                strategy = strategy4;
	}
	public Strategy getStrategy(){
		return strategy1;
	}
    }




