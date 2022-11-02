/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
  
  @Test public void testAddsTwoAndTwo() {
    Calculator calc = new Calculator();
    assertEquals("2 + 2 should equal 4", Integer.valueOf(4), calc.add(2, 2));
  }

  @Test public void testMultiplysTenAndTen() {
    Calculator calc = new Calculator();
    assertEquals("10 * 10 must equal 100", Integer.valueOf(100), calc.multiply(10, 10));
  }

  @Test public void testDividesTwentyByFive() {
    Calculator calc = new Calculator();
    assertEquals("20 /  5 must equal 4", Integer.valueOf(4), calc.divide(20, 5));
  }

  @Test public void testForHandlingFloats() {
    Calculator calc = new Calculator();
    assertEquals("10 / 3 must return .333... float", Double.valueOf(3.333), calc.divide(10, 3));
  }
  
}