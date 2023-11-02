public class LogCalculator implements Calculable{
    private Logable logger;
    private Calculable calculator;

    public LogCalculator( Calculable calculator, Logable logger) {
        this.logger = logger;
        this.calculator = calculator;
    }

    @Override
    public Calculable sum(int arg) {
        logger.log("Сложение " + getResult() + " c " + arg);
        return calculator.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        logger.log("Умножение " + getResult() + " c " + arg);
        return calculator.multi(arg);
    }

    @Override
    public int getResult() {
        return calculator.getResult();
    }
}
