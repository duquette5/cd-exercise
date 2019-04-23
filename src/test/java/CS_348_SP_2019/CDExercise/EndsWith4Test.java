
package CS_348_SP_2019.CDExercise;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import CS_348_SP_2019.CDExercise.EndsWith4;

public class EndsWith4Test {

	@Test
	public void testToString() {
		EndsWith4 four = new EndsWith4();
		// add your name to the expected string, after the all the other names in the form "John Smith, "
		assertEquals("EndsWith4 [names=Kyle LaPointe, ]", four.toString());
	}

}
