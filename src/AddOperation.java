public class AddOperation implements Operation {

    private final Symbol symbol;
    private final Operation operation;

    public AddOperation(Operation operation, Symbol symbol) {
        this.symbol = symbol;
        this.operation = operation;
    }

    @Override
    public int evaluate(int seed, Symbol previousSymbol) {
        return operation.evaluate(seed + symbol.evaluate(previousSymbol), symbol);
    }
}
