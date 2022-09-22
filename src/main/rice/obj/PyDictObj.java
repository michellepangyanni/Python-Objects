package main.rice.obj;
import java.util.Map;

public class PyDictObj<KeyType extends APyObj, ValueType extends APyObj> extends APyObj{
    /**
     * The value of this PyDictObj.
     */
    private Map<KeyType, ValueType> map;
    /**
     * Constructor for a PyDictObj; initializes its value to a dict of the input.
     *
     * @param map a Map representing the value of this PyDictObj
     */
    public PyDictObj(Map<KeyType, ValueType> map) {
        this.map = map;
    }
    /**
     * Declared as a Map and return as a Map
     * @return the Java representation of this Python object
     */
    @Override
    public Map<KeyType, ValueType> getValue(){
        return this.map;
    }
    /**
     * Builds and returns a string representation of this object that mirrors the Python
     * string representation.
     *
     * @return a string representation of this object
     */
    @Override
    public String toString() {
        // build a string to format the dictionary
        StringBuilder str = new StringBuilder();
        str.append("{");
        int size = this.getValue().size();
        // counter to keep track of how far into the dictionary we are since dictionaries are not ordered
        int counter = 0;
        //// iterate over elements of the dictionary
        for(Map.Entry<KeyType, ValueType> entry: this.getValue().entrySet()){
            // add the key value pair with the python formatting
            str.append(entry.getKey());
            str.append(": ");
            str.append(entry.getValue());
            // we do not want to add a ", " at the end of the dictionary
            if(counter < size -1){
                str.append(", ");
            }
            //up the counter
            counter ++;
        }
        str.append("}");
        // convert the string builder to a string and return
        return str.toString();
    }
}
