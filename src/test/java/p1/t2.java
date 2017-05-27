package p1;

import org.testng.SkipException;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class t2 {

	@Test
	public void a1() {
		System.out.println("a1");
	}
	
	@Test
	public void a2() {
		System.out.println("a2");
	}
	
	@Test
	public void a3() {
		System.out.println("a3");
	}
	@Test
	public void a4() {
		System.out.println("a4");
		System.out.println("a6");
		fail("failed");
	}
	@Test
	public void a5() {
		System.out.println("a5");
		throw new SkipException("skipped");
	}
	@Test
	public void a6() {
		System.out.println("a6");
		fail("failed");
	}
	
}
