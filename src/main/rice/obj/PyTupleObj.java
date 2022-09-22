package main.rice.obj;
import java.util.List;
// TODO: implement the concrete PyTupleObj class here
public class PyTupleObj<InnerType extends APyObj> extends AIterablePyObj<InnerType>{
    /**
     * Constructor for a PyListObj; calls the superclass to initialize value of list.
     *
     * @param tup a list representing the value of this PyTupleObj
     */
    public PyTupleObj(List<InnerType> tup){

        super(tup);
    }
    /**
     * Builds and returns a string representation of this object that mirrors the Python
     * string representation.
     *
     * @return a string representation of this object
     */
    @Override
    public String toString() {
        if(list.size() == 1){
            return "(" + list.get(0) + ",)";
        }
        StringBuilder str = new StringBuilder();
        str.append("(");
        // get size of set since order does not matter in sets so we cannot call by index
        int size = list.size();
        int counter = 0;
        // iterate over each object in the set to add to str
        for(Object i: this.list){
            str.append(i);
            if(counter < size -1){
                str.append(", ");
            }
            counter ++;
        }
        str.append(")");
        return str.toString();
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
    public boolean equals(Object obj){
        // check that obj is of the type PyTupleObj
        if (!(obj instanceof PyTupleObj)){
            // if it is not an instance of PyTupleObj, return false
            return false;
        }
        //compare by value
        return this.getValue().equals(((APyObj) obj).getValue());
    }

}
