package main.rice.obj;
import java.util.Set;
import java.util.Collection;
// TODO: implement the concrete PySetObj class here
public class PySetObj<InnerType extends APyObj> extends APyObj {
    /**
     * The value of this PySetObj.
     */
    private Set<InnerType> set;
    /**
     * Constructor for a PySetObj.
     * Sets the field object, set, to the parameter set.
     * Initializes the object with the input.
     *
     * @param set, a set representing the value of this PySetObj
     */
    public PySetObj(Set<InnerType> set){
        this.set = set;
    }
    /**
     * Declared to return a Collection but should actually return a set
     * Set extends Collection
     *
     * @return the underlying (Java) representation of this Python object
     */
    @Override
    public Collection<InnerType> getValue(){
        return this.set;
    }
    /**
     * Builds and returns a string representation of this object that mirrors the Python
     * string representation.
     *
     * @return a string representation of this object
     */
    @Override
    public String toString() {
        if (this.getValue().size() == 0) {
            return "set()";
        }
        // build a string builder to format
        StringBuilder str = new StringBuilder();
        str.append("{");
        // get size of set since order does not matter in sets we cannot call by index
        int size = this.set.size();
        int counter = 0;
        // iterate over each object in the set to add to str
        for (Object obj : this.set) {
            str.append(obj);
            // we want to do different things based off of two cases
            if (counter < size - 1) {
                // if we aren't at the end of the set, we simply continue with the normal inner
                // set python syntax
                str.append(",");
            }
            counter++;
        }
        str.append("}");
        return str.toString();
    }

}
