public class RomanCalculator {

    private final RomanSymbolParser romanSymbolParser;

    public RomanCalculator(RomanSymbolParser romanSymbolParser) {
        this.romanSymbolParser = romanSymbolParser;
    }

    private interface Operation{
        int evaluate(int seed, Symbol previousSymbol);
    }


    private class AddOperation implements Operation {

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

    private class UnitOperation implements Operation {

        @Override
        public int evaluate(int seed, Symbol previousSymbol) {
            return seed;
        }
    }

    public int evaluate(String romanString) {
        String[] romanCharacters = romanString.split("");
        Operation operation = new UnitOperation();
        for (int index = 1; index < romanCharacters.length; index++) {
            operation = new AddOperation(operation, romanSymbolParser.parse(romanCharacters[index]));
        }
        return operation.evaluate(0, Symbol.NULL);
    }
}
