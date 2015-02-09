package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {

	@BeforeClass
	public static void setUpBefore1_0() throws Exception {
	}

	@Before
	public void setUp1_3() throws Exception {
	}

	@After
	public void tearDown1_4() throws Exception {
	}

	@AfterClass
	public static void tearDownAfter1_1() throws Exception {
	}

	@Test
	public void Test_01_assertEquals_Positive() {
		assertEquals("String not the same", "Testing JUnit 4", App.s);
	}

	@Test
	public void Test_02_assertEquals_Negative() {
		assertEquals("String not the same", "Testing TestNG 6", App.s);
	}

	@Ignore
	@Test
	public void Test_03_assertEquals_Positive() {
		assertEquals("String not the same", "Testing JUnit 3", App.s);
	}

	@Test
	public void Test_04_assertSame_Positive() {
		assertSame("Integer not the same", 55, App.i);
	}

	@Test
	public void Test_05_assertSame_Positive() {
		assertSame("Integer not the same", 54, App.i);
	}

	@Ignore
	@Test
	public void Test_06_assertSame_Positive() {
		assertSame("Integer not the same", 56, App.i);
	}

	@Test
	public void Test_07_assertFalse_Positive() {
		assertFalse("Boolean should be false", App.f);
	}

	@Test
	public void Test_08_assertFalse_Positive() {
		assertFalse("Boolean should be false", App.t);
	}

	@Test
	public void Test_09_assertTrue_Positive() {
		assertTrue("Boolean should be false", App.t);
	}

	@Test
	public void Test_10_assertTrue_Positive() {
		assertTrue("Boolean should be false", App.f);
	}
}
