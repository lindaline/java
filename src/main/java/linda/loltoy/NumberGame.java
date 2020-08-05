package linda.loltoy;

import java.util.HashSet;
import java.util.Set;

public abstract class NumberGame {
    Set<Integer>numbers=new HashSet<>();
    int numberCount=0;
    public abstract void genertate();
    public boolean validate(){
        if (numbers.size()==numberCount){
            return true;
        }else{
            return false;
        }
    }
}
