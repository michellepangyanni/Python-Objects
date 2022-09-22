package main.rice.obj;
/**
 * a representation of Python objects of type bool
 */
public class PyBoolObj extends APyObj{
    /**
     * The value of this PyBoolObj
     */
    private final Boolean value;

    /**
     * Constructor for a PyBoolObj
     * @param value, the value of this PyBoolObj
     */
    public PyBoolObj(Boolean value) {
        this.value = value;
    }
    /**
     * @return the Java Boolean representation of this PyBoolObj
     */
    @Override
    public Boolean getValue(){
        return this.value;
    }

    /**
     * Builds and returns a Java string representation of this object that mirrors
     * the Python string representation
     * @return a Java string representation of this object
     */
    @Override
    public String toString() {
        if (!this.value){
            return "False";
        }
        return "True";
    }
}

