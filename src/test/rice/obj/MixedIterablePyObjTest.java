package test.rice.obj;
import main.rice.obj.*;
import org.junit.jupiter.api.*;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

/**
 * Test cases that involve multiple different iterable APyObj types, representing nested Python objects
 */
class MixedIterablePyObjTest {
    // TODO: you are encouraged to add test cases here
    /**
     * a list, tuple, set all have the same internal value
     */
    private static PyListObj<PyBoolObj> simpleList;
    private static PyTupleObj<PyBoolObj> simpleTuple;
    private static PySetObj<PyBoolObj> simpleSet;

    /**
     * two identical tuples of sets
     */
    private static PyTupleObj<PySetObj<PyIntObj>> tupOfSets1;
    private static PyTupleObj<PySetObj<PyIntObj>> tupOfSets2;

    /**
     *two identical sets of tuples
     */
    private static PySetObj<PyTupleObj<PyBoolObj>> setOfTups1;
    private static PySetObj<PyTupleObj<PyBoolObj>> setOfTups2;

    /**
     * two identical dicts mapping tuples to lists
     */
    private static PyDictObj<PyTupleObj<PyFloatObj>, PyListObj<PyIntObj>> dictOfTupsToLists1;
    private static PyDictObj<PyTupleObj<PyFloatObj>, PyListObj<PyIntObj>> dictOfTupsToLists2;

    /**
     * Two identical lists of tuples.
     */
    private static PyListObj<PyTupleObj<PyStringObj>> listOfTups1;
    private static PyListObj<PyTupleObj<PyStringObj>> listOfTups2;

    /**
     * Sets up all static fields for use in the test cases.
     */
    /**
     * Tests toString() on a tuple of sets.
     */
    /**
     * Tests equals() on two identical lists of tuples.
     */
    @Test
    @Tag("0.25")
    @Order(7)
    void testEqualsList() {
        assertEquals(listOfTups1, listOfTups2);
    }

}
