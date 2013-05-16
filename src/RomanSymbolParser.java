import java.util.HashMap;
import java.util.Map;

public class RomanSymbolParser {

    private Map<String,Integer> symbolValues = new HashMap<String, Integer>(){{
        put("I",1);
        put("V",5);
        put("X",10);
        put("L",50);
        put("C",100);
        put("D",500);
        put("M",1000);
    }};

    public Symbol parse(String romanSymbolString) {
        Integer value = symbolValues.get(romanSymbolString);
        if(value == null){
            throw new IllegalArgumentException("Invalid symbol found - '" + romanSymbolString  + "'");
        }
        return new Symbol(romanSymbolString, value);
    }
}
