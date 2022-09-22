package main.rice.obj;
import java.util.List;
// TODO: implement the concrete PyListObj class here
public class PyListObj<InnerType extends APyObj> extends AIterablePyObj<InnerType> {
    /**
     * Constructor for a PyListObj; calls the superclass to initialize value of list.
     *
     * @param list, a list representing the value of this PyListObj
     */
    public PyListObj(List<InnerType> list){
        super(list);
    }
    /**
     * Builds and returns a string representation of this object that mirrors the Python
     * string representation.
     *
     * @return a string representation of this object
     */
    @Override
    public String toString() {
        return list.toString();
    }
    /**
     * Compares this to the input object by value.
     * Used when comparing PyListObj and PyTupleObj because both of them have an internal
     * representation of a List, but they should not be equal due to their
     * Python difference.
     *
     * @param obj the object to compare against
     * @return true if this is equivalent by value to obj; false otherwise
     */
    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof PyListObj)){
            return false;
        }
        return this.getValue().equals(((APyObj) obj).getValue());
    }

}