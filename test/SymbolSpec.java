import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.fest.assertions.Assertions.assertThat;

@RunWith(JUnit4.class)
public class SymbolSpec {

    @Test
    public void itReturnsValueOfSymbolWhenPreviousSymbolIsSame(){
        assertThat(new Symbol("I",1).evaluate(new Symbol("I",1))).isEqualTo(1);
    }

    @Test
    public void itReturnsValueOfSymboleWhenPreviousSymbolIsSmaller(){
        assertThat(new Symbol("V",5).evaluate(new Symbol("I",1))).isEqualTo(5);
    }

    @Test
    public void itReturnsNegatedValueOfSymbolWhenPreviousSymbolIsGreater(){
        assertThat(new Symbol("1",1).evaluate(new Symbol("V",5))).isEqualTo(-1);
    }
}
