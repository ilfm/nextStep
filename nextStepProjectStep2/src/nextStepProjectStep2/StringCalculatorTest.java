package nextStepProjectStep2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringCalculatorTest {

	StringCalculator sc;
	
	@Before
	public void start() {
		sc = new StringCalculator();
	}
	
	
	@Test
	public void testStringCalculater() {
		sc.stringCalculator("2,3,3:");
	}

	@Test
	public void testCustomStringCalculater() {
		sc.findCustomSeperator("//;\n1;2;3");
	}
	
	// 1.예외가 발생하는거에만 집중 
	// 아놔 왜 .class 하는거지 ㅋ 
	@Test(expected=RuntimeException.class)
	public void testExpectedException() {
		sc.findCustomSeperator("//;\n1;2;-6");
	}
	// 아놔 왜 none이지
	// 
	@Rule 
	public ExpectedException exceptionRule = ExpectedException.none(); 
	
	// 2.속성이 필요한 예외 발생 
	@Test
	public void testExpectedExceptionWithRule() {
		exceptionRule.expect(RuntimeException.class);
		exceptionRule.expectMessage("음수예용~");
		sc.findCustomSeperator("//;\n1;2;-6");
		
	}
}
