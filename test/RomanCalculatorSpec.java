import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.fest.assertions.Assertions.assertThat;

@RunWith(JUnit4.class)
public class RomanCalculatorSpec {

    @Test
    public void itEvaluatesRomanNumbers(){
        RomanCalculator romanCalculator = new RomanCalculator(new RomanSymbolParser());
//        assertThat(romanCalculator.evaluate("")).isEqualTo(0);
        assertThat(romanCalculator.evaluate("V")).isEqualTo(5);
        assertThat(romanCalculator.evaluate("II")).isEqualTo(2);
        assertThat(romanCalculator.evaluate("IV")).isEqualTo(4);
        assertThat(romanCalculator.evaluate("IX")).isEqualTo(9);
        assertThat(romanCalculator.evaluate("XVI")).isEqualTo(16);
        assertThat(romanCalculator.evaluate("XXXII")).isEqualTo(32);
        assertThat(romanCalculator.evaluate("LXIV")).isEqualTo(64);
        assertThat(romanCalculator.evaluate("XC")).isEqualTo(90);
        assertThat(romanCalculator.evaluate("CXXVIII")).isEqualTo(128);
        assertThat(romanCalculator.evaluate("CCLVI")).isEqualTo(256);
        assertThat(romanCalculator.evaluate("DXII")).isEqualTo(512);
        assertThat(romanCalculator.evaluate("CM")).isEqualTo(900);
        assertThat(romanCalculator.evaluate("MXXIV")).isEqualTo(1024);
        assertThat(romanCalculator.evaluate("MDCLXVI")).isEqualTo(1666);
    }
}
