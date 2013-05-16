import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.fest.assertions.Assertions.assertThat;

@RunWith(JUnit4.class)
public class RomanSymbolParserSpec {

    @Test
    public void itParsesSymbolAndCreateSymbolGraph(){
        assertThat(new RomanSymbolParser().parse("I")).isEqualTo(new Symbol("I",1));
    }

}
