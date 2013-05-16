import java.util.Arrays;
import java.util.List;

public class RomanCalculator {

    private final RomanSymbolParser romanSymbolParser;

    public RomanCalculator(RomanSymbolParser romanSymbolParser) {
        this.romanSymbolParser = romanSymbolParser;
    }

    public int evaluate(String romanString) {
        Operation operation = new UnitOperation();
        for (String romanCharacter : getRomanCharacters(romanString)) {
            operation = new AddOperation(operation, romanSymbolParser.parse(romanCharacter));
        }
        return operation.evaluate(0, Symbol.NULL);
    }

    private List<String> getRomanCharacters(String romanString) {
        List<String> romanCharactersWithInitialEmptyCharacter = Arrays.asList(romanString.split(""));
        return romanCharactersWithInitialEmptyCharacter.subList(1, romanCharactersWithInitialEmptyCharacter.size());
    }
}
