import java.util.ArrayList;
import java.util.List;

public class RomanCalculator {

    private final RomanSymbolParser romanSymbolParser;

    public RomanCalculator(RomanSymbolParser romanSymbolParser) {
        this.romanSymbolParser = romanSymbolParser;
    }

    public int evaluate(String romanString) {
        String[] romanCharacters = romanString.split("");
        List<Symbol> symbols = new ArrayList<Symbol>();
        for(int index = 1; index < romanCharacters.length; index++){
            symbols.add(romanSymbolParser.parse(romanCharacters[index]));
        }
        if (symbols.isEmpty()) {
            return 0;
        }
        if (symbols.size() == 1) {
            return symbols.get(0).evaluate(Symbol.NULL);
        }
        Symbol previousSymbol = symbols.get(symbols.size() - 1);
        int sum = previousSymbol.evaluate(Symbol.NULL);
        for (int index = symbols.size() - 2; index >= 0; index--) {
            sum = sum + symbols.get(index).evaluate(previousSymbol);
            previousSymbol = symbols.get(index);
        }
        return sum;
    }
}
