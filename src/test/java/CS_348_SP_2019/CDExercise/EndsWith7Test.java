package CS_348_SP_2019.CDExercise;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import CS_348_SP_2019.CDExercise.EndsWith7;

public class EndsWith7Test {

	@Test
	public void testToString() {
		EndsWith7 seven = new EndsWith7();
		// add your name to the expected string, after the all the other names in the form "John Smith, "
		assertEquals("EndsWith7 [names=James Denesha, Samantha Tran, Tim Mesite, Nicholas Coutu, ]", seven.toString());

	}

}
