package test.rice.obj;

import main.rice.obj.PyFloatObj;
import org.junit.jupiter.api.*;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for the PyFloatObj class.
 */
class PyFloatObjTest {

    /**
     * A PyFloatObj representing the Python float value 1.0.
     */
    private static final PyFloatObj posFloat = new PyFloatObj(1.0);

    /**
     * Two distinct PyFloatObjs representing the Python float value -1.0.
     */
    private static final PyFloatObj negFloat = new PyFloatObj(-1.0);
    private static final PyFloatObj negFloat2 = new PyFloatObj(-1.0);

    /**
     * A PyFloatObj representing the Python float value 33333.33333.
     */
    private static final PyFloatObj longFloat = new PyFloatObj(33333.33333);

    /**
     * A random floating point value and a PyFloatObj representing that value.
     */
    private static final double randVal = new Random().nextDouble();
    private static final PyFloatObj randFloat = new PyFloatObj(randVal);

    /**
     * Tests that getValue() returns the expected result for a PyFloatObj constructed with
     * a positive floating point value.
     */
    @Test
    void testGetValuePositive() {
        assertEquals(1.0, posFloat.getValue());
    }

    /**
     * Tests that getValue() returns the expected result for a PyFloatObj constructed with
     * a negative floating point value.
     */
    @Test
    void testGetValueNegative() {
        assertEquals(-1.0, negFloat.getValue());
    }

    /**
     * Tests that getValue() returns the expected result for a PyFloatObj constructed with
     * a long (in terms of number of decimal places) floating point value.
     */
    @Test
    void testGetValueLong() {
        assertEquals(33333.33333, longFloat.getValue());
    }

    /**
     * Tests that getValue() returns the expected result for a PyFloatObj constructed with
     * a random floating point value.
     */
    @Test
    void testGetValueRandom() {
        assertEquals(randVal, randFloat.getValue());
    }

    /**
     * Tests that toString() returns the expected result for a PyFloatObj constructed with
     * a positive floating point value.
     */
    @Test
    void testToStringPositive() {
        assertEquals("1.0", posFloat.toString());
    }

    /**
     * Tests that toString() returns the expected result for a PyFloatObj constructed with
     * a negative floating point value.
     */
    @Test
    void testToStringNegative() {
        assertEquals("-1.0", negFloat.toString());
    }

    /**
     * Tests that toString() returns the expected result for a PyFloatObj constructed with
     * a long (in terms of number of decimal places) floating point value.
     */
    @Test
    void testToStringLong() {
        assert ((Float.parseFloat(longFloat.toString()) - 33333.33333) < 0.01);
    }

    /**
     * Tests that toString() returns the expected result for a PyFloatObj constructed with
     * a random floating point value.
     */
    @Test
    void testToStringRandom() {
        assertEquals(String.valueOf(randVal), randFloat.toString());
    }

    /**
     * Tests that two distinct PyFloatObjs constructed with the same floating point value
     * are considered equivalent by equals().
     */
    @Test
    void testEqualsSimple() {
        assertEquals(negFloat, negFloat2);
    }

    /**
     * Tests that two distinct PyFloatObjs constructed with different values are not
     * considered equivalent by equals().
     */
    @Test
    void testNotEqual() {
        assertNotEquals(longFloat, negFloat);
    }

    /**
     * Tests that a PyFloatObj is not considered to be equivalent to a non-APyObj.
     */
    @Test
    void testNotEqualNonAPyObj() {
        assertNotEquals(posFloat, 1.0);
    }

    /**
     * Tests that two distinct PyFloatObjs constructed with the same floating point value
     * return the same value for hashCode().
     */
    @Test
    void testHashCodeSimple() {
        assertEquals(negFloat.hashCode(), negFloat2.hashCode());
    }

    /**
     * Tests that two distinct PyFloatObjs constructed with different values return
     * different values for hashCode().
     */
    @Test
    void testHashCodeNotEqual() {
        assertNotEquals(longFloat.hashCode(), negFloat.hashCode());
    }
}