import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Object implements Comparator<String> {
    @Override
    public int compare(String obj1, String obj2) {
        return  obj1.length() - obj2.length();
    }
}
