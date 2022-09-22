package main.rice.obj;
import java.util.Collection;
import java.util.List;
/**
 * An abstract class representing an iterable python object
 * @param <InnerType> the type of object contained within this iterable object
 */
public abstract class AIterablePyObj<InnerType extends APyObj> extends APyObj{
    /**
     * Value of this AIterableObj
     */
    protected List<InnerType> list;

    /**
     * Default constructor for AIterableObj
     */
    public AIterablePyObj(){

    }
    /**
     * Constructor for AIterableObj
     * Sets the field object to the value of the inputted List object
     * @param list, a list representing the value of this PyListObj
     */
    public AIterablePyObj(List<InnerType> list){

        this.list = list;
    }

    /**
     * @return the Java collection representing this AIterablePyObj
     */
    @Override
    public Collection<InnerType> getValue(){
        return this.list;
    }

}


