public class LogCalculaBleFactory implements ICalculableFactory{
    private Logable logger;

    public LogCalculaBleFactory(Logable logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(int primaryArg) {
        return new LogCalculator(new Calculator(primaryArg), logger);
    }
}
