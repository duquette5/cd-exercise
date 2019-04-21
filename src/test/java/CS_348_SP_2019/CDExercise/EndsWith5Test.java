package CS_348_SP_2019.CDExercise;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import CS_348_SP_2019.CDExercise.EndsWith5;

public class EndsWith5Test {

	@Test
	public void testToString() {
		EndsWith5 five = new EndsWith5();
		// add your name to the expected string, after the all the other names in the form "John Smith, "
		assertEquals("EndsWith5 [names=]", five.toString());

	}

}
