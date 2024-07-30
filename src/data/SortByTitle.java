
package data;
import java.util.Comparator;
/**
 *
 * @author quang
 */
public class SortByTitle implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareToIgnoreCase(o2.getTitle());       
    }
     
}
