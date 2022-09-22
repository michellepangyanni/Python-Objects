package test.rice.obj;

import main.rice.obj.*;
import org.junit.jupiter.api.*;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for the PySetObj class.
 */
class PySetObjTest {
    // TODO: optionally add test cases here
    /**
     * A non-empty Set.
     */
    private static Set<PyFloatObj> val;

    /**
     * Two identical PySetObjs containing floats.
     */
    private static PySetObj<PyFloatObj> floatSet;
    private static PySetObj<PyFloatObj> floatSet2;

    /**
     * A different PySetObj containing floats.
     */
    private static PySetObj<PyFloatObj> floatSet3;

    /**
     * Sets up all static fields for use in the test cases.
     */
    @BeforeAll
    static void setUp() {
        // Create two identical sets of floats, and a third distinct set of floats.
        val = new HashSet<>();
        val.add(new PyFloatObj(1.5));
        val.add(new PyFloatObj(2.0));
        val.add(new PyFloatObj(2.5));
        floatSet = new PySetObj<>(val);

        val = Set.of(new PyFloatObj(1.5), new PyFloatObj(2.0), new PyFloatObj(2.5));
        floatSet2 = new PySetObj<>(val);

        val = Set.of(new PyFloatObj(3.0));
        floatSet3 = new PySetObj<>(val);
    }

    /**
     * Tests getValue().
     */
    @Test
    void testGetValue() {
        assertEquals(val, floatSet3.getValue());
    }

    /**
     * Tests toString().
     */
    @Test
    void testToString() {
        assertEquals("{3.0}", floatSet3.toString());
    }

    /**
     * Tests equals() on two identical PySetObjs.
     */
    @Test
    void testEquals() {
        assertEquals(floatSet, floatSet2);
    }

    /**
     * Tests equals() on two non-equivalent PySetObjs.
     */
    @Test
    void testNotEqual() {
        assertNotEquals(floatSet, floatSet3);
    }

    /**
     * Tests that hashCode() returns the same value for two identical PySetObjs.
     */
    @Test
    void testHashCodeEqual() {
        assertEquals(floatSet.hashCode(), floatSet2.hashCode());
    }

    /**
     * Tests that hashCode() returns different values for two non-equivalent PySetObjs.
     */
    @Test
    void testHashCodeNotEqual() {
        assertNotEquals(floatSet.hashCode(), floatSet3.hashCode());
    }
}
