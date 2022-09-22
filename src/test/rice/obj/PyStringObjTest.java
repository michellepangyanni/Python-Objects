package test.rice.obj;

import main.rice.obj.PyCharObj;
import main.rice.obj.PyStringObj;
import org.junit.jupiter.api.*;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for the PyStringObj class.
 */
class PyStringObjTest {
    // TODO: optionally add test cases here
    /**
     * A List<PyCharObj>.
     */
    private static List<PyCharObj> val;

    /**
     * Two identical PyStringObjs.
     */
    private static PyStringObj str;
    private static PyStringObj str2;

    /**
     * A different PyStringObj.
     */
    private static PyStringObj str3;

    /**
     * Sets up all static fields for use in test cases.
     */
    @BeforeAll
    static void setUp() {
        str = new PyStringObj("abc");
        str2 = new PyStringObj(List.of(new PyCharObj('a'), new PyCharObj('b'), new PyCharObj('c')));
        val = List.of(new PyCharObj('d'), new PyCharObj('e'));
        str3 = new PyStringObj(val);
    }

    /**
     * Tests getValue().
     */
    @Test
    void testGetValue() {
        assertEquals(val, str3.getValue());
    }

    /**
     * Tests toString().
     */
    @Test
    void testToString() {
        assertEquals("'abc'", str.toString());
    }

    /**
     * Tests equals() on two identical PyStringObjs.
     */
    @Test
    void testEquals() {
        assertEquals(str, str2);
    }

    /**
     * Tests equals() on two non-equivalent PyStringObjs.
     */
    @Test
    void testNotEqual() {
        assertNotEquals(str, str3);
    }

    /**
     * Tests that hashCode() returns the same value for two identical PyStringObjs.
     */
    @Test
    void testHashCodeEqual() {
        assertEquals(str.hashCode(), str2.hashCode());
    }

    /**
     * Tests that hashCode() returns different values for two non-equivalent PyStringObjs.
     */
    @Test
    void testHashCodeNotEqual() {
        assertNotEquals(str.hashCode(), str3.hashCode());
    }
}