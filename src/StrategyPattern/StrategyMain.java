package StrategyPattern;

public class StrategyMain {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.execute(5,6));
    }
}
