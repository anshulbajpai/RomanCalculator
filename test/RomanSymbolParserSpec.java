import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.fest.assertions.Assertions.assertThat;

@RunWith(JUnit4.class)
public class RomanSymbolParserSpec {
    RomanSymbolParser romanSymbolParser = new RomanSymbolParser();
    @Test
    public void itParsesSymbolAndCreateSymbolGraph(){
        assertThat(romanSymbolParser.parse("I")).isEqualTo(new Symbol("I", 1));
        assertThat(romanSymbolParser.parse("V")).isEqualTo(new Symbol("V", 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void itThrowsExceptionIfAnInvalidRomanCharacterIsParsed(){
        romanSymbolParser.parse("f");
    }

}
