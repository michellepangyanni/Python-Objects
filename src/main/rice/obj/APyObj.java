package main.rice.obj;
/**
 * An abstract class whose instances represent specific Python objects.
 */
public abstract class APyObj{
    protected Object value;
    /**
     * @return the Java representation of this Python object.
     */
    public Object getValue(){
        return value;
    }
    /**
     * Builds and returns a Java string representation of this object that mirrors
     * the Python string representation
     * @return a Java string representation of this object
     */
    @Override
    public abstract String toString();
    /**
     * Compare this to the input object by value
     * @param obj, the object to compare against
     * @return true if this is equivalent by value, false otherwise
     */
    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof APyObj)){
            return false;
        }
        //compare by value
        return this.getValue().equals(((APyObj) obj).getValue());
    }
    /**
     * Computes a hash code based on this object's value, s.t
     * two objects that are considered equal by .equals() will also have the same hash code
     * @return the hash code for this object
     */
    @Override
    public int hashCode(){
        return this.getValue().hashCode();
    }
}