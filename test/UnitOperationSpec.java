import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.fest.assertions.Assertions.assertThat;

@RunWith(JUnit4.class)
public class UnitOperationSpec {

    @Test
    public void itReturnsSeedAsTheFinalEvaluation(){
        assertThat(new UnitOperation().evaluate(5, Symbol.NULL)).isEqualTo(5);
        assertThat(new UnitOperation().evaluate(3, new Symbol("V", 5))).isEqualTo(3);
    }
}
