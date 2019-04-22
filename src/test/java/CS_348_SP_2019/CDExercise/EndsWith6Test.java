package CS_348_SP_2019.CDExercise;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import CS_348_SP_2019.CDExercise.EndsWith6;

public class EndsWith6Test {

	@Test
	public void testToString() {
		EndsWith6 six = new EndsWith6();
		// add your name to the expected string, after the all the other names in the form "John Smith, "
		assertEquals("EndsWith6 [names= Oresti Duro, Chris Radkowski, Shruti Nagpal, John Pacheco, ]", six.toString());

	}

}
