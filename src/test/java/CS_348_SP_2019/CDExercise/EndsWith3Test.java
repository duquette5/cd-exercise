
package CS_348_SP_2019.CDExercise;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import CS_348_SP_2019.CDExercise.EndsWith3;

public class EndsWith3Test {

	@Test
	public void testToString() {
		EndsWith3 three = new EndsWith3();
		// add your name to the expected string, after the all the other names in the form "John Smith, "
		assertEquals("EndsWith3 [names=Mia Rogers, Andrew Finneran, ]", three.toString());

	}

}
