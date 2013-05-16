import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.fest.assertions.Assertions.assertThat;

@RunWith(JUnit4.class)
public class SymbolSpec {

    @Test
    public void itEvaluatesWhenPreviousSymbolIsSame(){
        assertThat(new Symbol("I",1).evaluate(1,new Symbol("I",1))).isEqualTo(2);
    }

    @Test
    public void itEvaluatesWhenPreviousSymbolIsSmaller(){
        assertThat(new Symbol("V",5).evaluate(2,new Symbol("I",1))).isEqualTo(7);
    }

    @Test
    public void itEvaluatesWhenPreviousSymbolIsGreater(){
        assertThat(new Symbol("1",1).evaluate(5,new Symbol("V",5))).isEqualTo(4);
    }
}
