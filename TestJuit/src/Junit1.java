import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.Before;
class Junit1 {

	public QuizOneJunit obj;
	
	@Before
	public void unit() {
		obj = new QuizOneJunit();
	}
	
	@Test
	public void tc01() {
		assertEquals(2, obj.countLetterA("Attack"));
	}
	
	public void tc02() {
		assertEquals(0, obj.countLetterA("Computer"));
	}

}
