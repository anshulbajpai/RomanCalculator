import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.fest.assertions.Assertions.assertThat;

@RunWith(JUnit4.class)
public class AddOperationSpec {

    @Test
    public void itEvaluatesAnOperation(){
        assertThat(new AddOperation(new UnitOperation(),new Symbol("V",5)).evaluate(0,Symbol.NULL)).isEqualTo(5);
        assertThat(new AddOperation(new UnitOperation(),new Symbol("I",1)).evaluate(5,new Symbol("V",5))).isEqualTo(4);
        assertThat(new AddOperation(new UnitOperation(),new Symbol("V",5)).evaluate(1,new Symbol("I",1))).isEqualTo(6);
        assertThat(new AddOperation(new AddOperation(new UnitOperation(), new Symbol("X",10)),new Symbol("I",1)).evaluate(5,new Symbol("V",5))).isEqualTo(14);
    }

}
