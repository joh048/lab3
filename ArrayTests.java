import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 1, 2, 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3, 2, 1 }, input1);
	}

  public void testReverseInPlace() {
    int[] input1 = { };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ }, input1);
	}

  public void testReverseInPlace() {
    int[] input1 = { 3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3}, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { 4, 5};
    assertArrayEquals(new int[]{ 5, 4}, ArrayExamples.reversed(input1));
  }

  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  public void testReversed() {
    int[] input1 = { 1, 3, 2, 12, 2};
    assertArrayEquals(new int[]{ 2, 12, 2, 3, 1}, ArrayExamples.reversed(input1));
  }
}
