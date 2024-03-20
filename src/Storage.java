import java.util.ArrayList;
import java.util.Iterator;

public class Storage implements Iterable<ContactInfo> {
    private ArrayList<ContactInfo> myList = new ArrayList<>();

    public Storage() {

    }

    public void addStudent(ContactInfo a){
        myList.add(a);
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "myList=" + myList +
                '}';
    }

    @Override
    public Iterator<ContactInfo> iterator() {
        return myList.iterator();
    }
}
