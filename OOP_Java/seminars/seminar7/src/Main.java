public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new LogCalculaBleFactory(new ConsoleLogger());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}
