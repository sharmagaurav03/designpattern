package pattern.strategy.tutorialpoints;

/**
 * Created by gauravs on 21/2/16.
 */
public class Context{
    private Strategy strategy;

    public Context(Strategy strategy)
    {
        this.strategy=strategy;
    }

    public int executeStrategy(int num1, int num2)
    {
        return strategy.doOperation(num1, num2);
    }
}
