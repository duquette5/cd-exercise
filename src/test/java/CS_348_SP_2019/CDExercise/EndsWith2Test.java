
package CS_348_SP_2019.CDExercise;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import CS_348_SP_2019.CDExercise.EndsWith2;

public class EndsWith2Test {

	@Test
	public void testToString() {
		EndsWith2 two = new EndsWith2();
		// add your name to the expected string, after the all the other names in the form "John Smith, "
		assertEquals("EndsWith2 [names=Karl Wurst, Yesenia Mercedes-Nunez, ]", two.toString());
	}

}
